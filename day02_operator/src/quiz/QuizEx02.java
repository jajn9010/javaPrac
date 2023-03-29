package quiz;

import java.util.Scanner;

//문제]  이름, 주소, 연락처 입력 받아서 출력
public class QuizEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 입력 요망 : ");
		String name = sc.next();
		System.out.print("주소 입력 요망 : ");
		String add = sc.next();
		System.out.print("번호 입력 요망 : ");
		String pNum = sc.next();

		sc.close();

		System.out.println("이름 : " + name + "\n주소 : " + add + "\n전화번호 : " + pNum);

	}

}
