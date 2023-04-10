package ex04.inheritance;

import java.util.Scanner;

public class Circle extends Shape { // Sub class
	public Circle() {
		super(2, 3); // 반드시 첫줄에 와야함
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름을 넣어주세요.");
		this.w = sc.nextInt();
	}
	
	public double calc() {
		this.result = (w * w * Math.PI);
		return result;
	}
	
	public void show() {
		System.out.println("반지름이 " + w + "인 원의 넓이 = " + calc());
	}
}
