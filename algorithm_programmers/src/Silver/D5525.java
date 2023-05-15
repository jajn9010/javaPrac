package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D5525 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int length = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		String P = "";
		
		for (int i = 0; i < n; i++) {
			P += "IO";
		}
		
		P = P + "I";
		
		int cnt = 0;
		for (int i = 0; i <= length - P.length(); i++) {
			String s = str.substring(i, i + P.length());
			if(s.equals(P)) cnt++;
		}
		
		System.out.println(cnt);
	}
}
