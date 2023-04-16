package Quiz2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreController implements ScoreInterface {

	private static final List<Score> SCORES = new ArrayList<>();
	private static final Scanner SC = new Scanner(System.in);

	@Override
	public void addScore() {
		Integer i = new Integer(0);
		int kor, eng, com, rank = 0, stdNum = 0;
		System.out.println("이름을 입력해 주세요.");
		String name = SC.nextLine();
		do {
			System.out.println("학생의 국어점수를 입력해주세요.");
			kor = SC.nextInt();
		} while (kor > 100 || kor < 0);
		do {
			System.out.println("학생의 영어점수를 입력해주세요.");
			eng = SC.nextInt();
		} while (eng > 100 || eng < 0);
		do {
			System.out.println("학생의 전산점수를 입력해주세요.");
			com = SC.nextInt();
		} while (com > 100 || com < 0);
		if (SCORES.size() == 0) {
			rank = 1;
			stdNum = 1;
		} else {
			stdNum = SCORES.get(SCORES.size() - 1).getStdNum() + 1;
		}
		SC.nextLine();
		SCORES.add(new Score(name, kor, eng, com, rank, stdNum));
		rankScore();
	}

	@Override
	public void updateScore() {
		if (SCORES.size() != 0) {
			showScore();
			System.out.println("수정할 학생의 학번을 입력하세요.");
			Integer i = SC.nextInt();
			SC.nextLine();

			if (SCORES.size() >= i) {
				System.out.println("학생의 수정할 부분이 무엇입니까?");
				System.out.println("1.학생 이름, 2.국어점수, 3.영어점수, 4.전산점수");
				Integer num = SC.nextInt();
				SC.nextLine();
				switch (num) {
				case 1: {
					System.out.println("수정할 학생 이름를 입력해주세요.");
					String nName = SC.nextLine();
					SCORES.get(i - 1).setName(nName);
					break;
				}
				case 2: {
					System.out.println("수정할 국어점수를 입력해주세요.");
					Integer nKor = SC.nextInt();
					SC.nextLine();
					SCORES.get(i - 1).setKor(nKor);
					SCORES.get(i-1).updateScore();
					break;
				}
				case 3: {
					Integer nEng = SC.nextInt();
					System.out.println("수정할 영어점수를 입력해주세요.");
					SC.nextLine();
					SCORES.get(i - 1).setEng(nEng);
					SCORES.get(i-1).updateScore();
					break;
				}
				case 4: {
					System.out.println("수정할 전산점수를 입력해주세요.");
					Integer nCom = SC.nextInt();
					SC.nextLine();
					SCORES.get(i - 1).setCom(nCom);
					SCORES.get(i-1).updateScore();
					break;
				}
				default: {
					if (!num.equals("[1-4]")) {
						System.out.println("입력범위를 초과하셨습니다.");
					}
				}
				} // switch end
			} else {
			} // inner if end
		} else {
			System.out.println("수정할 학생이 없습니다.");
		} // outter if end
	}

	@Override
	public void showScore() {
		rankScore();
		System.out.println("============================================================================");
		System.out.println(
				"\n학번\t이름\t국어\t영어\t전산\t총점\t평균\t\t학점\t석차\n============================================================================");
		for (int i = 0; i < SCORES.size(); i++) {
			Score a = SCORES.get(i);
			if (SCORES.size() != 0) {
				System.out.printf("%2d번\t%3s\t%3d점\t%3d점\t%3d점\t%3d점\t%6.2f점\t%2c\t%d/%d%n", a.getStdNum(), a.getName(),
						a.getKor(), a.getEng(), a.getCom(), a.getTotal(), a.getAvg(), a.getGrade(), a.getRank(),
						SCORES.size());
			} else
				System.out.println("등록된 학생이 없습니다.");
		}
	}

	@Override
	public void deleteScore() {
		if (SCORES.size() != 0) {
			showScore();
			System.out.println("삭제할 학생의 학번을 입력하세요.");
			Integer num = SC.nextInt();
			SC.nextLine();
			if (SCORES.size() > num) {
				for (int j = 0; j < SCORES.size(); j++) {
					if (SCORES.get(j).getStdNum() == num) {
						SCORES.remove(j);
					}
				}
				rankScore();
			} else {
				System.out.println("잘못입력하셨습니다. 번호를 확인 후 다시 입력바랍니다.");
			}
		} else {
			System.out.println("삭제할 학생이 없습니다.");
		}
	}

	public void rankScore() {
		SCORES.forEach(s -> s.setRank(1));
		for (int i = 0; i < SCORES.size(); i++) {
			for (int j = 0; j < SCORES.size(); j++) {
				if (SCORES.get(i).getTotal() > SCORES.get(j).getTotal()) {
					SCORES.get(j).setRank(SCORES.get(j).getRank() + 1);
				}

			}
		}

	}

}
