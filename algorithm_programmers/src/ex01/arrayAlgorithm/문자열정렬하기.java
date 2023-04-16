package ex01.arrayAlgorithm;

import java.util.Arrays;

public class 문자열정렬하기 {
	public static void main(String[] args) {
		String my_string = "hi12392";
		int[] answer = new int[my_string.length()];
		
		my_string = my_string.replaceAll("[^0-9]", "");
		
		for (int i = 0; i < my_string.length(); i++) {
			answer[i] = (int)my_string.charAt(i);
		}
		
		
		System.out.println(Arrays.toString(answer));
		
	}
}
