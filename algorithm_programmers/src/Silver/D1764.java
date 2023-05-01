package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class D1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		HashSet<String> setA = new HashSet<>();
		HashSet<String> setB = new HashSet<>();
		HashSet<String> setKyo = new HashSet<>();
		
		for (int i = 0; i < A; i++) {
			setA.add(br.readLine());
		}

		for (int i = 0; i < B; i++) {
			setB.add(br.readLine());
		}
		
		Iterator<String> it = setB.iterator();
		while (it.hasNext()) {
			String tmp = it.next();
			if (setA.contains(tmp))
				setKyo.add(tmp);
		}
		
		String[] str = new String[setKyo.size()];
		it = setKyo.iterator();
		for (int i = 0; i < setKyo.size(); i++) {
			str[i] = it.next();
		}
		
		Arrays.sort(str);
		
		sb.append(setKyo.size() + "\n");
		
		for (String item : str) sb.append(item + "\n");
		
		System.out.println(sb);
	}
}
