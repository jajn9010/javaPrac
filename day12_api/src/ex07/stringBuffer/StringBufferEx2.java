package ex07.stringBuffer;

public class StringBufferEx2 {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil"); //문자열 추가
		System.out.println(sb);
		
//		sb.reverse();
//		System.out.println(sb);
		System.out.println("==================================");
		
		sb.insert(7, " my"); //문자열 삽입
		System.out.println(sb);
		
		sb.replace(8, 10, "your"); //해당하는 문자열 변경(교체)
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.delete(0, 5);
		System.out.println(sb);
		
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.setLength(20); //Data 용량이 작아진 다음 돌아오면 Data는 손실된다.
		System.out.println(sb);
	}
}