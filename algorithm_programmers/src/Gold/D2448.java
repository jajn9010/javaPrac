package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class D2448 {
	static char[][] star;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		star = new char[n][n * 2 - 1];

		for (int i = 0; i < n; i++) {
			Arrays.fill(star[i], ' ');
		}

		draw(0, n - 1, n);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n * 2 - 1; j++) {
				sb.append(star[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	private static void draw(int i, int j, int n) {
		if (n == 3) {
			star[i][j] = '*';
			star[i + 1][j - 1] = star[i + 1][j + 1] = '*';
			star[i + 2][j - 2] = star[i + 2][j - 1] = star[i + 2][j] = star[i + 2][j + 1] = star[i + 2][j + 2] = '*';
			return;
		} else {
			int curr = n / 2;
			draw(i, j, curr);
			draw(i + curr, j - curr, curr);
			draw(i + curr, j + curr, curr);
		}
	}
}
