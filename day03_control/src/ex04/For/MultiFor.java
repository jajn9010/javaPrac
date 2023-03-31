//*
package ex04.For;

public class MultiFor {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 5; j > 0; j--) {
				if (j-i <= 0) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <=5; j++) {
				if(i-j <=0) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= 9; i += 2) {
			
			for (int j = 9; j > 0; j--) {
//				if(j-i <= 5 || ) System.out.print("*");
//				else System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
//*/

/*
package ex04.For;

public class MultiFor {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= 5; j++) {
				if(i <= j)
				System.out.print("*");
				
			} // j end
			System.out.println();
		} // i end
		
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= 5; j++) {
				if(i >= j)
				System.out.print("*");
				
			} // j end
			System.out.println();
		} // i end
		
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= 5; j++) {
				
				System.out.print("*");
				
			} // j end
			System.out.println();
		} // i end
	}
}
//*/

/*
package ex04.For;

public class MultiFor {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= 5; j++) {
				
				System.out.print("*");
				
			} // j end
			System.out.println();
		} // i end
	}
}
//*/

/*
package ex04.For;

public class MultiFor {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 2; i++) {
			
			for (int j = 1; j <= 3; j++) {
				
				System.out.print(j + "\t");
				
			} // j end
			System.out.println();
		} // i end
	}
}
//*/