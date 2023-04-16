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
		int kor, eng, com, rank = 0;
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
		}
		SC.nextLine();
		SCORES.add(new Score(name, kor, eng, com, rank, SCORES.size()+1));
		rankScore();
	}

	@Override
	public void updateScore() {
		showScore();
		System.out.println("수정할 학생의 학번을 입력하세요.");
		Integer i = SC.nextInt();
		
	}

	@Override
	public void showScore() {
		rankScore();
		System.out.println("============================================================================");
		System.out.println(
				"\n학번\t이름\t국어\t영어\t전산\t총점\t평균\t\t학점\t석차\n============================================================================");
		for (int i = 0; i < SCORES.size(); i++) {
			Score a = SCORES.get(i);
			if (SCORES.size() > 0) {
				System.out.printf("%2d번\t%3s\t%3d점\t%3d점\t%3d점\t%3d점\t%6.2f점\t%2c\t%d/%d%n", a.getStdNum(), a.getName(), 
						a.getKor(),	a.getEng(), a.getCom(), a.getTotal(), a.getAvg(), a.getGrade(), a.getRank(), SCORES.size());
			} else
//				System.out.println("등록된 학생이 없습니다.");
				break;
		}
	}

	@Override
	public void deleteScore() {
		showScore();
		System.out.println("수정할 학생의 학번을 입력하세요.");
		Integer i = SC.nextInt();
		SCORES.remove(i);
	}

	public void rankScore() {
		for (int i = 0; i < SCORES.size(); i++) {
			for (int j = i + 1; j < SCORES.size(); j++) {
				if (SCORES.get(i).getTotal() > SCORES.get(j).getTotal()) {
					SCORES.get(j).setRank(SCORES.get(j).getRank() + 1);
				}
			}
		}
	}

}
