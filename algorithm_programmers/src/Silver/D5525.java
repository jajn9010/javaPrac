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
		
		int result = 0;
		int cnt = 0;
		for (int i = 1; i < n-1; i++) {
			if(ch[i - 1] ==  'I' && ch[i] == '0' && ch[i+1] == 'I') {
				
			}
			
		}
		
		System.out.println(cnt);
	}
}
