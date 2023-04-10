package ex04.inheritance;

import java.util.Scanner;

public class Triangle extends Shape {

	public Triangle() {
		Scanner sc = new Scanner(System.in);

		System.out.println("너비를 입력해주세요.");
		this.w = sc.nextInt();
		System.out.println("높이를 입력해주세요.");
		this.h = sc.nextInt();
	}

	public double calc() {
		this.result = (w * h / 2.);
		return result;
	}

	public void show() {
		System.out.printf("너비가 %d고 높이가 %d인 삼각형의 넓이는 %.2f입니다.", w, h, calc());
	}
}
