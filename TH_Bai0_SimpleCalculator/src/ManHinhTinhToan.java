import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;

	public ManHinhTinhToan() {
		setTitle("Chương trình Tính toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất a");
		lblNewLabel.setBounds(40, 49, 99, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập số thứ nhất b");
		lblNewLabel_1.setBounds(40, 103, 99, 28);
		contentPane.add(lblNewLabel_1);
		
		txtA = new JTextField();
		txtA.setBounds(168, 53, 208, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(168, 107, 208, 20);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		JButton btnCong = new JButton("+");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý cộng ở đây
				HamXuLyCong();
			}
		});
		btnCong.setBounds(82, 152, 57, 23);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("-");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý trừ ở đây
				HamXuLyTru();
			}
		});
		btnTru.setBounds(153, 152, 57, 23);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("x");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyNhan();
			}
		});
		btnNhan.setBounds(220, 152, 57, 23);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("/");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyChia();
			}
		});
		btnChia.setBounds(287, 152, 57, 23);
		contentPane.add(btnChia);
		
		JLabel lblNewLabel_1_1 = new JLabel("Kết quả tính toán");
		lblNewLabel_1_1.setBounds(40, 202, 99, 28);
		contentPane.add(lblNewLabel_1_1);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setBounds(168, 206, 208, 20);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);
	}
	void HamXuLyCong() {
		String str_soA = txtA.getText();
        String str_soB = txtB.getText();

        double soA = Double.parseDouble(str_soA);
        double soB = Double.parseDouble(str_soB);

        double tong = soA + soB;
        txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyTru() {
		String str_soA = txtA.getText();
	    String str_soB = txtB.getText();

	    double soA = Double.parseDouble(str_soA);
	    double soB = Double.parseDouble(str_soB);

	    double hieu = soA - soB;
	    txtKetQua.setText(String.valueOf(hieu));
	}
	void HamXuLyNhan() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		
		double soA = Double.parseDouble(str_soA);
        double soB = Double.parseDouble(str_soB);
		
		double tich = soA * soB;
		txtKetQua.setText(String.valueOf(tich));
	}
	void HamXuLyChia() {
		 String str_soA = txtA.getText();
	     String str_soB = txtB.getText();

	     double soA = Double.parseDouble(str_soA);
	     double soB = Double.parseDouble(str_soB);

	     if (soB != 0) {
	         double thuong = soA / soB;
	         txtKetQua.setText(String.valueOf(thuong));
	     } else {
	         txtKetQua.setText("Không thể chia cho 0");
	     }
	}
}
