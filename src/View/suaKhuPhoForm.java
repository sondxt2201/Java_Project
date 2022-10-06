package View;

import java.awt.EventQueue;
import java.awt.*;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controller.*;
import Model.*;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class suaKhuPhoForm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textmaKhupho;
	private JTextField texttenKhupho;
	private JTextField textmaHodan;
	private JTextField textsoNha;
	private JTextField textmaNguoi;
	private JTextField texthoVaten;
	private JTextField texttuoi;
	private JTextField textnamSinh;
	private JTextField textngheNghiep;
	private JTable table_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					suaKhuPhoForm frame = new suaKhuPhoForm();
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
	public suaKhuPhoForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 713);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 389, 669, 274);
		contentPane.add(scrollPane);

		JPanel panel = new JPanel();
		panel.setBounds(27, 162, 288, 216);
		panel.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(panel);
		panel.setLayout(null);

		Panel panel_1 = new Panel();
		panel_1.setBounds(367, 94, 329, 284);
		panel_1.setBackground(Color.GREEN);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		textmaKhupho = new JTextField();
		textmaKhupho.setBounds(139, 94, 164, 20);
		getContentPane().add(textmaKhupho);
		textmaKhupho.setColumns(10);

		texttenKhupho = new JTextField();
		texttenKhupho.setBounds(139, 125, 164, 20);
		texttenKhupho.setColumns(10);
		contentPane.add(texttenKhupho);

		textmaHodan = new JTextField();
		textmaHodan.setColumns(10);
		textmaHodan.setBounds(114, 15, 164, 20);
		panel.add(textmaHodan);

		textsoNha = new JTextField();
		textsoNha.setColumns(10);
		textsoNha.setBounds(114, 51, 164, 79);
		panel.add(textsoNha);

		textmaNguoi = new JTextField();
		textmaNguoi.setColumns(10);
		textmaNguoi.setBounds(155, 10, 164, 20);
		panel_1.add(textmaNguoi);

		texthoVaten = new JTextField();
		texthoVaten.setColumns(10);
		texthoVaten.setBounds(155, 48, 164, 20);
		panel_1.add(texthoVaten);

		texttuoi = new JTextField();
		texttuoi.setColumns(10);
		texttuoi.setBounds(155, 91, 164, 20);
		panel_1.add(texttuoi);

		textnamSinh = new JTextField();
		textnamSinh.setColumns(10);
		textnamSinh.setBounds(155, 134, 164, 20);
		panel_1.add(textnamSinh);

		textngheNghiep = new JTextField();
		textngheNghiep.setColumns(10);
		textngheNghiep.setBounds(155, 175, 164, 20);
		panel_1.add(textngheNghiep);

		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Mã người", "Họ và tên", "Tuổi", "Năm sinh", "Nghề nghiệp" }));
		scrollPane.setViewportView(table_3);

		JLabel lblmaKhupho = new JLabel("Mã khu phố");
		lblmaKhupho.setBounds(27, 95, 75, 17);
		lblmaKhupho.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblmaKhupho);

		JLabel lbltenKhupho = new JLabel("Tên khu phố");
		lbltenKhupho.setBounds(27, 126, 75, 17);
		lbltenKhupho.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lbltenKhupho);

		JLabel lblNewLabel_2 = new JLabel("Sửa khu phố");
		lblNewLabel_2.setBounds(254, 11, 178, 45);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_2);

		JLabel lblmaHodan = new JLabel("Mã hộ dân");
		lblmaHodan.setHorizontalAlignment(SwingConstants.LEFT);
		lblmaHodan.setBounds(10, 11, 78, 27);
		lblmaHodan.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblmaHodan);

		JLabel lblsoNha = new JLabel("Số nhà");
		lblsoNha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblsoNha.setBounds(13, 51, 75, 17);
		panel.add(lblsoNha);

		JLabel lblmaNguoi = new JLabel("Mã người");
		lblmaNguoi.setBounds(10, 11, 66, 16);
		lblmaNguoi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblmaNguoi);

		JLabel lblhoVaten = new JLabel("Họ và tên");
		lblhoVaten.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblhoVaten.setBounds(10, 49, 75, 17);
		panel_1.add(lblhoVaten);

		JLabel lbltuoi = new JLabel("Tuổi");
		lbltuoi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbltuoi.setBounds(10, 92, 75, 17);
		panel_1.add(lbltuoi);

		JLabel lblnamSinh = new JLabel("năm sinh");
		lblnamSinh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblnamSinh.setBounds(10, 135, 75, 17);
		panel_1.add(lblnamSinh);

		JLabel lblngheNghiep = new JLabel("Nghề nghiệp");
		lblngheNghiep.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblngheNghiep.setBounds(10, 176, 75, 17);
		panel_1.add(lblngheNghiep);

		JButton btnquayLaimainform = new JButton("Back");
		btnquayLaimainform.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainForm MF = new MainForm();
				MF.setVisible(true);
			}
		});
		btnquayLaimainform.setBounds(607, 25, 89, 23);
		contentPane.add(btnquayLaimainform);

		JButton btnluuSuakhupho = new JButton("Lưu");
		btnluuSuakhupho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					DefaultTableModel model = (DefaultTableModel) table_3.getModel();
					String data[] = { textmaNguoi.getText(), texthoVaten.getText(), texttuoi.getText(),
							textnamSinh.getText(), textngheNghiep.getText() };
					model.addRow(data);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				JOptionPane.showMessageDialog(rootPane, "Sửa khu phố thành công!");
			}
		});
		btnluuSuakhupho.setBounds(489, 25, 89, 23);
		contentPane.add(btnluuSuakhupho);

		JButton btnluuHodan = new JButton("Lưu");
		btnluuHodan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				HoDan hd = new HoDan();
				hd.setmaHodan(textmaHodan.getText());
				hd.setsoNha(textsoNha.getText());
				hd.setsoThanhvien(0);
				hd.setmaKhupho(textmaKhupho.getText());
				if (new HoDanDAO().addHoDan(hd)) {
					JOptionPane.showMessageDialog(rootPane, "Lưu hộ dân thành công");
				}

				KhuPho kp = new KhuPho();
				kp.setmaKhupho(textmaKhupho.getText());
				kp.settenKhupho(texttenKhupho.getText());
				new KhuPhoDAO().addKhuPho(kp);

			}
		});
		btnluuHodan.setBounds(189, 148, 89, 23);
		panel.add(btnluuHodan);

		JButton btnhoDantruoc = new JButton("Hộ dân trước");
		btnhoDantruoc.setBounds(10, 182, 130, 23);
		panel.add(btnhoDantruoc);

		JButton btnhoDansau = new JButton("Hộ dân sau");
		btnhoDansau.setBounds(148, 182, 130, 23);
		panel.add(btnhoDansau);

		JButton btnluuNguoi = new JButton("Lưu");
		btnluuNguoi.addActionListener(new ActionListener() {
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

			}
		});
		btnluuNguoi.setBounds(230, 216, 89, 23);
		panel_1.add(btnluuNguoi);

		JButton btnthanhVientruoc = new JButton("Thành viên trước");
		btnthanhVientruoc.setBounds(10, 250, 152, 23);
		panel_1.add(btnthanhVientruoc);

		JButton btnthanhViensau = new JButton("Thành viên sau");
		btnthanhViensau.setBounds(167, 250, 152, 23);
		panel_1.add(btnthanhViensau);

	}
}
