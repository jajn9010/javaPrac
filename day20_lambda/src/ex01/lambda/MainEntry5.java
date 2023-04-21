package ex01.lambda;

interface Message {
	void something(int x, int y); // parameter O
}

interface Talk {
	void something(String x, String y);
}

class Person {
	public void greeting(Message msg) {
		msg.something(3, 5);
		System.out.println("Message interface something : ");
	}

	public void greeting(Talk msg) {
		msg.something("Hello ", "DaeBo");
		System.out.println("Message interface something : ");
	}
}

public class MainEntry5 {
	public static void main(String[] args) {

		// Lambda Expression, JDK 1.8 이상
		Person p = new Person();

		p.greeting(new Message() { // java에서 쓰던 일반적인 방식

			@Override
			public void something(int x, int y) {

				System.out.println("x = " + x + ", y = " + y);

			}

		});

		System.out.println("=======================================");
		char ch = 'K';
		
//		p.greeting((String x, String y) -> { // 에러발생, 타입이 애매하기 때문에 타입을 정확히 적어줘야함.
		
//		p.greeting((int x, int y) -> {
		p.greeting((String x, String y) -> { // Lambda 형태, 자료형도 필요없다, 매개변수가 2개 이상일때는 괄호 생략하면 안됨
			System.out.println("x = " + x + ", y = " + y);
//			ch = 'P'; // 값 변경 할 수 없다.
			System.out.println(ch);
			
			num = 500; // static 변수값은 변경 가능함.
			System.out.println(num);
		});
	}
	
	static int num = 30;
}
