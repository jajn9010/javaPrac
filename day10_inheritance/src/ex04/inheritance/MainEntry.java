package ex04.inheritance;

public class MainEntry {
	public static void main(String[] args) {
//		Shape sh = new Shape();
//		sh.show(); //
		
		Shape sh = new Circle();
		sh.show();
		
		sh = new Triangle();
		sh.show();
		
//		Circle c = new Circle();
////		System.out.println(c);
//		
//		c.show();
//		
//		System.out.println("=================================");
//		Triangle t = new Triangle();
//		
//		t.show();
	}
}
