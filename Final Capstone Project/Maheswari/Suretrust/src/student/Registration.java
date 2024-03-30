package student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.ImageIcon;

public class Registration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textDesignation;
	private JTextField textEmail;
	private JTextField textRegister;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\balar\\Downloads\\WhatsApp Image 2024-03-11 at 7.15.25 PM.jpeg"));
		setTitle("User Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 524);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(26, 78, 99, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Designation");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(26, 140, 160, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(26, 210, 86, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Register no");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(26, 278, 170, 22);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(26, 360, 99, 22);
		contentPane.add(lblNewLabel_4);
		
		textName = new JTextField();
		textName.setBounds(249, 78, 285, 24);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textDesignation = new JTextField();
		textDesignation.setBounds(249, 145, 285, 24);
		contentPane.add(textDesignation);
		textDesignation.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(249, 210, 285, 24);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textRegister = new JTextField();
		textRegister.setBounds(249, 278, 285, 24);
		contentPane.add(textRegister);
		textRegister.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(249, 360, 285, 24);
		contentPane.add(password);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage rf=new LoginPage();
				rf.show();
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(101, 434, 141, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setBackground(new Color(0, 0, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fname,designation,email,registerno,Password;
				fname=textName.getText();
				designation=textDesignation.getText();
				email=textEmail.getText();
				registerno=textRegister.getText();
				Password=password.getText();
				
				if(fname.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Full Name");
				}
				else if(designation.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter designation");
				}
				else if(email.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Email Address");
				}
				else if(registerno.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Mobile Number");
				}
				else if(password.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Password");
				}
				else {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suretrust","root","tiger");
					String query="insert into schoolmanagement  values(?,?,?,?,?)";
					PreparedStatement ps= con.prepareStatement(query);
					ps.setString(1, textName.getText());
					ps.setString(2, textDesignation.getText());
					ps.setString(3, textEmail.getText());
					ps.setString(4, textRegister.getText());
					ps.setString(5, password.getText());
					int i=ps.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton_1,i+"Record added successfully");
					ps.close();
					con.close();
				} catch (Exception e1) {
					
					
					
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(332, 434, 135, 31);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("USER REGISTRATION");
		lblNewLabel_5.setForeground(new Color(0, 128, 0));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(173, 20, 248, 31);
		contentPane.add(lblNewLabel_5);
	}
}
