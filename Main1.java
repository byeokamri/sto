package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] intArr = new int[2];
		String[] stringArr = new String[2];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
			// 1 입력을받는다. split함수로 구분해준다. String 배열에 넣는다.
			String str = br.readLine();
			stringArr = str.split(" ");

			for (int j = 0; j < 2; j++) {
				// 스트링배열 형변환 인트배열로
				intArr[j] = Integer.parseInt(stringArr[j]);
			}
			sb.append(intArr[0] + intArr[1] + "\n");

		}
		System.out.println(sb.toString());

	}

}
