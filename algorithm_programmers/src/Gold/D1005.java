package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D1005 {
	static int N, K;
	static int[] cost;
	static StringBuilder sb;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			cost = new int[N + 1];
			ArrayList<ArrayList<Integer>> nodes = new ArrayList<>();
			
			for (int i = 0; i <= N; i++) {
				nodes.add(new ArrayList<>());
			}
			
			int[] indegree = new int[N + 1];
			
			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= N; i++) {
				cost[i] = Integer.parseInt(st.nextToken());
			}
			
			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				int v1 = Integer.parseInt(st.nextToken());
				int v2 = Integer.parseInt(st.nextToken());
				
				nodes.get(v1).add(v2);
				indegree[v2]++;
			}
			
			int win = Integer.parseInt(br.readLine());
			
			topologicalSort(indegree, nodes, win);
		}
		System.out.println(sb);
	}

	private static void topologicalSort(int[] indegree, ArrayList<ArrayList<Integer>> nodes, int win) {
		Queue<Integer> q = new LinkedList<>();
		int[] result = new int[N + 1];
		
		for (int i = 1; i <= N; i++) {
			result[i] = cost[i];
			
			if(indegree[i] == 0) {
				q.add(i);
			}
		}
		
		while(!q.isEmpty()) {
			int node = q.poll();
			
			for (int item : nodes.get(node)) {
				result[item] = Math.max(result[item], result[node] + cost[item]);
				indegree[item]--;
				
				if(indegree[item] == 0) {
					q.add(item);
				}
			}
		}
		sb.append(result[win]).append("\n");
	}
}
