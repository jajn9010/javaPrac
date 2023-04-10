package ex01.Interface;

interface A {	// interface - abstract method, final field만 갖는다.
	int x = 90;  // final static int x = 90; 과 같다.
	final int y = 7777;
	char ch = 'A';
	
	//추상메소드, abstract 생략 가능함 - 무조건 추상메소드임
	
	public void show();  // public abstract void show(); 와 같음.
	public abstract void disp();
	
} // A end

interface B {
	void view();
} // B end

interface C {
	String name = "happy";
	public void draw();
} // C end

interface D extends B { // interface 간에도 상속이 가능하다. 인터페이스를 상속하는 class에서 재정의(Override)해야함.
	void dview();
} // D end


///////////////////////////////////////////////////////////////////////
class Rect implements D {

	@Override
	public void view() { // B interface method
		
	}

	@Override
	public void dview() { // D interface method
		
	}
	
	public int plus(int x, int y) {
		return x + y;
	}
	
} // Rect class
///////////////////////////////////////////////////////////////////////

class Shape {
	
} // Shape class

class Circle implements C {

	@Override
	public void draw() {
//		name = "jaejin";
		System.out.println(name + "이 오셨네요");
	}
	
}

class Multi extends Shape implements B, C, A {

	@Override
	public void show() { // A
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() { // A
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() { // C
		// TODO Auto-generated method stub
		
	}

	@Override
	public void view() { // B
		// TODO Auto-generated method stub
		
	}
	
} // Multi End

public class MainEntry {
	public static void main(String[] args) {
		
//		A a = new A(); // interface는 Class가 아니기 때문에 객체생성 할 수 없다.
		
	}
}
