package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2630 {
	static int white = 0, blue = 0;
	static int[][] map;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		solve(0, 0, N);
		
		sb.append(white).append("\n").append(blue);
		System.out.println(sb);
	}

	private static void solve(int row, int col, int size) {
		if(check(row, col, size)) {
			if(map[row][col] == 0) {
				white++;
			}else {
				blue++;
			}
			return;
		}
		
		int nSize = size / 2;
		
		solve(row, col, nSize);
		solve(row + nSize, col, nSize);
		solve(row, col + nSize, nSize);
		solve(row + nSize, col + nSize, nSize);
	}

	private static boolean check(int row, int col, int size) {
		int color = map[row][col];
		
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if(map[i][j] != color) {
					return false;
				}
			}
		}
		return true;
	}
}
