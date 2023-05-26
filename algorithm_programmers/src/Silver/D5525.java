package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D5525 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int length = Integer.parseInt(br.readLine());
		
		char[] ch = br.readLine().toCharArray(); 
		
		int cnt = 0;
		int ans = 0;
		for (int i = 0; i < length-2; i++) {
			if(ch[i] == 'I' && ch[i+1] == 'O' && ch[i+2] == 'I') {
				cnt++;
				
				if(cnt == n) {
					cnt--;
					ans++;
				}
				i++;
			}
			else {
				cnt = 0;
			}
		}
		System.out.println(ans);
	}
}
