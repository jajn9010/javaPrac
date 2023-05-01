package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D11720 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch;
		int ans = 0;
		
		int T = Integer.parseInt(br.readLine());
		String str = br.readLine();
		for (int i = 0; i < T; i++) {
			ch = str.charAt(i);
			ans += ch - '0';
		}
		System.out.println(ans);
	}
}
