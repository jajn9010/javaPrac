package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();

		int[] arr = new int[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(arr[ch - 'A'] == -1) {
				arr[ch - 'A'] = i; 
			}
		}
		
		for(int item:arr) System.out.print(item + " ");
	}
}
