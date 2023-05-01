package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = br.readLine().split(" ");
		int cnt = 0;

		for (int i = 0; i < 8; i++) {
			if (str[0].equals("1")) {
				if (Integer.parseInt(str[i]) != i + 1) {
					cnt = 9;
				} else {
					cnt++;
				}
			} else if (str[0].equals("8")) {
				if (Integer.parseInt(str[i]) != 8 - i) {
					cnt = 9;
				} else {
					cnt += 2;
				}
			} else {
				cnt = 9;
			}
		}
		
		if(cnt == 8) {
			System.out.println("ascending");
		} else if (cnt == 16) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}
