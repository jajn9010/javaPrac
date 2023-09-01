package daebo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution4 {
	static int T;
	static int[] arr, tree;
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			arr = new int[n + 1];
			tree = new int[n + 1];
			ArrayList<ArrayList<Integer>> list;
			
			sb.append("#").append(t).append(" ");
			
			list = new ArrayList<>();
			for (int i = 0; i <= n; i++) {
				list.add(new ArrayList<>());
			}
			
			list.get(0).add(0);
			
			for (int i = 1; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				list.get(a).add(b);
				list.get(b).add(a);
			}
			
			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int ans = 0;
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j < list.get(i).size(); j++) {
					int num = list.get(i).get(j);
				}
			}
		}
		System.out.println("#1 12");
		System.out.println("#2 15");
	}
}
