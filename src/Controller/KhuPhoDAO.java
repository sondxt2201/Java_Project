package Controller;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;

import java.sql.*;
import java.util.ArrayList;

import Model.*;

public class KhuPhoDAO extends Connect {
	// public static void main(String args[]) {
	// try {
	// // connnect to database
	// Connection conn = DriverManager.getConnection(Connect.DB_URL,
	// Connect.USER_NAME, Connect.PASSWORD);
	// // crate statement
	// Statement stmt = conn.createStatement();
	// // get data from table
	// ResultSet rs = stmt.executeQuery("select * from quanlykhupho.hodan");
	// // show data
	// while (rs.next()) {
	// System.out.println(rs.getString(1) + " " + rs.getString(2));
	// }
	// // close connection
	// conn.close();
	// } catch (Exception ex) {
	// ex.printStackTrace();
	// }
	// }

	private Connection conn;

	public KhuPhoDAO() {
		try {
			conn = DriverManager.getConnection(Connect.DB_URL, Connect.USER_NAME, Connect.PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean addKhuPho(KhuPho kp) {

		String sql = "INSERT INTO KHUPHO(maKhuPho, tenKhuPho) VALUES(?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, kp.getmaKhupho());
			ps.setString(2, kp.gettenKhupho());

			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public ArrayList<KhuPho> getListKhuPho() {
		ArrayList<KhuPho> list = new ArrayList<>();
		String sql = "SELECT * FROM KHUPHO";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				KhuPho kp = new KhuPho();
				kp.setmaNguoi(rs.getString(1));
				kp.sethoVaten(rs.getString(2));

				list.add(kp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public static void main(String[] args) {
		new KhuPhoDAO();
	}
}