package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1978 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		int ans = 0;
		st = new StringTokenizer(br.readLine());
		while(T-- > 0) {
			int a = Integer.parseInt(st.nextToken());
			
			if(a == 1) continue;
			else {
				int cnt = 0;
				for (int i = 1; i <= a; i++) {
					if(a%i == 0) cnt++;
				}
				if(cnt == 2) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
