package Diamond;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D18186 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long N = Long.parseLong(st.nextToken());
		
		long b = Long.parseLong(st.nextToken());
		long c = Long.parseLong(st.nextToken());
		
		long noodle, cntB, cntC = 0, cntC2 = 0, ans = 0;
		
		st = new StringTokenizer(br.readLine());
		if(c > b) {
			c = b;
		}
		for (int i = 0; i < N; i++) {
			noodle = Long.parseLong(st.nextToken());
			cntB = noodle - Math.min(noodle, cntC);
			ans += (b * cntB) + (c * Math.min(noodle, cntC));
			cntC2 = Math.min(cntC2, noodle);
			cntC = cntC2 + cntB;
			cntC2 = cntB;
		}
		System.out.println(ans);
	}
}
