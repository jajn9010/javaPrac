package report;

import java.util.Scanner;

public class Report1 {
	public static void main(String[] args) {
		
		System.out.println("정수 3개를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int temp = 0;
		
		if (a < b) {
			temp = b;
			b = a;
			a = temp;
		}
		if (a < c) {
			temp = c;
			c = a;
			a = temp;
		}
		if (b < c) {
			temp = c;
			c = b;
			b = temp;
		}
		
		System.out.println(a + " > " + b + " > " + c);
		
		sc.close();
		
	}
}
