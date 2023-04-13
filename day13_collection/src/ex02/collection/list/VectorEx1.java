package ex02.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

// 순서 있고, 중복 허용한다.
public class VectorEx1 {
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();
		System.out.println("length       /       capacity");
		System.out.println(v.size() + "            /            " + v.capacity());

		Vector<Integer> v2 = new Vector<>(3, 4); // 초기용량, 증가용량
		v2.add(2);		v2.add(22);		v2.add(21);		v2.add(312);
		v2.add(200);	v2.add(215);	v2.add(512);	v2.add(232);
		v2.add(342);	v2.add(200);	v2.add(312);	v2.add(25);

		System.out.println(v2.size() + "            /            " + v2.capacity());

		System.out.println("================ iterator() method ====================");
		Iterator it = v2.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}

		System.out.println("\n================ get() method ====================");
		for (int i = 0; i < v2.size(); i++) {
			System.out.print(v2.get(i) + "  ");
		}

		System.out.println("\n================ sort method ====================");

		Collections.sort(v2);
		System.out.println(v2);
		for (int i = 0; i < v2.size(); i++) {
			System.out.print(v2.get(i) + "  ");
		}

		System.out.println("\n================ elementsAt() method ====================");

		for (int i = 0; i < v2.size(); i++) { // vector에 있는 모든 요수에 대해 반복
			Integer num = v2.elementAt(i);
			System.out.print(num + "  ");
		}

		System.out.println("\n================ trimToSize() method ====================");
		System.out.println(v2.size() + "            /            " + v2.capacity());
		v2.trimToSize();
		System.out.println(v2.size() + "            /            " + v2.capacity());
	}
}
