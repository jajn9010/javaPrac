package Platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2618 {
	static int[][] list = new int[1002][2], dp = new int[1002][1002];
	static int N, W;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		W = Integer.parseInt(br.readLine());

		for (int i = 1; i <= W; i++) {
			st = new StringTokenizer(br.readLine());
			list[i][0] = Integer.parseInt(st.nextToken());
			list[i][1] = Integer.parseInt(st.nextToken());
		}

		StringBuilder sb = new StringBuilder();
		sb.append(solve(1, 0, 0)).append("\n");

		int idx1 = 0, idx2 = 0;

		for (int i = 1; i <= W; i++) {
			int one = distance(1, idx1, i);

			if (dp[idx1][idx2] - one == dp[i][idx2]) {
				idx1 = i;
				sb.append(1).append("\n");
			} else {
				idx2 = i;
				sb.append(2).append("\n");
			}
		}
		
		System.out.println(sb);
	}

	private static int solve(int index, int one, int two) {
		if (index > W)
			return 0;

		if (dp[one][two] != 0)
			return dp[one][two];

		int one_move = solve(index + 1, index, two) + distance(1, one, index);

		int two_move = solve(index + 1, one, index) + distance(2, two, index);

		dp[one][two] = Math.min(one_move, two_move);

		return dp[one][two];
	}

	private static int distance(int sep, int start, int end) {

		int x_start = list[start][0], y_start = list[start][1], x_end = list[end][0], y_end = list[end][1];

		if (start == 0) {
			if (sep == 1) {
				x_start = y_start = 1;
			} else {
				x_start = y_start = N;
			}
		}

		return Math.abs(x_start - x_end) + Math.abs(y_start - y_end);
	}
}
