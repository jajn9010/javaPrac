package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1987 {
	static int R, C, cnt;
	static int[] dx = {0, 0, -1, 1}, dy = {1, -1, 0, 0};
	static int[][] map;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		cnt = 0;
		
		map = new int[R][C];
		visited = new boolean[26];
		
		for (int i = 0; i < R; i++) {
			String str = br.readLine();
			for (int j = 0; j < C; j++) {
				map[i][j] = str.charAt(j) - 'A';
			}
		}
		
		dfs(0,0,0);
		
		System.out.println(cnt);
	}

	private static void dfs(int y, int x, int count) {
		if(visited[map[y][x]]) {
			cnt = Math.max(cnt, count);
		} else {
			visited[map[y][x]] = true;
			
			for (int i = 0; i < 4; i++) {
				int nextY = y + dy[i];
				int nextX = x + dx[i];
				
				if(nextY >= 0 && nextY < R && nextX >= 0 && nextX < C) {
					dfs(nextY, nextX, count + 1);
				}
			}
			visited[map[y][x]] = false;
		}
	}
}
