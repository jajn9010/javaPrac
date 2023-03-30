package ex03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyMain {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("x, y = ");
		int x, y, result;
		
		try {
			x = sc.nextInt();
			y = sc.nextInt();
			result = x / y; //에러발생 소지가 있음
			System.out.println(result);			
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		} catch (Exception e) {
//			System.out.println(x); // 
//			System.out.println("0으로 나눌 수 없습니다."); // user message
//			System.out.println(e.getMessage());
//			e.printStackTrace();   // 단계별로 발생한 에러를 단계별로 프린트 해줘라
			System.out.println("Exception");
		} finally {
			System.out.println("finally 무조건 처리됨!!!");
		}
		
		sc.close();
		
		
	}
}
