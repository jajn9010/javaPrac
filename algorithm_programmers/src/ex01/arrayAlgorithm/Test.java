package ex01.arrayAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				int hap = i * j;
				System.out.printf("%d * %d = %d\t", i, j, hap);
			}
			System.out.println();
		}
		
		int[][] arr = new int[3][4];
		for (int i = 0; i < 3; i++) {
			int hap = 0;
			for (int j = 0; j < 4; j++) {
				if(j == 3) {
					arr[i][j] = hap;
					continue;
				}
				int num = (int) (Math.random() * 100);
				arr[i][j] = num;
				hap += num;
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
	}
}
