package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class D14427 {
	static int N, M;
	static int[] arr, tree;
	static PriorityQueue<Long> q;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N + 1];
		tree = new int[N * 4];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		init(1, N, 1);
		
		M = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			if(a == 1) {
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				arr[b] = c;
				update(1, N, 1, b);
			} else {
				sb.append(tree[1]).append("\n");
			}
		}
		System.out.println(sb);
	}
	
	private static int update(int start, int end, int node, int idx) {
		if(idx < start || idx > end) return tree[node];
		if(start == end) return tree[node] = idx;
		int mid = (start + end) / 2;
		return tree[node] = minIndex(update(start, mid, node * 2, idx), update(mid + 1, end, node * 2 + 1, idx));
	}

	private static int minIndex(int x, int y) {
		if(arr[x] == arr[y]) return Math.min(x, y);
		else return arr[x] < arr[y] ? x : y;
	}

	private static int init(int start, int end, int node) {
		if(start == end) {
			return tree[node] = start;
		}
		
		int mid = (start + end) / 2;
		
		return tree[node] = minIndex(init(start, mid, node * 2), init(mid + 1, end, node * 2 + 1));
	}
}
