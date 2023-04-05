package quiz;

import java.util.Scanner;

public class Quiz_사칙연산함수 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("input data = ");
			int su1 = sc.nextInt();
			int su2 = sc.nextInt();

			System.out.println("integer data input(1 : +, 2 : -, 3 : /, 4 : *, 0 : exit) = ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1: plus(su1, su2); break;
			case 2: sub(su1, su2); break;
			case 3: div(su1, su2); break;
			case 4: mul(su1, su2); break;
			case 0: System.out.println("종료를 원하시는군요. 사칙연산을 종료합니다.");
					System.exit(0);
			default:
				System.out.println("없는 번호를 선택하셨습니다. 0~4까지 중에서 선택하세요.");
			}
			
			sc.close();
		}
	}
	
//	public static void main(String[] args) {
//		// 함수 호출
//		Scanner sc = new Scanner(System.in);
//		System.out.println("x, y를 입력해주세요 : ");
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		
//		plus(x, y);
//		mul(x, y);
//		sub(x, y);
//		div(x, y);
//		
//		sc.close();
//		
//	}

	// plus(+), mul(*) 리턴 타입 없이
	// sub(-), div(/) 리턴 타입 있고, / 함수는 예외처리도 한다.
	
	public static void plus(int x, int y) {
		int sum = x + y;
		System.out.println(x + " + " + y + " = " + sum);
	}
	
	public static void mul(int x, int y) {
		int gob = x * y;
		System.out.println(x + " * " + y + " = " + gob);
	}
	
	public static int sub(int x, int y) {
		int sub = x - y;
		System.out.println(x + " - " + y + " = " + sub);
		return sub;
	}
	
	public static double div(int x, int y) {
		double div = 0;
		
		if ( y == 0 ) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.exit(0);
		}else {
			div = (double)x / y;
			System.out.printf("%d / %d = %.2f\n", x, y, div);
		}
		
		return div;
	}
	
}
