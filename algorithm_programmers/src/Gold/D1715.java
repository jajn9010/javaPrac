package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class D1715 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		
		for (int i = 0; i < N; i++) {
			q.add(Integer.parseInt(br.readLine()));
		}
		
		int ans = 0;
		for (int i = 0; i < N - 1; i++) {
			int plus = q.poll() + q.poll();
			ans += plus;
			q.add(plus);
		}
		
		System.out.println(ans);
	}
}
