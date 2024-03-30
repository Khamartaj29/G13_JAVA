package newpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PayBill extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayBill frame = new PayBill();
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
	public PayBill() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 649);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pay Bill");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(307, 26, 87, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Meter Number");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBackground(SystemColor.info);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(34, 113, 117, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBackground(SystemColor.info);
		lblNewLabel_1_1.setBounds(34, 177, 117, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Month");
		lblNewLabel_1_1_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBackground(SystemColor.info);
		lblNewLabel_1_1_1.setBounds(34, 248, 117, 30);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Units");
		lblNewLabel_1_1_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_2.setBackground(SystemColor.info);
		lblNewLabel_1_1_2.setBounds(34, 310, 117, 30);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Total Bill");
		lblNewLabel_1_1_2_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_2_1.setBackground(SystemColor.info);
		lblNewLabel_1_1_2_1.setBounds(34, 375, 117, 30);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		textField = new JTextField();
		textField.setBounds(259, 116, 161, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(259, 180, 161, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(259, 310, 161, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(259, 378, 161, 30);
		contentPane.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 0, 255));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox.setBounds(259, 248, 160, 30);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\91800\\Downloads\\bill (1).png"));
		lblNewLabel_2.setBounds(307, 208, 451, 268);
		contentPane.add(lblNewLabel_2);
		
		JButton btnPay = new JButton("PAY");
		btnPay.setForeground(new Color(0, 0, 205));
		btnPay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPay.setBounds(47, 471, 117, 30);
		contentPane.add(btnPay);
		
		JButton btnBack_1 = new JButton("BACK");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage2 rf=new Homepage2();
				rf.show();
				dispose();
			}
		});
		btnBack_1.setForeground(new Color(0, 0, 205));
		btnBack_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack_1.setBounds(259, 471, 117, 30);
		contentPane.add(btnBack_1);
	}
}
