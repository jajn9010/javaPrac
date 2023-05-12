package ex02.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpCRUD {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Connection conn;
	
	static void connect() throws ClassNotFoundException, SQLException{
		//연결 메소드
		//1. Driver load........ exception
//		Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("oracle.jdbc.OracleDriver");
		
		//2. Connection & Open
					 //driver:@IP:portNumber:SID(or 전역데이터베이스명)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String uId = "JIN";
		String pwd = "oracle";
		
		conn = DriverManager.getConnection(url, uId, pwd);
	}
	
	// selectByNo();
	
	// selectAll()
	static void selectAll() throws SQLException {
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMP"); // ctrl + shift + x = 전부 대문자 만들기
						//반환값이 있는 경우는 대부분 select 부분이다.
		System.out.println("사번\t성명\t직업\t관리자번호\t입사일\t급여\t성과금\t부서");
		
		while(rs.next()) {
			int empNo = rs.getInt(1);  // rs.getxxx(인덱스번호); // rs.getxxx("필드명");
			String eName = rs.getString(2);
			String job = rs.getString(3);
			int mgr = rs.getInt(4);
			Date hireDate = rs.getDate(5);
			int sal = rs.getInt(6);
			int comm = rs.getInt(7);
			int deptno = rs.getInt(8);
			
			System.out.println(empNo + "\t" + eName + "\t" + job + "\t" + mgr + "\t" + hireDate + "\t" + sal + "\t" + comm + "\t" + deptno);
		}
	}
	
	// insert()
	static void insert() {
		
	}
	// update()
	
	// delete()
	static void delete() throws SQLException, IOException {
		System.out.println("삭제할 직원의 사번를 입력하세요.");
		String dSql = "DELETE EMP WHERE EMPNO = ?";
		PreparedStatement pstmt = conn.prepareStatement(dSql);
		pstmt.setInt(1, Integer.parseInt(br.readLine()));
		pstmt.executeUpdate();
	}
	
	// 종료
	
	// menu
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		connect();
		selectAll();
//		delete();
	}
}
