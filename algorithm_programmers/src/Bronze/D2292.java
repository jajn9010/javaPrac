package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2292 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int start = 1;
		int i = 1;
		
		while(true) {
			if(n == 1) {
				System.out.println(1);
				break;
			} else if (n > start && n <= start + i * 6) {
				System.out.println(i+1);
				break;
			}
			start += (i * 6);
			i++;
		}
	}
}
