package Uas2;
//NAMA : WENI DWI EVA YANTI

//NIM  : H1051201037

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.SwingConstants;

public class DaurUlang {

	public static JTextArea outuser;
	public JFrame frmPenjualanSampah;
	private JTextField nama;
	private JTextField alamat;
	private JComboBox jeniss;
	private JTextArea textArea;
	private JLabel hargas;
	private JTextField nohape;
	int hrg;
	int hg;
	int harga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaurUlang window = new DaurUlang();
					window.frmPenjualanSampah.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// ArrayList ini memanggil class sampah dan dalam nama variabel sampahs
	ArrayList<sampah> sampahs = new ArrayList<sampah>();

	/**
	 * Create the application.
	 */
	public DaurUlang() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPenjualanSampah = new JFrame();
		frmPenjualanSampah.setBackground(new Color(224, 255, 255));
		frmPenjualanSampah.getContentPane().setBackground(new Color(46, 139, 87));
		frmPenjualanSampah.setTitle("Penjualan Sampah Daur Ulang");
		frmPenjualanSampah.setBounds(100, 100, 700, 540);
		frmPenjualanSampah.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPenjualanSampah.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 87, 252, 403);
		panel.setBackground(new Color(189, 183, 107));
		frmPenjualanSampah.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nama");
		lblNewLabel.setBounds(10, 38, 49, 14);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));

		nama = new JTextField();
		nama.setBounds(80, 36, 144, 20);
		panel.add(nama);
		nama.setColumns(10);

		JLabel lblAlamat = new JLabel("Alamat");
		lblAlamat.setBounds(10, 77, 49, 14);
		panel.add(lblAlamat);
		lblAlamat.setFont(new Font("Tahoma", Font.PLAIN, 12));

		alamat = new JTextField();
		alamat.setBounds(80, 75, 144, 20);
		panel.add(alamat);
		alamat.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Jenis Sampah");
		lblNewLabel_1.setBounds(10, 161, 88, 14);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));

		jeniss = new JComboBox();
		jeniss.setBounds(109, 147, 116, 28);
		jeniss.setModel(new DefaultComboBoxModel(new String[] { "", "Organik", "Non Organik" }));
		jeniss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jeniss.getSelectedItem() == "Organik") {
					hg = 4000;
				}
				if (jeniss.getSelectedItem() == "Non Organik") {
					hg = 5000;
				}
			}
		});
		panel.add(jeniss);

		JLabel lblNewLabel_1_1_1 = new JLabel("Harga : Rp. ");
		lblNewLabel_1_1_1.setBounds(9, 242, 72, 20);
		panel.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JLabel lblNewLabel_1_1 = new JLabel("Berat Sampah");
		lblNewLabel_1_1.setBounds(10, 202, 88, 14);
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JSpinner berat = new JSpinner();
		berat.setBounds(103, 200, 43, 20);
		berat.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		panel.add(berat);

		JLabel lblNewLabel_2 = new JLabel("Kg");
		lblNewLabel_2.setBounds(156, 202, 49, 18);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JLabel lblNewLabel_3 = new JLabel("ISI DATA");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(96, 11, 65, 14);
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Impact", Font.PLAIN, 15));
		panel.add(lblNewLabel_3);

		JButton jual = new JButton("Jual");
		jual.setBounds(10, 340, 89, 56);
		jual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nm = nama.getText();
				String al = alamat.getText();
				String np = nohape.getText();
				String jn = jeniss.getSelectedItem().toString();
				// variabel bt merupakan object maka dari itu di ubah ke tipe data String
				String bt = berat.getValue().toString();
				// variabel value merupakan object maka dari itu di ubah ke tipe data Integer
				int value = (int) berat.getValue();
				// hg merupakan variabel harga dari jenis sampah
				harga = hg * value;
				// integer harga diubah ke tipe data string agar bisa di di input ke textArea
				String hrg = String.valueOf(harga);
				hargas.setText(hrg);

				sampah samp = (new sampah(nm, al, np, jn, bt, hrg));
				// data input (samp) dimasukkan ke arraylist sampahs
				sampahs.add(samp);

				String ht = "";

				for (int i = 0; i < sampahs.size(); i++) {
					ht = ("\n+===============================+" + "\nNama : " + sampahs.get(i).nama + "\nAlamat : "
							+ sampahs.get(i).alamat + "\nNo HP : " + sampahs.get(i).noHp + "\nJenis Sampah : "
							+ sampahs.get(i).jenis + "\nBerat Sampah : " + sampahs.get(i).berat + "Kg"
							+ "\nHarga Total : Rp. " + sampahs.get(i).harga + "\n+===============================+");
				}
				textArea.append(ht);

			}
		});
		panel.add(jual);

		JButton selesai = new JButton("Selesai");
		selesai.setBounds(154, 340, 89, 56);
		selesai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		panel.add(selesai);

		hargas = new JLabel("0");
		hargas.setBounds(79, 246, 49, 14);
		panel.add(hargas);

		JButton refresh = new JButton("Refresh");
		refresh.setBounds(154, 273, 89, 56);
		refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nama.setText("");
				alamat.setText("");
				jeniss.setSelectedItem("");
				berat.setValue(0);
				hargas.setText("");
				nohape.setText("");
			}
		});
		panel.add(refresh);

		nohape = new JTextField();
		nohape.setColumns(10);
		nohape.setBounds(80, 115, 144, 20);
		panel.add(nohape);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("No HP");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(10, 114, 49, 20);
		panel.add(lblNewLabel_1_1_1_1);
		
		JList list = new JList();
		list.setBounds(62, 310, 36, -16);
		panel.add(list);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(272, 87, 402, 403);
		frmPenjualanSampah.getContentPane().add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textArea.setEditable(false);
			}
		});
		textArea.setBackground(new Color(245, 245, 220));
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));

		outuser = new JTextArea();
		outuser.setBackground(new Color(211, 211, 211));
		outuser.setFont(new Font("Monospaced", Font.PLAIN, 18));
		outuser.setText("User Belum Login");
		outuser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				outuser.setEditable(false);
			}
		});
		outuser.setBounds(10, 11, 217, 65);
		frmPenjualanSampah.getContentPane().add(outuser);
		
		JButton kembali = new JButton("Kembali");
		kembali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login kembali = new Login();
				frmPenjualanSampah.setVisible(false);
				kembali.back.setVisible(true);
			}
		});
		kembali.setBounds(585, 11, 89, 23);
		frmPenjualanSampah.getContentPane().add(kembali);
		
				JLabel lblNewLabel_3_1 = new JLabel("BANK SAMPAH");
				lblNewLabel_3_1.setBounds(272, 24, 181, 41);
				frmPenjualanSampah.getContentPane().add(lblNewLabel_3_1);
				lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_3_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
	}
}
