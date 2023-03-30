package ex02.Switch;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		System.out.println("point = ? ");
		
		Scanner sc = new Scanner(System.in);
		
		int point = sc.nextInt();
		
		switch (point) {
		case 1: System.out.print("집 "); //break;
		case 2: System.out.print("피아노 "); //break;
		case 3: System.out.print("우산 "); //break;
		
//		default:
//			System.out.println("없는 등수 입니다.");
		}
		
		System.out.println("상품에 당첨되셨습니다. 축하합니다. ^^");
		sc.close();
		
	}
}
