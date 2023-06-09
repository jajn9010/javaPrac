package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D7569 {
	static int N, M, H;
	static int[] dx = {0, 0, -1, 1, 0, 0}, dy = {1, -1, 0, 0, 0, 0}, dz = {0, 0, 0, 0, 1, -1};
	static int[][][] map;
	static Queue<int[]> q;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		
		map = new int[H][N][M];
		q = new LinkedList<>();
		for (int k = 0; k < H; k++) {
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++) {
					map[k][i][j] = Integer.parseInt(st.nextToken());
					if(map[k][i][j] == 1) q.add(new int[] {k, i, j});
				}
			}
		}
		
		System.out.println(bfs());
	}

	private static int bfs() {
		while(!q.isEmpty()) {
			int[] curr = q.poll();
			int currX = curr[2];
			int currY = curr[1];
			int currZ = curr[0];
			
			for (int i = 0; i < 6; i++) {
				int nextX = currX + dx[i];
				int nextY = currY + dy[i];
				int nextZ = currZ + dz[i];
				
				if(nextX >= 0 && nextY >= 0 && nextX < M && nextY < N && nextZ >= 0 && nextZ < H) {
					if(map[nextZ][nextY][nextX] == 0) {
						q.add(new int[] {nextZ, nextY, nextX});
						map[nextZ][nextY][nextX] = map[currZ][currY][currX] + 1;
					}
				}
			}
		}
		
		int max = Integer.MIN_VALUE;
		for (int k = 0; k < H; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if(map[k][i][j] == 0) return -1;
					if(map[k][i][j] > max) max = map[k][i][j];
				}
			}
		}
		
		if(max == 1) return 0;
		else return max - 1;
	}
}
