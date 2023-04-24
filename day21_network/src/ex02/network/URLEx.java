package ex02.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {
	public static void main(String[] args) throws MalformedURLException, IOException {
			URL url = new URL("https://www.google.com"); // 예외발생
			
			//System.in : 표준 입력 - 키보드로부터 입력받는다.
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream())); //openStream 도 예외 발생
			
			String inputLine;
			while((inputLine = br.readLine()) != null) { // 예외발생. IOException
				System.out.println(inputLine);
			}
			br.close();
	}
}
