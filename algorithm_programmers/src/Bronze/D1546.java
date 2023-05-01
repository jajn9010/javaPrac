package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[T];
		int max = 0;
		double total = 0;
		
		for (int i = 0; i < T; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < T; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for (int i = 0; i < T; i++) {
			total += (double) arr[i] / max * 100;
		}
		
		System.out.println(total/T);
	}
}
