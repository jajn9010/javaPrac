package ex01.Abstract;

abstract class Shape { // abstract class, Super class
	double result = 0;
	public abstract double calc();    // abstract method
	public abstract void draw();
	
	public void show() {
		System.out.println("Super class Shape");
	}
} //Shape End

class Circle extends Shape { // Sub class

	double r = 5.0;
	
	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("원의 넓이 : " + result + "인 원을 그렸습니다.");
	}
	
} //Circle End

class Rect extends Shape {
	int w = 3, h = 5;

	@Override
	public double calc() {
		result = w * h;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("사각형의 넓이 : " + result + "인 사각형을 그렸습니다.");
	}
	
} // Rect End

class Triangle extends Shape {
	int w = 3, h = 5;

	@Override
	public double calc() {
		result = w * h / 2;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("삼각형의 넓이 : " + result + "인 삼각형을 그렸습니다.");
	}
	
} // Triangle End

public class MainEntry {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		Rect r = new Rect();
		r.draw();
		Triangle t = new Triangle();
		t.draw();
//		Shape sh = new Shape(); // 자체적으로 객체 생성할 수 없다.
//		Shape sh = new Circle(); // 상속 받은 자손 클래스로는 객체 생성 할 수 잇다.
	}
}
