package ex05.sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		
		int[] a = { 7, 3, 5, 2, 8 };
		int temp = 0;
		
		System.out.println("before sort : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}

		System.out.println("\nafter sort : ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i -1; j++) {

				if (a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				} // if end
			} // j end
		} // i end

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
	}
}
/*
	기준이 없다. 제일 큰게 앞으로 온다.
*/