package ex01.randomMethod;

public class MainEntry {
	public static void main(String[] args) {
		
		int a = 0;
		
		System.out.println(Math.random());		
//		Math.random() * n  <===== 0 ~ n-1 값 추출됨
		System.out.println(Math.random()*44+1); // * 를 하면 뒤의 들어오는 숫자 n-1번까지 랜덤 추출. 1부터 추출하려면 없애려면 +1하면 됨
		
		System.out.println((int)(Math.random()*44)+1); // 소수점 나오는 것이 싫으면 int형태롤 명시적 형변환 실시
	}
}
