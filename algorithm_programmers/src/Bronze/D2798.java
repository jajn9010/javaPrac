package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int [n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = calc(arr, n, m);
		sb.append(result);
		System.out.println(sb);
	}
	
	static int calc(int[] arr, int n, int m) {
		int result = 0;
		for (int i = 0; i < n-2; i++) {
			for (int j = i+1; j < n-1; j++) {
				for (int y = j+1; y < n; y++) {
					int temp = arr[i]+arr[j]+arr[y];
					if(m == temp) {
						return temp;
					}
					
					if(result < temp && temp < m) {
						result = temp;
					}
				}
			}
		}
		
		return result;
	}
}
