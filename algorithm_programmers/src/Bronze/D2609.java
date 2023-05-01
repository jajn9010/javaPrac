package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int min = (A < B) ? A : B;
		int g = 0;

		for (int i = 1; i <= min; i++) {
			if (A % i == 0 && B % i == 0) {
				g = i;
			}
		}
		sb.append(g + "\n" + ((A * B) / g));
		System.out.println(sb);
	}
}
