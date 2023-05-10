package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D14471 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int [m];
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int ans = 0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] <= n) {
				ans += n-arr[i];
			}
		}
		
		System.out.println(ans);
	}
}
