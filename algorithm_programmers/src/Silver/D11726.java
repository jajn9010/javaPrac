package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D11726 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		long[] arr = new long[n + 1];

		for (int i = 1; i <= n; i++) {
			if (i <= 3)
				arr[i] = i;
			else {
				arr[i] = (arr[i - 1] + arr[i - 2]) % 10007;
			}
		}

		System.out.println(arr[n]);
	}
}
