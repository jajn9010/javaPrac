package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D7576 {
	static int N, M;
	static int[] dx = {0, 0, -1, 1}, dy = {1, -1, 0, 0};
	static int[][] map;
	static Queue<int[]> q;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		q = new LinkedList<>();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 1) q.add(new int[] {i, j});
			}
		}
		
		System.out.println(bfs());
	}

	private static int bfs() {
		while(!q.isEmpty()) {
			int[] curr = q.poll();
			int currX = curr[1];
			int currY = curr[0];
			
			for (int i = 0; i < 4; i++) {
				int nextX = currX + dx[i];
				int nextY = currY + dy[i];
				
				if(nextX >= 0 && nextY >= 0 && nextX < M && nextY < N) {
					if(map[nextY][nextX] == 0) {
						q.add(new int[] {nextY, nextX});
						map[nextY][nextX] = map[currY][currX] + 1;
					}
				}
			}
		}
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(map[i][j] == 0) return -1;
				if(map[i][j] > max) max = map[i][j];
			}
		}
		
		if(max == 1) return 0;
		else return max - 1;
	}
}
