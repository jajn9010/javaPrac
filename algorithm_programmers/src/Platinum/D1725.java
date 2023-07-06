package Platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1725 {
	static int N;
	static int[] arr, tree;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N + 1];
		tree = new int[N * 4 + 1];
		
		for (int i = 1; i <= N; i++) {
			int val = Integer.parseInt(br.readLine());
			arr[i] = val;
		}
		
		init(1, N, 1);
		System.out.println(solve(1, N));
	}

	private static int solve(int left, int right) {
		int minIdx = query(1, N, 1, left, right);
		
		int area = (right - left + 1) * arr[minIdx];
		int val = 0;
		if(left < minIdx) {
			val = solve(left, minIdx - 1);
			area = area < val ? val : area;
		}
		
		if(minIdx < right) {
			val = solve(minIdx + 1, right);
			area = area < val ? val : area;
		}
		
		return area;
	}

	private static int query(int start, int end, int node, int left, int right) {
		if(end < left || right < start) return -1;
		if(left <= start && end <= right) return tree[node];
		
		int mid = (start + end) >> 1;
		
		int l = query(start, mid, node * 2, left, right);
		int r = query(mid + 1, end, node * 2 + 1, left, right);
		
		if(l == -1) return r;
		else if(r == -1) return l;
		else return arr[l] < arr[r] ? l : r;
	}

	private static int init(int start, int end, int node) {
		if(start == end) return tree[node] = start;
		
		int mid = (start + end) >> 1;
		
		int left = init(start, mid, node * 2);
		int right = init(mid + 1, end, node * 2 + 1);
		
		return tree[node] = arr[left] < arr[right] ? left : right;
	}
}
