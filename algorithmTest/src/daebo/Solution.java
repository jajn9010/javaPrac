package daebo;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
	static int AnswerN;
	static int N = 8;

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			AnswerN = 0;
			N = sc.nextInt();
			
			String[] str = new String[N];
			char [][] poXY = new char[N][N];
			int x = 0;
			int y = 0;
			int cnt = 0;
			
			for (int i = 0; i < N; i++) {
				str[i] = sc.nextLine();
				str[i] = str[i].replace(" ", "");
				System.out.println(Arrays.toString(str));
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					poXY[i][j] = str[i].charAt(j);
					if(poXY[i][j] == 'X') {
						x = i;
						y = j;
					}
				}
			}
			
			
			for (int i = x-2; i >= 0; i--) {
				if(x < 1 || x > N-2) {
					AnswerN += 0;
				}else {
					if(poXY[x][i] == 'L') {
						cnt +=0;
					}else if(poXY[x][i] == 'H') {
						cnt +=1;
					}else if (poXY[x][i] == 'Y') {
						cnt = 0;
						break;
					}
				}
				if(cnt >= 2) {
					AnswerN += 1;
					break;
				}
			}
			
			for (int i = x; i < N; i++) {
				if(x < 1 || x > N-2) {
					AnswerN += 0;
				}else {
					if(poXY[x][i] == 'L') {
						cnt +=0;
					}else if(poXY[x][i] == 'H') {
						cnt +=1;
					}else if (poXY[x][i] == 'Y') {
						cnt = 0;
						break;
					}
				}
				if(cnt >= 2) {
					AnswerN += 1;
					break;
				}
			}
			
			for (int i = y; i < N; i++) {
				if(y < 1 || y > N-2) {
					AnswerN += 0;
				}else {
					if(poXY[i][y] == 'L') {
						cnt +=0;
					}else if(poXY[i][y] == 'H') {
						cnt +=1;
					}else if (poXY[i][y] == 'Y') {
						cnt = 0;
						break;
					}
				}
				if(cnt >= 2) {
					AnswerN += 1;
					break;
				}
			}
			
			for (int i = y-2; i >= 0; i--) {
				if(y < 1 || y > N-2) {
					AnswerN += 0;
				}else {
					if(poXY[i][y] == 'L') {
						cnt +=0;
					}else if(poXY[i][y] == 'H') {
						cnt +=1;
					}else if (poXY[i][y] == 'Y') {
						cnt = 0;
						break;
					}
				}
				if(cnt >= 2) {
					AnswerN += 1;
					break;
				}
			}
			
			System.out.println("#" + test_case + " " + AnswerN);

		}
	}
}