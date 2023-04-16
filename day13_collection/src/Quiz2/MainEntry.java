package Quiz2;

import java.util.Scanner;

public class MainEntry {
	private static final ScoreController controller = new ScoreController();

	@SuppressWarnings("resource") //닫기 가능 유형의 자원 사용에 대한 경고 억제
	public static void main(String[] args) {
		String menu; // int로 받으면 buffer에 엔터기호나 공백이 남았을 시 문제가 생기므로 String으로 받음

		try {
			do {
				System.out.println("\n================학사관리 시스템================");
				System.out.println("1.추가, 2.조회, 3.수정, 4.삭제, 5.프로그램 종료");
				menu = new Scanner(System.in).nextLine();

				switch (menu.trim()) {
				case "1": {
					controller.addScore(); break;
				}
				case "2": {
					controller.showScore(); break;
				}
				case "3": {
					controller.updateScore(); break;
				}
				case "4": {
					controller.deleteScore(); break;
				}
				case "5":
					System.exit(0);
				default: {
					if (!menu.equals("[1-5]")) {
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
