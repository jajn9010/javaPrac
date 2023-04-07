package homework;

public class Regular extends Employee {
	private int pay;
	
	public Regular () {
		pay = 2000000;
	}
	
	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public void disp() {
		if(super.getDepart() == "영업") {
			double npay = 0.0;
			Sales sale = new Sales();
			npay = sale.calc(pay);
			super.disp();
			System.out.println("\n급여 : "+ (int)npay);
		}else if (super.getCont() == "계약직") {
			PartTime pt = new PartTime();
			super.disp();
			System.out.println("\n급여 : " + pt.AllPay());
		}
	}
	
//	public void input() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("급여를 입력해주세요.");
//		setPay(sc.nextInt());
//		
//	}
}
