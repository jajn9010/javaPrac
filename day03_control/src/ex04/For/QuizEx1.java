//*
package ex04.For;

import java.util.Scanner;

public class QuizEx1 {
	public static void main(String[] args) {
		int sum = 0;
		int cnt = 0;
		
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
				cnt ++;
			}
		}
		System.out.println("1부터 100까지의 3의 배수의 합은 " + sum + "이고 개수는 " + cnt + "개 입니다.");
	}
}
//*/

/*
문제2] 1 ~ 100까지 3의 배수의 합과 개수를 구하는 프로그램 작성
*/

/*
package ex04.For;

public class QuizEx1 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의 합은 " + sum + "입니다.");

		sum = 0;  //누적할 변수 초기화
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의 합은 " + sum + "입니다.");
	}
}
//*/

/*
문제1] 1 ~ 100까지 합을 구하는 프로그램 작성
*/