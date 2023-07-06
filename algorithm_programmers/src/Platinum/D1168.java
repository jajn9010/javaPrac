package Platinum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class D1168 {
	static int N, K;
	static int[] arr, tree;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		tree = new int[N * 4 + 1];
		
		init(1, N, 1);
		
		int idx = 1;
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for (int i = 0; i < N; i++) {
			int size = N - i;
			idx += K - 1;
			
			if(idx % size == 0) idx = size;
			else if(idx > size) idx %= size;
			
			int ans = query(1, N, 1, idx);
			
			update(1, N, 1, ans);
			
			if(i == N - 1) sb.append(ans).append(">");
			else sb.append(ans).append(", ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	private static int update(int start, int end, int node, int idx) {
		tree[node]--;
		if(start == end) return 0;
		else {
			int mid = (start + end) / 2;
			if(idx <= mid) return update(start, mid, node * 2, idx);
			else return update(mid + 1, end, node * 2 + 1, idx);
		}
	}

	private static int query(int start, int end, int node, int idx) {
		if(start == end) return start;
		int mid = (start + end) / 2;
		if(idx <= tree[node * 2]) return query(start, mid, node * 2, idx);
		else return query(mid + 1, end, node * 2 + 1, idx - tree[node * 2]);
	}

	private static int init(int start, int end, int node) {
		if(start == end) return tree[node] = 1;
		int mid = (start + end) / 2;
		return tree[node] = init(start, mid, node * 2) + init(mid + 1, end, node * 2 + 1);
	}
}
