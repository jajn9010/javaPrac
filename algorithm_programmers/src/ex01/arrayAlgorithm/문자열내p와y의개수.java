package ex01.arrayAlgorithm;

public class 문자열내p와y의개수 {
	public static void main(String[] args) {
		boolean answer = true;
		
		String s = "pPoooyY";
		s = s.toUpperCase();
		
		int allP = s.length() - s.replaceAll("P", "").length();
        int allY = s.length() - s.replaceAll("Y", "").length();
        
        answer = (allP != allY) ? false : true;
        
        System.out.println(answer);
		
	}
}
