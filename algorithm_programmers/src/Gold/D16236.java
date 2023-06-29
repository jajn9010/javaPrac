package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D16236 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int size = 2;
		int eat = 0;
		int ans = 0;
		int[][] map = new int[N][N];
		Pair shark = null;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 9) {
					shark = new Pair(i, j);
					map[i][j] = 0;
				}
			}
		}
		
		int[] dx = {0, 0, -1, 1}, dy = {1, -1, 0, 0};
		
		while(true) {
			int x = Integer.MAX_VALUE;
			int y = Integer.MAX_VALUE;
			int d = Integer.MAX_VALUE;
			
			int[][] dist = new int[N][N];
			
			Queue<Pair> q = new LinkedList<>();
			q.add(new Pair(shark.x, shark.y));
			
			while(!q.isEmpty()) {
				Pair curr = q.poll();
				
				for (int i = 0; i < 4; i++) {
					int nextY = curr.x + dy[i];
					int nextX = curr.y + dx[i];
					
					if(nextY < 0 || nextY >= N || nextX < 0 || nextX >= N) continue;
					if(map[nextY][nextX] > size) continue;
					if(dist[nextY][nextX] != 0) continue;
					
					dist[nextY][nextX] = dist[curr.x][curr.y] + 1;
					
					if(map[nextY][nextX] != 0 && map[nextY][nextX] < size) {
						if(d > dist[nextY][nextX]) {
							d = dist[nextY][nextX];
							y = nextY;
							x = nextX;
						} else if(d == dist[nextY][nextX]) {
							if(nextY < y) {
								x = nextX;
								y = nextY;
							} else if (nextX == x) {
								x = nextX;
								y = nextY;
							}
						}
					}
					
					q.add(new Pair(nextY, nextX));
				}
			}
			
			if(x == Integer.MAX_VALUE && y == Integer.MAX_VALUE) break;
			
			ans += dist[y][x];
			map[y][x] = 0;
			
			shark.x = y;
			shark.y = x;
			
			eat++;
			
			if(eat == size) {
				size++;
				eat = 0;
			}
		}
		System.out.println(ans);
	}
	
	private static class Pair {
		int x, y;
		
		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
