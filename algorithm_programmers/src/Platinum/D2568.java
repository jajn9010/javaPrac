package Platinum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class D2568 {
	static Pair[] list;
	static int[] ans;
	static boolean[] visited;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
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
		
		for (int i = 1; i < N; i++) {
			if(ans[idx] < list[i].y) {
				ans[++idx] = list[i].y;
				trace[i] = new Pair(idx, list[i].x);
			} else {
				int lower_bound = binarySearch(0, idx, list[i].y);
				ans[lower_bound -1 ] = list[i].y;
				trace[i] = new Pair(lower_bound - 1, list[i].y);
			}
		}
		
		System.out.println(N - (idx + 1));
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
		return right + 1;
	}
}
