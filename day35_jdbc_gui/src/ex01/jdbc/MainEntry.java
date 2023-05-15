package ex01.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;

public class MainEntry {
	public static void main(String[] args) {
		Connection conn = ConnectionHelper.getConnection("oracle");
		Statement stmt = null;
		ResultSet rs = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			stmt = conn.createStatement();
			// SQL 구문, HTML Tag는 java/jsp/servlet 에서 문자열 취급한다.
//			String sql = "CREATE TABLE KOSADB(NAME VARCHAR2(20), AGE NUMBER)";
			StringBuffer sb = new StringBuffer();
//			sb.append("IF EXISTS TABLE DROP ");
			sb.append("CREATE TABLE KOSADB(NAME VARCHAR2(20), AGE NUMBER)");
			
			System.out.println(sb.toString());
			stmt.executeUpdate(sb.toString()); // 반환값 없는 경우

			String sql = "INSERT INTO KOSADB VALUES('YUNA', 33)";
			int result = stmt.executeUpdate(sql);

			sql = "SELECT * FROM KOSADB";
			rs = stmt.executeQuery(sql);

			System.out.println(result + "개 추가됨.");

			while (rs.next()) {
				System.out.println("name : " + rs.getString(1) + "\t");
				System.out.println("age : " + rs.getInt("age"));
			}
			
//			conn.commit();
			
//			sql = "DROP TABLE KOSADB";
//			result = stmt.executeUpdate(sql);
//			System.out.println("drop table : " + result);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseHelper.close(rs);
			CloseHelper.close(stmt);
			CloseHelper.close(conn);
		}
	}
}
