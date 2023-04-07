package quiz;

public class Sawoen {
	private int num, pay;
	private String name, position, depart, phone;

	public Sawoen() {
		num = 1;
		pay = 2000000;
		name = "이재진";
		position = "사원";
		depart = "개발";
		phone = "010-5445-7506";
	}

	public Sawoen(int num, int pay, String name, String position, String depart, String phone) {
		this.num = num;
		this.pay = pay;
		this.name = name;
		this.position = position;
		this.depart = depart;
		this.phone = phone;
	}

	public Sawoen(int num, String name, String position, String depart) {
		this.num = num;
		this.name = name;
		this.position = position;
		this.depart = depart;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void disp() {
		if (pay == 0) {
			System.out.printf("이름 : %s, 사번 : %d, 부서 : %s 직급 : %s\n", name, num, depart, position);
		} else {
			System.out.printf("이름 : %s, 사번 : %d, 부서 : %s\n직급 : %s, 급여 : %d, 연락처 : %s\n",
								name, num, depart, position, pay, phone);
		}
	}
	
	public void line() {
		System.out.println("=====================================================");
	}
}
