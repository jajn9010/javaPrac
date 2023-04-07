package ex03.inheritance;

public class Rect extends Point {
	private int x2, y2;
	
	public Rect() {
		x2 = y2 = 20;
	}

	public Rect(int x2) {
		this.x2 = x2;
	}

	public Rect(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public void disp() {
		super.disp();
		System.out.println( ", " + x2 + ", " + y2);
	}
}
