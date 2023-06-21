package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D12015 {
	static int[] list;
	static int[] ans;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		list = new int[N];
		int[] trace = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(st.nextToken());
			list[i] = a;
		}

		int idx = 0;

		ans = new int[N];
		ans[idx] = list[0];
		trace[0] = list[0];

		for (int i = 1; i < N; i++) {
			if (ans[idx] < list[i]) {
				ans[++idx] = list[i];
				trace[i] = list[i];
			} else {
				int lower_bound = binarySearch(0, idx, list[i]);
				ans[lower_bound] = list[i];
				trace[i] = list[i];
			}
		}

		System.out.println(Arrays.toString(trace));
		sb.append(N - (idx + 1)).append("\n");
		System.out.println(sb);
	}

	public static int binarySearch(int left, int right, int v) {
		int mid = 0;
		while (left < right) {
			mid = (left + right) / 2;
			if (ans[mid] >= v)
				right = mid;
			else
				left = mid + 1;
		}
		return right;
	}
}
