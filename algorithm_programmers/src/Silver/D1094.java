package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1094 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		char[] ch = String.valueOf(Integer.toBinaryString(n)).toCharArray();
		int ans = 0;
		
		for(char item : ch) {
			if(item - '0' == 1) ans++;
		}
		System.out.println(ans);
	}
}
