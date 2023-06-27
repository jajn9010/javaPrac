package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D2098 {
	static int N;
	static int[][] map, dp;
	static int INF = 16000000;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		dp = new int[N][(1 << N) - 1];
		
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
		
		for (int i = 0; i < N; i++) {
			Arrays.fill(dp[i], -1);
		}
		
		System.out.println(TSP(0, 1));
	}

	private static int TSP(int now, int visited) {
		if(visited == ((1 << N) - 1)) {
			if(map[now][0] > 0) {
				return map[now][0];
			}
			return INF;
		}
		
		if(dp[now][visited] != -1) {
			return dp[now][visited];
		}
		
		dp[now][visited] = INF;
		for (int i = 0; i < N; i++) {
			if(i == now) continue;
			
			if((visited & (1 << i)) == 0 && map[now][i] > 0) {
				dp[now][visited] = Math.min(dp[now][visited], TSP(i, visited | (1 << i)) + map[now][i]);
			}
		}
		
		return dp[now][visited];
	}
}
