/*
package ex03.array;

import java.util.Arrays;
import java.util.Scanner;

public class QuizEx1 {
	public static void main(String[] args) {
		
		int[][] a = new int[2][3];
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("array data 2row, 3col = ");
		
		//input
		for (int i = 0; i < a.length; i++) { //row , 배열명.length   <== 행의 길이
			
			for (int j = 0; j < a[i].length; j++) {
				
				System.out.println("a[" + i + "][" + j + "] = ");
				a[i][j] = sc.nextInt();
				
			}
			
		}
		
		
		// 2행 3열
		
//		int[][] a = {{1, 2, 0}, {5, 7, 0}};
//		
//		for (int i = 0; i < a.length; i++ ) {
//			a[i][2] = a[i][0] * a[i][1];
//		}
//		
//		System.out.println(Arrays.deepToString(a));
		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j] + "\t");
//			}
//			System.out.println();
//		}
	
	}
}
//*/

//*
package ex03.array;

public class QuizEx1 {
	public static void main(String[] args) {
		
		// 3행 4열

		int[][] quiz = { { 3, 8, 5, 10 }, { 7, 1, 2, 3 }, { 0, 0, 0, 0 } };

		for (int i = 0; i < quiz[0].length; i++) {
			quiz[2][i] = quiz[0][i] + quiz[1][i];
		}

		for (int i = 0; i < quiz.length; i++) {
			for (int j = 0; j < quiz[i].length; j++) {
				System.out.print(quiz[i][j] + "\t");
			}
			System.out.println();
		}
			
	}
}
//*/