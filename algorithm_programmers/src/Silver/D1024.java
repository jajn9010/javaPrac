package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1024 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		for (int i = l; i <= 100; i++) {
			int a = (n - sum(i-1)) / i;
			
			if(n == cSum(a, i) && a >= 0) {
				for (int j = 0; j < i; j++) {
					sb.append(a + j).append(" ");
				}
				break;
			}
			if(i == 100 && n != cSum(a, i)) sb.append(-1);
		}
		
		System.out.println(sb);
	}

	public static int cSum(int a, int i) {
		int sum = 0;
		for (int j = 0; j < i; j++) {
			sum += a + i;
		}
		return sum;
	}

	public static int sum(int i) {
		i = i * (i - 1) / 2;
		return i;
	}
	
	
}
