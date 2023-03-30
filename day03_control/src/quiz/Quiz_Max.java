package quiz;

import java.util.Scanner;

public class Quiz_Max {
	public static void main(String[] args) {
		
		System.out.println("정수 2개를 입력해 주세요 : ");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		
		if (a>b) System.out.println(a);
		else if(a<b) System.out.println(b);
		else System.out.println("같은 값입니다.");
		
//		int res = (a>b) ? a : (a<b) ? b : 0;		
	}
}

//문제3] 정수 2개 입력 받아서 큰수 출력하는 프로그램 작성