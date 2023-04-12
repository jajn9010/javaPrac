package ex01.arrayAlgorithm;

public class 모음제거 {
	public static void main(String[] args) {
		String my_string = new String("bus");
		String answer = "";
		
		answer = my_string.replaceAll("[a, e, i, o, u]", "");
		System.out.println(answer);
	}
}
