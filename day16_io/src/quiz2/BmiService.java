package quiz2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BmiService {
	private static final BmiController controller = new BmiController();
	private static ArrayList<Bmi> bmiArr = new ArrayList<>();
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			do {
				System.out.println("\n====================================BMI 지수 측정 프로그램====================================");
				System.out.println("1.고객정보추가, 2.고객정보삭제, 3.고객정보출력, 4.고객정보수정, 5.고객정보저장, 6.프로그램종료");
				String a = br.readLine();
				
				switch (a.trim()) {
				case "1": {
					controller.addBmi(bmiArr); break;
				}
				case "2": {
					controller.deleteBmi(bmiArr); break;
				}
				case "3": {
					controller.print(bmiArr); break;
				}
				case "4": {
					controller.updateBmi(bmiArr); break;
				}
				case "5":
					controller.saveBmi(bmiArr); break;
				case "6":
					System.exit(0);
				default: {
					if (!a.equals("[1-6]")) {
						System.out.println("입력범위를 초과하셨습니다.");
					}
				}
				}
			} while (true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
