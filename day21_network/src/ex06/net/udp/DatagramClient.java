package ex06.net.udp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramClient {
	public static void main(String[] args) {

		BufferedReader br = null;
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		DataInputStream dis = null;

		int port = 5000;
		String str;
		byte[] buffer = null;

		try {
			System.out.println("@@@ UDP File Client @@@");
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("전송 대상(Server IP) = ");
			String ipAddress = br.readLine(); // 192.168.0.30j or 127.0.0.1
			System.out.println("전송 파일(파일명.확장자) = ");
			String fileName = br.readLine();

			File file = new File(fileName);

			if (!file.exists()) {
				System.out.println("파일이 존재하지 않습니다.");
				System.exit(0);
			}

			str = "start";
			buffer = str.getBytes();
			ds = new DatagramSocket();
			InetAddress iaddress = InetAddress.getByName(ipAddress); // 문자열 ip 주소를 실제 ip 주소로 변환
			dp = new DatagramPacket(buffer, buffer.length, iaddress, port);
			ds.send(dp); // 송신........

			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			buffer = new byte[65536];

			while (true) {
				int count = dis.read(buffer, 0, buffer.length);

				if (count == -1)
					break;

				dp = new DatagramPacket(buffer, count, iaddress, port);
				ds.send(dp); // 데이터 전송(송신)
			}

			str = "end";
			buffer = str.getBytes();

			dp = new DatagramPacket(buffer, buffer.length, iaddress, port);
			ds.send(dp);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				dis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
