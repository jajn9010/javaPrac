package Platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D1071 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[] list = new int[N + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(list);

		for (int i = 1; i < N; i++) {
			if (list[i] + 1 != list[i + 1])
				continue;
			int k = i + 1;
			while (k != N + 1 && list[i + 1] == list[k])
				k++;
			if (k == N + 1) {
				int j = i;
				while (list[i] == list[j])
					j--;
				list[j + 1]++;
				list[i + 1]--;
			} else {
				list[i + 1] = list[k];
				list[k] = list[i] + 1;
			}
		}
		for (int i = 1; i <= N; i++)
			sb.append(list[i]).append(' ');
		System.out.println(sb);
	}
}
