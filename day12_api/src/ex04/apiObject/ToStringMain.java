package ex04.apiObject;

class Rectangle { // extends Object 가 생략하고 있음.
	int x, y;
	public void disp() {  // 출력하는 user method 만듦
		System.out.println(x + ", " + y);
	}
	
	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return x + ", 333 " + y;
//	}
	
//	public String toString() {
//		return x + ", " + y;
//	}
}

public class ToStringMain {
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		
		System.out.println(r);   // r.toString();
//		r.disp();
//		System.out.println(r.toString());
	}
}
