package student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textEmail;
	private JPasswordField password;

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
		getContentPane().setBackground(new Color(255, 128, 192));
		setTitle("LoginPage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 386);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(171, 26, 146, 37);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(69, 120, 135, 25);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(69, 194, 135, 25);
		getContentPane().add(lblNewLabel_2);
		
		textEmail = new JTextField();
		textEmail.setBounds(214, 120, 223, 25);
		getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(214, 197, 223, 25);
		getContentPane().add(password);
		
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textEmail.setText(null);
				password.setText(null);
			}
		});
		btnReset.setBackground(new Color(0, 255, 255));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBounds(171, 303, 117, 21);
		getContentPane().add(btnReset);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  System.exit(0);
			  
			}
		});
		btnNewButton_2.setBackground(new Color(255, 255, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(369, 303, 85, 21);
		getContentPane().add(btnNewButton_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(50, 261, 423, 2);
		getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(50, 73, 423, 2);
		getContentPane().add(separator_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(0, 0, 255));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suretrust","root","tiger");
					Statement stmt=con.createStatement();
					String sql="Select * from schoolmanagement where Email='"+textEmail.getText()+"'and password='"+password.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Login Sucessfully.....");
						HomePage lp=new HomePage();
						lp.show();
						dispose();
					}
					else
						JOptionPane.showMessageDialog(null, "Incorrect Email or Password......");
					con.close();
				}
				catch(Exception e1) {
					System.out.print(e1);
				}
			
			}
		});
		btnLogin.setBounds(39, 302, 96, 25);
		getContentPane().add(btnLogin);
	}
}
