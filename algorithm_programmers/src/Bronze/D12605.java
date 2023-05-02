package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D12605 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String[] str = br.readLine().split(" ");
			sb.append("Case #").append(i+1).append(": ");
			for(int j = str.length-1; j >= 0; j--) {
				sb.append(str[j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
