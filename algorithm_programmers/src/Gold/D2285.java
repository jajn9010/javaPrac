package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D2285 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		Pair[] pair = new Pair[N];

		long total = 0L;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			long x = Long.parseLong(st.nextToken());
			long a = Long.parseLong(st.nextToken());

			pair[i] = new Pair(x, a);
			total += a;
		}

		Arrays.sort(pair);

		long sum = 0L;
		for (Pair p : pair) {
			sum += p.a;
			if (sum >= (total + 1) / 2) {
				System.out.println(p.x);
				break;
			}
		}
	}

	public static class Pair implements Comparable<Pair> {
		long x, a;

		Pair(long x, long a) {
			this.x = x;
			this.a = a;
		}

		@Override
		public int compareTo(Pair o) {
			if (this.x == o.x) {
				return (int) (this.a - o.a);
			}
			return (int) (this.x - o.x);
		}
	}
}
