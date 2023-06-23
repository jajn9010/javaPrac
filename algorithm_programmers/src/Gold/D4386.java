package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class D4386 {
	static int n;
	static int[] parents;
	static ArrayList<Node> nodes;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		Star[] star = new Star[n];
		parents = new int[n + 1];
		nodes = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			double x = Double.parseDouble(st.nextToken());
			double y = Double.parseDouble(st.nextToken());
			star[i] = new Star(i, x, y);
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				double r = Math.sqrt(Math.pow(star[j].x - star[i].x, 2) + Math.pow(star[j].y - star[i].y, 2));
				nodes.add(new Node(star[i].num, star[j].num, r));
			}
		}

		Collections.sort(nodes);

		make();

		double sum = 0;

		for (Node n : nodes) {
			if(find(n.x) != find(n.y)) {
				sum += n.r;
				union(n.x, n.y);
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

	private static int find(int v) {
		if (parents[v] == v)
			return v;
		else
			return parents[v] = find(parents[v]);
	}

	private static void make() {
		for (int i = 1; i <= n; i++) {
			parents[i] = i;
		}
	}

	private static class Star {
		int num;
		double x, y;
		
		Star(int num, double x, double y) {
			this.num = num;
			this.x = x;
			this.y = y;
		}
	}
	
	private static class Node implements Comparable<Node> {
		int x, y;
		double r;

		Node(int x, int y, double r) {
			this.x = x;
			this.y = y;
			this.r = r;
		}

		@Override
		public int compareTo(Node o) {
			if (this.r < o.r) {
				return -1;
			}
			return 1;
		}
	}
}
