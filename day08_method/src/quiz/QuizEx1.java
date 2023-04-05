package quiz;

public class QuizEx1 {
	public static void main(String[] args) {

		add(1, 2);
		sub(1, 2, 3, 4, 5);
		message();
		max(10, -55);
		
	}
	
	private static void max(int i, int j) {
		
		if(i < 0) i = -i;
		if(j < 0) j = -j;
		
		int sum = i + j;
		System.out.println(sum);
		
	}

	private static void message() {
		
		System.out.println("안녕하세요.");
		System.out.println("좋은 아침입니다.");
		
	}

	private static void sub(int x, int y, int z, int a, int b) {
		
		int sum = x + y + z + a + b;
		System.out.println("합 = " + sum);
		
	}

	public static void add(int x, int y) {
		int sum = x + y;
		System.out.println(sum);
	}
	
}

/*
 * add( int x, int y ), sub( 1, 2, 3 ), message() { 인사말 출력 }
 */