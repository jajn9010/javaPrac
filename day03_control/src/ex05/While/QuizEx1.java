package ex05.While;

import java.util.Scanner;

public class QuizEx1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int kor, eng, result = 0;
		char op;
		
		do {			
			System.out.println("당신의 국어 점수를 입력하세요 : ");
			kor = sc.nextInt();
		} while (kor > 100 || kor <0);
		
		do {			
			System.out.println("당신의 영어 점수를 입력하세요 : ");
			eng = sc.nextInt();
		} while (eng > 100 || eng <0);
		
		do {			
			System.out.println("연산자(+, -, *, /)를 입력하세요 : ");
			op = sc.next().charAt(0);
		} while (op != '+' && op != '*' && op != '-' && op != '/');
		
		if (op == '+') result = kor + eng;
		else if (op == '-') result = kor - eng;
		else if (op == '/') {
			try {
				result = kor / eng;
			} catch (Exception e) {
				System.out.println("분모가 0인 경우 나눗셈을 할 수 없습니다.");
				e.printStackTrace();
			}
		}
		else result = kor * eng;
		
		System.out.printf("%d %c %d = %d", kor, op, eng, result);
	}
}

/*
문제]	3과목의 점수를 입력 받고 ( 0 ~ 100점 )
		연산자(+, -, *, /)만을 입력 받아서
		
		100, 100, 100, +를 받았을 때
		result = 
					100 + 100 + 100 = 300
*/