package ex01.constructor;

public class MainEntry {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.disp();
		
		Circle c1 = new Circle(1,2,3);
		c1.disp();
		
		Circle c2 = new Circle(10, 20);
		c2.disp();
		
		Circle c3 = new Circle(5);
		c3.disp();
	}
}
