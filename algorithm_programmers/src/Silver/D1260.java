package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;


public class D1260 {
	static int[] map;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int[][] graph = new int [m+1][2];
		visited = new boolean[m+1];
		
		for (int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			graph[i][0] = Integer.parseInt(st.nextToken());
			graph[i][1] = Integer.parseInt(st.nextToken());
		}
		
//		System.out.println(dfs(v, graph, visited));
		System.out.println(bfs(v, graph, visited));
	}
	public static String dfs(int v, int[][] graph, boolean[] visited2) {
		Stack<Integer> s = new Stack<>();
		
		s.push(v);
		
		visited2[v] = true;
		
		while(!s.isEmpty()) {
			int node = s.pop();
			sb.append(node).append(" ");
			
			for (int i = 0; i < graph[node].length; i++) {
				
			}
		}
		
		return sb.toString();
	}
	public static String bfs(int v, int[][] graph, boolean[] visited2) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(v);
		
		visited2[v] = true;
		
		while(!q.isEmpty()) {
			int node = q.poll();
			sb.append(node).append(" ");
			
			for (int i = 0; i < graph[node].length; i++) {
				int temp = graph[node][i];
				if(!visited[temp]) {
					visited[temp] = true;
					q.offer(temp);
				}
			}
		}
		return sb.toString();
	}
}
