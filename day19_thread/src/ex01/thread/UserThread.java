package ex01.thread;

import java.util.Iterator;

public class UserThread extends Thread {
	String name;
	
	public UserThread(String name) {
		this.name = name;
		System.out.println("UserThread constructor" + name);
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			
			if( i == 3 ) {
				try {
					sleep(1000); // 1000이 1초, 예외발생
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}// if end
			System.out.println(i);
		}// for end
	}
}
