package Platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class D2568 {
	static Pair[] list;
	static int[] ans;
	static boolean[] visited;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		list = new Pair[N];
		visited = new boolean[500001];
		Pair[] trace = new Pair[N];
		
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list[i] = new Pair(a, b);
			visited[a] = true;
		}
		
		Arrays.sort(list, new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				return o1.x - o2.x;
			}
		});
		
		int idx = 0;
		
		ans = new int[N];
		ans[idx] = list[0].y;
		trace[0] = new Pair(0, list[0].x);
		
		for (int i = 1; i < N; i++) {
			if(ans[idx] < list[i].y) {
				ans[++idx] = list[i].y;
				trace[i] = new Pair(idx, list[i].x);
			} else {
				int lower_bound = binarySearch(0, idx, list[i].y);
				ans[lower_bound] = list[i].y;
				trace[i] = new Pair(lower_bound, list[i].x);
			}
		}
		
		sb.append(N - (idx + 1)).append("\n");

		ArrayList<Integer> arr = new ArrayList<>();
		
		
		for (int i = N - 1; i >= 0 ; i--) {
			if(trace[i].x == idx) {
				arr.add(trace[i].y);
				idx--;
			}
		}
		
		for(int a : arr) visited[a] = false;
		
		for (int i = 0; i <= 500000; i++) {
			if(visited[i]) sb.append(i).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static class Pair {
		int x, y;
		
		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static int binarySearch(int left, int right, int v) {
		int mid = 0;
		while (left < right) {
			mid = (left + right) / 2;
			if(ans[mid] >= v) right = mid;
			else left = mid + 1;
		}
		return right;
	}
}
