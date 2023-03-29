package ex03.operator;

import java.util.Scanner;

//*
//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		// 삼항(조건) 연산자 : (조건) ? 참 : 거짓;
		int x, y, z=0, result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("integer data 2 input = ");
		
		x = sc.nextInt();
		y = sc.nextInt();
		
//		if(x > y) result = x;
//		else result = y;
		
		result = (x > y) ? x : y;
		
		System.out.println("max = " + result);
		
		String str = null;
		System.out.println("year = ");
		
		int year = sc.nextInt();
		
		//if 판정?
		
		str = (year == 2000) ? "맞다." : "아니다";
		
		System.out.println(year + "년도는 윤년이 " + str);
		
		result = (x > y) ? x 
					: (y > z) ? y
							: (x > z) ? x : z; // else if 처럼 계속 할 수 있음
		
		sc.close();
		
	}
}
//*/

/*
//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		// 논리연산자 : &, &&(and), |, ||(or), ^(xor), !
		int x = 4;
		int y = 7;

		// 2진논리 결과 ==> 값
		System.out.println("x and y : " + (x & y));
		System.out.println("x or y : " + (x | y));
		System.out.println("x xor y : " + (x ^ y));

		// 10진논리 결과 ==> T/F (참, 거짓)

		int tx = 10;
		int ty = 20;
		int tz = 30;
		boolean flag = false;

//		flag = (tx < ty) && (ty < tz);
		flag = (tx > ty) && (ty < tz); // '&&'연산일 때 앞에 값이 거짓이면 뒤는 수행하지 않는다
		System.out.println(flag);

		flag = (tx < ty) || (ty < tz); // '||'연산일 때 앞에 값이 참이면 뒤는 수행하지 않는다
//		flag = (tx > ty) || (ty < tz);
		System.out.println(flag);
		
		//not 연산
		System.out.println(!flag);

	}
}
//*/