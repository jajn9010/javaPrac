package ex03.exception;

import java.util.Scanner;

public class ThrowsMain {
	public static void main(String[] args)
			throws Exception {  // 예외처리 위임, JVM이 대신 처리함
		
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
