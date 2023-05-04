package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D15829 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		char[] ch = br.readLine().toCharArray();
		int r = 31;
		int m = 1234567891;
		long sum = 0;
		long mod = 1;
		for (int i = 0; i < T; i++) {
			sum += ((int) ((ch[i] - 'a' + 1) * mod));
			mod = (r * mod)%m;
		}
		System.out.println(sum%m);
	}
}
