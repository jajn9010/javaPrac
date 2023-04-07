package ex06.constructor;

public class Point {
	private int x, y;  // 멤버변수

	public Point() {
		this(10, 20);
//		x = 10;
//		y = 20;
	}

	public Point(int x) {
		this.x = x;
		y = 20;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
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
		System.out.println(x + ", " + y);
	}
}
