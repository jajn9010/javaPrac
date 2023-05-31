package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D14659 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
				
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int big = arr[0];
		int cnt = 0;
		
		for (int i = 1; i < n; i++) {
			if(big < arr[i] && i != n - 1) {
				big = arr[i];
				cnt = 0;
			} else if(big < arr[i] && i == n - 1) {
				continue;
			} else {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
