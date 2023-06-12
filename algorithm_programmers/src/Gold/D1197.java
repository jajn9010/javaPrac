package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class D1197 {
	static int V, E;
	static int[] parents;
	static ArrayList<Node> nodeList;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		
		parents = new int[V + 1];
		nodeList = new ArrayList<>();
		
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			nodeList.add(new Node(from, to, cost));
		}
		
		Collections.sort(nodeList);
		
		make();
		
		int sum = 0, cnt = 0;
		
		for(Node n : nodeList) {
			if(union(n.from, n.to)) {
				sum += n.cost;
				cnt++;
				
				if(cnt == E -1) break;
			}
		}
		
		System.out.println(sum);
	}
	
	private static boolean union(int from, int to) {
		int fromRoot = find(from);
		int toRoot = find(to);
		
		if(fromRoot == toRoot) return false;
		else parents[toRoot] = fromRoot;
		return true;
	}

	private static int find(int v) {
		if(parents[v] == v) return v;
		else return parents[v] = find(parents[v]);
	}

	private static void make() {
		for (int i = 1; i <= V; i++) {
			parents[i] = i;
		}
	}

	public static class Node implements Comparable<Node>{
		int from, to, cost;
		
		Node(int from, int to, int cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}

		@Override
		public int compareTo(Node o) {
			return this.cost - o.cost;
		}
	}
}
