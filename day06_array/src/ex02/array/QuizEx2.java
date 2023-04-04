package ex02.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuizEx2 {
	public static void main(String[] args) {
		
		// 기상청에 출근했다. (단, 특정월(4월) 30일 기준) 비가 온 날에 대한 
//		   강수량의 평균(Double)을 구하시오.
		
		//추가) 원하는 달(월)을 입력받아서 일수를 결정한다.
		
		int SU = 30, sum = 0;   // 유지보수 수월하게 하기 위해
		double avg = 0;
		double[] arr = new double[SU];
		
		System.out.println("일일 강수량을 입력 하세요. ");
		
		for(int i =0; i < arr.length; i++) {
			
			System.out.println((i+1) + "일 강수량을 입력하세요. ");
			arr[i] = new Scanner(System.in).nextDouble();
			sum += arr[i];
			avg = (double)sum / arr.length;
			
		}
		
		System.out.printf("4월 평균 강수량 : %.2f", avg);
		
		
//		================================================================ 2차 방법
		
//		int[] arr = new int[30];
//		int sum = 0, cnt = 0;
//		double avg = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			if ((Math.random()) > 0.5) {
//				arr[i] = (int)(Math.random() * 100 + 10);
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		
		
//		=============================================================== 1차 방법
		
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
