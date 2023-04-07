package homework;

public class PartTime {
	int pay, time, day;

	public PartTime() {
		pay = 9650;
		time = 8;
		day = 10;
	}
	
	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int AllPay() {
		return day * time * pay;
	}
}
