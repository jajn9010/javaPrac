package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D27866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] ch = br.readLine().toCharArray();
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(ch[n-1]);		
	}
}
