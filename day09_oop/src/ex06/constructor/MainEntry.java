package ex06.constructor;

public class MainEntry {
	public static void main(String[] args) {
		
		Point pt = new Point();
		pt.disp();
		
		Point pt2 = new Point(300);
		pt2.disp();
		
		Point pt3 = new Point(200, 100);
		pt3.disp();
		
	}
}
