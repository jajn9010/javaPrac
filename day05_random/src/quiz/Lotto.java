package quiz;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		
		Random rand = new Random();
		int a, b, c, d, e, f, temp;
		
		for (int i = 1; i <= 5; i++) {
			
			a = rand.nextInt(45)+1;
			
			do {
				b = rand.nextInt(45)+1;
			}while(b == a);
			
			do {
				c = rand.nextInt(45)+1;
			}while(c == a || c == b);
			
			do {
				d = rand.nextInt(45)+1;
			}while(d == a || d == b || d == c);
			
			do {
				e = rand.nextInt(45)+1;
			}while(e == a || e == b || e == c || e == d);
			
			do {
				f = rand.nextInt(45)+1;
			}while(f == a || f == b || f == c || f == d || f == e);
			
			if(a>b) { temp = b; b = a; a = temp; }
			if(a>c) { temp = c; c = a; a = temp; }
			if(a>d) { temp = d; d = a; a = temp; }
			if(a>e) { temp = e; e = a; a = temp; }
			if(a>f) { temp = f;	f = a; a = temp; }
			if(b>c) { temp = c;	c = b; b = temp; }
			if(b>d) { temp = d;	d = b; b = temp; }
			if(b>e) { temp = e;	e = b; b = temp; }
			if(b>f) { temp = f; f = b; b = temp; }
			if(c>d) { temp = d;	d = c; c = temp; }
			if(c>e) { temp = e;	e = c; c = temp; }
			if(c>f) { temp = f;	f = c; c = temp; }
			if(d>e) { temp = e;	e = d; d = temp; }
			if(d>f) { temp = f;	f = d; d = temp; }
			if(e>f) { temp = f;	f = e; e = temp; }
						
			System.out.printf("%d, %d, %d, %d, %d, %d \n" ,a,b,c,d,e,f);
		}
		
	}
}
