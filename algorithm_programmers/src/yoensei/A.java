package yoensei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		String[] str = br.readLine().split(" ");
		int[] list = new int[str.length];
		
		for (int i = 0; i < str.length; i++) {
			list[i] = Integer.parseInt(str[i]);
		}
		
		int total = Integer.MAX_VALUE;
		
		for (int i = 0; i < list.length - 1; i++) {
			int cnt = (list[i] * b) + (list[i + 1] * b);
			total = Math.min(total, cnt);
		}
		System.out.println(total);
	}
}
