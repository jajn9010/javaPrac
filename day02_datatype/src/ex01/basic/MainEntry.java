package ex01.basic;

public class MainEntry {

	public static void main(String[] args) {
		for (int i = 1; i < 16; i++) {
			System.out.println("insert into PIMapping(productno, itemno) values (" + i + ", 3);");
			System.out.println("insert into PIMapping(productno, itemno) values (" + i + ", 6);");
			System.out.println("insert into PIMapping(productno, itemno) values (" + i + ", 9);");
			System.out.println("insert into PIMapping(productno, itemno) values (" + i + ", 11);");
			System.out.println("insert into PIMapping(productno, itemno) values (" + i + ", 14);");
			System.out.println("insert into PIMapping(productno, itemno) values (" + i + ", 19);");
			System.out.println("insert into PIMapping(productno, itemno) values (" + i + ", 20);");
			System.out.println("insert into PIMapping(productno, itemno) values (" + i + ", 23);");
		}
	}

}
