package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D14940 {
	static int n, m, cnt;
	static int[] dx = {0, 0, -1, 1}, dy = {1, -1, 0, 0};
	static int[][] map, ans;
	static boolean[][] visited;
	static Queue<Pair> q;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		ans = new int[n][m];
		q = new LinkedList<>();
		
		visited = new boolean[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 2) q.add(new Pair(i, j));
				if(map[i][j] == 1) ans[i][j] = -1; 
			}
		}
		
		int x = q.peek().x, y = q.peek().y;
		
		bfs(x, y);
		
		StringBuilder sb = new StringBuilder();
		for (int[] list : ans) {
			for(int item : list) sb.append(item).append(" ");
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	private static void bfs(int y, int x) {
		if(visited[y][x]) return;
		
		visited[y][x] = true;
		
		while(!q.isEmpty()) {
			Pair curr = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int nextY = curr.x + dy[i];
				int nextX = curr.y + dx[i];
				if(nextY >= 0 && nextY < n && nextX >=0 && nextX < m && map[nextY][nextX] == 1 && !visited[nextY][nextX]) {
					ans[nextY][nextX] = ans[curr.x][curr.y] + 1;
					q.add(new Pair(nextY, nextX));
					visited[nextY][nextX] = true;
					bfs(nextY, nextX);
				}
			}
		}
	}

	static class Pair {
		int x, y;
		
		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
