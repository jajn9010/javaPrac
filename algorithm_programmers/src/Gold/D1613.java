package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1613 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] list = new int[N + 1][N + 1];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int front = Integer.parseInt(st.nextToken());
			int back = Integer.parseInt(st.nextToken());
			list[front][back] = 1;
			list[back][front] = -1;
		}

		for (int k = 1; k <= N; k++) {
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (list[i][k] == 1 && list[k][j] == 1)
						list[i][j] = 1;
					if (list[i][k] == -1 && list[k][j] == -1)
						list[i][j] = -1;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		int S = Integer.parseInt(br.readLine());
		for (int i = 0; i < S; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(list[a][b] == 1) sb.append(-1).append("\n");
			else if(list[a][b] == -1) sb.append(1).append("\n");
			else sb.append(0).append("\n");
		}
		
		System.out.println(sb);
	}
}
