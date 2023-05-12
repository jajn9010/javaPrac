package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;
import model.GiftVO;

public class GiftController { // Controller
	// 연결, 삽입, 삭제, 수정, 검색
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Statement stmt = null;
	static ResultSet rs = null;
	static PreparedStatement pstmt = null;
	static Connection conn = null;

	// connect
	public static void connect() {
		try {
			conn = ConnectionHelper.getConnection("oracle");
			stmt = conn.createStatement();
			conn.setAutoCommit(false); // 자동커밋 끄기
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// close
	public static void close() {
		try {
			CloseHelper.close(rs);
			CloseHelper.close(stmt);
			CloseHelper.close(pstmt);
			CloseHelper.close(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// menu
	public static void menu() throws SQLException, IOException { // 예외처리 위임
		GiftVO vo = new GiftVO();

		while (true) {
			System.out.println();
			ConnectionHelper.menu();

			switch (Integer.parseInt(br.readLine())) {
			case 0:
				System.out.println("Commit 하시겠습니까?(Y/N)");
				System.out.println("하지 않으시면 Rollback 됩니다.");
				if (br.readLine().equalsIgnoreCase("Y")) {
					conn.commit(); // 예외발생
					selectAll(vo.getClassName());
				} else {
					conn.rollback();
					selectAll(vo.getClassName());
				}
			case 1:
				selectAll(vo.getClassName());
				break;
			case 2:
				insert();
				break;
			case 3:
				update(vo.getClassName());
				break;
			case 4:
				delete(vo.getClassName());
				break;
			case 5:
				selectByGno(vo.getClassName());
				break;
			case 6:
				close();
				System.out.println("프로그램 종료합니다.");
				System.exit(0);
				break;
			case 9:
				conn.commit();
				System.out.println("성공적으로 Commit 되었습니다.");
				break;
			default:
				break;
			}
		} // end while
	} // end menu

	// insert
	public static void insert() throws IOException {
		System.out.println("GNO : ");
		String gno = br.readLine();

		System.out.println("GNAME : ");
		String gname = br.readLine();

		System.out.println("G_START : ");
		String g_start = br.readLine();

		System.out.println("G_END : ");
		String g_end = br.readLine();

		try {
			pstmt = conn.prepareStatement("INSERT INTO GIFT VALUES(?, ?, ?, ?)");
			pstmt.setString(1, gno);
			pstmt.setString(2, gname);
			pstmt.setString(3, g_start);
			pstmt.setString(4, g_end);

			int result = pstmt.executeUpdate();

			System.out.println(result + "개 데이터가 추가 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end insert

	// delete
	public static void delete(String name) throws IOException, SQLException {
		selectAll(name);
		System.out.println("삭제할 상품의 번호를 입력하세요");
		String gno = br.readLine();

		try {
			pstmt = conn.prepareStatement("delete " + name + " where gno = ?");
			pstmt.setString(1, gno);

			pstmt.executeUpdate();

			System.out.println(gno + "번 상품이 삭제되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// update
	public static void update(String name) throws SQLException, IOException {
		selectAll(name);
		System.out.println("상품번호를 입력하시오.");
		String gno = br.readLine();
		System.out.println("상품이름을 입력하시오.");
		String gname = br.readLine();
		System.out.println("상품최저가를 입력하시오.");
		String g_start = br.readLine();
		System.out.println("상품최고가를 입력하시오.");
		String g_end = br.readLine();

		try {
			pstmt = conn.prepareStatement("update gift set gname=?, g_start = ?, g_end=? where gno=?");
			pstmt.setString(4, gno);
			pstmt.setString(4, gno);
			pstmt.setString(1, gname);
			pstmt.setString(1, gname);
			pstmt.setString(2, g_start);
			pstmt.setString(2, g_start);
			pstmt.setString(3, g_end);
			pstmt.setString(3, g_end);

			int result = pstmt.executeUpdate();
			System.out.println(result + "데이터가 변경 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// selectAll();
	public static void selectAll(String name) throws SQLException {
		rs = stmt.executeQuery("SELECT * FROM " + name); // 반환값 있는 경우
		System.out.println(name);
		ResultSetMetaData rsmd = rs.getMetaData(); // 해당 테이블에 대한 정보를 가지고 있음.
		int count = rsmd.getColumnCount();

		while (rs.next()) {
			for (int i = 1; i <= count; i++) {

				switch (rsmd.getColumnType(i)) {
				case Types.NUMERIC:
				case Types.INTEGER:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getInt(i) + " ");
					break;
				case Types.FLOAT:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getFloat(i) + " ");
					break;
				case Types.DOUBLE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDouble(i) + " ");
					break;
				case Types.CHAR:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + " ");
					break;
				case Types.DATE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDate(i) + " ");
					break;
				default:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + " ");
					break;
				} // switch end
			} // for end
			System.out.println();
		} // end while
	} // end selectAll

	// select
	public static void selectByGno(String className) throws SQLException, NumberFormatException, IOException {
		pstmt = conn.prepareStatement("select * from " + className + " where gno = ?");
		System.out.print("검색할 상품의 GNO(숫자)를 입력: ");
		int gno = Integer.parseInt(br.readLine());
		pstmt.setInt(1, gno);
		rs = pstmt.executeQuery();
		ArrayList<GiftVO> list = new ArrayList<>();
		while (rs.next()) {
			GiftVO gift = new GiftVO();
			gift.setGno(rs.getInt("GNO"));
			gift.setGname(rs.getString("GNAME"));
			gift.setG_start(rs.getInt("G_START"));
			gift.setG_end(rs.getInt("G_END"));
			list.add(gift);
		}
		if (list.size() == 0) {
			System.out.println("검색된 상품이 없습니다.");
			System.out.println();
			return;
		}
		for (GiftVO gift : list) {
			System.out.println("GNO: " + gift.getGno());
			System.out.println("GNAME: " + gift.getGname());
			System.out.println("G_START: " + gift.getG_start());
			System.out.println("G_END: " + gift.getG_end());
			System.out.println();
		}

	}
}
