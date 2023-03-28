package ex02.scanner;

//import java.lang.*; // 내부적으로 자동 import됨
import java.util.Scanner;
public class MainEntry {
	public static void main(String[] args) {
		
		//표준 입력 : System.in
		Scanner sc = new Scanner(System.in); // 객체 생성, 메모리할당, 생성자함수 자동호출
		System.out.print("정수 데이터 입력 요망 : ");
		int su = sc.nextInt();
		
		System.out.println("\n\n입력 받은 수 : "+su);
		
		// Ctrl + / : 한줄주석 설정/해제
		// Ctrl + Shift + / : 여러줄 주석 설정
//		Ctrl + Shift + \ : 여러줄 주석 설정
	}
}
