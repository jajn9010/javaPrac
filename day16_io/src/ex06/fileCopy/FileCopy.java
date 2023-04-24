//*

package ex06.fileCopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 읽기 객체 생성 - FileInputStream
//		InputStream is = new FileInputStream("minji.jpg"); // 상대경로
//		InputStream is = new FileInputStream("C:\\Users\\KOSA\\Pictures\\Saved Pictures\\3월 29일 Quiz.png"); // 절대경로
		InputStream is = new FileInputStream("C:/Users/KOSA/Pictures/Saved Pictures/3월 29일 Quiz.png"); // 절대경로

		// 쓰기 객체 생성 - FileOutputStream
		OutputStream os = new FileOutputStream("copy.png");
		
		byte[] buffer = new byte[1024*8]; //보통 8byte씩 잡기 때문에 8kb로 한다.

		long start = System.currentTimeMillis(); // 작업 시작시간 저장

		while (true) { // 실제 작업
			int inputData = is.read(buffer);
			if (inputData == -1)
				break;
			os.write(buffer, 0, inputData); //buffer 크기만큼 0부터 inputData(읽어드린 데이터크기)만큼 읽어줘
		}

		long end = System.currentTimeMillis(); // 작업 끝난시간 저장

		System.out.println(end - start); // 복사(작업)에 걸린 시간

		is.close();
		os.close();
		System.out.println("success copy!!!");
	}
}
//*/

/*

package ex06.fileCopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 읽기 객체 생성 - FileInputStream
//		InputStream is = new FileInputStream("minji.jpg"); // 상대경로
//		InputStream is = new FileInputStream("C:\\Users\\KOSA\\Pictures\\Saved Pictures\\3월 29일 Quiz.png"); // 절대경로
		InputStream is = new FileInputStream("C:/Users/KOSA/Pictures/Saved Pictures/3월 29일 Quiz.png"); // 절대경로

		// 쓰기 객체 생성 - FileOutputStream
		OutputStream os = new FileOutputStream("copy.png");

		long start = System.currentTimeMillis(); // 작업 시작시간 저장

		while (true) { // 실제 작업
			int inputData = is.read();
			if (inputData == -1)
				break;
			os.write(inputData);
		}

		long end = System.currentTimeMillis(); // 작업 끝난시간 저장

		System.out.println(end - start); // 복사(작업)에 걸린 시간

		is.close();
		os.close();
		System.out.println("success copy!!!");
	}
}
//*/