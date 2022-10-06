package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QTV_1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QTV_1 frame = new QTV_1();
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
	public QTV_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Đầu Xuân Thái Sơn");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 44, 264, 109);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Sinh viên");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(26, 123, 87, 30);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Công việc: Xây dựng chức năng đăng nhập, sửa khu phố, thêm khu phố");
		lblNewLabel_2.setBounds(20, 164, 390, 64);
		contentPane.add(lblNewLabel_2);

		JButton btnNewButton = new JButton("Thoát");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainForm MF = new MainForm();
				MF.setVisible(true);
			}
		});
		btnNewButton.setBounds(321, 95, 89, 23);
		contentPane.add(btnNewButton);
	}
}
