package Platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D2419 {
	static int n, m, ans = 0;
	static int[] dp, arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		dp = new int[(n + 1) * (n + 1)];
		arr = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		for (int i = 1, s = Arrays.binarySearch(arr, 0); i <= n; i++) {
			Arrays.fill(dp, -1);
			ans = Math.max(ans, i * m - recur(s, s, i));
		}
		System.out.println(ans);
	}

	private static int recur(int start, int end, int left) {
		if (left < 1)
			return 0;

		if (dp[start * (n + 1) + end] != -1)
			return dp[start * (n + 1) + end];
		
		int l = Math.min(start, end), r = Math.max(start, end);
		dp[start * (n + 1) + end] = Integer.MAX_VALUE;
		
		if (r < n)
			dp[start * (n + 1) + end] = Math.min(dp[start * (n + 1) + end], recur(l, r + 1, left - 1) + left * (arr[r + 1] - arr[end]));
		
		if (l > 0)
			dp[start * (n + 1) + end] = Math.min(dp[start * (n + 1) + end], recur(r, l - 1, left - 1) + left * (arr[end] - arr[l - 1]));
		
		return dp[start * (n + 1) + end];
	}
}
