//package ex01.lambda;
//
//interface Message {
//	int something(int x, int y);
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something(3, 5);
//		System.out.println("Message interface something : " + su);
//	}
//}
//
//public class MainEntry4 {
//	public static void main(String[] args) {
//
//		// Lambda Expression, JDK 1.8 이상
//		Person p = new Person();
//		
//		p.greeting(new Message() { // java에서 쓰던 일반적인 방식
//			
//			@Override
//			public int something(int x, int y) {
//				
//				System.out.println("return type, parameter 안녕하세요.");
//				System.out.println("x = " + x + ", y = " + y);
//				return 50;
//				
//			}
//			
//		});
//		
//		System.out.println("=======================================");
//		
//		p.greeting((x, y) -> { //Lambda 형태, 자료형도 필요없다, 매개변수가 2개 이상일때는 괄호 생략하면 안됨
//			System.out.println("Lambda return type, parameter 안녕");
//			System.out.println("x = " + x + ", y = " + y);
//			return 20;
//		});
//	}
//}
