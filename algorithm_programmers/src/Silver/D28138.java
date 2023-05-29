package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class D28138 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long n = Long.parseLong(st.nextToken());
		long r = Long.parseLong(st.nextToken());
		long check = n - r;
		long sqrt = (long) Math.sqrt(check);
		
		ArrayList<Long> list = new ArrayList<>();

		for (int i = 1; i <= sqrt; i++) {
			if(check % i == 0) {
				list.add((long) i);
				if(check / i != i) {
					list.add(check / i);
				}
			}
		}
		
		long ans = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) > r) ans += list.get(i);
		}
		
		System.out.println(ans);
	}
}
