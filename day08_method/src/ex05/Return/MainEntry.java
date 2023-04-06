package ex05.Return;

public class MainEntry {
	public static void main(String[] args) {
		int x = 5;
				
		System.out.println(x);
		x *= 100;
		
		if( x == 500 ) return;
		
		System.out.println(x);
		System.out.println("여기까지 출력해줘~");
		
	}
}
