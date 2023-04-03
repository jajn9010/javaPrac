package ex01.memory;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		int x = 3, y = 5;
		double d = 12.34;
		char ch = 'A';
		
		String s1 = new String("kosa");
		String s2 = new String("daebo");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("int data input : ");
		int z = sc.nextInt();
		System.out.println(z);
		System.out.println(x + ", " + y + ", " + d + ", " + ch);
		System.out.println(s1 + " " + s2);
		
		sc.close();
		
	}
}
