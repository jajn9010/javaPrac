package Gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class D1717 {
	static int N, M;
	static int[] parent;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		parent = new int [N + 1];
		
		for (int i = 1; i <= N; i++) {
			parent[i] = i;
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int check = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(check == 0) {
				union(a, b);
			} else {
				if(find(a) == find(b)) {
					bw.write("YES" + "\n");
				} else {
					bw.write("NO" + "\n");;
				}
			}
		}
		bw.flush();
		bw.close();
	}
	private static void union(int pre, int val) {
		parent[find(val)] = find(pre);
	}
	private static int find(int v) {
		if(v != parent[v]) {
			parent[v] = find(parent[v]);
		}
		return parent[v];
	}
}
