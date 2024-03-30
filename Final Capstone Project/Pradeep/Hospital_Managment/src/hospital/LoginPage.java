package hospital;

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

public class LoginPage extends JFrame {

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
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginPage.class.getResource("/Assects/Suretrust.png")));
		setTitle("SURE Trust Hospital Managment System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1012, 626);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(153, 50, 204)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Hospital Management System");
		lblNewLabel.setIcon(new ImageIcon(LoginPage.class.getResource("/Assects/Suretrust.png")));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setForeground(new Color(148, 0, 211));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(252, 33, 529, 46);
		contentPane.add(lblNewLabel);
		
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
				Registration_form rf=new Registration_form();
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
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suretrust","root","root");
					Statement stmt=con.createStatement();
					String sql="Select * from Registration where username='"+textUser.getText()+"'and password='"+textPassword.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Login Sucessfully.....");
						HomePage lp=new HomePage();
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
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(237, 193, 129, 43);
		panel.add(btnReset);
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textUser.setText(null);
				textPassword.setText(null);
			}
		});
		btnReset.setBackground(new Color(255, 0, 0));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(437, 193, 129, 43);
		panel.add(btnExit);
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame LoginPage = new JFrame("Exit");

				if (JOptionPane.showConfirmDialog(LoginPage, "Confirm if you want to exit", "Login Page",

				JOptionPane. YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {

				System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnExit.setBackground(new Color(0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(596, 28, 226, 229);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(LoginPage.class.getResource("/Assects/Log.jpeg")));
		lblNewLabel_3.setBounds(0, 0, 226, 229);
		panel_1.add(lblNewLabel_3);
	}
}
