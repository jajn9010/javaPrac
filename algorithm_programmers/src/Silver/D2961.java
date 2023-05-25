package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2961 {
	static int n;
	static int min;
	static int[][] list;
	static boolean[] visited;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());

		list = new int[n][2];
		visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			list[i][0] = Integer.parseInt(st.nextToken());
			list[i][1] = Integer.parseInt(st.nextToken());
		}

		min = Integer.MAX_VALUE;
		calc(0, 1, 0);
		System.out.println(min);
	}

	private static void calc(int curr, int gSour, int sBitter) {
		if (curr == list.length) {
			int falsecnt = 0;
			for (int i = 0; i < n; i++) {
				if (visited[i])
					continue;
				falsecnt++;
			}

			if (falsecnt == n)
				return;
			min = Math.min(min, Math.abs(gSour - sBitter));
			return;
		}
		visited[curr] = true;
		calc(curr + 1, gSour * list[curr][0], sBitter + list[curr][1]);
		visited[curr] = false;
		calc(curr + 1, gSour, sBitter);
	}
}
