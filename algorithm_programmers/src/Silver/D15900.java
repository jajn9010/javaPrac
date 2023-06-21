package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class D15900 {
	static ArrayList<ArrayList<Integer>> nodes;
	static int ans;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		nodes = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i <= N; i++) {
			nodes.add(new ArrayList<>());
		}
		
		for (int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			nodes.get(a).add(b);
			nodes.get(b).add(a);
		}
		
		boolean[] visited = new boolean[N + 1];
		dfs(1, 0, visited);
		
		System.out.println((ans % 2 == 0)? "No" : "Yes");
	}


	private static void dfs(int node, int cnt, boolean[] visited) {
		visited[node] = true;
		
		for(int item : nodes.get(node)) if(!visited[item]) dfs(item, cnt + 1, visited); 
		
		if(node != 1 && nodes.get(node).size() == 1) ans += cnt;
	}
}
