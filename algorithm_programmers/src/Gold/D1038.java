package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class D1038 {
	static ArrayList<Integer> list;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		list = new ArrayList<>();

		if (T <= 10)
			System.out.println(T);
		else if (T > 1022)
			System.out.println(-1);
		else if (T == 1022) System.out.println("9876543210");
		else {
			for (int i = 0; i < 10; i++) {
				dfs(i, 1);
			}
			Collections.sort(list);
			System.out.println(list.get(T));
		}
	}

	public static void dfs(int i, int depth) {
		if (depth > 10) {
			return;
		}
		
		list.add(i);

		for (int j = 0; j < i % 10; j++) {
			dfs((i * 10) + j, depth + 1);
		}
		return;
	}
}
