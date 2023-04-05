package ex01.method;

public class MethodEx2 {
	public static void main(String[] args) {

		System.out.println(display(10, "&"));
		
		MainEntry.line();
		String str = name(10, "jaejin");
		System.out.println(str);
		
		System.out.println("name() call : " + name(99, "gil dong"));
		
	}

	// 4) 매개변수 있고, 리턴타입 있는 경우
	public static String display(int x, String name) {

		for (int i = 0; i <= x; i++) {
			System.out.println(name);
		}
		return name;
	}
	
	public static String name(int x, String irum) {
		
		System.out.println("x = " + x);
		
		return irum;
	}

}
