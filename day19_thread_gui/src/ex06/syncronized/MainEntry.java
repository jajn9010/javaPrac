package ex06.syncronized;

class Atm { // 따로 만들어야 하지만 교육을 위해 위에 올림

	private int money;

	public Atm(int money) {
		this.money = money;
	}

	// 입금함수
	public synchronized void deposit(int amount, String name) {
		money += amount;
		System.out.println(name + " : 입금금액 " + amount);
	}

	// 출금함수
	public void withdraw(int amount, String name) {
		synchronized (this) {
			if ((money - amount) > 0) {

				Thread.yield(); // 양보하는 것.

				money -= amount;
				System.out.println(name + " : 출금금액 " + amount);
			} else {
				System.out.println(name + "님의 잔액이 부족합니다.");
			} // if end
		} // synchronized end
	}

	// 통장 잔고 함수
	public void getMoney() {
		System.out.println("\t\t\t\t잔액은 : " + money + " 원입니다.");
	}

} // Atm end

class UserAtm extends Thread {

	Atm obj;
	boolean flag = false;

	public UserAtm(Atm obj, String name) {
		super(name); // Thread(String name) Constructor를 쓰겠다는 의미
		this.obj = obj;
	}

	@Override
	public void run() { // Thread 실행부(구현부). 객체만들어서 Thread.run() 소용없음. 동기화를 걸때는 run() method를 찾으면 됨.
		for (int i = 0; i < 2; i++) { // 입금함수, 출금함수를 불러서 꼬이게 만들기 위함
			try {
				sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (flag) {
				obj.deposit((int) (Math.random() * 10 + 2) * 100, getName());
			} else {
				obj.withdraw((int) (Math.random() * 10 + 2) * 100, getName());
			}

			flag = true;
			obj.getMoney();

		} // for end
	} // run end
} // UserAtm end

public class MainEntry {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		UserAtm user1 = new UserAtm(at, "이재진");
		UserAtm user2 = new UserAtm(at, "곽규창");
		UserAtm user3 = new UserAtm(at, "주영회");

		user1.start();
		user2.start();
		user3.start();
	}
}
