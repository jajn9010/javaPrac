package ex02.runnable;

public class MainEntry {
	public static void main(String[] args) {
		
		new Thread(new UserRunable("u1")).start();
		new Thread(new UserRunable("u2")).start();
		new Thread(new UserRunable("u3")).start();
		
//		UserRnnable u1 = new UserRunable("u1");
//		Thread t1 = new Thread(u1);
//		t1.start(); // run() method를 유도한다.
	}
}
