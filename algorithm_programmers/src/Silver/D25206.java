package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D25206 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		double total = 0, gTotal = 0;

		String input = "";
		while ((input = br.readLine()) != null && !input.isEmpty()) {
			st = new StringTokenizer(input);
			st.nextToken();
			double t = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();

			if (grade.equals("P")) {
				continue;
			} else {
				double g = check(grade);
				
				total += (t * g);
				gTotal += t;
			}
		}

		System.out.println(total / gTotal);
	}

	public static double check(String grade) {
		switch (grade) {
		case "A+":
			return 4.5;
		case "A0":
			return 4.0;
		case "B+":
			return 3.5;
		case "B0":
			return 3.0;
		case "C+":
			return 2.5;
		case "C0":
			return 2.0;
		case "D+":
			return 1.5;
		case "D0":
			return 1.0;
		case "F":
			return 0.0;
		}
		return -1;
	}
}
