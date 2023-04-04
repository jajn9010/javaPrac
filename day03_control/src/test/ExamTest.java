//*
package test;

public class ExamTest {
	public static void main(String[] args) {
		
		// 3행 4열
		
				int[][] quiz = {{3, 8, 5, 10},{7, 1, 2, 3},{0, 0, 0, 0}};
				
				for (int i = 0; i < quiz[0].length; i++) {
					quiz[2][i] = quiz[0][i] + quiz[1][i];
				}
				
				for (int i = 0; i < quiz.length; i++) {
					for (int j = 0; j < quiz[i].length; j++) {
//						System.out.print(quiz[i][j] + "\t");
						System.out.println("a[" + i + "][" + j + "] 는 " + quiz[i][j] + "입니다.");
					}
					System.out.println();
				}
		
	}
}
//*/