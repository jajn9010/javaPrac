package Platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D3830 {
	static int N, M;
	static int[] parent, weight;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String input = "";
		while(!(input = br.readLine()).equals("0 0")) {
			String[] str = input.split(" ");
			N = Integer.parseInt(str[0]);
			M = Integer.parseInt(str[1]);
			parent = new int[N + 1];
			weight = new int[N + 1];
			
			for (int i = 1; i <= N; i++) {
				parent[i] = i;
			}
			
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				
				if(s.equals("!")) {
					int a = Integer.parseInt(st.nextToken());
					int b = Integer.parseInt(st.nextToken());
					int weight = Integer.parseInt(st.nextToken());
					
					union(a, b, weight);
				} else {
					int a = Integer.parseInt(st.nextToken());
					int b = Integer.parseInt(st.nextToken());
					
					if(find(a) != find(b)) sb.append("UNKNOWN").append("\n");
					else sb.append(weight[b] - weight[a]).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
	
	private static void union(int a, int b, int w) {
		int parentA = find(a);
		int parentB = find(b);
		
		if(parentA == parentB) return; 
		
		parent[parentB] = parentA;
		weight[parentB] += (w - weight[b] + weight[a]);
	}
	
	private static int find(int x) {
		if(parent[x] == x) return x;
		else {
			int prev = find(parent[x]);
			weight[x] += weight[parent[x]];
			return parent[x] = prev;
		}
	}
}
