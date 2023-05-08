package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class D27160 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		HashMap<String, Integer> map = new HashMap<>();
		
		int T = Integer.parseInt(br.readLine());
		
		String[] ans = {"STRAWBERRY", "BANANA", "LIME", "PLUM"};
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int n = Integer.parseInt(st.nextToken());
			
			if(map.get(str) == null) {
				map.put(str, n);
			} else {
				map.put(str, map.get(str)+n);
			}
		}
		int cnt = 0;
		for (int i = 0; i < ans.length; i++) {
			if(map.get(ans[i]) == null) continue;
			else if(map.get(ans[i]) == 5) cnt++;
		}
		
		System.out.println((cnt>0)? "YES" : "NO");
	}
}
