package Employee_Management_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login_Page extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textId;
	private JPasswordField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Page frame = new Login_Page();
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
	public Login_Page() {
		setBackground(new Color(255, 255, 255));
		setTitle("User Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login_Page.class.getResource("/Assets/Screenshot 2024-03-26 193041.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 469);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(186, 85, 211), 4));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER LOGIN");
		lblNewLabel.setForeground(new Color(153, 50, 204));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel.setBounds(228, 29, 177, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Id");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1.setBounds(65, 113, 155, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(65, 172, 155, 31);
		contentPane.add(lblNewLabel_1_1);
		
		textId = new JTextField();
		textId.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textId.setBounds(255, 116, 237, 31);
		contentPane.add(textId);
		textId.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeemanagementsystem","root","Sabiya@123");
					Statement stmt=con.createStatement();
					String sql="Select * from Registration where id='"+textId.getText()+"'and password='"+textPassword.getText().toString()+"'";
		                    ResultSet rs=stmt.executeQuery(sql);
							if(rs.next()) {
								JOptionPane.showMessageDialog(null, "Login Successful!");
								Home_Page Ip=new Home_Page();
								Ip.show();
								dispose();
							}
							else {
								JOptionPane.showMessageDialog(null, "Incorrect Employee Id or Password");
								con.close();
							}
				
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBackground(new Color(153, 50, 204));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(240, 243, 155, 36);
		contentPane.add(btnNewButton);
		
		JLabel lblIfYouDont = new JLabel("If you don't have account please Register");
		lblIfYouDont.setForeground(new Color(75, 0, 130));
		lblIfYouDont.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblIfYouDont.setBounds(21, 331, 399, 45);
		contentPane.add(lblIfYouDont);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Registration__Page Ip=new Registration__Page();
				Ip.show();
				dispose();
			}
		});
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnRegister.setBackground(new Color(60, 179, 113));
		btnRegister.setBounds(423, 334, 155, 36);
		contentPane.add(btnRegister);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(153, 50, 204));
		separator_2.setForeground(new Color(153, 50, 204));
		separator_2.setBounds(26, 302, 552, 25);
		contentPane.add(separator_2);
		
		textPassword = new JPasswordField();
		textPassword.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textPassword.setBounds(255, 172, 237, 31);
		contentPane.add(textPassword);
	}
}
