package report;

import java.util.Scanner;

public class Report2 {
	public static void main(String[] args) {
		
		System.out.println("정수 2개를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("연산자를 입력하세요 : ");
		String strop = sc.next();
		char op = strop.charAt(0);
		
		if (op == '+') System.out.println(a + " " + strop + " " + b + " = " + (a+b));
		else if (op == '-') System.out.println(a + " " + strop + " " + b + " = " + (a-b));
		else if (op == '*') System.out.println(a + " " + strop + " " + b + " = " + (a*b));
		else if (op == '/') {
			double result = (double)a/(double)b;
			System.out.println(a + " " + strop + " " + b + " = " + result);
		}
		else System.out.println("사칙연산이 아닙니다.");
		
	}
}
