package Uas2;
//NAMA : WENI DWI EVA YANTI

//NIM  : H1051201037

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Login {

	public JFrame back;
	public static JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.back.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	DaurUlang main = new DaurUlang();
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		back = new JFrame();
		back.getContentPane().setForeground(new Color(135, 206, 250));
		back.setBounds(100, 100, 632, 477);
		back.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		back.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(119, 136, 153));
		panel_1.setForeground(new Color(250, 250, 210));
		panel_1.setBounds(0, 0, 618, 440);
		back.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 216, 230));
		panel.setBounds(134, 147, 350, 246);
		panel_1.add(panel);
		panel.setForeground(new Color(30, 144, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		panel.setLayout(null);
		
		user = new JTextField();
		user.setBounds(100, 63, 240, 31);
		panel.add(user);
		user.setColumns(10);
		
		JLabel notif = new JLabel("");
		notif.setBounds(10, 105, 261, 14);
		panel.add(notif);
		
		pass = new JPasswordField();
		pass.setColumns(10);
		pass.setBounds(100, 108, 240, 31);
		panel.add(pass);
		
		JButton userin = new JButton("Login");
		userin.setFont(new Font("Tahoma", Font.BOLD, 11));
		userin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				notif.setText("Login Berhasil, Selamat Datang "+user.getText());
				main.frmPenjualanSampah.setVisible(true);
				main.outuser.setText("Selamat Datang \n"+user.getText());
			}
		});
		userin.setBounds(64, 190, 89, 33);
		panel.add(userin);	
		
		JLabel lblSilakanLogin = new JLabel("Silakan Login");
		lblSilakanLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSilakanLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblSilakanLogin.setBounds(43, 18, 261, 34);
		panel.add(lblSilakanLogin);
		
		JButton btnKeluar = new JButton("Keluar");
		btnKeluar.setForeground(new Color(0, 0, 0));
		btnKeluar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnKeluar.setBounds(207, 189, 97, 35);
		panel.add(btnKeluar);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 66, 80, 23);
		panel.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword.setBounds(10, 116, 80, 23);
		panel.add(lblPassword);
		
		JLabel lblNewLabel_1 = new JLabel("BANK SAMPAH");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 28));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(173, 11, 258, 62);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Penjualan Daur Ulang Sampah");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(173, 68, 258, 37);
		panel_1.add(lblNewLabel_1_1);
		btnKeluar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
	}
}
