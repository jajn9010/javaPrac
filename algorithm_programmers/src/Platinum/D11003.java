package Platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class D11003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		Deque<int[]> q = new ArrayDeque<>();
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			while(!q.isEmpty() && q.peekLast()[0] > num) q.pollLast();
			
			q.offer(new int[] {num, i});
			
			if(q.peek()[1] < i - (L - 1)) q.poll();
			
			sb.append(q.peek()[0]).append(" ");
		}
		System.out.println(sb);
	}
}
