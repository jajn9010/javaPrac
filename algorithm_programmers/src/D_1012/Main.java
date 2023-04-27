package D_1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pair {
	int x, y;

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static int w, h, k;
	static int[] dx = { 0, 0, -1, 1 }, dy = { 1, -1, 0, 0 };
	static int[][] map;
	static boolean[][] visit;
	static Queue<Pair> q;

	static boolean bfs(int x, int y) {
		if (visit[y][x])
			return false;
		Queue<Pair> bfsq = new LinkedList<>();
		visit[y][x] = true;

		bfsq.add(new Pair(x, y));

		while (!bfsq.isEmpty()) {
			Pair curr = bfsq.poll();
			for (int i = 0; i < 4; i++) {
				int nextX = curr.x + dx[i];
				int nextY = curr.y + dy[i];

				if (nextX < 0 || nextX >= w || nextY < 0 || nextY >= h)
					continue;
				if (visit[nextY][nextX])
					continue;
				if (map[nextY][nextX] == 0)
					continue;

				visit[nextY][nextX] = true;
				bfsq.add(new Pair(nextX, nextY));
			}
		}
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());

			map = new int[h][w];
			visit = new boolean[h][w];
			q = new LinkedList<>();

			while (k-- > 0) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());

				map[y][x] = 1;
				q.add(new Pair(x, y));
			}

			int ans = 0;
			while (!q.isEmpty()) {
				Pair curr = q.poll();
				if (bfs(curr.x, curr.y))
					ans++;
			}
			sb.append(ans + "\n");
		}
		System.out.println(sb);
	}
}
