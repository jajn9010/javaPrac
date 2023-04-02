/*
package report;

import java.util.ArrayList;
import java.util.List;

public class Report {
	public static void main(String[] args) {

		List<Integer> num = new ArrayList<>();
		double sum = 0;
		
		for (int i = 1; i <= 9; i++) {
			sum += (double)i/(i+1);
			num.add(i);
		}
		System.out.printf("%d/%d + %d/%d + %d/%d + %d/%d + %d/%d + %d/%d + %d/%d + %d/%d + %d/%d = %.2f"
							, num.get(0), num.get(1), num.get(1), num.get(2), num.get(2), num.get(3), num.get(3), num.get(4) 
							, num.get(4), num.get(5), num.get(5), num.get(6), num.get(6), num.get(7), num.get(7), num.get(8) 
							, num.get(8), num.get(8)+1, sum);
	}
}
//*/

/*
package report;

import java.util.ArrayList;
import java.util.List;

public class Report {
	public static void main(String[] args) {

		List<Integer> num = new ArrayList<>();
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1)	{
				sum -= i;
				num.add(-i);
			}
			else {
				sum += i;
				num.add(i);
			}
		}
		System.out.printf("(%d) + %d + (%d) + %d + (%d) + %d + (%d) + %d + (%d) + %d = %d"
							,num.get(0), num.get(1), num.get(2), num.get(3), num.get(4), 
							num.get(5), num.get(6), num.get(7), num.get(8), num.get(9), sum);
	}
}
//*/

//*
package report;

import java.util.ArrayList;
import java.util.List;

public class Report {
	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<>();
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i+1; j++) {
				sum += j;
			}
			num.add(i);
		}
		System.out.printf("%d + (%d + %d) + (%d + %d + %d) + (%d + %d + %d + %d) + (%d + %d + %d + %d + %d) = %d"
							, num.get(0), num.get(0), num.get(1), num.get(0), num.get(1), num.get(2),
							num.get(0), num.get(1), num.get(2), num.get(3), num.get(0), num.get(1),
							num.get(2), num.get(3), num.get(4), sum);
	}
}
//*/