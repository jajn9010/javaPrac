package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class D2667 {
	static int N, cnt, num;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {0, 0, -1, 1}, dy = {1, -1, 0, 0};
	static Queue<Pair> q;
	static List<Integer> aparts;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		aparts = new ArrayList<>();
		
		map = new int[N][N];
		visited = new boolean[N][N];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}

		cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j] == 1 && !visited[i][j]) {
					num = 0;
					cnt++;
					bfs(i, j);
					aparts.add(num + 1);
				}
			}
		}
		Collections.sort(aparts);
		System.out.println(cnt);
		for(int item : aparts) System.out.println(item);
	}
	
	private static void bfs(int i, int j) {
		q = new LinkedList<>();
		q.add(new Pair(i, j));
		visited[i][j] = true;
		
		while(!q.isEmpty()) {
			Pair curr = q.poll();
			int currY = curr.x;
			int currX = curr.y;
			
			for (int k = 0; k < 4; k++) {
				int nextY = currY + dy[k];
				int nextX = currX + dx[k];
				
				if(nextX >= 0 && nextX < N && nextY >= 0 && nextY <N) {
					if(map[nextY][nextX] == 1 && !visited[nextY][nextX]) {
						num++;
						q.add(new Pair(nextY, nextX));
						visited[nextY][nextX] = true;
					}
				}
			}
		}
	}

	public static class Pair {
		int x, y;
		
		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
