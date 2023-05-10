package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D18111 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int[][] arr = new int[h][w];

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int time = Integer.MAX_VALUE;
		int height = 0;

		for (int i = 0; i < h; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < w; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] > max)
					max = arr[i][j];
				if (arr[i][j] < min)
					min = arr[i][j];
			}
		}
		
		
		for (int i = max; i >= min; i--) {
			int t = 0;
			int item = b;

			for (int j = 0; j < h; j++) {
				for (int k = 0; k < w; k++) {
					if (arr[j][k] > i) {
						item += (arr[j][k] - i);
						t += 2 * (arr[j][k] - i);
					} else if(arr[j][k] < i) {
						item -= (i-arr[j][k]);
						t += (i-arr[j][k]);
					}
				}
			}
			
			if(item >= 0 && time > t) {
				height = i;
				time = t;
			}
		}
		
		sb.append(time).append(" ").append(height);
		System.out.println(sb);
	}
}
