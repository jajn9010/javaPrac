package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 	DB 연결 정보 반복적인 코딩을 해결하는 것.

 	Class.forName("oracle.jdbc.OracleDriver");
	conn = DriverManager.getConnection(jdbc:oracle:thin:@localhost:1521:orcl, JIN, oracle);
	
	이런식으로 사용
	ConnectionHelper.getConnection("mysql"); or ("oracle") or ("mssql")
	dsn ==> data sourcee name
 */
public class ConnectionHelper {
	//method(접근자 : public static)
	public static Connection getConnection(String dsn) {
		Connection conn = null;
		try {
			if(dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql:@localhost:3306/kosaDB", "JIN", "mysql");
			} else if(dsn.endsWith("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "JIN", "oracle");
				System.out.println("connection success!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	public static Connection getConnection(String dsn, String userid, String pwd) {
		Connection conn = null;
		try {
			if(dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql:@localhost:3306/kosaDB", userid, pwd);
			} else if(dsn.endsWith("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", userid, pwd);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	public static void menu() {
		System.out.println("\n-=-=-=-=-=-=-=-=-= JDBC Query -=-=-=-=-=-=-=-=-=");
		System.out.println("\t0. ROLLBACK");
		System.out.println("\t1. 전체보기");
		System.out.println("\t2. 레코드 삽입(추가)");
		System.out.println("\t3. 레코드 수정");
		System.out.println("\t4. 레코드 삭제");
		System.out.println("\t5. 조건에 의한 검색(EX: GNO)");
		System.out.println("\t6. 프로그램 종료 ");
		System.out.println("\t9. commit");
		System.out.println("\t>> 원하는 메뉴를 선택하세요.");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
}
