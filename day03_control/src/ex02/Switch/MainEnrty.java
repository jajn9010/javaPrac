//*
package ex02.Switch;

import java.util.Scanner;

public class MainEnrty {
	public static void main(String[] args) {
		
		System.out.print("좋아하는 도시를 선택하세요 (s, d, b, j)");
		
		Scanner sc = new Scanner(System.in);
		
//		String str = "korea";
//		char ch = str.charAt(3);
//		System.out.println(op);
		
//		String str = sc.next();
//		char op = str.charAt(0); // 문자열 함수 중 문자열에서 charAt(index) 인덱스번호 문자 가져오는 함수.
		char ch = sc.next().charAt(0); //문자열 입력받기
		
		switch (ch) {
		case 's' : System.out.print("서울"); break;
		case 'd' : System.out.print("대구"); break;
		case 'b' : System.out.print("부산"); break;
		case 'j' : System.out.print("제주"); break;
		default: 
			System.out.print("잘못 선택하셨습니다. s, d, b, j 중에서만 선택하시길 바랍니다.");
			System.exit(0); //프로그램 강제 종료
		} //switch end
		
		System.out.println("룰(을) 선택하셨습니다.");
		
		sc.close();
	}
}
//*/

/*
package ex02.Switch;

import java.util.Scanner;

public class MainEnrty {
	public static void main(String[] args) {
		
		System.out.print("좋아하는 도시를 선택하세요 (s, d, b, j)");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next(); //문자열 입력받기
		
		switch (str) {
		case "s" : System.out.print("서울"); break;
		case "d" : System.out.print("대구"); break;
		case "b" : System.out.print("부산"); break;
		case "j" : System.out.print("제주"); break;
		default: 
			System.out.print("잘못 선택하셨습니다. s, d, b, j 중에서만 선택하시길 바랍니다.");
			System.exit(0); //프로그램 강제 종료
		} //switch end
		
		System.out.println("룰(을) 선택하셨습니다.");
		
		sc.close();
	}
}
//*/

/*
package ex02.Switch;

import java.util.Scanner;

public class MainEnrty {
	public static void main(String[] args) {
		
		System.out.println("point = ? ");
		
		Scanner sc = new Scanner(System.in);
		
		int point = sc.nextInt();
		
		switch (point) { // long형 제외한 정수형, 문자형만 올 수 있다.
		case 1: // 값이 숫자일때는 그냥 쓰면됨, 문자라면 '', 문자열이면 ""
			System.out.println("포인트 점수 1점 입니다.");
			break;

		case 2: // 값이 숫자일때는 그냥 쓰면됨, 문자라면 '', 문자열이면 ""
			System.out.println("포인트 점수 2점 입니다.");
			break;
			
		case 3: // 값이 숫자일때는 그냥 쓰면됨, 문자라면 '', 문자열이면 ""
			System.out.println("포인트 점수 3점 입니다.");
			break;
		
		default: // 생략이 가능 - 에러처리나 메세지 작성하는게 좋음
			System.out.println("없는 포인트 넣으셨네요. 1, 2, 3 중에서 선택하세요");
			
		} // switch end
		
		sc.close();
		
		System.out.println("main end!");
	}
}
//*/