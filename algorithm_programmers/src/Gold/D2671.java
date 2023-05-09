package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2671 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = "(100+1+|01)+";

		String pattern = br.readLine();

		if (pattern.matches(str))
			sb.append("SUBMARINE").append("\n");
		else
			sb.append("NOISE").append("\n");

		System.out.println(sb);
	}
}
