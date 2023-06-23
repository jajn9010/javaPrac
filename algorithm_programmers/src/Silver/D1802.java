package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1802 {
	static boolean check = false;
	static char[] list;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			list = br.readLine().toCharArray();
			int n = list.length;
			if(n == 1) System.out.println("YES");
			else {
				dfs(n);
				if(check) System.out.println("YES");
				else System.out.println("NO");
			}
		}
	}

	private static void dfs(int n) {
		int mid = n / 2 ;
		for (int i = 0; i < mid; i++) {
			if(list[mid - (i + 1)] == list[mid + (i + 1)]) {
				check = false;
				return;
			}
			else {
				check = true;
			}
		}
		if(mid > 0) {
			dfs(mid);
		}
	}
}
