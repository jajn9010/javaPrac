package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D11501 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] list = new int[N];
			
			for (int i = 0; i < N; i++) {
				list[i] = Integer.parseInt(st.nextToken());
			}
			
			
			long max = 0;
			long answer = 0;
			for (int i = N-1; i >= 0; i--) {
				if(list[i] > max) {
					max = list[i];
				} else {
					answer += (max - list[i]);
					max = list[i];
				}
			}
			sb.append(answer + "\n");
		}
		System.out.println(sb);
	}
}
