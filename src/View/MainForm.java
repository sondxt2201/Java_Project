package View;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;

import Controller.*;
import java.sql.*;

public class MainForm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
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
	public MainForm() {

		getComponents();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 827, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 811, 22);
		getContentPane().add(menuBar);

		JMenu mnNavigate = new JMenu("Navigate");
		mnNavigate.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnNavigate);

		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("Thêm khu phố" + "  " + "Alt+C");
		rdbtnmntmNewRadioItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				themKhuPhoForm KPF = new themKhuPhoForm();
				KPF.setVisible(true);
			}
		});
		rdbtnmntmNewRadioItem.setHorizontalAlignment(SwingConstants.CENTER);
		mnNavigate.add(rdbtnmntmNewRadioItem);

		JMenu mnAdmin = new JMenu("Admin");
		menuBar.add(mnAdmin);

		JRadioButtonMenuItem rdbtnmntmAdmin_1 = new JRadioButtonMenuItem("QTV_1" + "  " + "Shift+Y");
		rdbtnmntmAdmin_1.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnmntmAdmin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				QTV_1 qtv = new QTV_1();
				qtv.setVisible(true);
			}
		});
		mnAdmin.add(rdbtnmntmAdmin_1);

		JRadioButtonMenuItem rdbtnmntmAdmin_2 = new JRadioButtonMenuItem("QTV_2" + "  " + "Shift+Y");
		rdbtnmntmAdmin_2.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnmntmAdmin_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				QTV_2 qtv = new QTV_2();
				qtv.setVisible(true);
			}
		});
		mnAdmin.add(rdbtnmntmAdmin_2);

		JRadioButtonMenuItem rdbtnmntmAdmin_3 = new JRadioButtonMenuItem("QTV_3" + "  " + "Shift+Q");
		rdbtnmntmAdmin_3.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnmntmAdmin_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				QTV_3 qtv = new QTV_3();
				qtv.setVisible(true);
			}
		});
		mnAdmin.add(rdbtnmntmAdmin_3);

		JMenu mnExit = new JMenu("Exit");
		mnExit.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.add(mnExit);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 115, 788, 338);
		contentPane.add(scrollPane_1);

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Mã khu phố", "Tên khu phố" }));
		scrollPane_1.setViewportView(table);

		JRadioButtonMenuItem rdbtnmntmNewRadioItem_2 = new JRadioButtonMenuItem("Thoát" + "  " + "Shift+X");
		rdbtnmntmNewRadioItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnExit.add(rdbtnmntmNewRadioItem_2);

		JLabel lblNewLabel = new JLabel("Nhập mã khu phố để xem, sửa hoặc xoá");
		lblNewLabel.setBounds(10, 33, 242, 22);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(lblNewLabel);

		TextField textmaKhupho = new TextField();
		textmaKhupho.setBounds(276, 33, 256, 22);
		getContentPane().add(textmaKhupho);

		JButton btnsuathongtinkhupho = new JButton("Sửa");
		btnsuathongtinkhupho.setBounds(587, 33, 89, 23);
		btnsuathongtinkhupho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				suaKhuPhoForm sKPF = new suaKhuPhoForm();
				sKPF.setVisible(true);
			}
		});
		btnsuathongtinkhupho.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(btnsuathongtinkhupho);

		JButton btnxoakhupho = new JButton("Xoá");
		btnxoakhupho.setBounds(709, 33, 89, 23);
		btnxoakhupho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();

				try {
					Connection conn = DriverManager.getConnection(Connect.DB_URL, Connect.USER_NAME, Connect.PASSWORD);
					Statement stmt = conn.createStatement();
					int rows = table.getSelectedRow();
					int columns = table.getSelectedColumn();
					String id = table.getModel().getValueAt(rows, columns).toString();
					model.removeRow(table.getSelectedRow());
					stmt.executeUpdate("DELETE FROM khupho WHERE maKhuPho =" + "'" + id + "'");
				} catch (Exception ex) {
					ex.printStackTrace();
				}

				model.removeRow(table.getSelectedRow());
			}
		});
		btnxoakhupho.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(btnxoakhupho);

		JButton btnxemthongtinkhupho = new JButton("Lưu");
		btnxemthongtinkhupho.setBounds(587, 76, 89, 23);
		btnxemthongtinkhupho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					Connection conn = DriverManager.getConnection(Connect.DB_URL, Connect.USER_NAME, Connect.PASSWORD);
					Statement stmt = conn.createStatement();

					DefaultTableModel model = (DefaultTableModel) table.getModel();
					int rows = table.getSelectedRow();
					int columns = table.getSelectedColumn();
					String maKhupho = model.getValueAt(rows, columns).toString();
					String tenKhupho = model.getValueAt(rows, columns + 1).toString();
					stmt.executeUpdate("UPDATE khupho SET maKhupho= " + "'" + maKhupho + "'" + " WHERE tenKhuPho=" + "'"
							+ tenKhupho + "'");

				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnxemthongtinkhupho.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(btnxemthongtinkhupho);

		JButton btnlammoidulieu = new JButton("Làm mới");
		btnlammoidulieu.setBounds(709, 76, 89, 23);
		btnlammoidulieu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textmaKhupho.setText("");
				try {
					Connection conn = DriverManager.getConnection(Connect.DB_URL, Connect.USER_NAME, Connect.PASSWORD);
					Statement stmt = conn.createStatement();
					// get data from table
					ResultSet rs = stmt.executeQuery("select * from quanlykhupho.khupho");
					ResultSetMetaData rsmd = rs.getMetaData();
					DefaultTableModel model = (DefaultTableModel) table.getModel();

					int cols = rsmd.getColumnCount();
					String[] colname = new String[cols];
					for (int i = 0; i < cols; i++)
						colname[i] = rsmd.getColumnName(i + 1);
					model.setColumnIdentifiers(colname);
					String maKhupho, tenKhupho;
					while (rs.next()) {
						maKhupho = rs.getString(1);
						tenKhupho = rs.getString(2);
						String[] row = { maKhupho, tenKhupho };
						model.addRow(row);
					}

				} catch (Exception ex) {
					ex.printStackTrace();
				}

			}
		});
		btnlammoidulieu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(btnlammoidulieu);

		JButton btnthemKhupho = new JButton("Thêm khu phố");
		btnthemKhupho.setBounds(10, 76, 132, 23);
		btnthemKhupho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				themKhuPhoForm KPF = new themKhuPhoForm();
				KPF.setVisible(true);
			}
		});
		btnthemKhupho.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(btnthemKhupho);

	}
}
