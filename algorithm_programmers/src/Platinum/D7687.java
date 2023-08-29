package Platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D7687 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			int lx = Integer.parseInt(st.nextToken());
			int ly = Integer.parseInt(st.nextToken());
			int lz = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			
			if((lx | ly | lz | x | y | z) == 0) break;
			
			int ans = Integer.MAX_VALUE;
			
			 if(x == 0 || y == 0 || z == 0) sb.append(x * x + y * y + z * z).append('\n');
	            else {
	                if (lx == x) {
	                    ans = Math.min(ans, (x + y) * (x + y) + z * z);
	                    ans = Math.min(ans, (x + z) * (x + z) + y * y);
	                    ans = Math.min(ans, (lz + y) * (lz + y) + (lx + lz - z) * (lx + lz - z));
	                    ans = Math.min(ans, (ly + z) * (ly + z) + (lx + ly - y) * (lx + ly - y));
	                }
	                if (ly == y) {
	                    ans = Math.min(ans, (x + y) * (x + y) + z * z);
	                    ans = Math.min(ans, (y + z) * (y + z) + x * x);
	                    ans = Math.min(ans, (lz + x) * (lz + x) + (ly + lz - z) * (ly + lz - z));
	                    ans = Math.min(ans, (lx + z) * (lx + z) + (lx + ly - x) * (lx + ly - x));
	                }
	                if (lz == z) {
	                    ans = Math.min(ans, (z + y) * (z + y) + x * x);
	                    ans = Math.min(ans, (x + z) * (x + z) + y * y);
	                    ans = Math.min(ans, (lx + y) * (lx + y) + (lx + lz - x) * (lx + lz - x));
	                    ans = Math.min(ans, (ly + x) * (ly + x) + (lz + ly - y) * (lz + ly - y));
	                }
	                sb.append(ans).append('\n');
	            }
		}
		System.out.println(sb);
	}
}
