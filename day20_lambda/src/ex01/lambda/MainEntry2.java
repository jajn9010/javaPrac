//package ex01.lambda;
//
//interface Message {
//	int something();
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something();
//		System.out.println("Message interface something : " + su);
//	}
//}
//
//public class MainEntry2 {
//	public static void main(String[] args) {
//
//		// Lambda Expression, JDK 1.8 이상
//		Person p = new Person();
//		
//		p.greeting(new Message() { // java에서 쓰던 일반적인 방식
//			
//			@Override
//			public int something() {
//				
//				System.out.println("return type 안녕하세요.");
//				System.out.println("한주 동안 수고 많으셨습니다.");
//				return 100;
//				
//			}
//			
//		});
//		
//		System.out.println("=======================================");
//		
//		p.greeting(() -> { //Lambda 형태
//			System.out.println("Lambda return type 안녕");
//			System.out.println("한주 열공 감사요!!");
//			return 200;
//		});
//	}
//}
