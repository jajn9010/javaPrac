package quiz;

import java.util.Arrays;

public class QuizLotto {
	
	public static void init() {
		// 난수 구해서 숫자 6개의 Data를 뽑기.
		
		int[] arr = new int[6];
		
		for ( int i = 0; i < 6; i++) {
			arr[i] = (int)(Math.random()*45)+1;
			
			if(isCheck(arr, i)) {
				i--;
			}
		}
		Arrays.sort(arr);
		print(arr);
	}
	
	public static void print(int[] arr) {
		for (int item : arr) System.out.print(item + "\t");
		System.out.println();
	}
	
	public static void set() {
		for (int i = 0; i < 5; i++) {
			init();
		}
	}

	public static boolean isCheck(int[] arr, int x) {
		boolean check = false;
		for (int i = 0; i < x; i++) {
			if(arr[x] == arr[i]) check = true;
		}
		return check;
	}

	public static void main(String[] args) {
		set();
	}
	
	
	// 같은 수인지 판단하는 함수 구현 ( ex: isCheck(int[] arr, int i) {  }) boolean type으로 구현
}
