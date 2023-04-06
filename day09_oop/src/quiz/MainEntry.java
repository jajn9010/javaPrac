package quiz;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("인원수를 입력해주세요.");
		int su = scan.nextInt();
		
		Score sc [] = new Score[su];
		
		for (int i = 0; i < su; i++) {
			sc[i] = new Score();
			input(i, sc[i]);
		}
		
		for (int i = 0; i < su; i++) {
			output(sc[i]);
		}
		sc.clone();
	}
	
	public static void input(int i, Score score) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("학생의 이름 : ");
		score.name = scan.next();

		do {
			System.out.print("국어 점수를 입력해주세요 : ");
			score.kor = scan.nextInt();
		} while (score.kor > 100 || score.kor < 0);
		do {
			System.out.print("영어 점수를 입력해주세요 : ");
			score.eng = scan.nextInt();
		} while (score.eng > 100 || score.eng < 0);
		do {
			System.out.print("전산 점수를 입력해주세요 : ");
			score.com = scan.nextInt();
		} while (score.com > 100 || score.com < 0);
		score.getScore();
	}
	
	public static void output(Score score) {
		System.out.print("\n" + score.name + "님의 성적표***************\n" + "국어 : " + score.kor + ", 영어 : " + score.eng + ", 전산 : " + score.com
				+ "\n총점 : " + score.total);
		System.out.printf(", 평균 : %.2f, 평점 : %c", score.evg, score.grade);
		System.out.println("\n");
	}
}
