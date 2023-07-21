package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class D7662 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			TreeMap<Integer, Integer> map = new TreeMap<>();
			int k = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine());
				
				char c = st.nextToken().charAt(0);
				int n = Integer.parseInt(st.nextToken());
				
				if(c == 'I') {
					map.put(n, map.getOrDefault(n, 0) + 1);
				} else if(map.size() == 0) {
					continue;
				} else {
					int key = n == 1 ? map.lastKey() : map.firstKey();
					int cnt = map.get(key);
					
					if(cnt == 1) {
						map.remove(key);
					} else {
						map.put(key, cnt - 1);
					}
				}
			}
			
			if(map.size() == 0) {
				sb.append("EMPTY").append("\n");
			} else {
				sb.append(map.lastKey()).append(" ").append(map.firstKey()).append("\n");
			}
		}
		System.out.println(sb);
	}
}
