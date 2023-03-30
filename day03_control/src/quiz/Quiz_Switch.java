package quiz;

import java.util.Scanner;

public class Quiz_Switch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신이 받은 점수는? : ");
		int score = sc.nextInt();
		
		switch (score/10) {
		case 10 : System.out.println("당신은 만점으로 학점 A 입니다."); break;
		case 9 : System.out.println("당신은 " + score + "으로 학점 A 입니다."); break;
		case 8 : System.out.println("당신은 " + score + "으로 학점 B 입니다."); break;
		case 7 : System.out.println("당신은 " + score + "으로 학점 C 입니다."); break;
		case 6 : System.out.println("당신은 " + score + "으로 학점 D 입니다."); break;
		case 5 : case 4 : case 3 : case 2 : case 1 : 
			System.out.println("당신은 " + score + "으로 학점 F 입니다."); break;
						
		default :
			System.out.println("점수를 잘못 입력하셨습니다. 0점부터 100점까지 입력해주세요.");
		}		
		sc.close();
	}
}


/*

*/