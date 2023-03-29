package quiz;

import java.util.Scanner;

public class Quiz_If {
	public static void main(String[] args) {
		
		System.out.println("kor = "); int kor = new Scanner(System.in).nextInt();
		System.out.println("eng = "); int eng = new Scanner(System.in).nextInt();
		System.out.println("com = "); int com = new Scanner(System.in).nextInt();
		double avg = (kor + eng + com) / 3.0;
//		double avg = (double)(kor + eng + com) / 3;
		
		if( avg >= 60 ) { // 3과목 평균 60점 이상이어야하고, ..
			
			if ( kor >= 40 && eng >= 40 && com >= 40) {
				System.out.printf("모든 과목이 40점 이상이며, 평균이 %.1f로 [합격]입니다\n", avg);
			} else {
				System.out.printf("평균이 %.1f 이지만, ", avg);
				if(kor < 40) System.out.print("국어 " + kor + "점");
				if(kor < 40) System.out.print("언어 " + eng + "점");
				if(kor < 40) System.out.print("전산 " + com + "점");
				System.out.print("으로 [과락탈락]입니다.");
			}
			
		} else {
			System.out.printf("평균이 %.1f로 [평균 미달 탈락]입니다.\n", avg);
		}
		
	}
}

/*
package quiz;

import java.util.Scanner;

public class Quiz_If {
	public static void main(String[] args) {
		
		int kor, eng, com, total;
		double evg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("언어, 영어, 전산 순으로 점수를 입력해주세요 : ");
		
		kor = sc.nextInt();
		eng = sc.nextInt();
		com = sc.nextInt();
		
		total = kor + eng + com;
		evg = (double)total/3;
		
		if (evg >= 60 && kor >= 40 && eng >= 40 && com >= 40) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("평균 점수 : " + evg);
			System.out.println("언어 점수 : " + kor);
			System.out.println("영어 점수 : " + eng);
			System.out.println("전산 점수 : " + com);
			
			if(evg < 60) {
				System.out.println("평균 미달 - 불합격");
			}
			else if(kor<40) {
				System.out.println("언어 과락 - 불합격");
			}
			else if(eng<40) {
				System.out.println("영어 과락 - 불합격");
			}
			else {
				System.out.println("전산 과락 - 불합격");
			}
		}
		
		
		sc.close();
	}
}
//*/

/*
package quiz;

import java.util.Scanner;

public class Quiz_If {
	public static void main(String[] args) {
		
		int score = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학점을 입력해주세요 : ");
		score = sc.nextInt();
		
		if (score <100 && score > 90) System.out.println("귀하의 학점은 A 입니다.");
		else if (score <89 && score > 80) System.out.println("귀하의 학점은 B 입니다"); 
		else if (score <79 && score > 70) System.out.println("귀하의 학점은 C 입니다"); 
		else if (score <69 && score > 60) System.out.println("귀하의 학점은 D 입니다"); 
		else if (score <59 && score > 50) System.out.println("귀하의 학점은 E 입니다"); 
		else if (score <49) System.out.println("귀하의 학점은 F 입니다");
		else System.out.println("점수 범위를 초과하였습니다.");
		
		sc.close();
	}
}
//*/

/*
	문제1] 점수 입력 받아서 평점(학점) 구하는 프로그램 작성
		100~90 : A
		89~80 : B
*/

/*
	문제2] 3과목 (K, E, C) 점수 입력 받아서 평균 60점 이상.
		  각 과목 40점 이상이어야 합격.
		  불합격이면 불합격 출력, 각 과목 과락
		  
*/