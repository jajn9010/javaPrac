package ex01.lambda;

import java.util.ArrayList;

public class LambdaMain {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    
	    System.out.println(numbers); // [5, 9, 8, 1]
//	    Consumer<Integer> method = (n) -> { System.out.println(n); };
//	    numbers.forEach( method );

//	    for(int item : numbers) System.out.println(item);
	    numbers.forEach( n -> System.out.println(n) );
	    
	}
}
