//*
package ex01.operator;

//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//산술연산자 : +, -, *, /, %, ^........
		int x = 10, y = 20;
		int gob = x * y;
		
		System.out.println(gob);
		System.out.println("x * y = " + (x*y));
		System.out.println(x + " * " + y + " = " + (x*y));
		System.out.println("---------------------------");
		
		System.out.println("3+4*5 = "+(3+4*5));
		System.out.println("(3+4)*5 = "+((3+4)*5));
		
		System.out.println("\n\n7/3 = "+ (7 / 3)); //나누기 연산, 정수 연산 정수는 무조건 정수다. = 몫
		System.out.println("7%3 = "+ (7 % 3)); // 나머지
		
		//정수 (+, -, *, /, %, ^........)  정수 = 정수
		System.out.println("\n 7/3 = "+ (7/3)); //2
		System.out.println("\n 7/3.0 = "+ (7/3.0)); //2.3333333
		System.out.println("\n 7./3.0 = "+ (7./3.0)); //2.3333333
	}
}
//*/

/*
package ex01.operator;

//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//단항연산자 : 증감연산자 (증가하거나 감소) -> ++, --, ~(틸트마크) ...
		int x = -7, y;
		
		y = ~x; //비트부정 : -(원래값 + 1) ==> 출력 결과가 값
		
		System.out.println("x = " + x + "\ty = " + y);
	}
}
//*/

/*
package ex01.operator;

//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//단항연산자 : 증감연산자 (증가하거나 감소) -> ++, --, ~(틸트마크) ...
		int x = 10, y;
		
		//y = x++; // 후위 연산 (변수 뒤에 위치한다.) : 대입먼저, 연산나중
		//y = ++x; // 전위 연산 (변수 앞에 위치한다.) : 연산먼저, 대입나중
		//y = x--;
		
		++x; // 단독으로 쓰임. 전위,후위 연산 같음
		y = x; 
		
		System.out.println("x = " + x + "\ty = " + y);
	}
}
//*/