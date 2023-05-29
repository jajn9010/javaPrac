package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class D9935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		char[] ch = br.readLine().toCharArray();
		String bomb = br.readLine();
		Stack<Character> s = new Stack<>();
		Stack<Character> basket = new Stack<>();
		
		for (int i = 0; i < ch.length; i++) {
			s.add(ch[i]);
		}
		
		while(!s.isEmpty()) {
			sb = new StringBuilder();
			for (int i = 0; i < bomb.length()-1; i++) {
				sb.append(s.pop());
				basket.add(sb.charAt(i));
			}
			if(s.size() == 0) break;
			else {
				sb.append(s.peek());
				sb.reverse();
				String str = sb.toString();
				
				if(str.equals(bomb)) {
					s.pop();
					for (int i = 0; i < bomb.length()-1; i++) {
						basket.pop();
					}
					for (int i = 0; i < basket.size(); i++) {
						s.add(basket.pop());
						i--;
					}
				}
			}
		}
		
		sb = new StringBuilder();
		if(basket.size() != 0) {
			for (int i = 0; i < basket.size(); i++) {
				sb.append(basket.pop());
				i--;
			}
		} else sb.append("FRULA");
		
		System.out.println(sb);
	}
}
