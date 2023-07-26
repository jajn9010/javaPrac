package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1614 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long finger = Integer.parseInt(br.readLine());
		long use = Integer.parseInt(br.readLine());
		long ans = 0L;
		
		if(finger == 1) {
			ans = use * 8;
		} else if (finger == 5) {
			ans = use * 8 + 4;
		} else {
			if(use % 2 == 0) {
				ans = use * 4 + finger - 1;
			} else {
				ans = use * 4 + 5 - finger;
			}
		}
		System.out.println(ans);
	}
}
