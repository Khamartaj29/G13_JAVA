package newpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class CustomerRegister extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField UName;
	private JTextField FName;
	private JTextField MNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerRegister frame = new CustomerRegister();
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
	public CustomerRegister() {
		setTitle("Electricity Billing System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 869, 566);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(128, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		panel.setBounds(73, 29, 697, 67);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ELECTRICITY BILLING SYSTEM");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(50, 11, 526, 47);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Register");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(541, 27, 156, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("UserName");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(98, 201, 229, 50);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Full Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(98, 280, 229, 50);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_4.setBounds(98, 352, 229, 50);
		contentPane.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		passwordField.setBounds(373, 354, 364, 41);
		contentPane.add(passwordField);
		
		UName = new JTextField();
		UName.setFont(new Font("Tahoma", Font.PLAIN, 22));
		UName.setBounds(373, 207, 364, 41);
		contentPane.add(UName);
		UName.setColumns(10);
		
		FName = new JTextField();
		FName.setFont(new Font("Tahoma", Font.PLAIN, 22));
		FName.setColumns(10);
		FName.setBounds(373, 286, 364, 41);
		contentPane.add(FName);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Welcome wl=new Welcome();
				wl.show();
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnNewButton.setForeground(new Color(230, 230, 250));
		btnNewButton.setBounds(97, 442, 166, 50);
		contentPane.add(btnNewButton);
		
		final JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mnum,fname,uname,password;
				mnum=MNum.getText();
				fname=FName.getText();
				uname=UName.getText();
				password=passwordField.getText();
				
				if(mnum.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Meter No");
				}
				if(fname.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Full Name");
				}
				else if(uname.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter User Name");
				}
				else if(password.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Password");
				}
				else {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suretrust","root","root");
					String query="insert into customer values(?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1, MNum.getText());
					ps.setString(2, UName.getText());
					ps.setString(3, FName.getText());
					ps.setString(4, passwordField.getText());
					int i=ps.executeUpdate();
					JOptionPane.showMessageDialog(btnCreate,i+" User Registerd successfully, Thank You!");
					ps.close();
					con.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			}
		});
		btnCreate.setBackground(new Color(0, 128, 0));
		btnCreate.setForeground(new Color(230, 230, 250));
		btnCreate.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnCreate.setBounds(523, 438, 214, 58);
		contentPane.add(btnCreate);
		
		MNum = new JTextField();
		MNum.setFont(new Font("Tahoma", Font.PLAIN, 22));
		MNum.setColumns(10);
		MNum.setBounds(373, 138, 364, 41);
		contentPane.add(MNum);
		
		JLabel lblNewLabel_2_1 = new JLabel("Meter Number");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(98, 138, 229, 50);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MNum.setText("");
				UName.setText("");
				FName.setText("");
				passwordField.setText("");
			}
		});
		btnNewButton_1.setForeground(new Color(230, 230, 250));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton_1.setBackground(new Color(128, 0, 128));
		btnNewButton_1.setBounds(340, 443, 109, 50);
		contentPane.add(btnNewButton_1);
	}
}
