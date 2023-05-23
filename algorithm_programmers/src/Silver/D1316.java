package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1316 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			if(count() == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	public static boolean count() throws IOException {
		boolean[] check = new boolean [26];
		int pre = 0;
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			if(pre != now) {
				if(check[now - 'a'] == false) {
					check[now - 'a'] = true;
					pre = now;
				}else {
					return false;
				}
			}else {
				continue;
			}
		}
		
		return true;
	}
}
