package Silver;

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

public class D2178 {
	static int n, m;
	static int[] dx = { -1, 1, 0, 0 }, dy = { 0, 0, -1, 1 };
	static int[][] map;
	static boolean[][] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		visited = new boolean[n][m];
		
		for (int i = 0; i < n; i++) {
			char[] ch = br.readLine().toCharArray();
			for (int j = 0; j < m; j++) {
				map[i][j] = ch[j] - '0';
			}
		}
		
		visited[0][0] = true;
		bfs(0, 0);
		System.out.println(map[n-1][m-1]);
	}

	private static void bfs(int x, int y) {
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(x, y));
		
		while(!q.isEmpty() ) {
			Pair a = q.poll();
			int currX = a.x;
			int currY = a.y;
			
			for (int i = 0; i < 4; i++) {
				int nextX = currX + dx[i];
				int nextY = currY + dy[i];
				
				if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) continue;
				if(visited[nextX][nextY] || map[nextX][nextY] == 0) continue;
				
				q.add(new Pair(nextX, nextY));
				map[nextX][nextY] = map[currX][currY] + 1;
				visited[nextX][nextY] = true;
			}
		}
	}
}
