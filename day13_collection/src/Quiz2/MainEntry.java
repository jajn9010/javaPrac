package Quiz2;

import java.util.HashMap;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		HashMap<Integer, Student> students = new HashMap<>();
		
		System.out.println("입력하실 인원수를 입력하세요.");
		int SU = new Scanner(System.in).nextInt();
		int num = 0;
		
		do {
			
			num++;
		}while(num < SU);
	}
}
