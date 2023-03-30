package quiz;

import java.util.Scanner;

public class Quiz_윤년판정프로그램 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1.변수 선언
		int year;
		String msg = "";
		boolean flag = false;
		
		//2. 메세지 출력 및 입력받기
		System.out.println("년도를 입력해 주세요 : ");
		year = sc.nextInt();
		
		//3. 처리(계산)
		if ((year % 4 == 0) && year % 100 != 0 || year % 400 == 0) {
			flag = true;
		}
		
		msg = (flag == true) ? "윤년" : "평년";
		
		//4. 결과출력
		System.out.println(year + "년도는 " + msg + "입니다.");
		
		sc.close();
		
	}
}
