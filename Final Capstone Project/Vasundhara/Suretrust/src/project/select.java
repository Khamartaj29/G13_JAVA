package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class select extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					select frame = new select();
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
	public select() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(77, 10, 146, 23);
		contentPane.add(lblNewLabel);
		
		JLabel UserName = new JLabel("UserName");
		UserName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		UserName.setBounds(25, 85, 89, 13);
		contentPane.add(UserName);
		
		JLabel lblNewLabel_1 = new JLabel("Type of cropping");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(25, 142, 146, 13);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(231, 74, 163, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username,type ;
				
					
					username=textField.getText();
					type=textField_1.getText();
					
					
					
					 if(username.equals("")) {
						JOptionPane.showMessageDialog(null, "Please enter UserName");
					 }
						else if(type.equals("")) {
							JOptionPane.showMessageDialog(null, "Please enter Type");
					}
					else {
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =DriverManager.getConnection("jdbc:mysql://127.0.01:3306/Agriculture","root","root");
					String quary="insert into Methods values(?,?)";
					PreparedStatement ps=con.prepareStatement(quary);
					ps.setString( 1,textField.getText());
					ps.setString( 2,textField_1.getText());
					int i=ps.executeUpdate();
					JOptionPane.showConfirmDialog( btnNewButton , i + " add sussesfully  completed");
					ps.close();
					con.close();
					Quary rf=new Quary();
					rf.show();
					dispose();
					
				
			}catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
			}
		});
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(164, 216, 89, 21);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(179, 141, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
