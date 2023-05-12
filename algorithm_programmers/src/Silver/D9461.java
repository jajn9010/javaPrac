package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D9461 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		long[] ans = new long [101];
		ans[0] = 0;
		ans[1] = 1;
		ans[2] = 1;
		ans[3] = 1;
		ans[4] = 2;

		while (T-- > 0) {
			int a = Integer.parseInt(br.readLine());
			if (a > 4) {
				for (int i = 5; i <= a; i++) {
					ans[i] = ans[i-1] + ans[i-5];
				}
			}
			sb.append(ans[a]).append("\n");
		}
		System.out.println(sb);
	}
}
