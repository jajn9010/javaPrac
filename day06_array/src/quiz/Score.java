/*
package quiz;

import java.util.Scanner;

public class Score {
	
	// 7명의 성적처리 배열이용하기
	public static void main(String[] args) {

		String name;
		int kor, eng, com, total;
		double everg;
		char grade = ' ';
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("이름을 입력해 주세요 : ");
			name = sc.next();
			
			do {			
				System.out.println("국어 점수를 입력해주세요 : ");
				kor = sc.nextInt();
			}while(kor > 100 || kor < 0);
			do {			
				System.out.println("영어 점수를 입력해주세요 : ");
				eng = sc.nextInt();
			}while(eng > 100 || eng < 0);
			do {			
				System.out.println("전산 점수를 입력해주세요 : ");
				com = sc.nextInt();
			}while(com > 100 || com < 0);
			
			total = kor + eng + com;
			everg = (double)total/3;
			
			switch ((int)everg/10) {
			case 10 : case 9 : 
				grade = 'A'; break;
			case 8 : grade = 'B'; break;
			case 7 : grade = 'C'; break;
			case 6 : grade = 'D'; break;
			default : grade = 'F'; break;
			}		
			
			System.out.print(name + "님의 성적표***************\n" + "국어 : " + kor + ", 영어 : " 
								+ eng + ", 전산 : " + com + "\n총점 : " + total);
			System.out.printf(", 평균 : %.2f, 평점 : %c ", everg, grade);
			
			System.out.println("\n더 입력 하시겠어요? (y/n)");
//			char ans = sc.next().charAt(0);
			String ans = sc.next();
			
//			if(ans == 'n' || ans == 'N') break;
//			if( ans.toLowerCase().equals("n") || ans.toUpperCase().equals("N")) break;  //대문자 소문자 문자로
			if( ans.equalsIgnoreCase("n")) break; // equalsIgnoresCase() ==> () 괄호 안의 대소문자 구분 없이 비교하는 함수
			
//			sc.close();
		}
		
	}
}

/*
	문제] 이름 입력 받고, 국어, 영어, 전산 점수를 입력 받아서
		 총점, 평균까지 구하는 프로그램 작성
		 
		 이도연님의 성적표********************
		 국어 : 100, 영어 : 100, 전산 : 100
		 총점 : 300, 평균 : 100.0,  평점(학점) : A
*/

//*/

//*
package quiz;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.SwingConstants;

public class Score {

	// 7명의 성적처리 배열이용하기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("입력할 인원수를 입력해 주세요 : ");
		int su = sc.nextInt();
		String[] names = new String[su];

		int[][] score = new int[su][4];
		String name;
		int kor, eng, com, total;
		double[] everg = new double[su];
		char[] grade = new char[su];
		double[] ranks = new double[su];

		for (int i = 0; i < names.length; i++) {

			System.out.printf("%d번째 학생의 이름 : ", i + 1);
			name = sc.next();
			names[i] = name;

			do {
				System.out.print("국어 점수를 입력해주세요 : ");
				kor = sc.nextInt();
				score[i][0] = kor;
			} while (kor > 100 || kor < 0);
			do {
				System.out.print("영어 점수를 입력해주세요 : ");
				eng = sc.nextInt();
				score[i][1] = eng;
			} while (eng > 100 || eng < 0);
			do {
				System.out.print("전산 점수를 입력해주세요 : ");
				com = sc.nextInt();
				score[i][2] = com;
			} while (com > 100 || com < 0);

			total = kor + eng + com;
			score[i][3] = total;
		} // for end

		for (int i = 0; i < ranks.length; i++) {
			ranks[i] = (double) score[i][3] / 3;
		} // copy everg

		Arrays.sort(ranks); // ranks sort

		for (int i = 0; i < score.length; i++) {
			everg[i] = (double) score[i][3] / 3;
			grade[i] = ' ';
			int rank = 0;

			switch ((int) everg[i] / 10) {
			case 10:
			case 9:
				grade[i] = 'A';
				break;
			case 8:
				grade[i] = 'B';
				break;
			case 7:
				grade[i] = 'C';
				break;
			case 6:
				grade[i] = 'D';
				break;
			default:
				grade[i] = 'F';
				break;
			} // grade end

			for (int j = 0; j < ranks.length; j++) {
				if (everg[i] == ranks[j]) {
					rank = ranks.length - j;
				}
			}

			System.out.print(names[i] + "님의 성적표***************\n" + "국어 : " + score[i][0] + ", 영어 : " + score[i][1]
					+ ", 전산 : " + score[i][2] + "\n총점 : " + score[i][3]);
			System.out.printf(", 평균 : %.2f, 평점 : %c, 석차(등수) : %d ", everg[i], grade[i], rank);
			System.out.println("\n");
			
		} // score for end

		sc.close();

	}
}

/*
	문제] 이름 입력 받고, 국어, 영어, 전산 점수를 입력 받아서
		 총점, 평균까지 구하는 프로그램 작성
		 
		 이도연님의 성적표********************
		 국어 : 100, 영어 : 100, 전산 : 100
		 총점 : 300, 평균 : 100.0,  평점(학점) : A, 석차(등수) : 2
*/

//*/