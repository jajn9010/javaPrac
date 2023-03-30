package report;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영문자를 입력해주세요.");
		char ch = sc.next().charAt(0);
		int res = (int)ch;
		int temp;
		char result;
		
		if(res >= 65 && res <=90) {
			temp = res + 32;
			result = (char)temp;
			System.out.println(result);
		}
		else if(res >= 97 && res <=122) {
			temp = res - 32;
			result = (char)temp;
			System.out.println(result);
		}
		else System.out.println("영문자가 아닙니다.");
	}
}
