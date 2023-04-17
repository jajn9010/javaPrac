package ex01.generic;

import java.util.Date;

class Point {
}

public class MainEntry {
	public static void main(String[] args) {

		GenericEx<String> t1 = new GenericEx<>();
		String[] str = { "abd", "kbs", "director" };
		t1.set(str);
		t1.print();
		System.out.println("===================================");

		GenericEx<Integer> t2 = new GenericEx<>();
		Integer[] num = { 1, 2, 3, 4, 5, 6, 7, 8, };
		t2.set(num);
		t2.print();
		System.out.println("===================================");

		GenericEx<Double> t3 = new GenericEx<>();
		Double[] dou = { 1.2, 2.3, 4.7, 8.5 };
		t3.set(dou);
		t3.print();
		System.out.println("===================================");

		GenericEx<Object> t4 = new GenericEx<>();
		Object[] obj = { "12.34", new Date(), 47.2, 5.5, "text", 70, new Point() };
		t4.set(obj);
		t4.print();
		System.out.println("===================================");
	}
}
