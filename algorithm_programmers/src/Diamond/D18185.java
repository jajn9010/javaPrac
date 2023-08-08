package Diamond;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D18185 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int b = 3;
		int c = 2;
		int noodle, cntB, cntC = 0, cntC2 = 0, ans = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			noodle = Integer.parseInt(st.nextToken());
			cntB = noodle - Math.min(noodle, cntC);
			ans += (b * cntB) + (c * Math.min(noodle, cntC));
			cntC2 = Math.min(cntC2, noodle);
			cntC = cntC2 + cntB;
			cntC2 = cntB;
		}
		System.out.println(ans);
	}
}
