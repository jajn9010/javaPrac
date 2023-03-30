package ex01.If;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {

//		String str = ""; // null
		System.out.println("integer data input : ");

		Scanner sc = new Scanner(System.in);

		int su = sc.nextInt();

		if (su % 2 != 0) { // 홀수
			System.out.println("odd");

			if (su > 0) {
				System.out.println("양수");
			} else if (su < 0) {
				System.out.println("음수");
			} else {
				System.out.println("0이군요");
			} // in if end
		} else { // 짝수
			System.out.println("even");

			if (su > 0) {
				System.out.println("양수");
			} else if (su < 0) {
				System.out.println("음수");
			} else {
				System.out.println("0이군요");
			}
		} // out if end

		sc.close();
	}
}
