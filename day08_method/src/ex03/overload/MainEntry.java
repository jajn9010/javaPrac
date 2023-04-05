package ex03.overload;

public class MainEntry {
	
	public static void line() {
		System.out.println("==================================================");
	}
	
	public static void line(String str) {
			System.out.println(str);
	}
	
	public static void line(int n, String str) {
		for(int i = 1; i < n; i++) {
			System.out.println(str);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		line(3, "*");
		
		line();
		plus(20.23);
		plus(20);
		plus(20, 30);
		plus("잘되는지 확인");
		
	}
	
	public static void plus(int x) {
		System.out.println(x + 100);
	}
	
	public static void plus(int x, int y) {
		System.out.println(x + y);
	}
	
	public static void plus(double x) {
		System.out.println("double : " + x);
	}
	
	public static void plus(String x) {
		System.out.println("String : " + x);
	}
}
