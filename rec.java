package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rec {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long T = Integer.parseInt(br.readLine());
		long h = Integer.parseInt(br.readLine());
		long sum = 0;
		for (int i = 0; i < h; i++) {
			String str = br.readLine();
			String[] arr = str.split(" ");

			long a = Long.parseLong(arr[0]);
			long b = Long.parseLong(arr[1]);
			sum = sum + (a * b);

		}
		if (T == sum) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
/*
 * String str = br.readLine();
 * 
 * String []arr = new String[str.length()]; for (int i = 0; i < T; i++) { char s
 * = str.charAt(); }
 * 
 */
//  )()()()())()()()
//())(()