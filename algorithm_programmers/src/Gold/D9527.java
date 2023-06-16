package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D9527 {
	static long[] bit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		setbit();
		
		long ans = getbit(B) - getbit(A -1);
		
		System.out.println(String.valueOf(ans));
	}
	private static long getbit(long x) {
		long ans = x & 1;
		
		for (int i = 54; i > 0; i--) {
			if((x & (1L << i)) > 0L) {
				ans += bit[i - 1] + (x - (1L << i) + 1);
				x -= (1L << i);
			}
		}
		return ans;
	}
	private static void setbit() {
		bit = new long[55];
		bit[0] = 1;
		for (int i = 1; i < 55; i++) {
			bit[i] = 2 * bit[i - 1] + (1L << i);
		}
	}
}
