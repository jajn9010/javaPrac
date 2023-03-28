package ex02.datatype;

public class MainEntry {
	
	static int Num;   // 정수형 data : 0 , 실수형 data : 0.0, 문자열 : null
	static String str;
	
	public static void main(String[] args) { // 시작점 (진입점)
		
		int y = 12;  //지역변수는 반드시 초기화 하고 사용해야한다.
		System.out.println(y);
		
		System.out.println("static value : " + Num + ", " + str);
		
		int su = 30;
		System.out.println(su); // 4byte
		System.out.println(100); // 4byte
		
		long num = 20;
		System.out.println(num); // 8byte
		System.out.println(1000L); // 뒤에 L을 붙였기 때문에 long으로 인식한다.
		
		double d = 12.34;
		System.out.println(d); 
		System.out.println(34.56); // double타입으로 인식
		System.out.println(12.34f); // f 접미사로 float type로 변경
		
		float f = 12.34f; //12.34를 넣으면 comfile과정에서 대입 연산자로 인해 위의 12.34가 double로 인식한 뒤 넘어오기 때문에 에러발생 f 접미사 넣어줘야함
		System.out.println(f);
	} // main end
	
} // class end
