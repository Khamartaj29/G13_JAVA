package newpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Login2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField UName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login2 frame = new Login2();
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
	public Login2() {
		setTitle("Electricity Billing System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 869, 566);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(128, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		panel.setBounds(73, 29, 697, 67);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ELECTRICITY BILLING SYSTEM");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(102, 10, 526, 47);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("UserName");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(375, 177, 137, 50);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_4.setBounds(375, 258, 137, 50);
		contentPane.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		passwordField.setBounds(562, 259, 250, 50);
		contentPane.add(passwordField);
		
		UName = new JTextField();
		UName.setFont(new Font("Tahoma", Font.PLAIN, 22));
		UName.setBounds(562, 182, 250, 41);
		contentPane.add(UName);
		UName.setColumns(10);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Welcome2 lp=new Welcome2();
				lp.show();
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnNewButton.setForeground(new Color(230, 230, 250));
		btnNewButton.setBounds(73, 453, 214, 54);
		contentPane.add(btnNewButton);
		
		JButton btnCreate = new JButton("Login");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suretrust","root","root");
					Statement stmt=con.createStatement();
					String sql="Select * from Admin where UName='"+UName.getText()+"'and password='"+passwordField.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Login Sucessfully.....");
						Homepage1 lp=new Homepage1();
						lp.show();
						dispose();
					}
					else
						JOptionPane.showMessageDialog(null, "Incorrect UserName or Password......");
					con.close();
				}
				catch(Exception e1) {
					System.out.print(e1);
				}
			}
		});
		btnCreate.setBackground(new Color(0, 0, 255));
		btnCreate.setForeground(new Color(230, 230, 250));
		btnCreate.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnCreate.setBounds(578, 346, 214, 50);
		contentPane.add(btnCreate);
		
		JLabel lblNewLabel_1 = new JLabel("User Login");
		lblNewLabel_1.setBackground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(432, 106, 174, 41);
		contentPane.add(lblNewLabel_1);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Welcome lp=new Welcome();
				lp.show();
				dispose();
			}
		});
		btnSignUp.setForeground(new Color(230, 230, 250));
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnSignUp.setBackground(new Color(0, 128, 0));
		btnSignUp.setBounds(578, 455, 214, 50);
		contentPane.add(btnSignUp);
		
		JLabel lblNewLabel_3 = new JLabel("Dont have Account");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setForeground(new Color(0, 0, 255));
		lblNewLabel_3.setBounds(391, 471, 193, 26);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(23, 106, 323, 337);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBackground(new Color(255, 250, 205));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\91800\\Downloads\\th.jpeg"));
		lblNewLabel_6.setBounds(0, 0, 323, 338);
		panel_1.add(lblNewLabel_6);
	}
}

