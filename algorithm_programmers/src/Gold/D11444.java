package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D11444 {
	final static int mod = 1000000007;
	static long[][] origin = { { 1, 1 }, { 1, 0 } };

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long[][] A = { { 1, 1 }, { 1, 0 } };

		long n = Long.parseLong(br.readLine());

		System.out.println(pow(A, n - 1)[0][0]);
	}

	private static long[][] pow(long[][] A, long ex) {
		if (ex == 1 || ex == 0)
			return A;

		long[][] ret = pow(A, ex / 2);
		
		ret = multy(ret, ret);
		
		if(ex % 2 == 1L) {
			ret = multy(ret, origin);
		}

		return ret;
	}

	private static long[][] multy(long[][] o1, long[][] o2) {
		long[][] ret = new long[2][2];
		
		ret[0][0] = ((o1[0][0] * o2[0][0]) + (o1[0][1] * o2[1][0])) % mod;
		ret[0][1] = ((o1[0][0] * o2[0][1]) + (o1[0][1] * o2[1][1])) % mod;
		ret[1][0] = ((o1[1][0] * o2[0][0]) + (o1[1][1] * o2[1][0])) % mod;
		ret[1][1] = ((o1[1][0] * o2[0][1]) + (o1[1][1] * o2[1][1])) % mod;
		
		return ret;
	}
}
