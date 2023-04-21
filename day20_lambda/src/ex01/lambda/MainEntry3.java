//package ex01.lambda;
//
//interface Message {
//	int something(int x);
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something(30);
//		System.out.println("Message interface something : " + su);
//	}
//}
//
//public class MainEntry3 {
//	public static void main(String[] args) {
//
//		// Lambda Expression, JDK 1.8 이상
//		Person p = new Person();
//		
//		p.greeting(new Message() { // java에서 쓰던 일반적인 방식
//			
//			@Override
//			public int something(int x) {
//				
//				System.out.println("return type, parameter 안녕하세요.");
//				System.out.println("한주 동안 수고 많으셨습니다.");
//				return 50;
//				
//			}
//			
//		});
//		
//		System.out.println("=======================================");
////		p.greeting( x -> { //Lambda 형태, 자료형도 필요없다. 매개변수가 하나인 경우에 괄호도 없어도 된다.
////			System.out.println("Lambda return type, parameter 안녕");
////			System.out.println("한주 열공 감사요!!");
////			return 20;
////		});
//		
//		p.greeting((x) -> { //Lambda 형태, 자료형도 필요없다.
//			System.out.println("Lambda return type, parameter 안녕");
//			System.out.println("한주 열공 감사요!!");
//			return 20;
//		});
//	}
//}
