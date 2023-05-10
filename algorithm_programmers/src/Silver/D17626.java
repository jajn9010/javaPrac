package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D17626 {
	static int len = 4;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		find(n, 1);
		System.out.println(len);
	}
	public static void find(int n, int depth) {
		if(depth >= len) {
			return;
		}
		for (int i = (int) Math.sqrt(n); i >= 1; i--) {
			if(n-(int)Math.pow(i, 2) <= 0) {
				len = depth;
				return;
			}
			find(n-(int)Math.pow(i, 2), depth+1);
		}
	}
}
