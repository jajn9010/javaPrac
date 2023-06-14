package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2239 {
	static int[][] map;
	static boolean flag;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		map = new int[9][9];
		
		for (int i = 0; i < 9; i++) {
			String str = br.readLine();
			for (int j = 0; j < 9; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		
		dfs(0);
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sb.append(map[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

	private static void dfs(int depth) {
		if(depth == 81) {
			flag = true;
			return;
		}
		
		int r = depth / 9;
		int c = depth % 9;
		
		if(map[r][c] != 0) dfs(depth + 1);
		else {
			for (int i = 1; i < 10; i++) {
				if(!isValid(r, c, i)) continue;
				map[r][c] = i;
				dfs(depth + 1);
				
				if(flag) return;
				map[r][c] = 0;
			}
		}
	}

	private static boolean isValid(int r, int c, int n) {
		for (int i = 0; i < 9; i++) {
			if(map[i][c] == n || map[r][i] == n) {
				return false;
			}
		}
		
		int sr = r / 3 * 3;
		int sc = c - c % 3;
		
		for (int i = sr; i < sr + 3; i++) {
			for (int j = sc; j < sc + 3; j++) {
				if(map[i][j] == n) return false;
			}
		}
		
		return true;
	}
}
