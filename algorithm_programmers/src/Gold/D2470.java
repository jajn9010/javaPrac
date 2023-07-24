package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D2470 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[] list = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(list);
		
		int start = 0;
		int end = N - 1;
		int acid = 0;
		int alcali = 0;
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N-1; i++) {
			int hap = list[start] + list[end];
			if(min > 0 && min > Math.abs(hap)) {
				min = Math.abs(hap);
				acid = list[start];
				alcali = list[end];
			}
			if(hap < 0) {
				start++;
			}
			if(hap > 0) {
				end--;
			}
			
		}
		System.out.println(acid + " " + alcali);
	}
}
