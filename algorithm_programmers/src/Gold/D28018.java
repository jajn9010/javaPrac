package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D28018 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[1000002];

		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			arr[s] = arr[s] + 1;
			arr[e + 1] = arr[e + 1] - 1;
		}

		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i] + arr[i-1];
		}
		
		int Q = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < Q; i++) {
			int a = Integer.parseInt(st.nextToken());
			sb.append(arr[a]).append("\n");
		}
		System.out.println(sb);
	}
}
