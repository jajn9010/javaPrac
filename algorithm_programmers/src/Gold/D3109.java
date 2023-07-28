package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D3109 {
	static int R, C, cnt;
	static char[][] map;
	static int[] dx = {1, 1, 1}, dy = {-1, 0, 1};
	static boolean[][] visited;
	static boolean flag;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		map = new char[R][C];
		visited = new boolean[R][C];
		
		for (int i = 0; i < R; i++) {
			String str = br.readLine();
			for (int j = 0; j < C; j++) {
				map[i][j] = str.charAt(j);
				if(map[i][j] == 'x') visited[i][j] = true;
			}
		}
		cnt = 0;
		
		for (int i = 0; i < R; i++) {
			flag = false;
			dfs(i, 0);
		}
		
		System.out.println(cnt);
	}

	private static void dfs(int y, int x) {
		if(x == C -1) {
			cnt++;
			flag = true;
			visited[y][x] = true;
			return;
		}
		
		for (int i = 0; i < 3; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			
			if(ny >= 0 && ny < R && nx >= 0 && nx < C && visited[ny][nx] == false && map[ny][nx] == '.') {
				dfs(ny, nx);
				if(flag) {
					visited[ny][nx] = true;
					return;
				} else {
					visited[ny][nx] = true;
				}
			}
		}
	}
}
