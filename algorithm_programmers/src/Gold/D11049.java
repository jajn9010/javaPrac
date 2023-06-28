package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D11049 {
	static int[][] list, dp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		list = new int[N][2];
		dp = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			list[i][0] = Integer.parseInt(st.nextToken());
			list[i][1] = Integer.parseInt(st.nextToken());
			Arrays.fill(dp[i], Integer.MAX_VALUE);
		}
		
		System.out.println(solve(0, N - 1));
	}

	private static int solve(int start, int end) {
		if(start == end) return 0;
		if(dp[start][end] != Integer.MAX_VALUE) {
			return dp[start][end];
		}
		
		for (int i = start; i < end; i++) {
			int cost = solve(start, i) + solve(i + 1, end) + list[start][0] * list[i][1] * list[end][1];
			dp[start][end] = Math.min(dp[start][end], cost);
		}
		return dp[start][end];
	}
}
