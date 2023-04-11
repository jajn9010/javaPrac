package ex03.mutiImplements;

import ex02.Abstract.Shape;
import ex02.Interface.IDraw;

public class MultiClass extends Shape 
						implements IDraw, Test {
	
	private int num ;
	
	public void display() {
		System.out.println("MultiClass Method");
	}
	
	@Override
	public void draw() {
		num = 88;
		System.out.println("IDraw interface " + num);
	}

	@Override
	public double calc(double x) {
		System.out.println("Shape abstract class " + x);
		return x;
	}

	@Override
	public void show(String name) {
		System.out.println("Shape abstract class");
	}

	@Override
	public void testView() {
		System.out.println("Test interface");		
	}

}
