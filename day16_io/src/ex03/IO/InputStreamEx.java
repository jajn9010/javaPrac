package ex03.IO;

import java.io.IOException;

public class InputStreamEx {
	public static void main(String[] args) {
		System.out.println("input : ");
		int su;
		
		try {
			while((su = System.in.read()) != -1) {  // while( su != -1)
				if( su == 10 || su == 13 || su == 32 ) continue;
				if( su == 113 || su == 81 ) break;  // 'q' || 'Q'
				
				char ch = (char) su;
				System.out.println(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
