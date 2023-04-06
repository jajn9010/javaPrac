package ex03.oop;

public class MainEntry {
	public static void main(String[] args) {
		Rectangle rc = new Rectangle();
		
		rc.setX1(10);
		rc.setX2(20);
		rc.setY1(30);
		rc.setY2(40);
		
		rc.disp();
		
		System.out.println("===================================");
		Point point = new Point();
		point.display();
		
		point.setX(3);
		point.setY(5);
		
		point.display();
		
		point.setData(100, 50);
		
		point.display();
	}
}
