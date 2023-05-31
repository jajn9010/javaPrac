package Platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D24518 {
	static long N, M, mod, sqrt;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		mod = 1000000007;
		sqrt = (int) Math.sqrt(N);

		long total = 0L;

		for (int i = 1; i <= sqrt; i++) {
			total = (total + ((N / i) * (i % M))) % mod;
		}

		for (int i = 1; i + 1 <= N / sqrt; i++) {
			total = (total + (i * (sum(N / i) - sum(N / (i + 1))))) % mod;
		}

		System.out.println(total);
	}

	private static long sum(long x) {
		long res = 0;
		long T = (x + 1) / M;
		long start = T * M;
		
		res += T * M * (M - 1) / 2;
		res += (x - start) * (x - start + 1) / 2;
		
		return res;
	}
}
