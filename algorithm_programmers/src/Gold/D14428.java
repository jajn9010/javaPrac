package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class D14428 {
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
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a == 1) {
				arr[b] = c;
				update(1, N, 1, b, c);
			} else {
				sb.append(query(1, N, 1, b, c)).append("\n");
			}
		}
		System.out.println(sb);
	}
	
	private static int query(int start, int end, int node, int left, int right) {
		if(right < start || left > end) return -1;
		
		if(left <= start && end <= right) return tree[node];
		
		int mid = (start + end) / 2;
		int l = query(start, mid, node * 2, left, right);
		int r = query(mid + 1, end, node * 2 + 1, left, right);
		
		if(l == -1) return r;
		else if (r == -1) return l;
		else {
			if(arr[l] <= arr[r]) return l;
			else return r;
		}
	}

	private static void update(int start, int end, int node, int idx, int val) {
		if(idx < start || idx > end) return;
		if(start == end) {
			tree[node] = idx;
			arr[idx] = val;
			return;
		}
		int mid = (start + end) / 2;
		
		update(start, mid, node * 2, idx, val);
		update(mid + 1, end, node * 2 + 1, idx, val);
		
		if(arr[tree[node * 2]] <= arr[tree[node * 2 + 1]]) tree[node] = tree[node * 2];
		else tree[node] = tree[node * 2 + 1];
	}

	

	private static void init(int start, int end, int node) {
		if(start == end) {
			tree[node] = start;
		} else {
			int mid = (start + end) / 2;
			init(start, mid, node * 2);
			init(mid + 1, end, node * 2 + 1);
			
			if(arr[tree[node * 2]] <= arr[tree[node * 2 + 1]]) tree[node] = tree[node * 2];
			else tree[node] = tree[node * 2 + 1];
		}
		
	}
}
