package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Quary extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton Submit;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quary frame = new Quary();
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
	public Quary() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 333);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 160, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter your Quary");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(106, 10, 239, 29);
		contentPane.add(lblNewLabel);
		
		Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username,quary ;
				
				
				username=textField.getText();
				quary=textField_1.getText();
				
				
				
				 if(username.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter UserName");
				 }
					else if(quary.equals("")) {
						JOptionPane.showMessageDialog(null, "Please enter Quary");
				}
					else {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =DriverManager.getConnection("jdbc:mysql://127.0.01:3306/Agriculture","root","root");
					String quary1="insert into Quary values(?,?)";
					PreparedStatement ps=con.prepareStatement(quary1);
					ps.setString( 1,textField.getText());
					ps.setString( 2,textField_1.getText());
					int i=ps.executeUpdate();
					JOptionPane.showConfirmDialog( Submit , i + " add sussesfully  completed");
					ps.close();
					con.close();
					contract rf=new contract();
					rf.show();
					dispose();
					
			

				}catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
			}

				
			
				
			
		});
		Submit.setForeground(new Color(0, 255, 0));
		Submit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Submit.setBounds(195, 265, 150, 21);
		contentPane.add(Submit);
		
		JLabel UserName = new JLabel("UserName");
		UserName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		UserName.setForeground(new Color(148, 0, 211));
		UserName.setBounds(22, 73, 159, 29);
		contentPane.add(UserName);
		
		textField = new JTextField();
		textField.setBounds(270, 73, 315, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel Quary = new JLabel("Quary");
		Quary.setForeground(new Color(138, 43, 226));
		Quary.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Quary.setBounds(22, 140, 95, 21);
		contentPane.add(Quary);
		
		textField_1 = new JTextField();
		textField_1.setBounds(274, 141, 311, 88);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}

	protected static String getText() {
		// TODO Auto-generated method stub
		return null;
	}
}
