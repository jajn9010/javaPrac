package ex04.apiObject;

class Circle {
	int x = 5, y = 5;
}

public class EqualsMain {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		
		Circle c2 = new Circle();
		
		if( c1 == c2 ) System.out.println("같다.");
		else System.out.println("다르다.");
		
		int x = 3, y = 3;
		System.out.println("기본 자료형 비교");
		if( x == y ) System.out.println("same");
		else System.out.println("not same");
		
		System.out.println("참조자료형 비교");
		String str = new String("korea");
		String str2 = new String("Korea");
		
		if( str == str2 ) System.out.println("same");
		else System.out.println("not same");
		
		System.out.println("*** equals() method 비교 **************");
		if( str.equals(str2) ) System.out.println("same");
		else System.out.println("not same");
		
		System.out.println("---------------------------------------");
		if( str.equalsIgnoreCase(str2) ) System.out.println("same");
		else System.out.println("not same");
	}
}
