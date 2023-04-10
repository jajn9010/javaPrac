package ex02.Abstract;

public abstract class Shape { // Super class
	double result = 0;
	
	public abstract double calc(double x); // abstract method
	public abstract void show(String name);
	public void view() { // 일반 method
		System.out.println("Super class Shape");
	}
}
