package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2884 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int totalM = 0;

		if (h == 0) {
			h = 24;
		}

		totalM = h * 60 + m - 45;
		h = totalM / 60;
		m = totalM % 60;

		if (h == 24) {
			h = 0;
		}

		System.out.println(h + " " + m);
	}
}
