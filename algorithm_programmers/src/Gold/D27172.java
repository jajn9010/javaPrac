package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class D27172 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		int[] card = new int[1000001];
		int[] ans = new int[1000001];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(st.nextToken());
			list.add(a);
			card[a] = 1;
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = list.get(i) * 2; j < 1000001; j += list.get(i)) {
				if(card[j] == 1) {
					ans[list.get(i)]++;
					ans[j]--;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(ans[list.get(i)]).append(" ");
		}
		
		System.out.println(sb);
	}
}
