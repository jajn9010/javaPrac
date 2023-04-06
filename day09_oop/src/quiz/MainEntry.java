package quiz;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		Score sc = new Score();
//		sc.setName("이재진");
//		sc.setKor(100);
//		sc.setEng(80);
//		sc.setCom(90);
//		
//		sc.getScore();
		
		input(sc);
		
		sc.output();
		
	}
	
	public static void input(Score sc) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("학생의 이름 : ");
		sc.name = scan.next();

		do {
			System.out.print("국어 점수를 입력해주세요 : ");
			sc.kor = scan.nextInt();
		} while (sc.kor > 100 || sc.kor < 0);
		do {
			System.out.print("영어 점수를 입력해주세요 : ");
			sc.eng = scan.nextInt();
		} while (sc.eng > 100 || sc.eng < 0);
		do {
			System.out.print("전산 점수를 입력해주세요 : ");
			sc.com = scan.nextInt();
		} while (sc.com > 100 || sc.com < 0);
		sc.getScore();
		
		scan.close();
	}
}
