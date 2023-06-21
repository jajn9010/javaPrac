package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D28017 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] dp = new int[N][M];
		int[][] list = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				list[i][j] = Integer.parseInt(st.nextToken());
				if(i == 0) dp[i][j] = list[i][j];
			}
		}
		
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int min = Integer.MAX_VALUE;
				for (int k = 0; k < M; k++) {
					if(j != k) {
						min = Math.min(min, dp[i - 1][k]);
					}
				}
				dp[i][j] = list[i][j] + min;
			}
		}
		
		int ans = Integer.MAX_VALUE;
		for (int item : dp[N - 1]) ans = Math.min(ans, item);
		
		System.out.println(ans);
	}
}
