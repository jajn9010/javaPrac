package ex07.stringBuffer;

public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.hashCode());
		
		System.out.println("length\t/\tcapacity");
		int len = sb.length();
		int size = sb.capacity();
		System.out.println(len + "\t/\t" + size);
		
		sb.append("DaeBo");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "\t/\t" + size);
		
		sb.append("happyvirus");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "\t/\t" + size);
	
		sb.append("12345 67890");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "\t/\t" + size);
		
		sb.append("12345 67890");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "\t/\t" + size);
		
		System.out.println(sb.hashCode());
		
		sb.trimToSize();// 용량크기 조절
		size = sb.capacity();
		System.out.println(len + "\t/\t" + size);
		
	}
}
