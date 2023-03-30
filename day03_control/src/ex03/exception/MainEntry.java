//*
package ex03.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x, y = ");
		int x, y, result;
		
		try {
			x = sc.nextInt();
			y = sc.nextInt();
			result = x / y; //에러발생 소지가 있음
			System.out.println(result);			
		} catch (Exception e) {
//			System.out.println(x); // 
//			System.out.println("0으로 나눌 수 없습니다."); // user message
//			System.out.println(e.getMessage());
			e.printStackTrace();   // 단계별로 발생한 에러를 단계별로 프린트 해줘라
		}
		
		sc.close();
	}
}
//*/


/*
package ex03.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x, y = ");
		int x, y, result;
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (y == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.exit(0);
		}
		
		result = x / y; //에러발생 소지가 있음
		
		System.out.println(result);
		
		sc.close();
	}
}
//*/

/*
package ex03.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x, y = ");
		int x, y, result;
		x = sc.nextInt();
		y = sc.nextInt();
		
		result = x / y; //에러발생 소지가 있음
		
		System.out.println(result);
		
		sc.close();
	}
}
//*/