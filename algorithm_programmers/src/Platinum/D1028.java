package Platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1028 {
	static int R, C, ans;
	static int[][] map;
	static int[][][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new int[R][C];

		for (int i = 0; i < R; i++) {
			String str = br.readLine();
			for (int j = 0; j < C; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}

		dp = new int[R][C][2];

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (map[i][j] == 0) continue;

				dp[i][j][0] = isIn(i - 1, j + 1) ? dp[i - 1][j + 1][0] + 1 : 1;
				dp[i][j][1] = isIn(i - 1, j - 1) ? dp[i - 1][j - 1][1] + 1 : 1;

				for (int len = 0, max = Math.min(dp[i][j][0], dp[i][j][1]); len < max; len++) {
					if (!isIn(i - 2 * len, j - len) || !isIn(i - 2 * len, j + len)) break;

					if (dp[i - len][j - len][0] > len && dp[i - len][j + len][1] > len) ans = Math.max(ans, len + 1);
				}
			}
		}
		System.out.println(ans);
	}

	private static boolean isIn(int r, int c) {
		return 0 <= r && r < R && 0 <= c && c < C;
	}
}
