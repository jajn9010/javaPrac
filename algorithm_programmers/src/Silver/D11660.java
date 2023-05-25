package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D11660 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				if (j == 0) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				} else {
					arr[i][j] = arr[i][j - 1] + Integer.parseInt(st.nextToken());
				}
			}
		}

		for (int i = 1; i <= m; i++) {
			int x1, x2, y1, y2, total = 0;
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());

			for (int j = x1; j <= x2; j++) {
				total += arr[j][y2] - arr[j][y1-1];
			}
			sb.append(total).append("\n");
		}
		System.out.println(sb);
	}
}
