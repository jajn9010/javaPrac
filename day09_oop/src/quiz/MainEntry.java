package quiz;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("인원수를 입력해주세요.");
		int su = scan.nextInt();
		
		Score sc [] = new Score[su];
		
		input(sc);
		output(sc);
		
		scan.close();
	}
	
	public static void input(Score[] score) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < score.length; i++) {
			score[i] = new Score();
			System.out.printf("%d번째 학생의 이름 : ", i+1);
			score[i].name = scan.next();
			
			do {
				System.out.print("국어 점수를 입력해주세요 : ");
				score[i].kor = scan.nextInt();
			} while (score[i].kor > 100 || score[i].kor < 0);
			do {
				System.out.print("영어 점수를 입력해주세요 : ");
				score[i].eng = scan.nextInt();
			} while (score[i].eng > 100 || score[i].eng < 0);
			do {
				System.out.print("전산 점수를 입력해주세요 : ");
				score[i].com = scan.nextInt();
			} while (score[i].com > 100 || score[i].com < 0);
			
			score[i].getScore();
		}
	}
	
	public static void output(Score[] score) {
		for (int i = 0; i < score.length; i++) {
			System.out.print("\n" + score[i].name + "님의 성적표***************\n" + "국어 : " + score[i].kor + ", 영어 : " + 
					score[i].eng + ", 전산 : " + score[i].com + "\n총점 : " + score[i].total);
			System.out.printf(", 평균 : %.2f, 평점 : %c", score[i].evg, score[i].grade);
			System.out.println("\n");
		}
	}
}
