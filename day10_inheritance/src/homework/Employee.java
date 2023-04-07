package homework;

public class Employee {
	private String name, depart, phone, cont;
	private int num;

	
	
//	public Employee() {
//		num = 1;
//		name = "이재진";
//		depart = "영업";
//		phone = "010-5445-7506";
//		cont = "정규직";
//	}
	
	public Employee() {
		num = 2;
		name = "이개발";
		depart = "개발";
		phone = "010-5555-7777";
		cont = "계약직";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getCont() {
		return cont;
	}

	public void setCont(String cont) {
		this.cont = cont;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void disp() {
		System.out.printf("근로계약 : %s\n사번 : %d\n이름 : %s\n부서 : %s\n연락처 : %s",
							getCont(), getNum(), getName(), getDepart(), getPhone());
	}
	
//	public void line() {
//		System.out.println("\n========================================");
//	}
//
//	public void input() {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("이름을 입력해주세요");
//		setName(sc.next());
//		System.out.println("부서를 입력해주세요");
//		setDepart(sc.next());
//		System.out.println("연락처를 입력해주세요");
//		setPhone(sc.next());
//		System.out.println("계약직입니까 정규직입니까? (계약직 / 정규직)");
//		setCont(sc.next());
//		System.out.println("사번을 입력해주세요");
//		setNum(sc.nextInt());
//		
//	}
	
	
}
