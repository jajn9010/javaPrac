package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class D11723 {
	static HashSet<Integer> s = new HashSet<>();
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			if(str.equals("add")) s.add(Integer.parseInt(st.nextToken()));
			else if(str.equals("remove")) {
				remove(st.nextToken());
			}else if(str.equals("check")) {
				check(st.nextToken());
			}else if(str.equals("toggle")) {
				toggle(st.nextToken());
			}else if(str.equals("all")) {
				for (int j = 1; j <= 20; j++) {
					s.add(j);
				}
			}else if(str.equals("empty")) {
				for (int j = 1; j <= 20; j++) {
					s.remove(j);
				}
			}
		}
		System.out.println(sb);
	}

	public static void toggle(String nextToken) {
		int a = Integer.parseInt(nextToken);
		if(s.contains(a)) s.remove(a);
		else s.add(a);
	}

	public static void check(String nextToken) {
		int a = Integer.parseInt(nextToken);
		if(s.contains(a)) sb.append(1).append("\n");
		else sb.append(0).append("\n");
	}

	public static void remove(String nextToken) {
		int a = Integer.parseInt(nextToken);
		
		if(s.contains(a)) s.remove(a);
	}
}
