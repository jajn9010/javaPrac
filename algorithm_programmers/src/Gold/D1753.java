package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class node {
	int idx, cost;

	public node(int idx, int cost) {
		this.idx = idx;
		this.cost = cost;
	}
}

public class D1753 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int v = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());

		int start = Integer.parseInt(br.readLine());

		ArrayList<ArrayList<node>> graph = new ArrayList<>();

		for (int i = 0; i < v + 1; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < e; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());

			graph.get(a).add(new node(b, cost));
		}

		boolean[] visited = new boolean[v + 1];
		int[] dist = new int[v + 1];

		for (int i = 0; i < v + 1; i++) {
			dist[i] = Integer.MAX_VALUE;
		}

		dist[start] = 0;

		for (int i = 0; i < v; i++) {
			int nodeValue = Integer.MAX_VALUE;
			int nodeIdx = 0;

			for (int j = 1; j < v + 1; j++) {
				if (!visited[j] && dist[j] < nodeValue) {
					nodeValue = dist[j];
					nodeIdx = j;
				}
			}

			visited[nodeIdx] = true;

			for (int j = 0; j < graph.get(nodeIdx).size(); j++) {
				node adjNode = graph.get(nodeIdx).get(j);

				if (dist[adjNode.idx] > dist[nodeIdx] + adjNode.cost) {
					dist[adjNode.idx] = dist[nodeIdx] + adjNode.cost;
				}
			}
		}

		for (int i = 1; i < v + 1; i++) {
			if (dist[i] == Integer.MAX_VALUE) {
				System.out.println("INF");
			} else {
				System.out.println(dist[i]);
			}
		}
	}
}
