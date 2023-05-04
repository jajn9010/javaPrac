package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D11050 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int nT = 1, nK = 1, mK = 1;

		for (int i = 0; i < n; i++) {
			nT *= (i + 1);
		}

		for (int i = 0; i < k; i++) {
			nK *= (i + 1);
		}

		for (int i = 0; i < n - k; i++) {
			mK *= (i + 1);
		}
		
		System.out.println(nT/nK/mK);
	}
}
