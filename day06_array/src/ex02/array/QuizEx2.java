package ex02.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuizEx2 {
	public static void main(String[] args) {
		
		// 기상청에 출근했다. (단, 특정월(4월) 30일 기준) 비가 온 날에 대한 
//		   강수량의 평균(Double)을 구하시오.
		
		int[] arr = new int[30];
		int sum = 0, cnt = 0;
		double avg = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if ((Math.random()) > 0.5) {
				arr[i] = (int)(Math.random() * 100 + 10);
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
//		Random rand = new Random();
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("배열의 크기는? : ");
//		int su = sc.nextInt();
//		int[] arr = new int[su];
//		int sum = 0;
//		double avg = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = rand.nextInt(31);
//		}
//		
//		for (int i = 0; i < arr.length; i ++) {
//			sum += arr[i];
//		}
//		
//		avg = (double)sum / 30;
//		System.out.printf("4월 동안 비가 온 날은 %d일 이며, 평균 강수량은 %.2fml입니다.", su, avg);
//		
//		sc.close();
	}
}
