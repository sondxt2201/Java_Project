package Controller;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;

import java.sql.*;
import java.util.ArrayList;

import Model.*;

public class UserItemDAO extends Connect {
	// public static void main(String args[]) {
	// try {
	// // connnect to database
	// Connection conn = DriverManager.getConnection(Connect.DB_URL,
	// Connect.USER_NAME, Connect.PASSWORD);
	// // crate statement
	// Statement stmt = conn.createStatement();
	// // get data from table
	// ResultSet rs = stmt.executeQuery("select * from quanlykhupho.useritem");
	// // show data
	// while (rs.next()) {
	// System.out.println(rs.getString(1) + " " + rs.getString(2) + " " +
	// rs.getString(3));
	// }
	// // close connection
	// conn.close();
	// } catch (Exception ex) {
	// ex.printStackTrace();
	// }
	// }

	private Connection conn;

	public UserItemDAO() {
		try {
			conn = DriverManager.getConnection(Connect.DB_URL, Connect.USER_NAME, Connect.PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean addUserItem(UserItem ui) {

		String sql = "INSERT INTO USERITEM(tenTaiKhoan, matKhau) "
				+ "VALUES(?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, ui.gettenTaikhoan());
			ps.setString(2, ui.getmatKhau());

			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public ArrayList<UserItem> getListUseritem() {
		ArrayList<UserItem> list = new ArrayList<>();
		String sql = "SELECT * FROM USERITEM";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				UserItem ui = new UserItem();
				ui.settenTaikhoan(rs.getString("tenTaiKhoan"));
				ui.setmatKhau(rs.getString("matKhau"));

				list.add(ui);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public static void main(String[] args) {
		new UserItemDAO();
	}
}