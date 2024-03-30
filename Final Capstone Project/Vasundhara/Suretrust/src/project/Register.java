package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField FirstName;
	private JTextField LastName;
	private JTextField EmailId;
	private JTextField AadharNo;
	private JTextField MobileNO;
	private JTextField Address;
	private JTextField Postal;
	private JPasswordField Password;
	private JTextField UserName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		getContentPane().setBackground(new Color(0, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 520);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 41, 97, 13);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(423, 25, 78, 23);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email Id");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 93, 78, 13);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Pass Word");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(423, 93, 92, 13);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Aadhar NO");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_5.setBounds(10, 167, 97, 13);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Mobile NO");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(423, 167, 78, 13);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_7.setBounds(10, 243, 78, 13);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Postal pin");
		lblNewLabel_8.setBackground(new Color(204, 0, 153));
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(418, 225, 97, 14);
		getContentPane().add(lblNewLabel_8);
		
		FirstName = new JTextField();
		FirstName.setBounds(123, 39, 181, 19);
		getContentPane().add(FirstName);
		FirstName.setColumns(10);
		
		LastName = new JTextField();
		LastName.setBounds(562, 28, 181, 19);
		getContentPane().add(LastName);
		LastName.setColumns(10);
		
		EmailId = new JTextField();
		EmailId.setBounds(123, 93, 181, 33);
		getContentPane().add(EmailId);
		EmailId.setColumns(10);
		
		AadharNo = new JTextField();
		AadharNo.setBounds(123, 151, 181, 47);
		getContentPane().add(AadharNo);
		AadharNo.setColumns(10);
		
		MobileNO = new JTextField();
		MobileNO.setBounds(562, 131, 181, 23);
		getContentPane().add(MobileNO);
		MobileNO.setColumns(10);
		
		Address = new JTextField();
		Address.setBounds(123, 222, 181, 58);
		getContentPane().add(Address);
		Address.setColumns(10);
		
		Postal = new JTextField();
		Postal.setBounds(562, 222, 181, 23);
		getContentPane().add(Postal);
		Postal.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("IF U NEED TO LOGIN  HERE");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setBounds(198, 380, 490, 23);
		getContentPane().add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setForeground(new Color(0, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String fname,Lname,email,AdNo,Mobile,Add,post,password,username;
			fname=FirstName.getText();
				Lname=LastName.getText();
				email=EmailId.getText();
				AdNo=AadharNo.getText();
				Mobile=MobileNO.getText();
				Add=Address.getText();
				post=Postal.getText();
				password=Password.getText();
				username=UserName.getText();
				
				
				if(fname.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Full Name");
				}
				else if(Lname.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Last Name");
				}
				else if(email.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Email Address");
				}
				else if(AdNo.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter AdNo Number");
				}
				else if(Mobile.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter MobileNo");
				}
				else if(Add.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Address");
				}
				else if(post.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Postal");
				}
				else if(password.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Password");
				}
				else if(username.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter UserName");
				}
				else {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =DriverManager.getConnection("jdbc:mysql://127.0.01:3306/Agriculture","root","root");
					String quary="insert into Register values(?,?,?,?,?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(quary);
					ps.setString( 1,FirstName.getText());
					ps.setString( 2,LastName.getText());

					ps.setString( 3,EmailId.getText());
					ps.setString( 4,Password.getText());
					ps.setString( 5,AadharNo.getText());
					ps.setString( 6,MobileNO.getText());


					ps.setString( 7,Address.getText());
					ps.setString( 8,Postal.getText());
					ps.setString( 9,UserName.getText());
					
					
				
					int i=ps.executeUpdate();
					JOptionPane.showConfirmDialog( btnNewButton , i + " add sussesfully registration completed");
					ps.close();
					con.close();
				}catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
			
			}	
		});
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(50, 338, 85, 21);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstName.setText("");
				LastName.setText("");
				EmailId.setText("");
				Password.setText("");
				AadharNo.setText("");
				MobileNO.setText("");
					Address.setText("");

					Postal.setText("");
					
				}
			
			
		});
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1.setBounds(391, 318, 85, 21);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Close");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrontPage rf=new FrontPage();
				rf.show();
				dispose();
			}
		});
		btnNewButton_2.setForeground(new Color(128, 0, 128));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_2.setBounds(635, 318, 85, 21);
		getContentPane().add(btnNewButton_2);
		
		Password = new JPasswordField();
		Password.setBounds(562, 86, 181, 20);
		getContentPane().add(Password);
		
		JButton btnNewButton_3 = new JButton("Login");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login rf=new login();
				rf.show();
				dispose();
				
				
			}
		});
		btnNewButton_3.setBackground(new Color(30, 144, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(270, 413, 85, 21);
		getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_10 = new JLabel("UserName");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_10.setBounds(418, 267, 83, 23);
		getContentPane().add(lblNewLabel_10);
		
		UserName = new JTextField();
		UserName.setBounds(562, 270, 181, 19);
		getContentPane().add(UserName);
		UserName.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("Registration form");
		setJMenuBar(menuBar);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setForeground(new Color(255, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		menuBar.add(lblNewLabel);
	}
}