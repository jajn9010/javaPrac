package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class D5430 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Deque<Integer> q;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			q = new ArrayDeque<>();
			String p = br.readLine();
			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), "[],");
			
			for (int i = 0; i < n; i++) {
				q.add(Integer.parseInt(st.nextToken()));
			}
			solve(p, q);
		}
		System.out.println(sb);
	}
	
	private static void solve(String p, Deque<Integer> q) {
		char[] list = p.toCharArray();
		boolean check = true;
		
		for (int i = 0; i < list.length; i++) {
			if(list[i] == 'R') {
				check = !check;
			}
			if(list[i] == 'D' && q.size() != 0) {
				if(check) q.pollFirst();
				else q.pollLast();
			} else if(list[i] == 'D' && q.size() == 0) {
				sb.append("error").append("\n");
				return;
			}
		}
		
		int n = q.size();
		sb.append("[");
		for (int i = 0; i < n; i++) {
			if(check == true && i == n - 1) sb.append(q.pollFirst());
			else if(check == true) sb.append(q.pollFirst()).append(",");
			else if(check == false && i == n - 1) sb.append(q.pollLast());
			else sb.append(q.pollLast()).append(",");
		}
		sb.append("]").append("\n");
	}
}
