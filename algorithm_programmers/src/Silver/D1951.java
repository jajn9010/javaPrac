package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1951 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long N = Long.parseLong(br.readLine());

		long ans = 0;
		long mod = 1234567;

		while(N > 9) {
			long len = Long.toString(N).length();
			ans += (N - Math.pow(10, len - 1) + 1) * len;
			N = (long) Math.pow(10, len - 1 ) - 1;
		}
		
		ans += N;
		
		System.out.println(ans % mod);
	}
}
