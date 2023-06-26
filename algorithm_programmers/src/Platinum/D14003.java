package Platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class D14003 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> ans = new ArrayList<>();
		int[] arr = new int[N];
		int[] indexArr = new int[N];
		ans.add(Integer.MIN_VALUE);
		int val = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			val = Integer.parseInt(st.nextToken());
			arr[i] = val;
			
			if(ans.get(ans.size() - 1) < val) {
				ans.add(val);
				indexArr[i] = ans.size() - 1;
			} else {
				int left = 1;
				int right = ans.size() - 1;
				
				while (left <  right) {
					int mid = (left + right) >> 1;
					if(ans.get(mid) < val) left = mid + 1;
					else right = mid;
				}
				ans.set(right, val);
				indexArr[i] = right;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(ans.size() - 1).append("\n");
		
		int index = ans.size() - 1;
		Stack<Integer> s = new Stack<>();
		
		for (int i = N - 1; i >= 0; i--) {
			if(indexArr[i] == index) {
				index--;
				s.add(arr[i]);
			}
		}
		
		while(!s.isEmpty()) {
			sb.append(s.pop()).append(" ");
		}
		
		System.out.println(sb);
	}
}
