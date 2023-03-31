//*
package ex05.While;

public class DoWhileMain {
	public static void main(String[] args) {
		
		int a = 1, b = 1; // 변수초기화
		
		do {
			
			b = 1;
			do {
				
				System.out.print(b);
				b++; // 증감식
				
			} while(b <= 3); // 조건
			
			//b = 1;   //다중 while, do ~ while 문에서는 안쪽에 있는 변수의 초기화가 있어야 한다.
			a++; // 증감식
			
		} while(a <= 2); // 조건, 문장종결기호
		
	}
}
//*/

/*
package ex05.While;

public class DoWhileMain {
	public static void main(String[] args) {
		
		int a = 1;
		
		do {
			
			System.out.println(a);
			a++; //증감식
			
		} while(a < 11); //문장종결기호
		
	}
}
//*/