package ex06.breakContinue;

import java.util.Iterator;

public class MainEntry {
	public static void main(String[] args) {
		// break, continue
		
//		for(int i=1; i < 11; i++) {
//			
//			if( i == 7 ) break;  // 해당하는 구문 탈출 (가장 가까운 block)
//			System.out.println(i);
//			
//		}

		for(int i = 1; i < 11; i++) {
			
			if( i == 7 ) continue; // 시작점으로 돌린다. for -> 증감식으로, while/ do ~ while -> 조건문으로 이동
			System.out.println(i);
			
		}
		
		for (int i = 1; i < 101; i++) {
			
			if(i % 2 == 0) continue;
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
