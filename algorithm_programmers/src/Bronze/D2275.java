package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2275 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[15][15];
			
			for (int i = 1; i <= n; i++) {
				arr[0][i] = i;
			}
			
			for (int i = 1; i <= k; i++) {
				for (int j = 1; j <= n; j++) {
					arr[i][j] = arr[i][j-1] + arr[i-1][j];
				}
			}
			sb.append(arr[k][n]).append("\n");
		}
		System.out.println(sb);
	}
}
