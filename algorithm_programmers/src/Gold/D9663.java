package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D9663 {
	static int T;
	static int cnt = 0;
	static int[] arr;

	static void dfs(int depth) {
		// 깊이 탐색을 끝까지 마치면 cnt++
		if(depth == T) {
			cnt++;
			return;
		}
		
		for (int i = 0; i < T; i++) {
			arr[depth] = i;
			if (posible(depth)) {
				dfs(depth+1);
			}
		}
	}

	public static boolean posible(int depth) {
		for (int i = 0; i < depth; i++) {
			if(arr[depth] ==  arr[i]) return false;
			else if(Math.abs(depth-i) == Math.abs(arr[depth]-arr[i])) return false;
		}
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());
		arr = new int [T];
		
		dfs(0);
		System.out.println(cnt);
	}
}
