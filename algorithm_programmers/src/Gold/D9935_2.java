package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class D9935_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();
		String bomb = br.readLine();
		int bL = bomb.length();
		Stack<Character> s = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			s.add(str.charAt(i));

			if (s.size() >= bL) {
				boolean flag = true;

				for (int j = 0; j < bL; j++) {
					if (s.get(s.size() - bL + j) != bomb.charAt(j)) {
						flag = false;
						break;
					}
				}
				if (flag) {
					for (int j = 0; j < bL; j++) {
						s.pop();
					}
				}
			}
		}

		for (Character c : s)
			sb.append(c);

		System.out.println((sb.length() == 0) ? "FRULA" : sb);
	}
}
