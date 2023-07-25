package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D2206 {
	static int n, m;
	static int[] dx = {0, 0, -1, 1}, dy = {1, -1, 0, 0};
	static int[][] map, dist;
	static boolean[][][] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		Queue<int[]> q = new LinkedList<>();
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		dist = new int[n][m];
		visited = new boolean[n][m][2];
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		
		q.add(new int[] {0, 0, 0});
		
		if(n == 1 && m == 1) {
			System.out.println(1);
		} else {
			loop:
				while(!q.isEmpty()) {
					int[] curr = q.poll();
					
					for (int i = 0; i < 4; i++) {
						int nextX = curr[0] + dx[i];
						int nextY = curr[1] + dy[i];
						
						if(nextX < 0 || nextX >= n || nextY < 0 || nextY >= m) continue;
						
						if(map[nextX][nextY] == 1) {
							if(curr[2] == 0 && !visited[nextX][nextY][1]) {
								visited[nextX][nextY][curr[2]] = true;
								dist[nextX][nextY] = dist[curr[0]][curr[1]] + 1;
								q.add(new int[] {nextX, nextY, 1});
							}
						} else {
							if(!visited[nextX][nextY][curr[2]]) {
								visited[nextX][nextY][curr[2]] = true;
								dist[nextX][nextY] = dist[curr[0]][curr[1]] + 1;
								q.add(new int[] {nextX, nextY, curr[2]});
							}
						}
						if(nextX == n - 1 && nextY == m - 1) {
							sb.append(dist[nextX][nextY] + 1);
							break loop;
						}
					}
				}
			if(sb.toString().equals("")) {
				System.out.println(-1);
			}else {
				System.out.println(sb);
			}
		}
	}
}
