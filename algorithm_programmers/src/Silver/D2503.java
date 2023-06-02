package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2503 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		int[] strike = new int[n];
		int[] ball = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
			strike[i] = Integer.parseInt(st.nextToken());
			ball[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 123; i <= 987; i++) {
			int strike_temp;
			int ball_temp;
			int checked = 0;

			if (i / 100 == i / 10 % 10)
				continue;
			else if (i / 10 % 10 == i % 10)
				continue;
			else if (i / 100 == i % 10 )
				continue;
			
			if(i / 10 % 10 == 0) continue;
			if(i % 10 == 0) continue;
			for (int j = 0; j < n; j++) {
				strike_temp = 0;
				ball_temp = 0;
				
				if(arr[j] / 100 == i / 100) {
					strike_temp++;
				} else {
					if(arr[j] / 10 % 10 == i / 100) {
						ball_temp++;
					}
					else if(arr[j] % 10 == i / 100) {
						ball_temp++;
					}
				}
				
				if(arr[j] / 10 % 10 == i / 10 % 10) {
					strike_temp++;
				} else {
					if(arr[j] / 100 == i / 10 % 10) {
						ball_temp++;
					}
					else if(arr[j] % 10 == i / 10 % 10) {
						ball_temp++;
					}
				}
				
				if(arr[j] % 10 == i % 10) {
					strike_temp++;
				} else {
					if(arr[j] / 100 == i % 10) {
						ball_temp++;
					}
					else if(arr[j] / 10 % 10 == i % 10) {
						ball_temp++;
					}
				}
				
				if(strike[j] != strike_temp || ball[j] != ball_temp) break;
				checked++;
				
				if(checked == n) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
