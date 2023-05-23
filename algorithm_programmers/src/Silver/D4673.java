package Silver;

import java.util.HashSet;

public class D4673 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		HashSet<Integer> s = new HashSet<>();
		for (int i = 1; i < 10001; i++) {
			s.add(i);
		}
		for (int i = 1; i < 10000; i++) {
			char[] ch = String.valueOf(i).toCharArray();
			int del = 0;
			for (int j = 0; j < ch.length; j++) {
				del += (ch[j] - '0');
			}
			del = del + i;
			s.remove(del);
		}
		for (int item : s) {
			sb.append(item).append("\n");
		}
		System.out.println(sb);
	}
}
