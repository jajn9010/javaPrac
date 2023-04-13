package ex01.collection.set;

import java.util.HashSet;
import java.util.Set;

//Set : 순서없고, 중복 허용 X
public class HashSetEx {
	public static void main(String[] args) {
		
		Object[] objArr = {"1", new Integer(1), "2", "3", "3", "4", "4", "4"};
		
		Set set = new HashSet();
		
		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}
		System.out.println(set);
	}
}
