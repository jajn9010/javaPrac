package ex02.array;

public class MainEntry {
	public static void main(String[] args) {
		
		// 1.
		char[] ch; // 배열선언
		ch = new char[4]; // 배열생성, 메모리에 할당
		
		// 2.
		char[] ch2 = new char[4]; //배열선언 및 생성, 메모리 할당
		
		// 배열 초기화
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		// 3.
		char[] ch3 = {'J', 'A', 'V', 'A', 'k', 'b', 's', 'm', 'b', 'c'};
		char loop = 'b';
		
		// 배열의 크기
		System.out.println("배열의 길이(크기) : " + ch3.length);
		System.out.println("배열의 길이(크기) : " + ch2.length);		
		
		// 배열의 내용 출력
		System.out.println("ch2[2] : " + ch2[2]);
		System.out.println("=======================================");
		for (int i = 0; i < 4; i++) {
			System.out.println("ch2[" + i + "] = " + ch2[i]);
		}
		
		System.out.println("=======================================");
		for (int i = 0; i < ch3.length; i++) {
			System.out.println("ch3[" + i + "] = " +ch3[i]);
		}
		
		// 확장된 for문
		// for(자료형 변수명 : 컬렉션면 또는 배열명 { 반복구문; }
		for (int item : ch3) {
			System.out.println((char)item);
			if (loop == (char)item) break;
		}
		
	}
}
