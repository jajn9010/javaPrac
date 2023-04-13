package ex08.utilPackage;

import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class MainEntry {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance(); // 시스템이 가지고 있는 날짜를 가지고 온다.
		System.out.print(c.get(Calendar.YEAR) + "년 ");
		System.out.print(c.get(Calendar.MONTH)+ 1 + "월 "); // 월을 0부터 시작한다. +1 해줘야 한다.
		System.out.println(c.get(Calendar.DATE) + "일");
		
//		System.out.println(c);
		
		Date date = new Date();
		
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.println("현재 시간은 " + h + "시 " + m + "분 " + s + "초 입니다");
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c2.set(2018, 12, 20, 0, 0);
		
		if(c1.after(c2)) {
			System.out.println("현재 시간은 2018년 1월 1일 이후입니다.");
		}else if(c1.before(c2)) {
			System.out.println("현재 시간은 2018년 1월 1일 이전입니다.");
		}else if(c1.equals(c2)) {
			System.out.println("현재 시간은 2018년 1월 1일입니다.");
		}
	}
}
