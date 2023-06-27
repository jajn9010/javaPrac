package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D2225_2 {
	static int cnt;
	static int n, k, mod;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		mod = 1000000000;
		
		int[][] dp = new int[k + 1][n + 1];
		Arrays.fill(dp[1], 1);
		
		for (int i = 1; i <= k; i++) dp[i][0] = 1;
		
		for (int i = 2; i <= k; i++) {
			for (int j = 1; j <= n; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
				dp[i][j] = dp[i][j] % mod;
			}
		}
		
		System.out.println(dp[k][n]);
	}
}
