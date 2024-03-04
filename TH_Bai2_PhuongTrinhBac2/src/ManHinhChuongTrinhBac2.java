import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ManHinhChuongTrinhBac2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JLabel lblx1;
	private JLabel lblx2;
	public ManHinhChuongTrinhBac2() {
		setTitle("Giải phương trình bậc 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("a:");
		lblNewLabel.setBounds(36, 51, 21, 14);
		contentPane.add(lblNewLabel);
		
		txtA = new JTextField();
		txtA.setBounds(67, 48, 160, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("b:");
		lblNewLabel_1.setBounds(36, 82, 21, 14);
		contentPane.add(lblNewLabel_1);
		
		txtB = new JTextField();
		txtB.setBounds(67, 79, 160, 20);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("c:");
		lblNewLabel_1_1.setBounds(36, 113, 21, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(67, 110, 160, 20);
		contentPane.add(txtC);
		
		JButton btnTinh =  new JButton("Tính");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					PTB2();
				}
		});
		btnTinh.setBounds(95, 148, 89, 23);
		contentPane.add(btnTinh);
		
		JLabel lblKetQua = new JLabel("Kết quả:");
        lblKetQua.setBounds(36, 182, 60, 20);
        contentPane.add(lblKetQua);
        
        lblx1 = new JLabel("x1:");
        lblx1.setBounds(36, 213, 276, 14);
        contentPane.add(lblx1);
        
        lblx2 = new JLabel("x2:");
        lblx2.setBounds(36, 238, 160, 14);
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
