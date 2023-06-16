package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1105 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String l = st.nextToken();
		String r = st.nextToken();
		
		int cnt = 0;
		
		if(l.length() == r.length()) {
			for (int i = 0; i < l.length(); i++) {
				if(l.charAt(i) != r.charAt(i)) break;
				else {
					if(l.charAt(i) == '8') cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
