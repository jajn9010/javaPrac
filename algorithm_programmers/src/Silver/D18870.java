package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class D18870 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int a = Integer.parseInt(br.readLine());
		int[] origin = new int[a];
		int[] sorted = new int[a];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a; i++) {
			origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sorted);
		
		int rank = 0;
		for (int i = 0; i < sorted.length; i++) {
			
			if(!map.containsKey(sorted[i])) {
				map.put(sorted[i], rank);
				rank++;
			}
		}
		
		for(int key : origin) {
			sb.append(map.get(key)).append(" ");
		}
		System.out.println(sb);
	}
}
