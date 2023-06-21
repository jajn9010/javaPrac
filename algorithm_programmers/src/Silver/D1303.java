package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D1303 {
	static char[][] map;
	static boolean[][] visited;
	static Queue<int[]> q;
	static int N, M, count, w_count, b_count;
	static int[] dx = {0, 0, -1, 1}, dy = {1, -1, 0, 0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		q = new LinkedList<>();
		
		map = new char[M][N];
		visited = new boolean[M][N];
		
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				char ch = str.charAt(j);
				map[i][j] = ch;
			}
		}
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if(visited[i][j] == false) {
					if(map[i][j] == 'W') {
						int num = bfs(i, j, 'W');
						w_count += num * num;
					} else {
						int num = bfs(i, j, 'B');
						b_count += num * num;
					}
				}
			}
		}
		
		System.out.println(w_count + " " + b_count);
	}

	private static int bfs(int y, int x, char c) {
		q.add(new int[] {y, x});
		count = 1;
		visited[y][x] = true;
		
		while(!q.isEmpty()) {
			int[] curr = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int nextY = curr[0] + dy[i];
				int nextX = curr[1] + dx[i];
				
				if(nextY >= 0 && nextY < M && nextX >= 0 && nextX < N && visited[nextY][nextX] == false && c == map[nextY][nextX]) {
					q.add(new int[] {nextY, nextX});
					visited[nextY][nextX] = true;
					count++;
				}
			}
		}
		
		return count;
	}
}
