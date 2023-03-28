//*
package ex02.datatype;

public class DataType2 {
	
	// 형변환
	public static void main(String[] args) {
		
		short sh = 3;  //short의 양의 정수 크기  -32,768 ~ 32,767
		int num = 50000; // -21억 ~ 21억
		
		// 작은 자료형이 큰 자료형으로 형변환이 될 때는 자동으로 형변환(묵시적 형변환)이 일어난다.
		num = sh; // int(4byte) = short(2byte)
		System.out.println(sh + " : " + num);
		
//		num = -32769;
		num = 32770;
		// 큰 자료형이 작은 자료형에 넣으려면 명시적형변환을 해야한다.
		// 데이터 손실이 발생할 수 있다.
		sh = (short)num; // 명시적 형변환, short(2byte) = int(4byte)
		System.out.println(sh + " : " + num);
		
	}
	
}
//*/



/*
package ex02.datatype;

public class DataType2 {
	
	// 모든 자료형은 자신의 범위(크기)를 벗어나지 않는다
	public static void main(String[] args) {
		
		short sh = 32767;  //short의 양의 정수 크기  -32,768 ~ 32,767
		int num = 50000; // -21억 ~ 21억
		
		System.out.println(sh + " : " + num);
		
//		num = -32769;
		num = 32770;
		sh = (short)num;
		System.out.println(sh + " : " + num);
		
	}
	
}
//*/
// 한줄 주석

/*   여러줄 주석   *에스테디크(아스타)    */   