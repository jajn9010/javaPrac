package ex07.io.data;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataOutputStreamEx {
	public static void main(String[] args) throws Exception { //예외발생 처리 위임
		
		File file = new File("test.txt");
		FileOutputStream fos = new FileOutputStream(file);//예외발생
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);//예외발생
		
		dos.writeChar(65); //ASCII code --> 'A'
		dos.writeShort(100);
		dos.writeInt(5000);
		dos.writeLong(888888888);
		dos.writeDouble(8.8);
		dos.writeFloat(12.34f);
		dos.flush(); // buffer 비우기 --> write 랑 짝꿍
		
		System.out.println("test.txt 파일에 " + dos.size() + "byte save");
		dos.close();
	}
}
