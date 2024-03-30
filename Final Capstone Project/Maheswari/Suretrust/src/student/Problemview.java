package student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Problemview extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textName;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problemview frame = new Problemview();
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
	public Problemview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 453);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TEACHERS LOGIN");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(193, 34, 241, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(76, 135, 164, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(76, 238, 164, 45);
		contentPane.add(lblNewLabel_2);
		
		textName = new JTextField();
		textName.setBounds(265, 140, 259, 31);
		contentPane.add(textName);
		textName.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(265, 221, 259, 36);
		contentPane.add(password);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suretrust","root","tiger");
					Statement stmt=con.createStatement();
					String sql="Select * from teacherlogin where Name='"+textName.getText()+"'and password='"+password.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Login Sucessfully.....");
						Issuedata lp=new Issuedata();
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
		btnNewButton.setBackground(new Color(128, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(401, 320, 123, 45);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage rf= new HomePage();
				rf.show();
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(0, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(76, 320, 130, 45);
		contentPane.add(btnNewButton_1);
	}
}
