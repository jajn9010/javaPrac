package ex03.inheritance;

public class MainEntry {
	public static void main(String[] args) {
		Rect r = new Rect();
		r.disp();
		
		Rect r2 = new Rect(30);
		r2.disp();
		
		Rect r3 = new Rect(40, 50);
		r3.disp();
		
		Circle c = new Circle();
		c.disp();
		
		Circle c2 = new Circle(1, 2);
		c2.disp();
		
		Point pt = new Point();
		pt.disp();
		pt.line();
		
		Point pt2 = new Point(100);
		pt2.disp();
	}
}
