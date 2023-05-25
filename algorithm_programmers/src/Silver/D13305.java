package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D13305 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		long[] road = new long[n-1];
		long[] price = new long[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n-1; i++) {
			road[i] = Long.parseLong(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < price.length; i++) {
			price[i] = Long.parseLong(st.nextToken());
		}
		
		for (int i = 0; i < n-1; i++) {
			if(price[i] < price[i+1]) {
				price[i+1] = price[i];
			}
		}
		
		long ans = 0;
		for (int i = 0; i < n-1; i++) {
			ans += price[i] * road[i];
		}
		
		System.out.println(ans);
	}
}
