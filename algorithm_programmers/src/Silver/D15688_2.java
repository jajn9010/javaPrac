package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D15688_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		int[] count = new int[2000001];
		int[] ans = new int[T];
		
		for(int i = 0; i < T; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < T; i++) {
			count[arr[i]]++;
		}
		
		for(int i = 1; i < count.length; i++) {
			count[i] += count[i-1];
		}
		
		for(int i = T-1; i >= 0; i--) {
			int value = arr[i];
			count[value]--;
			ans[count[value]] = value;
		}
		
		for (int i = 0; i < ans.length; i++) {
			sb.append(ans[i]).append("\n");
		}
		System.out.println(sb);
	}
}
