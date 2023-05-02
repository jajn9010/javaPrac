package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2750 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		int temp = 0;
		
		for (int i = 0; i < T; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < T; i++) {
			for (int j = i+1; j < T; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int item:arr) sb.append(item + "\n");
		System.out.println(sb);
	}
}
