package dbeducation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		Connection conn = null;
		Scanner sc = new Scanner(System.in);
		try {
			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl"
					, ""
					, "");
			
			System.out.println("연결 성공");
			
			String sql = ""
					+ "INSERT INTO USER_INFOMATION(USER_ID, USER_PASSWORD, USER_NAME, USER_AGE, USER_GENDER, USER_PHONENUMBER, CREATE_DATE)"
					+ "VALUES (?, ?, ?, ?, ?, ?, SYSDATE)";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			System.out.println("사용자 ID생성: ");
			pstmt.setString(1, sc.nextLine());
			System.out.println("사용자 PassWord생성: ");
			pstmt.setString(2, sc.nextLine());
			System.out.println("사용자 이름생성: ");
			pstmt.setString(3, sc.nextLine());
			System.out.println("사용자 나이생성: ");
			pstmt.setString(4, sc.nextLine());
			System.out.println("사용자 성별생성: ");
			pstmt.setString(5, sc.nextLine());
			System.out.println("사용자 휴대전화번호 생성: ");
			pstmt.setString(6, sc.nextLine());

			int rows = pstmt.executeUpdate();
			
			if(rows == 0) {
				System.out.println("DB저장 실패");
			}else {
				System.out.println("DB저장 성공" + rows);				
			}
			
			
			//PreparedStatement 닫기
			pstmt.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					// 연결 끊기
					conn.close();
					System.out.println("연결 끊기");
				} catch (SQLException e) {
				}
			}
		}
		sc.close();
	}
}