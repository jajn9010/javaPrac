package quiz;

import java.util.Scanner;

public class Quiz_월의마지막일수 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int month, year;
		
		System.out.println("input month: ");
		month = sc.nextInt();
		System.out.println("input year: ");
		year = sc.nextInt();
		String msg = "";
		boolean flag = false;
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			System.out.println(month + "월의 마지막 날은 31일입니다."); break;
			
		case 4: case 6: case 9: case 11: 
			System.out.println(month + "월의 마지막 날은 30일입니다."); break;
			
			
		case 2: 
//			System.out.println("input year: ");
//			year = sc.nextInt();
//			
			if ((year % 4 == 0) && year % 100 != 0 || year % 400 == 0) {
				flag = true;
			}
			
			msg = (flag == true) ? year + "년도 " + month + "월의 마지막 날은 29일입니다."
									: year + "년도 " + month + "월의 마지막 날은 28일입니다.";
			System.out.println(msg);	break;
			
		default:
			System.out.println("올바르지 못한 입력입니다. 1월 ~ 12월까지만 입력해주시길 바랍니다.");
		}
		
	}

}
