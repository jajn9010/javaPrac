package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class D17219 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<String, String> map = new HashMap<>();
		
		int T = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), st.nextToken());
		}
		
		while(N-- > 0) {
			sb.append(map.get(br.readLine())).append("\n");
		}
		System.out.println(sb);
	}
}
