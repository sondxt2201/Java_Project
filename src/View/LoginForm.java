package View;

import java.sql.*;

import java.awt.EventQueue;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.*;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTaiKhoan;
	private JTextField textMatKhau;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		new JFrame();
		setBounds(100, 100, 409, 311);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Phần mềm quản lý khu phố - Tác giả: Đầu Xuân Thái Sơn");
		lblNewLabel.setBounds(0, 24, 393, 30);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Tài khoản");
		lblNewLabel_1.setBounds(37, 79, 86, 31);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Mật khẩu");
		lblNewLabel_2.setBounds(37, 121, 86, 31);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(lblNewLabel_2);

		textTaiKhoan = new JTextField();
		textTaiKhoan.setBounds(133, 85, 244, 20);
		getContentPane().add(textTaiKhoan);
		textTaiKhoan.setColumns(10);

		textMatKhau = new JTextField();
		textMatKhau.setBounds(133, 127, 244, 20);
		textMatKhau.setColumns(10);
		getContentPane().add(textMatKhau);

		JCheckBox chckbxAdmin = new JCheckBox("Quản trị viên ");
		chckbxAdmin.setBounds(74, 170, 112, 23);
		getContentPane().add(chckbxAdmin);

		JCheckBox chckbxUser = new JCheckBox("Người dùng");
		chckbxUser.setBounds(222, 170, 112, 23);
		getContentPane().add(chckbxUser);

		JButton btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (chckbxAdmin.isSelected() == true) {

					String userName = textTaiKhoan.getText();
					String passWord = textMatKhau.getText();
					try {
						Connection connection = DriverManager.getConnection(Connect.DB_URL, Connect.USER_NAME,
								Connect.PASSWORD);
						PreparedStatement st = connection.prepareStatement(
								"Select tenTaiKhoan, matKhau, vaiTro from USERITEM where tenTaiKhoan=? and matKhau=?");

						st.setString(1, userName);
						st.setString(2, passWord);
						ResultSet rs = st.executeQuery();

						if (rs.next()) {
							dispose();
							MainForm MF = new MainForm();
							MF.setVisible(true);
							JOptionPane.showMessageDialog(btnDangNhap, "Chào mừng quản trị viên!");
						} else {
							JOptionPane.showMessageDialog(btnDangNhap, "Tên tài khoản hoặc mật khẩu sai!!!");
						}
					} catch (SQLException sqlException) {
						sqlException.printStackTrace();
					}

				}
				if (chckbxUser.isSelected() == true) {
					String userName = textTaiKhoan.getText();
					String passWord = textMatKhau.getText();
					try {
						Connection connection = DriverManager.getConnection(Connect.DB_URL, Connect.USER_NAME,
								Connect.PASSWORD);
						PreparedStatement st = connection.prepareStatement(
								"Select tenTaiKhoan, matKhau, vaiTro from useritem where tenTaiKhoan=? and matKhau=?");

						st.setString(1, userName);
						st.setString(2, passWord);
						ResultSet rs = st.executeQuery();

						if (rs.next()) {
							dispose();
							MainForm MF = new MainForm();
							MF.setVisible(true);
							JOptionPane.showMessageDialog(btnDangNhap, "Chào mừng người dùng");
						} else {
							JOptionPane.showMessageDialog(btnDangNhap, "Tên tài khoản hoặc mật khẩu sai!!!");
						}
					} catch (SQLException sqlException) {
						sqlException.printStackTrace();
					}

				}
			}
		});
		btnDangNhap.setBounds(141, 214, 102, 30);
		getContentPane().add(btnDangNhap);

	}
}
