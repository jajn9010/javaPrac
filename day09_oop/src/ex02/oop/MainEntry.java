package ex02.oop;

class Point {// extends Object //오브젝트를 상속받고 있었음    { // 좌표점을 찍어내는 class
	
	private int x, y;	// 멤버 변수  -  접근지정자 : private < default < protected < public (생략하면 default)
	
	//멤버 함수
	
	public void display() {
		System.out.println(x + ", " + y);
	}
	
} // Point end

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		
//		System.out.println(pt);
		pt.display();
	}
} //MainEntry end
