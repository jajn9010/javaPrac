package ex02.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GiftInsert2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//1. Driver load........ exception
//		Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("oracle.jdbc.OracleDriver");
		
		//2. db연결
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String uId = "JIN";
		String pwd = "oracle";
		
		Connection conn = DriverManager.getConnection(url, uId, pwd);

		//3. 사용 (DML 명령어 : insert)  - Statement / PreparedStatement 
		
		System.out.println("Gift Table data input : 상품번호/상풍명/최저가/최고가 = ");
		String sql = "INSERT INTO GIFT VALUES(?, ?, ?, ?)";
		String usql = "UPDATE GIFT SET GNAME = ? WHERE GNO = ?";
		String dSql = "delete gift where gno = ?";
		
		PreparedStatement pstmt = conn.prepareStatement(dSql);
//		pstmt.setString(1, br.readLine());
		pstmt.setInt(1, Integer.parseInt(br.readLine()));
//		pstmt.setInt(1, Integer.parseInt(br.readLine()));
//		pstmt.setString(2, br.readLine());
//		pstmt.setInt(3, Integer.parseInt(br.readLine()));
//		pstmt.setInt(4, Integer.parseInt(br.readLine()));
		
		int result = pstmt.executeUpdate(); // 반환값이 없는 경우 - insert, update, delete
		
		System.out.println(result + "개 데이터 추가 성공함.");
		
		pstmt.close();
		conn.close();
	}
}
