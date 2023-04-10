package homework;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		Trans[] s = {new Subway(), new Bus(), new Bicycle(), new Plane()};
		String[] str = {"지하철", "버스", "자전거", "비행기"};
		
//		Trans[] s = new Trans[4];
//		s[0] = new Subway();
//		s[1] = new Bus();
//		s[2] = new Bicycle();
//		s[3] = new Plane();
		System.out.println("1부터 4까지의 숫자를 입력하시오");
		Scanner sc = new Scanner(System.in);
		
		int inNum = sc.nextInt();
		
		switch (inNum) {
		case 1: 
			s[inNum].start(str[inNum]); 
			s[inNum].stop(str[inNum]);; 
			break;
		case 2: 
			s[inNum].start(str[inNum]); 
			s[inNum].stop(str[inNum]);; 
			break;
		case 3: 
			s[inNum].start(str[inNum]); 
			s[inNum].stop(str[inNum]);; 
			break;
		case 4: 
			s[inNum].start(str[inNum]); 
			s[inNum].stop(str[inNum]);; 
			break;
		default:
			System.out.println("지정된 숫자 외 다른 숫자를 입력하셨습니다. 1~4까지의 숫자를 입력해주세요.");
		}
		
		sc.close();
		
//		for (int i = 0; i < s.length; i++) {
//			s[i].start();
//			s[i].stop();
//		}
		
	}
}
