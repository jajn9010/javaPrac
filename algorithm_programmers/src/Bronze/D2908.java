package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		sb = new StringBuffer(st.nextToken());
		int s1 = Integer.parseInt(sb.reverse().toString());
		sb = new StringBuffer(st.nextToken());
		int s2 = Integer.parseInt(sb.reverse().toString());
		
		System.out.println((s1 < s2) ? s2 : s1);
	}
}
