package D_1075;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		str = str.substring(0, str.length()-2) + "00";
		int N = Integer.parseInt(str);
		int F = Integer.parseInt(br.readLine());
		
		int n = N % F;
		
		if(n == 0) System.out.println("00");
		else {
			if(F - n < 10) System.out.println("0" + (F - n));
			else System.out.println(F - n);
		}
	}
}
