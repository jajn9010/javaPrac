package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GiftInsert3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. Driver load........ exception
//		Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("oracle.jdbc.OracleDriver");
		
		//2. db연결
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String uId = "JIN";
		String pwd = "oracle";
		
		Connection conn = DriverManager.getConnection(url, uId, pwd);

		//3. 사용 (DML 명령어 : insert)  - Statement / PreparedStatement 
		String sql = "INSERT INTO GIFT VALUES(?, ?, ?, ?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 20);
		pstmt.setString(2, "초코렛");
		pstmt.setInt(3, 3000);
		pstmt.setInt(4, 9999);
		
		int result = pstmt.executeUpdate(); // 반환값이 없는 경우 - insert, update, delete
		
		System.out.println(result + "개 데이터 추가 성공함.");
		
		pstmt.close();
		conn.close();
	}
}
