package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D28069 {
	static int n, k;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		String result = bfs(n);
		
		System.out.println(result);
	}

	private static String bfs(int n) {
		int[] arr = new int[1000001];
		Queue<Integer> q = new LinkedList<>();
		int num;
		
		arr[1] = 1;
		arr[2] = 2;
		q.add(2);
		
		while(!q.isEmpty()) {
			num = q.poll();
			int calc = num + (num/2);
			if(arr[num+1] == 0 && num + 1 < 1000000) {
				arr[num+1] = arr[num] + 1;
				q.add(num + 1);
			}
			if(calc < 1000000 && arr[calc] == 0 ) {
				arr[calc] = arr[num] + 1;
				q.add(calc);
			}
		}
		
		if(arr[n] <= k) {
			return "minigimbob";
		} else {
			return "water";
		}
		
	}
}
