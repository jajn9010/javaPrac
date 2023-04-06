package ex03.oop;

public class Point {
	private int x, y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setData(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void display() {
		System.out.println(x + ", " + y);
	}
}
