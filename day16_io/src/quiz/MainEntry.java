package quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainEntry {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.println("======================== 비만도 측정 프로그램 ========================");
			System.out.println("작업하실 내용을 선택해주세요.");
			System.out.println("1.고객정보추가, 2.고객정보삭제, 3.고객정보출력, 4.고객정보수정, 5.저장, 6.프로그램 종료");
			int num = Integer.parseInt(br.readLine());
			switch (num) {
			case 1: {
				System.out.println("고객님의 이름을 입력해주세요.");
				String name = br.readLine();
				System.out.println(name + "고객님의 키를 입력해주세요.");
				int tall = Integer.parseInt(br.readLine());
				System.out.println(name + "고객님의 몸무게 입력해주세요.");
				int weight = Integer.parseInt(br.readLine());
				System.out.println(name + "고객님의 성별을 입력해주세요.");
				int gender = Integer.parseInt(br.readLine());
				boolean check;
				if (gender == 1) {
					check = true;
				} else {
					check = false;
				}

				Bmi bmi = new Bmi(name, tall, weight, check);

				BmiController.addBmi(bmi);
				System.out.println("고객정보 등록완료");
				break;
			}
			case 2: {
				BmiController.print();
				System.out.println("삭제할 고객의 id를 입력해주세요.");
				int id = Integer.parseInt(br.readLine());
				
				BmiController.deleteBmi(id);
			}
			case 3: {
				BmiController.print();
				break;
			}
			case 4: {
				BmiController.print();
				System.out.println("수정할 고객의 id값을 입력하세요.");
				int dId = Integer.parseInt(br.readLine());
				BmiController.update(dId);
			}
			case 5: {
				BmiController.save();
				break;
			}
			case 6: {
				System.out.println("비만도 측정 프로그램을 종료하였습니다.");
				System.exit(0);
			}
			}

		}
	}
}
