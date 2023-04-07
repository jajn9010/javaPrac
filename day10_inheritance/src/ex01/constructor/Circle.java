package ex01.constructor;

public class Circle {
	private int x, y, r;
	
	//생성자함수 4개
	public Circle () {
//		x = y = 100;	r = 5;
		this(100,100,5);
	}

	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public Circle(int y, int r) {
		this(100, y, r);
		
//		this.y = y;
//		this.r = r;
	}

	public Circle(int r) {
		this.r = r;
		x = y = 9;
	}
	
	public void disp() {
		System.out.println("x = " + x + ", y = " + y + ", 반지름 r = " + r);
	}
	
}
