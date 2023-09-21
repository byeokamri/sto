package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dfs_dfs {
	static int a;
	static int b;
	static int result = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());

		dfs1(a, 0);
		dfs2(a, 0);
		System.out.println(result==Integer.MAX_VALUE?-1:result+1);
	}

	public static void dfs1(int q, int count) {
		if (q >= b) {
			return;
		} else {
			q *= 2;
			count++;
			if (q == b) {
				result = Math.min(result, count);
			} else {
				dfs1(q, count);
				dfs2(q, count);
			}
		}
	}

	public static void dfs2(int q, int count) {
		if (q >= b) {
			return;
		} else {
			q = q * 10 + 1;
			count++;
			if (q == b) {
				result = count;
			} else {
				dfs1(q, count);
				dfs2(q, count);
			}
		}
	}
	public static void bfs1(int q, int count) {
		
		if(q>=b) {
			return;
		}else if() {
			q *= 2;
			count++;
		}else
			if(q==b) {
				result=count;
			}else {
				bfs2(q, count);
			}
			
		}
	}
	public static void bfs2(int q , int count) {
		
		if(q>=b) {
			return;
		}else {
			
		}
	}
}
