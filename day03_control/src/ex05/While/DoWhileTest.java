package ex05.While;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int su;
		char grade = ' ';
		
		do {			
			System.out.println("당신의 점수 입력 요망 : ");
			su = sc.nextInt();
		}while(su < 0 || su > 101);
		
		switch (su / 10) {
		case 10, 9: grade = 'A'; break; 
		case 8: grade = 'B'; break; 
		case 7: grade = 'C'; break; 
		case 6: grade = 'D'; break; 
		default: grade = 'F'; break;
		}
		
		System.out.println("\n당신의 점수 " + su + " ==> " + grade + "학점");
		
		sc.close();
	}
}
