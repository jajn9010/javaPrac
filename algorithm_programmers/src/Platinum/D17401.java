package Platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class D17401 {
	static int T, N, D, M, mod = 1000000007;
	static ArrayList<ArrayList<Integer>> list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		T = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());
		
		while(T-- > 0) {
			M = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				
				
			}
		}
	}
}
