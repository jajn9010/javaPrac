package ex03.inheritance;

public class Point {
	protected int x, y;

	// 생성자함수
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		x = y = 10;
	}

	public Point(int x) {
		this(x, 9);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void disp() {
		System.out.print(x + ", " + y);
	}
	
	public void line() {
		System.out.println("\n====================");
	}
}
