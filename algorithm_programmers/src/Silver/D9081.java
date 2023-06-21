package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class D9081 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			String s = br.readLine();
			char[] ch = s.toCharArray();
			int n = ch.length;
			
			int index1 = -1, index2 = 0;
			
			for (int i = n - 1; i > 0; i--) {
				if(ch[i - 1] < ch[i]) {
					index1 = i - 1;
					break;
				}
			}
			if(index1 == -1) {
				sb.append(s).append("\n");
				continue;
			}
			
			for (int i = n - 1; i >= 0; i--) {
				if(ch[index1] < ch[i]) {
					index2 = i;
					break;
				}
			}
			
			char temp = ch[index1];
			ch[index1] = ch[index2];
			ch[index2] = temp;
			
			Arrays.sort(ch, index1 + 1, n);
			
			String str = "";
			for (char item : ch) str += item;
			sb.append(str).append("\n");
		}
		System.out.println(sb);
	}
}
