package ex06.instance_static;

//static method :  객체 생성 없이 바로 사용 가능함 ex) Math.random()
//object.methodName();
//ClassName.methodName();

class A {
	int x, y;
	
	//static method
	public static void setData(int xx, int yy) {
		System.out.println(xx + ", " + yy);
	}
	
	
} // A class end

public class StaticMethod {
	public static void main(String[] args) {
		A a = new A(); // 객체생성, 메모리에 할당, 생성자함수 자동호출
		
		A.setData(100, 500);  // ClassName.methodName();
		a.setData(20, 30);   // object.methodName();
		
		a.x = 999;
		a.y = 100;
	}
}
