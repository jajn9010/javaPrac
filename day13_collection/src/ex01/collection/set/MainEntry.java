package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;

// Set : 순서없고, 중복 허용 X
public class MainEntry {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();  // JDK 4.x 까지는 new HashSet<String>처럼 넣어줘야했지만 JDK 5.x 부터 안 넣어도 됨
		hs.add("키보드");
		hs.add("마우스");
		hs.add("컵");
		hs.add("볼펜");
		hs.add("키보드");
		
		System.out.println("요소 개수 : " + hs.size());
		System.out.println(hs);

		HashSet<Integer> hs2 = new HashSet<>();
		hs2.add(100);
		hs2.add(3);
		hs2.add(1000);
//		hs2.add("String"); // type이 맞지 않아서 에러

		HashSet hs3 = new HashSet<>();
		hs3.add(100.0);
		hs3.add(3);
		hs3.add(1000);
		hs3.add("String"); // type이 맞지 않아서 에러
		
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		it = hs3.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
