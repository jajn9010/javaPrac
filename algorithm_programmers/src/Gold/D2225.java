package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2225 {
	static int cnt;
	static int n, k, mod;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		mod = 1000000000;
		
		int[] list = new int[n + 1];
		list[0] = 0;
		for (int i = 1; i <= n; i++) {
			list[i] = i;
		}
		
		permutation(list, new int[k], 0, k);
		System.out.println(cnt / mod);
	}
	private static void permutation(int[] list, int[] out, int depth, int k) {
		if(depth == k) {
			int check = 0;
			for(int num : out) {
				check += num;
			}
			if(check == n) cnt++;
			return;
		}
		for(int i=0; i<list.length; i++){
            out[depth] = list[i];
            permutation(list, out, depth+1, k);
        }
	}
}
