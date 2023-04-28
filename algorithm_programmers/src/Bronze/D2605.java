package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class D2605 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> answer = new ArrayList<>();
		while(T-- > 0) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		for (int i = 0; i < list.size(); i++) {
			answer.add(list.get(i), i+1);
		}
		
		Collections.reverse(answer);
		
		for (int i = 0; i < answer.size(); i++) {
			sb.append(answer.get(i) + " ");
		}
		System.out.println(sb);
	}
}
