package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arithmetic_Operations {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("숫자 1 입력 : ");
		int su1 = Integer.parseInt(br.readLine().trim());
		System.out.println("숫자 2 입력 : ");
		int su2 = Integer.parseInt(br.readLine().trim());

		System.out.println("연산기호 입력 : ");
		String op = br.readLine().trim();
		double answer = 0;

		if (op.equals("*"))
			answer = su1 * su2;
		else if (op.equals("+"))
			answer = su1 + su2;
		else if (op.equals("-"))
			answer = su1 - su2;
		else {
			if (su2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);
			} else
				answer = (double) su1 / su2;
		}

//		System.out.println("연산기호 입력 : ");
//		char ch = br.readLine().charAt(0);
//		switch (ch) {
//		case '*':
//			answer = su1 * su2;
//			break;
//		case '+':
//			answer = su1 + su2;
//			break;
//		case '-':
//			answer = su1 - su2;
//			break;
//		case '/':
//			if (su2 == 0) {
//				System.out.println("0으로 나눌 수 없습니다.");
//				System.exit(0);
//			} else
//				answer = (double) su1 / su2;
//			break;
//		}

		System.out.printf("%d %s %d = %.2f", su1, op, su2, answer);

	}
}
