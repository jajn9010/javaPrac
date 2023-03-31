package ex06.breakContinue;

import java.util.Iterator;

public class MainEntry {
	public static void main(String[] args) {
		// break, continue
		
//		for(int i=1; i < 11; i++) {
//			
//			if( i == 7 ) break;
//			System.out.println(i);
//			
//		}

		for(int i = 1; i < 11; i++) {
			if( i == 7 ) continue;
			System.out.println(i);
		}
		
//		for(int i=1; i < 5; i++) {
//			System.out.println("나는 아이다." +  i);
//			for(int j = 1; j < 10; j++) {			
//				
//				if( j == 7 ) break;
//				System.out.println("i = " + i);
//				System.out.println("j = " + j);
//			}
//			System.out.println();
//		}
	}
}
