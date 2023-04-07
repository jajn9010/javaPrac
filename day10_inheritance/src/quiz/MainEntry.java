package quiz;

public class MainEntry {
	public static void main(String[] args) {
		
		Sawoen sa = new Sawoen();
		sa.disp();
		sa.line();

		Sawoen sa1 = new Sawoen(2, "김경영", "대리", "경영지원");
		sa1.disp();
		sa.line();
		
		Sawoen sa2 = new Sawoen(4, 5000000, "이개발", "부장", "개발", "010-5555-7777");
		sa2.disp();
	}
}
