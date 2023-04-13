package ex00.Instanceof;

class A {  }

class B extends A {   }

public class MainEntry {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
//		B a1 = new A();
		
		System.out.println("a instanceof A : " + (a instanceof A));
		System.out.println("b instanceof A : " + (b instanceof A));
		System.out.println("a instanceof B : " + (a instanceof B)); // false 부모는 자식 class의 것을 건들 수 없다.
		System.out.println("b instanceof B : " + (b instanceof B));
		
	}
}
