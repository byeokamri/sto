package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class reverse{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String []arr = new String[a];			
        
        for (int i = 0; i < a; i++) {        	
        	arr[i] = br.readLine();
		}
        Arrays.sort(arr,(o1,o2)
        		-> {if(o1.length() == o2.length()) {
        			return	o1.compareTo(o2);
        		}else{
        			return o1.length()-o2.length();}
        		});
        System.out.println(Arrays.toString(arr));
    }
    
}