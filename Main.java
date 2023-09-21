package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int o = 0; o < testcase; o++) {
			int n = Integer.parseInt(br.readLine());
			int[][] original = new int[2][n];

			for (int i = 0; i < 2; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < n; j++) {
					original[i][j] = Integer.parseInt(st.nextToken());
				}
			}


			if (n == 1) {
				System.out.println(Math.max(original[0][0], original[1][0]));
			} else if (n == 2) {
				System.out.println(Math.max(original[0][0] + original[1][1], original[0][1] + original[1][0]));
			} else {
				int[][] dp = new int[2][n];
				// 대각선 , 그옆 의 값 중에서 더 큰값과가 원본 배열의 해당 자리 값을 더한 값
				dp[0][0] = original[0][0];
				dp[0][1] = original[1][0] + original[0][1];
				dp[1][1] = original[1][1] + original[0][0];
				dp[1][0] = original[1][0];
				for (int i = 2; i < n; i++) {
					dp[0][i] = Math.max(dp[1][i - 2], dp[1][i - 1]) + original[0][i];
					dp[1][i] = Math.max(dp[0][i - 2], dp[0][i - 1]) + original[1][i];
				}
				
		
				
				System.out.println(Math.max(dp[0][n-1], dp[1][n-1]));
				
				
			}
		}
		
	}
}
