package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1267 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int Y = 0, M = 0;
		
		int T = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		while(T-- > 0) {
			int t = Integer.parseInt(st.nextToken());
			
			Y += (t / 30 + 1) * 10;
			M += (t / 60 + 1) * 15;
		}
		
		if(Y < M) System.out.println("Y " + Y);
		else if(Y > M) System.out.println("M " + M);
		else System.out.println("Y M " + Y);
	}
}
