package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2268 {
	static int N, M;
	static long[] tree;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		tree = new long[N * 4];

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if (a == 1) {
				update(1, N, 1, b, c);
			} else if (a == 0) {
				if(b > c) {
					int temp = b;
					b = c;
					c = temp;
				}
				
				sb.append(sum(1, N, 1, b, c)).append("\n");
			}
		}

		System.out.println(sb);
	}

	private static long sum(int start, int end, int node, int left, int right) {
		if (left > end || right < start) {
			return 0;
		}

		if (left <= start && right >= end) {
			return tree[node];
		}

		int mid = (start + end) / 2;

		return sum(start, mid, node * 2, left, right) + sum(mid + 1, end, node * 2 + 1, left, right);
	}

	private static long update(int start, int end, int node, int idx, long val) {
		if (idx < start || idx > end)
			return tree[node];

		if (start == end) {
			return tree[node] = val;
		}

		int mid = (start + end) / 2;

		return tree[node] = update(start, mid, node * 2, idx, val) + update(mid + 1, end, node * 2 + 1, idx, val);
	}
}
