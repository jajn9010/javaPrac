package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class D2342 {
	static int N;
	static ArrayList<Integer> list;
	static int[][][] step;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		list = new ArrayList<>();
		
		while(true) {
			int n = Integer.parseInt(st.nextToken());
			if(n == 0) break;
			list.add(n);
		}
		
		N = list.size();
		step = new int[N + 1][5][5];
		
		System.out.println(DDR(0, 0, 0));
	}

	private static int DDR(int s, int left, int right) {
		if(s == N) return 0;
		
		if(step[s][left][right] != 0) return step[s][left][right];
		
		int leftScore = score(left, list.get(s)) + DDR(s + 1, list.get(s), right);
		int rightScore = score(right, list.get(s)) + DDR(s + 1, left, list.get(s));
		
		return step[s][left][right] = Math.min(leftScore, rightScore);
	}

	private static int score(int from, int to) {
		if(from == to) return 1;
		if(from == 0) return 2;
		if(Math.abs(from - to) == 2) return 4;
		return 3;
	}
}
