package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D10159 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int[][] list = new int[N + 1][N + 1];
		
		for (int i = 1; i <= N; i++) {
			list[i][i] = 1;
		}
		
		StringTokenizer st;
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
					if(list[i][k] == 1 && list[k][j] == 1) list[i][j] = 1;
					if(list[i][k] == -1 && list[k][j] == -1) list[i][j] = -1;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			int cnt = 0;
			for (int j = 1; j <= N; j++) {
				if(list[i][j] != 0) cnt++;
			}
			sb.append(N - cnt).append("\n");
		}
		System.out.println(sb);
	}
}
