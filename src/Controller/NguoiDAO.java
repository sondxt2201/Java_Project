package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.Statement;

import java.util.ArrayList;

import Model.*;

import java.sql.*;

public class NguoiDAO extends Connect {
	// public static void main(String args[]) {
	// try {
	// // connnect to database
	// Connection conn = DriverManager.getConnection(Connect.DB_URL,
	// Connect.USER_NAME, Connect.PASSWORD);
	// // crate statement
	// Statement stmt = conn.createStatement();
	// // get data from table
	// ResultSet rs = stmt.executeQuery("select * from quanlykhupho.nguoi");
	// // show data
	// while (rs.next()) {
	// System.out.println(rs.getString(1) + " " + rs.getString(2) + " " +
	// rs.getInt(3) + " " + rs.getInt(4)
	// + " " + rs.getString(5) + " " + rs.getString(6));
	// }
	// // close connection
	// conn.close();
	// } catch (Exception ex) {
	// ex.printStackTrace();
	// }
	// }

	private Connection conn;

	public NguoiDAO() {
		try {
			conn = DriverManager.getConnection(Connect.DB_URL, Connect.USER_NAME, Connect.PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean addNguoi(Nguoi ng) {

		String sql = "INSERT INTO NGUOI(maNguoi, hoVaten, tuoi, namSinh, ngheNghiep, maHodan) " + "VALUES(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, ng.getmaNguoi());
			ps.setString(2, ng.gethoVaten());
			ps.setInt(3, ng.gettuoi());
			ps.setInt(4, ng.getnamSinh());
			ps.setString(5, ng.getngheNghiep());
			ps.setString(6, ng.getmaHodan());

			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public ArrayList<Nguoi> getListNguoi() {
		ArrayList<Nguoi> list = new ArrayList<>();
		String sql = "SELECT * FROM NGUOI";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Nguoi ng = new Nguoi();
				ng.setmaNguoi(rs.getString("maNguoi"));
				ng.sethoVaten(rs.getString("hoVaten"));
				ng.settuoi(rs.getInt("tuoi"));
				ng.setnamSinh(rs.getInt("namSinh"));
				ng.setngheNghiep(rs.getString("ngheNghiep"));
				ng.setmaHodan(rs.getString("maHodan"));

				list.add(ng);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public static void main(String[] args) {
		new NguoiDAO();
	}
}