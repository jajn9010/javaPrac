package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		
		int[] arr = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			int n = str.charAt(i) - 'A';
			arr[n]++;
		}
		
		int max = 0;
		char ans = '?';
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ans = (char)(i + 'A');
			} else if(arr[i] == max) {
				ans = '?';
			}
		}
		System.out.println(ans);
	}
}
