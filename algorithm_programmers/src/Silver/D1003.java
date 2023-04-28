package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1003 {
	static int[] n = {1, 1};
	static int[] m = {1, 2};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			int a = Integer.parseInt(br.readLine());
			
			if(a == 0) System.out.println("1 0");
			else if(a == 1) System.out.println("0 1");
			else if(a == 2) System.out.println("1 1");
			else if(a == 3) System.out.println("1 2");
			else {
				n[0] = 1;
				n[1] = 1;
				m[0] = 1;
				m[1] = 2;
				for (int i = 4; i <= a; i++) {
					int x = n[0]+m[0], y = n[1]+m[1];
					n[0] = m[0];
					n[1] = m[1];
					m[0] = x;
					m[1] = y;
				}
				System.out.println(m[0] + " " + m[1]);
			}
		}
	}
}
