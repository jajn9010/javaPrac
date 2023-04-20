package ex02.runnable;

public class UserRunable implements Runnable {

	String name;

	public UserRunable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {

			if (i == 3) {
				try {
					Thread.sleep(1000); // 1000이 1초, 예외발생
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // if end
			System.out.println(i);
		} // for end
	}

}
