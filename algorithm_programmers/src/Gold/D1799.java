package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1799 {
	static int n, b_cnt, w_cnt;
	static int[][] map;
	static int[] dx = { -1, 1}, dy = {-1, -1};

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		map = new int[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		boolean[][] b_visited = new boolean[n][n];
		b_search(b_visited, 0, 1, 0);

		boolean[][] w_visited = new boolean[n][n];
		w_search(w_visited, 0, 0, 0);

		System.out.println(b_cnt + w_cnt);
	}

	private static void w_search(boolean[][] visited, int y, int x, int cnt) {
		w_cnt = Math.max(cnt, w_cnt);

		if (x >= n) {
			y += 1;
			x = (y % 2 == 0) ? 0 : 1;
		}

		if (y >= n)
			return;

		if (isvalid(visited, y, x)) {
			visited[y][x] = true;
			w_search(visited, y, x + 2, cnt + 1);
			visited[y][x] = false;
		}

		w_search(visited, y, x + 2, cnt);
	}

	private static void b_search(boolean[][] visited, int y, int x, int cnt) {
		b_cnt = Math.max(cnt, b_cnt);

		if (x >= n) {
			y += 1;
			x = (y % 2 == 0) ? 1 : 0;
		}

		if (y >= n)
			return;

		if (isvalid(visited, y, x)) {
			visited[y][x] = true;
			b_search(visited, y, x + 2, cnt + 1);
			visited[y][x] = false;
		}

		b_search(visited, y, x + 2, cnt);
	}

	private static boolean isvalid(boolean[][] visited, int y, int x) {
		if (map[y][x] == 0)
			return false;

		for (int i = 0; i < 2; i++) {
			int nextY = y + dy[i];
			int nextX = x + dx[i];

			for (int j = 0; j < n; j++) {
				if (nextY >= 0 && nextY < n && nextX >= 0 && nextX < n) {
					if (visited[nextY][nextX])
						return false;
					nextY += dy[i];
					nextX += dx[i];
				}
			}
		}
		return true;
	}
}
