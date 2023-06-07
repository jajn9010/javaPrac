package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D21736 {
	static int N, M, cnt;
	static int[] dx = { 0, 0, -1, 1 }, dy = { 1, -1, 0, 0 };
	static char[][] arr;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		cnt = 0;

		arr = new char[N][M];
		visited = new boolean[N][M];

		int x = 0, y = 0;

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = str.charAt(j);
				if (str.charAt(j) == 'I') {
					y = i;
					x = j;
				}
			}
		}

		dfs(x, y);
		
		if(cnt == 0) {
			System.out.println("TT");
		} else {
			System.out.println(cnt);
		}
	}

	private static void dfs(int x, int y) {
		visited[y][x] = true;

		if (arr[y][x] == 'P') {
			cnt++;
		}
		
		for (int i = 0; i < 4; i++) {
			int nextY = y + dy[i];
			int nextX = x + dx[i];

			if (nextX >= 0 && nextY >= 0 && nextY < N && nextX < M && !visited[nextY][nextX]) {
				if(arr[nextY][nextX] != 'X') {
					dfs(nextX, nextY);
				}
			}
		}
	}
}
