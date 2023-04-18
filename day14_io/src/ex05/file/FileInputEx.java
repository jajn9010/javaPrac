package ex05.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputEx {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
//			OutputStream os = new FileOutputStream("test.txt");
//			OutputStream os = new FileOutputStream("C:\\app\\jaejin.txt"); //절대경로를 만들때 \ 두번 쓰지만 /로 해도 된다.
			OutputStream os = new FileOutputStream("C:/app/eunji.txt"); //절대경로를 만들때 \ 두번 쓰지만 /로 해도 된다.

			while (true) {
				System.out.println("문자열 입력 요망 : ");
				String str = sc.nextLine() + "\r\n"; // \r은 home키와 같음

//				if (str.toUpperCase().equals("EXIT\r\n"))
				if (str.equalsIgnoreCase("EXIT\r\n")) {
					System.out.println(str.length() + "byte만큼 썼습니다.");
					break;
				}
				
				os.write(str.getBytes()); //예외발생.  읽어들인 문자 str의 길이(getBytes()) 만큼 써주세요.
				System.out.println(str); //화면출력
			} // while end

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
