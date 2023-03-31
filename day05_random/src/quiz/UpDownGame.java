package quiz;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int dap = rand.nextInt(101)+1;
		int chance = 5;
		
		for(int i = 1; i < 6; i++) {
			
			if(i==1) System.out.println("원하는 숫자를 입력해 주세요.");
			else System.out.printf("틀렸습니다. 재시도해주세요. 남은기회는 %d입니다.", chance);
			
			int choose = sc.nextInt();
			
			if (choose == dap) {
				System.out.println("정답입니다."); break;
			}else if (choose > dap){
				System.out.println("down");
				chance --;
			}else {
				System.out.println("up");
				chance --;
			}
			if(chance == 0) System.out.printf("5번의 기회를 상실하셨습니다. 정답은 %d 입니다.", dap);
		}
		sc.close();
	}
}

/*
문제]	1 ~ 100까지의 수 중에서 난수가 출력  dap = 난수값 출력
		사용자로부터 5번의 기회를 줌.
		사용자가 입력한 값이 50보다 크면 up, 낮으면 down, 맞으면 "정답" 끝
		틀렸으면 5번의 기회를 상실하셨습니다. 하고 보여주고 답 보여주기
*/