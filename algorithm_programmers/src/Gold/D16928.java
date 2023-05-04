package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D16928 {
	static Queue<Integer> q;
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[101];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		while(n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x] = y;
		}
		
		while(m-- > 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x] = y;
		}
		System.out.println(bfs(1));
	}
	
	static int bfs(int n) {
		int[] check = new int[101];
		q = new LinkedList<>();
		q.offer(n);
		check[n] = 0;
		
		while(true) {
			int visited = q.poll();
			
			for(int i = 1; i < 7; i++) {
				int nextN = visited+i;
				
				if(nextN > 100) {
					continue;
				}
				
				if(check[arr[nextN]] == 0) {
					q.offer(arr[nextN]);
					check[arr[nextN]] = check[visited] + 1;
				}
				
				if(arr[nextN] == 100) {
					return check[100];
				}
			}
		}
	}
}
