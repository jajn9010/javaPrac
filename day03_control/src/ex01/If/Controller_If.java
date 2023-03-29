package ex01.If;

import java.util.Scanner;

public class Controller_If {
	public static void main(String[] args) {
		
		String str = ""; // null
		System.out.println("integer data input : "); 
				
		Scanner sc = new Scanner(System.in);
		
		int su = sc.nextInt();
		
		//짝, 홀수 판정 if
		if(su % 2 == 0) System.out.println("even");
		else System.out.println("odd");
		
		str = (su % 2 == 0) ? "even" : "odd";
		System.out.println(str);
		
		//양수, 음수, 0판정 if
		if(su > 0) System.out.println("양수");
		else if(su < 0) System.out.println("음수");
		else System.out.println("0이군요");
		
		sc.close();
	}
}
