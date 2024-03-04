import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ManHinhChuongTrinhBac2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JLabel lblNewLabel_2;
	private JLabel lblx1;
	private JLabel lblx2;

	
	public ManHinhChuongTrinhBac2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("a:");
		lblNewLabel.setBounds(55, 55, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("b:");
		lblNewLabel_1.setBounds(55, 91, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("c:");
		lblNewLabel_1_1.setBounds(55, 128, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtA = new JTextField();
		txtA.setBounds(111, 52, 195, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(111, 88, 195, 20);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(111, 125, 195, 20);
		contentPane.add(txtC);
		
		JButton btnTinh = new JButton("Tính");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PTB2();
			}
		});
		btnTinh.setBounds(150, 166, 89, 29);
		contentPane.add(btnTinh);
		
		lblNewLabel_2 = new JLabel("Kết Quả:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(55, 220, 52, 29);
		contentPane.add(lblNewLabel_2);
		
		lblx1 = new JLabel("x1:");
		lblx1.setBounds(55, 260, 213, 14);
		contentPane.add(lblx1);
		
		lblx2 = new JLabel("x2:");
		lblx2.setBounds(55, 285, 46, 14);
		contentPane.add(lblx2);
	}
	private void PTB2() {
	try {
        double a = Double.parseDouble(txtA.getText());
        double b = Double.parseDouble(txtB.getText());
        double c = Double.parseDouble(txtC.getText());

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            lblx1.setText("Phương trình vô nghiệm");
            lblx2.setText("");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            lblx1.setText("Phương trình có nghiệm kép x = " + x);
            lblx2.setText("");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            lblx1.setText("x1 = " + x1);
            lblx2.setText("x2 = " + x2);
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Nhập không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
    	}
	}
}
