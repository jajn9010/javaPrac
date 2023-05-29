package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2559_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] list = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			if(i==0) {
				list[i] = Integer.parseInt(st.nextToken());
			} else {
				list[i] = list[i-1] + Integer.parseInt(st.nextToken());
			}
		}
		
		int max = list[k-1];
		
		for (int i = k; i < n; i++) {
			max = Math.max(max, list[i] - list[i-k]);
		}
		
		System.out.println(max);
	}
}
