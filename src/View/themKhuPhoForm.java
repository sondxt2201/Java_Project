package View;

import java.awt.EventQueue;
import java.awt.*;

import javax.swing.border.EmptyBorder;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import Controller.*;
import Model.*;

public class themKhuPhoForm extends JFrame {

	private static final long serialVersionUID = 4242703936116995673L;
	private JPanel contentPane;
	private JTextField textmaNguoi;
	private JTextField texthoVaten;
	private JTextField texttuoi;
	private JTextField textnamSinh;
	private JTextField textngheNghiep;
	private JTextField textmaKhupho;
	private JTextField texttenKhupho;
	private JTextField textmaHodan;
	private JTextField textsoNha;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					themKhuPhoForm frame = new themKhuPhoForm();
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
	public themKhuPhoForm() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 593);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 10, 395, 536);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(415, 10, 364, 536);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblmaKhupho = new JLabel("Mã khu phố");
		lblmaKhupho.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblmaKhupho.setBounds(22, 11, 111, 25);
		panel.add(lblmaKhupho);

		JLabel lbltenKhupho = new JLabel("Tên khu phố");
		lbltenKhupho.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbltenKhupho.setBounds(22, 47, 124, 25);
		panel.add(lbltenKhupho);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 78, 375, 396);
		panel.add(panel_2);
		panel_2.setBackground(Color.GREEN);
		panel_2.setLayout(null);

		JLabel lblmaHodan = new JLabel("Mã hộ dân");
		lblmaHodan.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblmaHodan.setBounds(20, 11, 111, 25);
		panel_2.add(lblmaHodan);

		JLabel lblsoNha = new JLabel("Số nhà");
		lblsoNha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblsoNha.setBounds(20, 47, 111, 25);
		panel_2.add(lblsoNha);

		Panel panel_1_1 = new Panel();
		panel_1_1.setBackground(Color.CYAN);
		panel_1_1.setBounds(20, 78, 345, 269);
		panel_2.add(panel_1_1);
		panel_1_1.setLayout(null);

		JLabel lblmaNguoi = new JLabel("Mã người");
		lblmaNguoi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblmaNguoi.setBounds(10, 11, 66, 16);
		panel_1_1.add(lblmaNguoi);

		JLabel lblhoVaten = new JLabel("Họ và tên");
		lblhoVaten.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblhoVaten.setBounds(10, 49, 75, 17);
		panel_1_1.add(lblhoVaten);

		JLabel lbltuoi = new JLabel("Tuổi");
		lbltuoi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbltuoi.setBounds(10, 92, 75, 17);
		panel_1_1.add(lbltuoi);

		JLabel lblnamSinh = new JLabel("năm sinh");
		lblnamSinh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblnamSinh.setBounds(10, 135, 75, 17);
		panel_1_1.add(lblnamSinh);

		JLabel lbngheNghiep = new JLabel("Nghề nghiệp");
		lbngheNghiep.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbngheNghiep.setBounds(10, 182, 75, 17);
		panel_1_1.add(lbngheNghiep);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 36, 364, 163);
		panel_1.add(scrollPane);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 199, 364, 163);
		panel_1.add(scrollPane_1);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 362, 364, 163);
		panel_1.add(scrollPane_2);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Mã người", "Họ và tên", "Tuổi", "Năm sinh", "Nghề nghiệp" }));
		scrollPane.setViewportView(table);

		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Mã khu phố", "Tên khu phố" }));
		scrollPane_1.setViewportView(table_1);

		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Mã hộ dân", "Số nhà" }));
		scrollPane_2.setViewportView(table_2);

		JLabel lblthongTinvuanhap = new JLabel("Thông tin vừa nhập");
		lblthongTinvuanhap.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblthongTinvuanhap.setBounds(0, 0, 143, 25);
		panel_1.add(lblthongTinvuanhap);

		textmaNguoi = new JTextField();
		textmaNguoi.setColumns(10);
		textmaNguoi.setBounds(155, 10, 164, 20);
		panel_1_1.add(textmaNguoi);

		texthoVaten = new JTextField();
		texthoVaten.setColumns(10);
		texthoVaten.setBounds(155, 48, 164, 20);
		panel_1_1.add(texthoVaten);

		texttuoi = new JTextField();
		texttuoi.setColumns(10);
		texttuoi.setBounds(155, 91, 164, 20);
		panel_1_1.add(texttuoi);

		textnamSinh = new JTextField();
		textnamSinh.setColumns(10);
		textnamSinh.setBounds(155, 134, 164, 20);
		panel_1_1.add(textnamSinh);

		textngheNghiep = new JTextField();
		textngheNghiep.setColumns(10);
		textngheNghiep.setBounds(155, 181, 164, 20);
		panel_1_1.add(textngheNghiep);

		textmaHodan = new JTextField();
		textmaHodan.setColumns(10);
		textmaHodan.setBounds(173, 11, 164, 20);
		panel_2.add(textmaHodan);

		textsoNha = new JTextField();
		textsoNha.setColumns(10);
		textsoNha.setBounds(173, 47, 166, 20);
		panel_2.add(textsoNha);

		textmaKhupho = new JTextField();
		textmaKhupho.setColumns(10);
		textmaKhupho.setBounds(183, 11, 164, 20);
		panel.add(textmaKhupho);

		texttenKhupho = new JTextField();
		texttenKhupho.setColumns(10);
		texttenKhupho.setBounds(183, 47, 164, 20);
		panel.add(texttenKhupho);

		JButton btnnhapHodan = new JButton("Tiếp tục nhập hộ dân");
		btnnhapHodan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				HoDan hd = new HoDan();
				hd.setmaHodan(textmaHodan.getText());
				hd.setsoNha(textsoNha.getText());
				hd.setsoThanhvien(0);
				hd.setmaKhupho(textmaKhupho.getText());

				if (new HoDanDAO().addHoDan(hd)) {
					JOptionPane.showMessageDialog(rootPane, "Thêm hộ dân thành công!!");
				}

				DefaultTableModel model_2 = (DefaultTableModel) table_2.getModel();
				String[] row2 = { textmaHodan.getText(), textsoNha.getText() };
				model_2.addRow(row2);

				KhuPho kp = new KhuPho();
				kp.setmaKhupho(textmaKhupho.getText());
				kp.settenKhupho(texttenKhupho.getText());
				new KhuPhoDAO().addKhuPho(kp);

			}
		});
		btnnhapHodan.setBounds(159, 353, 180, 23);
		panel_2.add(btnnhapHodan);

		JButton btnnhapThanhvien = new JButton("Tiếp tục nhập thành viên");
		btnnhapThanhvien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Nguoi ng = new Nguoi();
				ng.setmaNguoi(textmaNguoi.getText());
				ng.sethoVaten(texthoVaten.getText());
				ng.settuoi(Integer.parseInt(texttuoi.getText()));
				ng.setnamSinh(Integer.parseInt(textnamSinh.getText()));
				ng.setngheNghiep(textngheNghiep.getText());
				ng.setmaHodan(textmaHodan.getText());

				HoDan hd = new HoDan();
				hd.setmaHodan(textmaHodan.getText());
				new HoDanDAO().addHoDan(hd);

				KhuPho kp = new KhuPho();
				kp.setmaKhupho(textmaKhupho.getText());
				kp.settenKhupho(texttenKhupho.getText());
				new KhuPhoDAO().addKhuPho(kp);

				if (new NguoiDAO().addNguoi(ng)) {
					JOptionPane.showMessageDialog(rootPane, "Thêm thành viên thành công!");
				} else {
					JOptionPane.showMessageDialog(rootPane, "Mã người bị trùng!!!");
				}
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				String data[] = { textmaNguoi.getText(), texthoVaten.getText(), texttuoi.getText(),
						textnamSinh.getText(), textngheNghiep.getText(), textmaHodan.getText() };
				model.addRow(data);

			}
		});
		btnnhapThanhvien.setBounds(139, 235, 180, 23);
		panel_1_1.add(btnnhapThanhvien);

		JButton btnhoanThanh = new JButton("Hoàn thành");
		btnhoanThanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					DefaultTableModel model_1 = (DefaultTableModel) table_1.getModel();
					String[] row1 = { textmaKhupho.getText(), texttenKhupho.getText() };
					model_1.addRow(row1);

				} catch (Exception ex) {
					ex.printStackTrace();
				}

			}
		});
		btnhoanThanh.setBounds(10, 502, 164, 23);
		panel.add(btnhoanThanh);

		JButton btnthoat = new JButton("Thoát");
		btnthoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainForm MF = new MainForm();
				MF.setVisible(true);
			}
		});
		btnthoat.setBounds(221, 502, 164, 23);
		panel.add(btnthoat);

	}
}
