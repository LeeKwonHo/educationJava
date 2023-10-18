package dbeducation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectEducation {

	public static void main(String[] args) {
		Connection conn = null;

		try {
			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결하기
			conn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521/orcl"
					, "LeeKwonHo"
					, "tiger");

			System.out.println("연결 성공");

			String sql = "" +
			" SELECT USER_ID , USER_PASSWORD , USER_NAME , USER_AGE , USER_GENDER , USER_PHONENUMBER , CREATE_DATE "
					+ " FROM USER_INFOMATION "
					+ " WHERE 'USER_ID' IS NOT NULL ";

			PreparedStatement pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				DataBassBoard dbBoard = new DataBassBoard();
				
				dbBoard.setUSER_ID(rs.getNString("USER_ID"));
				dbBoard.setUSER_PASSWORD(rs.getString("USER_PASSWORD"));
				dbBoard.setUSER_NAME(rs.getString("USER_NAME"));
				dbBoard.setUSER_AGE(rs.getString("USER_AGE"));
				dbBoard.setUSER_GENDER(rs.getString("USER_GENDER"));
				dbBoard.setUSER_PHONENUMBER(rs.getString("USER_PHONENUMBER"));
				dbBoard.setCREATE_DATE(rs.getDate("CREATE_DATE"));

				System.out.print("|" + dbBoard.getUSER_ID() + " | ");
				System.out.print(dbBoard.getUSER_PASSWORD() + " | \n");
				System.out.print(dbBoard.getUSER_NAME() + " | ");
				System.out.print(dbBoard.getUSER_AGE() + " | \n");
				System.out.print(dbBoard.getUSER_GENDER() + " | ");
				System.out.print(dbBoard.getUSER_PHONENUMBER() + " | \n");
				System.out.println(dbBoard.getCREATE_DATE() + "|");
			
			}
			rs.close();

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

	}
}