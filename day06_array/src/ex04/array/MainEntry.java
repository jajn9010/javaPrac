//*
package ex04.array;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("면, 행, 열 순으로 크기를 입력하세요.");
		int su1 = sc.nextInt(), su2 = sc.nextInt(), su3 = sc.nextInt();
		
		int[] a = new int[30];
		int[][] a2 = new int[2][3]; // 초기화 되어 있지 않을 때는 행, 열크기 생략 할 수 없다.
		int[][] a3 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] a4 = { { 1, 2, 3 }, { 4, 5, 6 } };
//		int[][] a5 = { 1, 2, 3, 4, 5, 6 }; //error
//		int[][] a6 = new int[2][] { { 1, 2, 3 }, { 4, 5, 6 } }; // 행크기 잡아 놓으면 error
		int[][] a7 = { { 0, }, { 0, } }; // 0으로 다 채울 때 / { {0}, {0} } 도 가능
		
		int[][][] a8 = new int[su1][su2][su3]; // [면][행][열]

		// 배열 길이(크기)
//		System.out.println("1차원 배열 길이 : " + a.length);
//		System.out.println("2차원 배열 행 길이 : " + a2.length);
//		System.out.println("2차원 배열 열 길이 : " + a2[0].length);
//		System.out.println();
//		System.out.println("3차원 배열 면 길이 : " + a8.length);
//		System.out.println("3차원 배열 행 길이 : " + a8[0].length);
//		System.out.println("3차원 배열 열 길이 : " + a8[0][0].length);
		
		//임의적인 데이터 입력 받아서 배열 데이터값 출력하는 프로그램 작성
		
		for (int i = 0; i < a8.length; i++) {
			for (int j = 0; j < a8[i].length; j++) {
				for (int k = 0; k < a8[i][j].length; k++) {
					a8[i][j][k] = (int)(Math.random()*50)+1;
					System.out.println("a8[" + i + "][" + j + "][" + k + "] = " + a8[i][j][k]);
				}
			}
		} // input end
		System.out.println("\n=================================\n");
		for (int i = 0; i < a8.length; i++) {
			System.out.println((i+1) + "번째 면행열\n");
			for (int j = 0; j < a8[i].length; j++) {
				for (int k = 0; k < a8[i][j].length; k++) {
					System.out.print(a8[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println("\n");
		} // output end
		
		sc.close();
	}
}
//*/

/*
package ex04.array;

public class MainEntry {
	public static void main(String[] args) {

		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
//			arr[i] = i + 1;
//			arr[i] = i + 1 * 5;
			arr[i] = (int) (Math.random() * 100) + 2;

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");

			if ((i + 1) % 10 == 0)
				System.out.println();
		}

	}
}
//*/