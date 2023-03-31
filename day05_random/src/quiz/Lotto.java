package quiz;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		
		Random rand = new Random();
		int temp = 0;
		
		for (int i = 1; i <= 6; i ++) {
			int a = rand.nextInt(46)+1;
			
			if (temp == a) {
				i--;
			}
			else {
				temp = a;
				System.out.print(a + "\t");
			}
			
		}
	}
}
