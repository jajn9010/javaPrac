package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class D1208_2 {
	static int N, S;
	static long[] arr;
	static ArrayList<Long> left = new ArrayList<>(), right = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		
		arr = new long[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		getSum(0, N / 2, 0, left);
		getSum(N / 2, N, 0, right);
		
		Collections.sort(left);
		Collections.sort(right);
		
		long cnt = getCnt();
		
		if (S == 0) cnt--;
		
		System.out.println(cnt);
	}

	private static long getCnt() {
		int pL = 0;
		int pR = right.size() - 1;
		long cnt = 0;
		
		while(pL < left.size() && pR >= 0) {
			long sum = left.get(pL) + right.get(pR);
			
			if(sum == S) {
				long a = left.get(pL);
				long cntL = 0;
				
				while(pL < left.size() && left.get(pL) == a) {
					pL++;
					cntL++;
				}
				
				long b = right.get(pR);
				long cntR = 0;
				
				while(pR >= 0 && right.get(pR) == b) {
					pR--;
					cntR++;
				}
				
				cnt += cntL * cntR;
			} else if(sum < S) pL++;
			else pR--;
			
		}
		return cnt;
	}

	private static void getSum(int idx, int end, long sum, ArrayList<Long> list) {
		if(idx == end) {
			list.add(sum);
			return;
		}
		
		getSum(idx + 1, end, sum + arr[idx], list);
		getSum(idx + 1, end, sum, list);
	}
}
