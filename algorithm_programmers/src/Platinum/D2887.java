package Platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class D2887 {
	static int[] parents;
	static ArrayList<Node> nodes;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		Point[] points = new Point[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());

			points[i] = new Point(i, x, y, z);
		}

		nodes = new ArrayList<>();
		
		Arrays.sort(points, (p1, p2) -> p1.x - p2.x);
		for (int i = 0; i < N - 1; i++) {
			int cost = Math.abs(points[i].x - points[i + 1].x);
			nodes.add(new Node(points[i].num, points[i + 1].num, cost));
		}
		
		Arrays.sort(points, (p1, p2) -> p1.y - p2.y);
		for (int i = 0; i < N - 1; i++) {
			int cost = Math.abs(points[i].y - points[i + 1].y);
			nodes.add(new Node(points[i].num, points[i + 1].num, cost));
		}
		
		Arrays.sort(points, (p1, p2) -> p1.z - p2.z);
		for (int i = 0; i < N - 1; i++) {
			int cost = Math.abs(points[i].z - points[i + 1].z);
			nodes.add(new Node(points[i].num, points[i + 1].num, cost));
		}
		
		parents = new int[N];
		for (int i = 0; i < N; i++) {
			parents[i] = i;
		}
		
		Collections.sort(nodes);
		
		int sum = 0;
		for(Node n : nodes) {
			if(find(n.from) != find(n.to)) {
				sum += n.cost;
				union(n.from, n.to);
			}
		}
		System.out.println(sum);
	}

	private static void union(int from, int to) {
		int fromRoot = find(from);
		int toRoot = find(to);
		
		if(fromRoot != toRoot) {
			parents[toRoot] = fromRoot;
		}
	}

	private static int find(int x) {
		if(parents[x] == x) return x;
		else return parents[x] = find(parents[x]); 
	}

	public static class Point {
		int num, x, y, z;

		Point(int num, int x, int y, int z) {
			this.num = num;
			this.x = x;
			this.y = y;
			this.z = z;
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
