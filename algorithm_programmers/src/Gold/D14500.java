package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D14500 {
	static int N, M, max, total;
	static int[][] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		max = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				tet1(i, j);
				tet2(i, j);
				tet3(i, j);
				tet4(i, j);
				tet5(i, j);
			}
		}

		System.out.println(max);
	}

	private static void tet5(int i, int j) {
		if(i + 1 < N && j + 2 < M)
			total = map[i][j] + map[i][j + 1] + map[i + 1][j + 1] + map[i][j + 2];
		max = Math.max(total, max);
		
		if(i + 2 < N && j - 1 >= 0)
			total = map[i][j] + map[i + 1][j] + map[i + 1][j - 1] + map[i + 2][j];
		max = Math.max(total, max);
		
		if(i - 1 >= 0 && j + 2 < M)
			total = map[i][j] + map[i][j + 1] + map[i - 1][j + 1] + map[i][j + 2];
		max = Math.max(total, max);
		
		if(i + 2 < N && j + 1 < M)
			total = map[i][j] + map[i + 1][j] + map[i + 1][j + 1] + map[i + 2][j];
		max = Math.max(total, max);
	}

	private static void tet4(int i, int j) {
		if (i + 2 < N && j + 1 < M)
			total = map[i][j] + map[i + 1][j] + map[i + 1][j + 1] + map[i + 2][j + 1];
		max = Math.max(total, max);

		if (i - 1 >= 0 && j + 2 < M)
			total = map[i][j] + map[i][j + 1] + map[i - 1][j + 1] + map[i - 1][j + 2];
		max = Math.max(total, max);
		
		if(i + 2 < N && j - 1 >= 0)
			total = map[i][j] + map[i + 1][j] + map[i + 1][j - 1] + map[i + 2][j - 1];
		max = Math.max(total, max);
		
		if(i + 1 < N && j + 2 < M)
			total = map[i][j] + map[i][j + 1] + map[i + 1][j + 1] + map[i + 1][j + 2];
		max = Math.max(total, max);
	}

	private static void tet3(int i, int j) {
		if (i + 2 < N && j + 1 < M)
			total = map[i][j] + map[i + 1][j] + map[i + 2][j] + map[i + 2][j + 1];
		max = Math.max(total, max);

		if (i + 1 < N && j + 2 < M)
			total = map[i][j] + map[i + 1][j] + map[i][j + 1] + map[i][j + 2];
		max = Math.max(total, max);

		if (i + 2 < N && j + 1 < M)
			total = map[i][j] + map[i][j + 1] + map[i + 1][j + 1] + map[i + 2][j + 1];
		max = Math.max(total, max);

		if (i + 1 < N && j - 2 >= 0)
			total = map[i][j] + map[i + 1][j] + map[i + 1][j - 1] + map[i + 1][j - 2];
		max = Math.max(total, max);
		
		if(i - 2 >= 0 && j + 1 < M)
			total = map[i][j] + map[i][j + 1] + map[i - 1][j + 1] + map[i - 2][j + 1];
		max = Math.max(total, max);
		
		if(i + 1 < N && j + 2 < M)
			total = map[i][j] + map[i + 1][j] + map[i + 1][j + 1] + map[i + 1][j + 2];
		max = Math.max(total, max);
		
		if(i + 2 < N & j + 1 < M)
			total = map[i][j] + map[i + 1][j] + map[i + 2][j] + map[i][j + 1];
		max = Math.max(total, max);
		
		if(i + 1 < N && j + 2 < M)
			total = map[i][j] + map[i][j + 1] + map[i][j + 2] + map[i + 1][j + 2];
		max = Math.max(total, max);
	}

	private static void tet2(int i, int j) {
		if (i + 1 < N && j + 1 < M)
			total = map[i][j] + map[i + 1][j] + map[i][j + 1] + map[i + 1][j + 1];
		max = Math.max(total, max);
	}

	private static void tet1(int i, int j) {
		if (j + 3 < M)
			total = map[i][j] + map[i][j + 1] + map[i][j + 2] + map[i][j + 3];
		max = Math.max(total, max);
		if (i + 3 < N)
			total = map[i][j] + map[i + 1][j] + map[i + 2][j] + map[i + 3][j];
		max = Math.max(total, max);
	}
}
