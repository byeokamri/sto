package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dice {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[][] floor = new int[N][M];
		int[] order = new int[K];

		int top = 0;
		int under = 0;
		int left = 0;
		int right = 0;
		int front = 0;
		int back = 0;
		int spare = 0;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				floor[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < K; i++) {
			order[i] = Integer.parseInt(st.nextToken());
		}
		// int a와 b의값을 교환하려면?
		for (int i = 0; i < K; i++) {
			if (order[i] == 1) {
				y += 1;
				if (y >= M) {
					y -= 1;
					continue;
				}
				spare = back;
				back = under;
				under = front;
				front = top;
				top = spare;
				if (floor[x][y] == 0) {
					floor[x][y] = under;
				} else {
					under = floor[x][y];
					floor[x][y] = 0;
				}
				System.out.println(top);
			} else if (order[i] == 2) {
				y -= 1;

				if (y < 0) {
					y += 1;
					continue;
				}
				spare = front;
				front = under;
				under = back;
				back = top;
				top = spare;
				if (floor[x][y] == 0) {
					floor[x][y] = under;
				} else {
					under = floor[x][y];
					floor[x][y] = 0;
				}
				System.out.println(top);
			} else if (order[i] == 3) {
				x -= 1;

				if (x < 0) {
					x += 1;
					continue;
				}
				spare = under;
				under = left;
				left = top;
				top = right;
				right = spare;
				if (floor[x][y] == 0) {
					floor[x][y] = under;
				} else {
					under = floor[x][y];
					floor[x][y] = 0;
				}
				System.out.println(top);
			} else {
				x += 1;
				if (x >= N) {
					x -= 1;
					continue;
				}
				spare = under;
				under = right;
				right = top;
				top = left;
				left = spare;
				if (floor[x][y] == 0) {
					floor[x][y] = under;
				} else {
					under = floor[x][y];
					floor[x][y] = 0;
				}
				System.out.println(top);
			}
		}

	}
}
