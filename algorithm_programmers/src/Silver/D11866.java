package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D11866 {
	static Queue<Integer> s;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		s = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			s.add(i);
		}
		
		sb.append("<");
		
		for(int j = 0; j < n-1; j++) {
			for(int i = 0; i < k; i++) {
				if(i == k-1) {
					int a = s.poll();
					sb.append(a).append(", ");
					break;
				}
				int a = s.poll();
				s.add(a);
			}
		}
		int a = s.poll();
		sb.append(a).append(">");
		
		System.out.println(sb);
	}
}
