package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D10026 {
	static int N;
	static char[][] map;
	static boolean[][] visited;
	static int[] dx = { 0, 0, -1, 1 }, dy = { 1, -1, 0, 0 };

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		map = new char[N + 1][N + 1];
		visited = new boolean[N + 1][N + 1];

		for (int i = 0; i < N; i++) {
			String temp = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = temp.charAt(j);
			}
		}

		int nomal_cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					bfs(i, j);
					nomal_cnt++;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 'G') {
					map[i][j] = 'R';
				}
			}
		}

		visited = new boolean[N + 1][N + 1];

		int deuter_cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					bfs(i, j);
					deuter_cnt++;
				}
			}
		}
		System.out.println(nomal_cnt + " " + deuter_cnt);
	}

	private static void bfs(int y, int x) {
		visited[y][x] = true;
		char temp = map[y][x];

		for (int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if (nextX < 0 || nextY < 0 || nextX > N || nextY > N)
				continue;
			if (!visited[nextY][nextX] && map[nextY][nextX] == temp) {
				bfs(nextY, nextX);
			}
		}
	}
}
