package quiz;

import java.util.Scanner;

import javax.swing.SwingConstants;

public class Score {
	
	// 7명의 성적처리 배열이용하기
	public static void main(String[] args) {
		
		String [] names = new String[7];
		
		int [][] score = new int[7][4];
		String name;
		int kor, eng, com, total;
		double[] everg = new double[7];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < names.length; i++) {
			
			System.out.println("이름을 입력해 주세요 : ");
			name = sc.next();
			names[i] = name;
			
			do {			
				System.out.println("국어 점수를 입력해주세요 : ");
				kor = sc.nextInt();
				score[i][0] = kor;
			}while(kor > 100 || kor < 0);
			do {			
				System.out.println("영어 점수를 입력해주세요 : ");
				eng = sc.nextInt();
				score[i][1] = eng;
			}while(eng > 100 || eng < 0);
			do {			
				System.out.println("전산 점수를 입력해주세요 : ");
				com = sc.nextInt();
				score[i][2] = com;
			}while(com > 100 || com < 0);

			total = kor + eng + com;
			score[i][3] = total;
		}
		for (int i = 0; i < score.length; i++) {
			everg[i] = (double)score[i][3]/3;
			char grade = ' ';
			
			switch ((int)everg[i]/10) {
			case 10 : case 9 : 
				grade = 'A'; break;
			case 8 : grade = 'B'; break;
			case 7 : grade = 'C'; break;
			case 6 : grade = 'D'; break;
			default : grade = 'F'; break;
			}		
			System.out.print(names[i] + "님의 성적표***************\n" + "국어 : " + score[i][0] + ", 영어 : " 
					+ score[i][1] + ", 전산 : " + score[i][2] + "\n총점 : " + score[i][3]);
			System.out.printf(", 평균 : %.2f, 평점 : %c ", everg[i], grade);
			System.out.println();
		}		
		
		
		sc.close();
		
	}
}

/*
	문제] 이름 입력 받고, 국어, 영어, 전산 점수를 입력 받아서
		 총점, 평균까지 구하는 프로그램 작성
		 
		 이도연님의 성적표********************
		 국어 : 100, 영어 : 100, 전산 : 100
		 총점 : 300, 평균 : 100.0,  평점(학점) : A
*/