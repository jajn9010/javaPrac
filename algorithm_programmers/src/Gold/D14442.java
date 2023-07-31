package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D14442 {
	static int n, m, k;
	static int[] dx = { 0, 0, -1, 1 }, dy = { 1, -1, 0, 0 };
	static int[][] map;
	static boolean[][][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<int[]> q = new LinkedList<>();

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		map = new int[n][m];
		visited = new boolean[n][m][k + 1];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}

		q.add(new int[] { 0, 0, 1, 0 });

		int ans = -1;
		loop: while (!q.isEmpty()) {
			int[] curr = q.poll();

			if (curr[0] == n - 1 && curr[1] == m - 1) {
				ans = curr[2];
				break loop;
			}

			for (int i = 0; i < 4; i++) {
				int nextX = curr[0] + dx[i];
				int nextY = curr[1] + dy[i];

				if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m)
					continue;

				if (map[nextX][nextY] == 0 && !visited[nextX][nextY][curr[3]]) {
					visited[nextX][nextY][curr[3]] = true;
					q.add(new int[] { nextX, nextY, curr[2] + 1, curr[3] });
				} else {
					if (curr[3] < k && !visited[nextX][nextY][curr[3] + 1]) {
						visited[nextX][nextY][curr[3] + 1] = true;
						q.add(new int[] { nextX, nextY, curr[2] + 1, curr[3] + 1 });
					}
				}
			}
		}
		System.out.println(ans);
	}
}
