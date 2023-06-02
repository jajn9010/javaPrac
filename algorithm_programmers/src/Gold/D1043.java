package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class D1043 {
	static int n, m, total;
	static boolean[] truePeople;
	static int[] parent;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		parent = new int[n + 1];
		
		// union-find 초기화
		for (int i = 1; i <= n; i++) {
			parent[i] = i;
		}
		
		truePeople = new boolean[n + 1];
		
		// 진실을 아는 사람들 데려오기
		st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		for (int i = 0; i < num; i++) {
			truePeople[Integer.parseInt(st.nextToken())] = true;
		}
		
		// 사람들 정보를 받아서 같은 파티 사람들 union화
		ArrayList<Integer>[] peoples = new ArrayList[m]; 
		for (int i = 0; i < m; i++) {
			peoples[i] = new ArrayList<>();
		}
		
		int val, pre = 0;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken());
			if(num  > 0) {
				pre = Integer.parseInt(st.nextToken());
				peoples[i].add(pre);
			}
			for (int j = 1; j < num; j++) {
				val = Integer.parseInt(st.nextToken());
				peoples[i].add(val);
				union(pre, val);
				pre = val;
			}
		}
		
		// 정보를 아는 사람들과 union인 사람들은 진실을 아는 사람 취급
		for (int i = 1; i < truePeople.length; i++) {
			if(truePeople[i]) {
				truePeople[find(i)] = true;
			}
		}
		
		// 진실 아는 사람과 파티 안한 사람들은 total ++
		int p;
		for (int i = 0; i < m; i++) {
			if(peoples[i].size() > 0) {
				p = find(peoples[i].get(0));
				if(!truePeople[p]) total++;
			}
		}
		System.out.println(total);
	}

	private static int find(int x) {
		if(parent[x] == x) {
			return parent[x] = x;
		}else {
			return find(parent[x]);
		}
	}

	private static boolean union(int pre, int val) {
		pre = find(pre);
		val = find(val);
		
		if(pre != val) {
			if(pre > val) {
				parent[pre] = val;
			} else {
				parent[val] = pre;
			}
			return true;
		}
		return false;
	}
}
