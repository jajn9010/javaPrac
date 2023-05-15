package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 	ConnectionHelper 클래스의 문제 : 연결하고 끊고 하는 것을 계속하는 것은 자원의 낭비이다.
 	매번 드라이브 로드...
 	Connection 생성...
 	
 	하나의 프로세스에서 하나만 만들어서 재사용하는 것이 좋음.
 	
 	해결방법
 	공유자원(싱클톤)
 */

public class ConnectionSingletonHelper {
	// 하나의 프로세스에서 공통을로사용할 수 있는 공용자원(static)
	private static Connection conn;

	private ConnectionSingletonHelper() {  }

	public static Connection getConnection(String dsn) {
		if (conn != null) {
			return conn;
		}

		try {
			if (dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql:@localhost:3306/kosaDB", "JIN", "mysql");
			} else if (dsn.endsWith("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "JIN", "oracle");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}

	public static void close() throws SQLException {
		if (conn != null) {
			if (!conn.isClosed()) {
				conn.close();
			}
		}
	}
}
