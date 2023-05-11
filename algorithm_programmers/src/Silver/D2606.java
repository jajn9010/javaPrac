package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D2606 {
	static Queue<Integer> q;
	static int cnt=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		int su = Integer.parseInt(br.readLine());
		
		boolean[] map = new boolean[T+1];
		int[][] arr = new int[T+1][T+1];
		
		for (int i = 0; i < su; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		bfs(1, arr, map);
		System.out.println(cnt-1);
	}
	public static void bfs(int i, int[][] arr, boolean[] map) {
		q = new LinkedList<>();
		int n = map.length-1;
		
		q.add(i);
		map[i] = true;
		
		while(!q.isEmpty()) {
			int a = q.poll();
			cnt++;
			
			for (int j = 1; j <= n; j++) {
				if(arr[a][j] == 1 && !map[j]) {
					q.add(j);
					map[j] = true;
				}
			}
		}
	}
}
