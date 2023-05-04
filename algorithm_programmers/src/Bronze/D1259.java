package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1259 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String input = "";
		while ((input = br.readLine()) != "0" && !input.equals("0")) {
			int n = Integer.parseInt(input);
			int k = n;
			int r = 0;

			while (k != 0) {
				r = r * 10 + k % 10;
				k /= 10;
			}

			if (n == r)
				sb.append("yes").append("\n");
			else
				sb.append("no").append("\n");
		}
		System.out.println(sb);
	}
}
