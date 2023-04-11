package ex02.staticMember;

class Atm {
	int count;  // instance member
	static int total;  // static member
	
	public Atm(int amount) { // constructor method
		count += amount;
		total += amount; // total = total + amount;
	}
	
	// static member에서 일반멤버 변수는 사용할 수 없다.
	public static void view()  {
		total = total + 100;
//		count = count + 100;
	}
	
	// static member에서는 this 사용할 수 없다.
	public static void show(int count, int total) {
//		this.count = count;
//		this.total = total;
	}
	
	public void display() { // 일반method에서는 다 사용할 수 있다.
		count += 50;
		total += 30;
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
	
} //Atm end

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println(Atm.total);
		
		Atm at = new Atm(1000);
		at.display();   // count : 1000, total : 1000
		
		System.out.println("==================================");
		
		Atm at2 = new Atm(1000);
		at2.display();   // count : 1000, total : 2000
		
		System.out.println("==================================");
		
		Atm at3 = new Atm(1000);
		at3.display();   // count : 1000, total : 3000
	}
}
