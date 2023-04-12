package ex05.wraper;

class Point {  }

public class MainEntry {
	public static void main(String[] args) {
		
		Integer Ia = new Integer(10);
		Integer Ib = new Integer("10");
		
		String su = "30";
		Point pt = new Point();
		
		System.out.println(pt);
		System.out.println(pt.toString());
		
		System.out.println(Ia);
		System.out.println(Ia.getClass().getName() + '@' + Integer.toHexString(Ia.hashCode()));
		
		int x = 77;
		double y = 5.5;
		System.out.println(x + ", " + y);
		y = x; // 묵시적 형변환
		x = (int)y; // 명시적 형변환  ==>  Data 손실이 발생한다. 8Byte ==> 4Byte에 넣어야 하기 때문
		System.out.println(x + ", " + y);
		
		// Boxing  vs  UnBoxing
		System.out.println("****** Boxing ******");
		int c = Ia.intValue();  // jdk 4.x 이전에 사용하던 함수들.
		int d = Ib;  // jdk 5.x 이후부터는 autoboxing, unboxing 됨.
		int num = Integer.parseInt(su);
		
		System.out.println(c + d);
		System.out.println(c + num);
		System.out.println(Ia.MAX_VALUE); //21억~
		System.out.println(Ia.MIN_VALUE); //-21역~
		
//		Double dd = 12.34;
		Double dd = new Double(12.34);
		
		System.out.println(dd);
		System.out.println(dd.MAX_VALUE); //21억~
		System.out.println(dd.MIN_VALUE); //-21역~
		
		System.out.println("=======================================");
		c = (int)dd.doubleValue();
		System.out.println("형변환 c의 값은? " + c);
		
		int e = Integer.parseInt("123");
		int f = Integer.parseInt("1111111", 2);
		
		System.out.println(e + ", " + f);
		
		int xx = 3; // stack memory
		Integer yy = new Integer(3); // heap memory
		
		xx = yy.intValue();
		xx = yy;   // autoboxing / unboxing
	}
}

/*
	Wraper class : 기본 자료형에 대응되는 클래스형 자료형
	기본자료형	클래스형(레퍼런스 또는 참조형)자료형
	int			Integer
	float		Float
	double		Double
	long		Long
	char		Character
     ........		........
*/