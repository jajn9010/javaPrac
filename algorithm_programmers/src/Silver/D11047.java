package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Integer[] arr = new Integer [n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr, (i1, i2) -> i2 - i1);
		
		int ans = 0;
		
		for (int i = 0; i < arr.length; i++) {
			ans += k / arr[i];
			k = k % arr[i];
		}
		
		System.out.println(ans);
	}
}
