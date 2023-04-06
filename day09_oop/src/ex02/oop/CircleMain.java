package ex02.oop;

class Circle {
	
	private int x, y, r;
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
	}
	
	public void display() {
		System.out.println(x + ", " + y + ", " + r);
	}
}

public class CircleMain extends Point {
	
	public static void main(String[] args) {
		Circle c = new Circle(); // 객체생성, 메모리에할당, 생성자함수 자동호출
		
		c.setR(5);
		System.out.println(c.getR());
		c.display();
	}
}
