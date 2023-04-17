package ex03.IO;

import java.io.IOException;

public class InputStreamEx2 {
	public static void main(String[] args) 
					throws IOException { //예외처리 위임
	
		int su = 0;
		
		System.out.println("데이터 입력 끝은 Ctrl + Z 누르세요. ");
		
		while (( su = System.in.read()) != -1 ) {
			System.out.print((char)su + "\t");
		}
	}
}
