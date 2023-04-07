package homework;

public class Sales extends Regular{
	private double commision;

	public Sales() {
		commision = 0.2;
	}

	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) {
		this.commision = commision;
	}
	
	public double calc(int x) {
		commision = commision +1;
		return (double)super.getPay() * commision;
	}
	
//	public void input() {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("커미션을 줄 숫자를 골라주세요. (0~9)");
//		setCommision(sc.nextDouble()/10);
//		
//	}
}
