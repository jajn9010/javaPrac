package ex06.breakContinue;

public class MultiBreak {
	public static void main(String[] args) {
		
		boolean flag = true;
		
		first:{
			
			second:{
				
				third:{
					
					int k = 100;
					System.out.println("Before the break" + k);	//1
					
					if ( flag ) break second;    // break 식별자;   식별자 위치까지 탈출
					
					System.out.println("This won't execute"); //2
					
				} // end third
				
				System.out.println("대보반 홧팅!!"); //3
				
			} // end second
			
			System.out.println("This is after second break!!!"); //4
			
		} // end first
		
		System.out.println("end first"); //5
		
	}
}


/*

식별자1 :	변수명 만드는 규칙과 똑같음. {
	식별자2 : {
		
		break 식별자1; <== 식별자1을 빠져나가려면 뒤에 식별자1을 부르면 됨
	}
}
			

*/