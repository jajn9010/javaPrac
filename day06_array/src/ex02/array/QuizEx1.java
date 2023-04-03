//*
package ex02.array;

import java.util.Arrays;
import java.util.Random;

public class QuizEx1 {
	public static void main(String[] args) {
		
		// 임의의 데이터 7개 입력 받고, 찾을 임의의 데이터 선택
		
		Random rand = new Random();
		
		int[] a = new int[7];
		int cnt = 0;
		int seek = rand.nextInt(100)+1;
		
		for (int i = 0; i < 7; i++) {
			a[i] = rand.nextInt(100)+1;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == seek) cnt++;
		} // for end
		
		System.out.println(Arrays.toString(a));
		System.out.println(seek);
		System.out.println(cnt);
		
		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + "\t");
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
	}
}
//*/

/*
package ex02.array;

import java.util.Arrays;
import java.util.Random;

public class QuizEx1 {
	public static void main(String[] args) {
		
		// 임의의 데이터 7개 입력 받고, 찾을 임의의 데이터 선택
		
		Random rand = new Random();
		
		int[] a = new int[7];
		int cnt = 0;
		int seek = rand.nextInt(100)+1;
		
		for (int i = 0; i < 7; i++) {
			a[i] = rand.nextInt(100)+1;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == seek) cnt++;
		} // for end
		
		System.out.println(Arrays.toString(a));
		System.out.println(seek);
		System.out.println(cnt);
		
		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + "\t");
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
	}
}
//*/

/*
package ex02.array;

public class QuizEx1 {
	public static void main(String[] args) {
		
		// 배열 여러개 데이터 중에서 7의 개수를 찾기.
		int[] a = new int[] {7, 3, 7, 8, 1, 9, 7, 100, 12, 7, 33, 7};
		int cnt = 0, seek = 7;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == seek) cnt++;
		} // for end
		
		System.out.println(cnt);
		
	}
}
//*/

/*
package ex02.array;

public class QuizEx1 {
	public static void main(String[] args) {
		
		// 배열 5개 데이터 선언하고 배열의 합을 구해주세요.
		int[] a = new int[] {3, 5, 8, 1, 9};
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		} // for end
		
		System.out.println(sum);
		
	}
}
//*/