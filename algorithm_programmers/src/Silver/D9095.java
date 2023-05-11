package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D9095 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			
			int[] ans = new int [12];
			
			for (int i = 1; i < ans.length; i++) {
				if(i <= 2) {
					ans[i] = i;
				}
				else if(i == 3) ans[i] = 4;
				else {
					ans[i] = ans[i-1] + ans[i-2] + ans[i-3];
				}
			}
			
			sb.append(ans[n]).append("\n");
		}
		System.out.println(sb);
	}
}
