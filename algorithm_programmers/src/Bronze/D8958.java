package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D8958 {
	static int cnt = 1;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int total;
		
		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			char[] ch = new char[str.length()];
			total = 0;
			for (int j = 0; j < str.length(); j++) {
				ch[j] = str.charAt(j);
				if(ch[j] == 'O') {
					total += cnt;
					cnt++;
				}else if(ch[j] == 'X') {
					total += 0;
					cnt = 1;
				}
			}
			System.out.println(total);
			cnt = 1;
		}
	}
}
