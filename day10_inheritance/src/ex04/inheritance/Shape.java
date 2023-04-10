package ex04.inheritance;

public class Shape {   // Super Class

	protected int w, h;
	protected double result;
	
	public Shape() { // 멤버변수의 초기화
		w = h = 0;
		result = 0.;
	}

	public Shape(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public Shape(int w, int h, double result) {
		this.w = w;
		this.h = h;
		this.result = result;
	}

	// getter / setter method
	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public double calc () {
		return result;
	}
	
	public void show() {
		System.out.println(w + ", " + h);
	}
	
}
