package suretrust;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Registration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField email;
	private JPasswordField passwordField;

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
		setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		setTitle("Registration");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\skiller\\project1\\images.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 998, 503);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel Username = new JLabel("Username");
		Username.setForeground(new Color(255, 255, 255));
		Username.setBackground(new Color(255, 255, 255));
		Username.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Username.setBounds(195, 105, 100, 40);
		
		contentPane.add(Username);
		
		JLabel Password = new JLabel("Password");
		Password.setForeground(new Color(255, 255, 255));
		Password.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Password.setBounds(195, 265, 85, 32);
		contentPane.add(Password);
		
		JLabel Email = new JLabel("Email");
		Email.setForeground(new Color(255, 255, 255));
		Email.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Email.setBounds(195, 190, 85, 32);
		contentPane.add(Email);
		
		username = new JTextField();
		username.setFont(new Font("Times New Roman", Font.BOLD, 16));
		username.setBounds(343, 105, 631, 32);
		contentPane.add(username);
		username.setColumns(10);
		
		
		email = new JTextField();
		email.setFont(new Font("Times New Roman", Font.BOLD, 16));
		email.setBounds(343, 190, 631, 32);
		contentPane.add(email);
		email.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(343, 269, 631, 30);
		contentPane.add(passwordField);
		
		JButton Submit = new JButton("Registration");
		Submit.addActionListener(new ActionListener() {
			@SuppressWarnings("unlikely-arg-type")
			public void actionPerformed(ActionEvent e) {
				home rf=new home();
				rf.show();
				
				
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
					String quary="insert into register values(?,?,?)";
					PreparedStatement ps=con.prepareStatement(quary);
					
					
					ps.setString(1,username.getText());
					
					
					ps.setString(2,email.getText());
			
					ps.setString(3,passwordField.getText() );
					

					
					ps.executeUpdate();
					int i=ps.executeUpdate();
					JOptionPane.showConfirmDialog(Submit, i + " add sussesfully registration completed");
					
					
					ps.close();
					con.close();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}}
			
			
		});
		Submit.setBackground(new Color(192, 192, 192));
		Submit.setForeground(new Color(0, 0, 0));
		Submit.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Submit.setBounds(222, 347, 147, 32);
		contentPane.add(Submit);
	}
}
