package ex01.collection.set;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet<>();
		
		int[] score = {100, 80, 90, 95, 97, 46, 88, 65, 95, 100};
		
		for (int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));
		}
		System.out.println(set);
		
		System.out.println("80보다 작은 값 : " + set.headSet(80));
		System.out.println("80보다 큰 값 : " + set.tailSet(80));
	}
}
