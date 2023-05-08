package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D1966 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Queue<Integer> q;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int index = Integer.parseInt(st.nextToken());
			q = new LinkedList<>();
			
			ArrayList<Integer> arr = new ArrayList<>();
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				arr.add(Integer.parseInt(st.nextToken()));
				q.add(arr.get(i));
			}
			
			int size = index;
			int cnt = 0;
			while(!q.isEmpty()) {
				int max = Collections.max(arr);
				
				if(q.peek() == max && size == 0) {
					q.poll();
					sb.append(cnt+1).append("\n");
					break;
				} else if(q.peek() == max) {
					arr.remove(q.poll());
					cnt++;
					size--;
				} else {
					if(size == 0) {
						size = q.size()-1;
						int a = q.poll();
						q.add(a);
					}else {
						int a = q.poll();
						q.add(a);
						size--;
					}
				}
			}
		}
		System.out.println(sb);
	}
}
