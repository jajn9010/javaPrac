package quiz;

import java.util.Scanner;

public class Quiz_ExceptionTryMultiCatch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, plu, min, gob, na;
		
		try {
			
			System.out.println("a, b 정수를 입력하세요 : ");
			a = sc.nextInt();
			b = sc.nextInt();
			
			plu = a + b;
			min = a - b;
			gob = a * b;
			na = a/b;
			
			System.out.println(plu);
			System.out.println(min);
			System.out.println(gob);
			System.out.println(na);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

/*
문제]	정수 2개 입력 받아서 / 연산처리 프로그램 작성 (예외처리 할 것)
*/