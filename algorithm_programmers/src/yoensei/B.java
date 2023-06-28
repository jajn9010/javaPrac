package yoensei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int X = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		HashMap<Long, Long> lMap = new HashMap<>();
		HashMap<Long, Long> rMap = new HashMap<>();

		for (Long i = 1L; i <= K; i++) {
			lMap.put(i, 0L);
			rMap.put(i, 0L);
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < X; i++) {
			long x = Long.parseLong(st.nextToken());

			if (lMap.get(x) == 0)
				lMap.put(x, 1L);
			else
				lMap.put(x, lMap.get(x) + 1L);
		}
		for (int i = 0; i < X; i++) {
			long x = Long.parseLong(st.nextToken());

			if (rMap.get(x) == 0)
				rMap.put(x, 1L);
			else
				rMap.put(x, rMap.get(x) + 1L);
		}
		
		long ans = 0;
		for (long i = 1; i <= K; i++) {
			for (long j = 1; j <= K; j++) {
				if(i == j) continue;
				ans += lMap.get(i) * rMap.get(j);
			}
		}
		
		System.out.println(ans);
	}
}
