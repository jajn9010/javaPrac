package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class D15666 {
	static int n, m;
	static int[] arr;
	static ArrayList<Integer> list;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		list = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i).intValue() == list.get(i+1).intValue()) {
//			if (list.get(i).equals(list.get(i+1))) {
				list.remove(i);
				i--;
			}
		}
		dfs(0, 0);
		System.out.println(sb);
	}

	private static void dfs(int now, int depth) {
		if (depth == m) {
			for (int item : arr)
				sb.append(item).append(" ");
			sb.append("\n");
			return;
		}

		for (int i = now; i < list.size(); i++) {
			arr[depth] = list.get(i);
			dfs(i, depth + 1);
		}
	}
}
