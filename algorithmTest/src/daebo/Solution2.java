package daebo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution2 {
	static int T;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		T = Integer.parseInt(br.readLine());
		int mod = 1000000007;
		
		for (int k = 1; k <= T; k++) {
			int n = Integer.parseInt(br.readLine());
			ArrayList<Integer>list = new ArrayList<>();
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			
			int total = 0;
			
			for (int i = 0; i < n; i++) {
				int sum = list.get(i);
				int max = sum;
				int min = Collections.min(list);
				int idx = list.indexOf(min);
				for (int j = i + 1; j < n; j++) {
					sum += list.get(j);
					if(j == idx && min < 0) {
						sum -= min;
					}
					if(sum > max) {
						max = sum;
					}
				}
				if(i != n - 1) {
					sum = max;
				}
				if(i != 0) {
					for (int j = i - 1; j >= 0; j--) {
						sum += list.get(j);
						if(j == idx && min < 0) {
							sum -= min;
						}
						if(sum > max) {
							max = sum;
						}
					}
				}
				total += Math.abs(max);
			}
			
			total %= mod;
		
			sb.append("#").append(k).append(" ").append(total).append("\n");
		}
		System.out.println(sb);
	}
}

/*
3
5
-1 2 -3 2 -1
1
0
4
1 1 1 1
 */

