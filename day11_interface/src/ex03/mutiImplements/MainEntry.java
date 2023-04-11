package ex03.mutiImplements;

import ex02.Abstract.Shape;
import ex02.Interface.IDraw;

public class MainEntry {
	public static void main(String[] args) {
		
		// 1. 자기자신으로 만들기
		MultiClass m = new MultiClass();
		
		m.view();
		m.testView();
		m.draw();
		m.display();
		System.out.println(m.su);
		
		System.out.println("===========================");
		
		// 2. 부모로 객체 생성   ==>  협소해진다. shape 클래스가 접근 할 수 있는 범위만 접근이 가능하다.
		Shape sh = new MultiClass();
		
		sh.show("jaejin");
		sh.view();
		
		System.out.println("===========================");
		
		Test t = new MultiClass();
		
		t.testView();
		System.out.println(t.str);
		
		System.out.println("===========================");

		IDraw d = new MultiClass();
		
		d.draw();
		System.out.println(d.su);
	}
}
