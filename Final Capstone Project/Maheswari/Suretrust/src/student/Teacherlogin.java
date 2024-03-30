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
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Teacherlogin extends JFrame {

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
					Teacherlogin frame = new Teacherlogin();
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
	public Teacherlogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 518);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Teacher Registration");
		lblNewLabel.setForeground(new Color(0, 0, 160));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(249, 38, 263, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(91, 158, 116, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(88, 264, 233, 57);
		contentPane.add(lblNewLabel_2);
		
		textName = new JTextField();
		textName.setBounds(267, 158, 331, 42);
		contentPane.add(textName);
		textName.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(267, 276, 331, 45);
		contentPane.add(password);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fname,Password;
				fname=textName.getText();
				Password=password.getText();
				if(fname.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Full Name");
				}
				else if(Password.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter password");
				}
				else {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suretrust","root","tiger");
						String query="insert into teacherlogin  values(?,?)";
						PreparedStatement ps= con.prepareStatement(query);
						ps.setString(1, textName.getText());
						ps.setString(2, password.getText());
					int i=ps.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton,i+"Record added successfully");
					ps.close();
					con.close();
				} catch (Exception e1) {
					
					
					
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setBounds(316, 379, 196, 51);
		contentPane.add(btnNewButton);
	}
}
