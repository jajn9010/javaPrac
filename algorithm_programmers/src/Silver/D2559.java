package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2559 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] list = new int[n];
		int[] hap = new int[n - k + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < hap.length; i++) {
			int total = 0;
			for (int j = i; j < i + k; j++) {
				total += list[j];
			}
			hap[i] = total;
		}
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < hap.length; i++) {
			if(max < hap[i]) max = hap[i];
		}
		
		System.out.println(max);
	}
}