package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D16953 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int ans = 1;
		
		while(b != a) {
			if(b < a) {
				ans = -1;
				break;
			}
			if(b % 10 != 1 && b % 2 != 0) {
				ans = -1;
				break;
			}
			
			if(b % 2 == 0) {
				ans++;
				b /= 2;
			} else if(b % 10 == 1) {
				ans++;
				b /= 10;
			}
		}
		System.out.println(ans);
	}
}
