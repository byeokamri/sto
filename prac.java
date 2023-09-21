package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prac {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		st=new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int []A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = i+1; 
		}
		int M = Integer.parseInt(st.nextToken());
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int spare = A[a-1];
			A[a-1]=A[b-1];
			A[b-1]=spare;
		}
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}			
	}
}
