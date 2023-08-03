package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D16565 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int mod = 10007;
		
		int[][] cards = new int[53][53];
		
		for (int i = 0; i < 53; i++) {
			cards[i][0] = 1;
		}
		
		for (int i = 1; i < 53; i++) {
			for (int j = 1; j < 53; j++) {
				cards[i][j] = (cards[i - 1][j] + cards[i -1][j - 1]) % mod;
			}
		}
		
		int ans = 0;
		for (int i = 1; i <= 13 && N - i * 4 >= 0; i++) {
			if(i % 2 == 1) ans = (ans + cards[52 - 4 * i][N - 4 * i] * cards[13][i] % mod) % mod;
			else ans = (ans - cards[52 - 4 * i][N - 4 * i] * cards[13][i] % mod + mod) % mod;
		}
		
		System.out.println(ans);
	}
}
