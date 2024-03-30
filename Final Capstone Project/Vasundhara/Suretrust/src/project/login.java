package project;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;

public class login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textUser;
	private JPasswordField textPassword;
	protected Component frmLoginSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\appra\\Pictures\\Project assects\\Suretrust.png"));
		setTitle("SURE Trust Agriculture Managment System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1012, 626);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(153, 50, 204)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel login = new JLabel("login");
		login.setIcon(new ImageIcon("C:\\Users\\appra\\Pictures\\Project assects\\Suretrust.png"));
		login.setBackground(new Color(240, 240, 240));
		login.setForeground(new Color(148, 0, 211));
		login.setFont(new Font("Times New Roman", Font.BOLD, 35));
		login.setBounds(252, 33, 529, 46);
		contentPane.add(login);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(61, 439, 925, 11);
		contentPane.add(separator);
		
		JLabel lblIfDontHave = new JLabel("If Don't have account please Register ");
		lblIfDontHave.setForeground(new Color(0, 0, 139));
		lblIfDontHave.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 30));
		lblIfDontHave.setBounds(145, 488, 437, 38);
		contentPane.add(lblIfDontHave);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setForeground(new Color(255, 255, 255));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register rf=new Register();
				rf.show();
				dispose();
			}
		});
		btnRegister.setBackground(new Color(0, 128, 0));
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnRegister.setBounds(640, 484, 160, 46);
		contentPane.add(btnRegister);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "User Login", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 0)));
		panel.setBounds(61, 111, 887, 280);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("UserName  :");
		lblNewLabel_1.setBounds(44, 47, 152, 31);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		textUser = new JTextField();
		textUser.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textUser.setBounds(266, 44, 300, 38);
		panel.add(textUser);
		textUser.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password   :");
		lblNewLabel_2.setBounds(44, 107, 171, 25);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		textPassword = new JPasswordField();
		textPassword.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textPassword.setBounds(266, 101, 300, 38);
		panel.add(textPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(44, 192, 139, 45);
		panel.add(btnLogin);
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Agriculture","root","root");
					Statement stmt=con.createStatement();
					String sql="Select * from Agriculture.Register where UserName='"+textUser.getText()+"'and Password='"+textPassword.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Login Sucessfully.....");
						Methods lp =new Methods();
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
		btnLogin.setBackground(new Color(30, 144, 255));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 25));
	}
}