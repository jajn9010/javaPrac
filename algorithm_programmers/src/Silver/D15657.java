package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D15657 {
	static int[] arr;
	static int[] list;
	static int n, m;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		list = new int[n];
		arr = new int[m];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(list);

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
		for (int i = now; i < n; i++) {
			arr[depth] = list[i];
			dfs(i, depth + 1);
		}
	}
}
