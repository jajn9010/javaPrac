package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1681 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int cnt = 0;
		
		char cL = (char) (L+'0');
		
		int n = 0;
		boolean P = false;
		
		while(n < N) {
			char[] cN = String.valueOf(cnt+1).toCharArray();
			P = false;
			for (int i = 0; i < cN.length; i++) {
				if(cN[i] == cL) {
					P = true;
					break;
				}
			}
			if(P) {
				cnt++;
				
			}else {
				cnt++;
				n++;
			}
		}
		System.out.println(cnt);
	}
}
