package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class D10816 {
	static HashMap<Integer, Integer> map;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		map = new HashMap<>();
		
		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(!map.containsKey(a)) {
				map.put(a, 1);
			} else {
				map.put(a, map.get(a)+1);
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(map.get(a) == null) {
				sb.append(0).append(" ");
			}else sb.append(map.get(a)).append(" ");
		}
		System.out.println(sb);
	}
}
