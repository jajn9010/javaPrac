package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class D11170 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			ArrayList<Character> ch = new ArrayList<>();
			
			int cnt = 0;
			
			for (int i = s; i <= e; i++) {
				char[] a = Integer.toString(i).toCharArray();
				for(char item : a) {
					if (item == '0') cnt++;
				}
			}
			
			sb.append(cnt).append("\n");
		}
		System.out.println(sb);
	}
}
