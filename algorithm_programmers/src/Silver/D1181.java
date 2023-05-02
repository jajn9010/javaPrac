package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class D1181 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		String[] str = new String[T];
		
		for (int i = 0; i < T; i++) {
			str[i] = br.readLine();
		}
		
		Arrays.sort(str);
		
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
			
		});
		
		String[] resultArr = Arrays.stream(str).distinct().toArray(String[]::new);
		
		for (int i = 0; i < resultArr.length; i++) {
			sb.append(resultArr[i]).append("\n");
		}
		
		System.out.println(sb);
	}
}
