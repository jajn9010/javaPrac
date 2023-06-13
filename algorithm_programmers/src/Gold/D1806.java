package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1806 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		int[] list = new int[N + 1];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		int ans = Integer.MAX_VALUE;
		int start = 0, end = 0, total = 0;
		
		while(start <= N && end <= N) {
			if(total >= S && ans > end - start) ans = end - start;
			if(total < S) total += list[end++];
			else total -= list[start++];
		}
		
		if(ans == Integer.MAX_VALUE) System.out.println(0);
		else System.out.println(ans);
	}
}
