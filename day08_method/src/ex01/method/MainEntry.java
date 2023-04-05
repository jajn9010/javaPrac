package ex01.method;

public class MainEntry {

	public static void main(String[] args) {

		abs(-9);
		plus(5, 30, "hello"); // 함수 호출
		System.out.println("main start");
		line();
		info();
		line();
		System.out.println("main end");

	}


	// 1) 매개변수 없고, 리턴타입 없는 경우
	public static void info() {

		System.out.println("jaejin");
		System.out.println("010-5445-7506");
		System.out.println("seoul");

	}

	public static void line() {
		System.out.println("=============================================");
	}

	// 2) 매개변수 있고, 리턴타입 없는 경우
	public static void plus(int x, int y, String msg) { // 함수 정의부(구현부)
		System.out.println("합 = " + (x + y));
		int sum = x + y;
		System.out.println("합 = " + sum);
		System.out.println(msg);
		System.out.println(x + ", " + y + ", " + msg);
	}

	public static void abs(int x) {
		
		if (x < 0) x = -x;
		System.out.println("절대값 : " + x);
		
	}
	
}
