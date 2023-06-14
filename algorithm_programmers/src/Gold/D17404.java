package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D17404 {
	static int r = 0, g = 1, b = 2;
	static int[][] cost, dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		cost = new int[N][3];
		dp = new int[N][3];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			cost[i][r] = Integer.parseInt(st.nextToken());
			cost[i][g] = Integer.parseInt(st.nextToken());
			cost[i][b] = Integer.parseInt(st.nextToken());
		}
		
		int ans = 1000000;
		for (int k = 0; k < 3; k++) {
			for (int i = 0; i < 3; i++) {
				if(i == k) dp[0][i] = cost[0][i];
				else dp[0][i] = 1000000;
			}
			
			for (int i = 1; i < N; i++) {
				dp[i][r] = Math.min(dp[i - 1][g], dp[i - 1][b]) + cost[i][r];
				dp[i][g] = Math.min(dp[i - 1][r], dp[i - 1][b]) + cost[i][g];
				dp[i][b] = Math.min(dp[i - 1][r], dp[i - 1][g]) + cost[i][b];
			}
			
			for (int i = 0; i < 3; i++) {
				if(i != k) {
					ans = Math.min(ans, dp[N - 1][i]);
				}
			}
		}
		
		System.out.println(ans);
	}
}
