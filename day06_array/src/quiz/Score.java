//*
package quiz;

import java.util.Scanner;

class STUDENT {
	String name;
	int kor, eng, com, total, rank;
	double evg;
	char grade;
}

public class Score {
	
	public static void output(int x, STUDENT student) { //출력 함수
		
		System.out.print(student.name + "님의 성적표***************\n" + "국어 : " + student.kor + ", 영어 : " + student.eng
				+ ", 전산 : " + student.com + "\n총점 : " + student.total);
		System.out.printf(", 평균 : %.2f, 평점 : %c", student.evg, student.grade);
		System.out.println("\n");
		
	}
	
	public static void input(int x, STUDENT student) { // 입력 함수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%d번째 학생의 이름 : ", x + 1);
		student.name = sc.next();

		do {
			System.out.print("국어 점수를 입력해주세요 : ");
			student.kor = sc.nextInt();
		} while (student.kor > 100 || student.kor < 0);
		do {
			System.out.print("영어 점수를 입력해주세요 : ");
			student.eng = sc.nextInt();
		} while (student.eng > 100 || student.eng < 0);
		do {
			System.out.print("전산 점수를 입력해주세요 : ");
			student.com = sc.nextInt();
		} while (student.com > 100 || student.com < 0);

		getScore(student);
		
	}
	
	public static void getScore(STUDENT student) { // 점수, 학점 구하는 함수

		student.total = student.kor + student.eng + student.com;
		student.evg = student.total / 3.0;
		
		switch ((int) student.evg / 10) {
			case 10:
			case 9:	student.grade = 'A'; break;
			case 8:	student.grade = 'B'; break;
			case 7:	student.grade = 'C'; break;
			case 6:	student.grade = 'D'; break;
			default:
				student.grade = 'F'; break;
		}
	
	}
	
	
	
	// 7명의 성적처리 배열이용하기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("입력할 인원수를 입력해 주세요 : ");
		int su = sc.nextInt();
		
		STUDENT student[] = new STUDENT[su];
//		STUDENT temp = new STUDENT();

		for (int i = 0; i < su; i++) { // 이름, 점수 입력;
			student[i] = new STUDENT();
			input(i, student[i]);
		} // for end

		for (int i = 0; i < su; i++) { // 내용 출력
			output(i, student[i]);
		} // for end
		
		sc.close();
	}

}

/*   순위 다음에 빼놓기
for (int i = 0; i < student.length; i++) {
			for (int j = i + 1; j < student.length; j++) {
				if(student[i].total < student[j].total) {
					temp = student[i];
					student[i] = student[j];
					student[j] = temp;
				}
				else if (student[i].total == student[j].total) {
					if(student[i].com < student[j].com) {
						temp = student[i];
						student[i] = student[j];
						student[j] = temp;
					}else if (student[i].com == student[j].com) {
						if(student[i].kor < student[j].kor) {
							temp = student[i];
							student[i] = student[j];
							student[j] = temp;
						}
					}
				}
			}
			
		} // for end
 */

/*
	문제] 이름 입력 받고, 국어, 영어, 전산 점수를 입력 받아서
		 총점, 평균까지 구하는 프로그램 작성
		 
		 이도연님의 성적표********************
		 국어 : 100, 영어 : 100, 전산 : 100
		 총점 : 300, 평균 : 100.0,  평점(학점) : A
*/

//*/

/*
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