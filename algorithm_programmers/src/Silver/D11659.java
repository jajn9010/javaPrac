package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int su = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int[] arr = new int[su+1];
				
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= su; i++) {
			arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
		}
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			int sIndex = Integer.parseInt(st.nextToken());
			int eIndex = Integer.parseInt(st.nextToken());
			
			int total = arr[eIndex] - arr[sIndex-1];
			
			sb.append(total).append("\n");
		}
		System.out.println(sb);
	}
}
