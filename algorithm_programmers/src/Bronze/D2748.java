package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class D2748 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<Long> arr = new ArrayList<>();
		arr.add(0L);
		arr.add(1L);
		
		int cnt = 1;
		Long ans = 0L;
		
		if(n == 0) sb.append(0);
		else if(n == 1) sb.append(1);
		else {
			while(cnt != n) {
				ans = arr.get(arr.size()-2) + arr.get(arr.size()-1);
				arr.add(ans);
				cnt++;
			}
			sb.append(ans);
		}
		System.out.println(sb);
	}
}
