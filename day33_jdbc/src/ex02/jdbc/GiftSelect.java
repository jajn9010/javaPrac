package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. Driver load........ exception
//		Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("driver load success!!!");
		
		//2. Connection & Open
					 //driver:@IP:portNumber:SID(or 전역데이터베이스명)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String uId = "JIN";
		String pwd = "oracle";
		
		Connection conn = DriverManager.getConnection(url, uId, pwd);
		System.out.println("connection sucess!!!");
		
		//3. 사용 (DML 명령어)
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT"); // ctrl + shift + x = 전부 대문자 만들기
						//반환값이 있는 경우는 대부분 select 부분이다.
		System.out.println("상품번호\t상품명\t\t최저가\t최고가");
		
		while(rs.next()) {
			int gno = rs.getInt(1);  // rs.getxxx(인덱스번호); // rs.getxxx("필드명");
			String gname = rs.getString("gname");
			int g_s = rs.getInt(3);
			int g_e = rs.getInt("g_end");
			
			System.out.println("\t" + gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}
		
		//4. 닫기. (자원 반환)
		rs.close();
		stmt.close();
		conn.close();
	}
}
