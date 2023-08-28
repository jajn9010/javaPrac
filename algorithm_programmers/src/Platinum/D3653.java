package Platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D3653 {
	static int T, n, m;

	static class SegTree {
		int[] tree;

		SegTree(int n) {
			tree = new int[n];
		}

		public int init(int node, int start, int end) {
			if (start == end) {
				if (start < m) return tree[node] = 0;
				else return tree[node] = 1;
			}

			int mid = (start + end) / 2;

			return tree[node] = init(node * 2, start, mid) + init(node * 2 + 1, mid + 1, end);
		}

		public int sum(int node, int start, int end, int left, int right) {
			if (right < start || end < left) return 0;
			if (left <= start && end <= right) return tree[node];
			
			int mid = (start + end) / 2;
			
			return sum(node * 2, start, mid, left, right) + sum(node * 2 + 1, mid + 1, end, left, right);
		}

		public void update(int node, int start, int end, int idx, int diff) {
			if (idx < start || end < idx) return;
			
			tree[node] += diff;
			
			if (start == end) return;
			
			int mid = (start + end) / 2;
			
			update(node * 2, start, mid, idx, diff);
			update(node * 2 + 1, mid + 1, end, idx, diff);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());

			int[] index = new int[n + 1];

			for (int i = 1; i <= n; i++) {
				index[i] = i + m - 1;
			}

			SegTree sg = new SegTree(4 * (n + m));
			sg.init(1, 0, n + m - 1);
			
			st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < m; i++) {
				int movie = Integer.parseInt(st.nextToken());
				int idx = index[movie];
				
				sb.append(sg.sum(1, 0, n + m - 1, 0, idx - 1)).append(" ");
				sg.update(1, 0, n + m - 1, idx, -1);
				sg.update(1, 0, n + m - 1, m - 1 - i, 1);
				index[movie] = m - 1 - i;
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
