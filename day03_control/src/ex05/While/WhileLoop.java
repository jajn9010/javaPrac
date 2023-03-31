package ex05.While;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int su;
		char grade = ' ', yn = ' ';
		
		while (true) {
			
			do {
				System.out.println("당신의 점수 입력 요망: ");
				su = sc.nextInt();
			}while( su < 0 || su > 101 );
			
			System.out.println("\n당신의 점수 " + su);
			
			System.out.println("계속 진행하시겠습니까? (y/n) ");
			yn = sc.next().charAt(0);			
			if( yn == 'n' || yn == 'N') break;
		}
		sc.close();
	}
}
