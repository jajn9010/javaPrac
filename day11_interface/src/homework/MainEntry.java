package homework;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		Trans[] t = {new Subway(), new Bus(), new Bicycle(), new Plane()};
		String[] str = {"Subway", "Bus", "Bicycle", "Plane"};
		int inNum = 0;
		Scanner sc = new Scanner(System.in);
		

		while(true) {
			System.out.println("1부터 4까지의 숫자를 입력하시오");
			inNum = sc.nextInt();
			
			switch (inNum-1) {
			case 0: 
				t[inNum-1].start(str[inNum-1]); 
				t[inNum-1].stop(str[inNum-1]);; 
				System.exit(0);
			case 1: 
				t[inNum-1].start(str[inNum-1]); 
				t[inNum-1].stop(str[inNum-1]);; 
				System.exit(0);
			case 2: 
				t[inNum-1].start(str[inNum-1]); 
				t[inNum-1].stop(str[inNum-1]);; 
				System.exit(0);
			case 3: 
				t[inNum-1].start(str[inNum-1]); 
				t[inNum-1].stop(str[inNum-1]);; 
				System.exit(0);
			default:
				if(inNum-1<0 || inNum-1 >3) {
					System.out.println("지정된 숫자 외 다른 숫자를 입력하셨습니다. 1~4까지의 숫자를 입력해주세요.");
				}
				
			}
		}
		
	}
}
