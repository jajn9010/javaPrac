package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class D27446 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		TreeSet<Integer> set = new TreeSet<>();
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		ArrayList<Integer> page = new ArrayList<>();
		
		for (int i = 1; i <= N; i++) {
			if(!set.contains(i)) page.add(i);
		}
		
		int ans = 0;
		
		for (int i = 1; i < page.size(); i++) {
			
		}
	}
}
