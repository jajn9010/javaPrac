package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D18917 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		long M = Integer.parseInt(br.readLine());
		long sum = 0;
		long xor = 0;
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int q = Integer.parseInt(st.nextToken());
			
			
			switch (q) {
			case 1:
				long num = Integer.parseInt(st.nextToken());
				sum += num;
				xor ^= num;
				break;
			case 2:
				long num2 = Integer.parseInt(st.nextToken());
				sum -= num2;
				xor ^= num2;
				break;
			case 3:
				sb.append(sum).append("\n");
				break;
			case 4:
				sb.append(xor).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
}
