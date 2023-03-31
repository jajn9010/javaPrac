//*
package ex04.For;

public class QuizGuGuDan {
	public static void main(String[] args) {
		// 구구단 전체 출력 프로그램 작성
		int a = 1;
		
		while(a <= 9) {
			
			int b = 1;
			while(b <= 9) {
				System.out.printf("%d * %d = %d\t", b, a, a*b);
				b++;
			}
			a++;
			System.out.println();
		}
		
	}
}
//*/


/*
package ex04.For;

public class QuizGuGuDan {
	public static void main(String[] args) {
		// 구구단 전체 출력 프로그램 작성
		
		for (int i = 2; i <= 9; i++) {
			
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + j*i + "\t");
			}
			System.out.println();
		}
		
	}
}
//*/