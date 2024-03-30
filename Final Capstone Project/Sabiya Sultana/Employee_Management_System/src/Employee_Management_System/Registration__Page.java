package Employee_Management_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Registration__Page extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textId;
	private JTextField textMobile;
	private JPasswordField textPassword;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textAddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration__Page frame = new Registration__Page();
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
	public Registration__Page() {
		setBackground(new Color(255, 255, 255));
		setTitle("Registration Form");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Registration__Page.class.getResource("/Assets/Screenshot 2024-03-16 225405.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 727);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setBorder(new LineBorder(new Color(34, 139, 34), 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER REGISTRATION");
		lblNewLabel.setBounds(136, 32, 429, 52);
		contentPane.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Employee Registration", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(60, 179, 113)));
		panel.setBackground(new Color(255, 255, 224));
		panel.setBounds(24, 103, 555, 497);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name  ");
		lblNewLabel_1.setBounds(22, 32, 212, 33);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		
		JLabel lblNewLabel_1_1 = new JLabel("Employee Id        ");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(22, 89, 212, 33);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mobile Number    ");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_1_1.setBounds(22, 153, 212, 33);
		panel.add(lblNewLabel_1_1_1);
		
		textName = new JTextField();
		textName.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textName.setBounds(220, 32, 298, 33);
		panel.add(textName);
		textName.setColumns(10);
		
		textId = new JTextField();
		textId.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textId.setColumns(10);
		textId.setBounds(220, 89, 298, 33);
		panel.add(textId);
		
		textMobile = new JTextField();
		textMobile.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textMobile.setColumns(10);
		textMobile.setBounds(220, 153, 298, 33);
		panel.add(textMobile);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Password");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_1_1_1.setBounds(22, 216, 212, 33);
		panel.add(lblNewLabel_1_1_1_1);
		
		textPassword = new JPasswordField();
		textPassword.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textPassword.setBounds(220, 216, 298, 33);
		panel.add(textPassword);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Gender");
		lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_1_1_1_1.setBounds(22, 286, 212, 24);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		JRadioButton rbMale = new JRadioButton("Male");
		buttonGroup.add(rbMale);
		rbMale.setBackground(UIManager.getColor("CheckBox.light"));
		rbMale.setFont(new Font("Times New Roman", Font.BOLD, 22));
		rbMale.setBounds(220, 286, 125, 24);
		panel.add(rbMale);
		
		JRadioButton rbFemale = new JRadioButton("Female");
		buttonGroup.add(rbFemale);
		rbFemale.setBackground(UIManager.getColor("CheckBox.light"));
		rbFemale.setFont(new Font("Times New Roman", Font.BOLD, 22));
		rbFemale.setBounds(393, 286, 125, 24);
		panel.add(rbFemale);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Do you have a car?");
		lblNewLabel_1_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_1_1_1_1_1.setBounds(22, 355, 212, 24);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JRadioButton rbYes = new JRadioButton("Yes");
		buttonGroup_1.add(rbYes);
		rbYes.setFont(new Font("Times New Roman", Font.BOLD, 22));
		rbYes.setBackground(UIManager.getColor("CheckBox.light"));
		rbYes.setBounds(220, 355, 125, 24);
		panel.add(rbYes);
		
		JRadioButton rbNo = new JRadioButton("No");
		buttonGroup_1.add(rbNo);
		rbNo.setFont(new Font("Times New Roman", Font.BOLD, 22));
		rbNo.setBackground(UIManager.getColor("CheckBox.light"));
		rbNo.setBounds(393, 355, 125, 24);
		panel.add(rbNo);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Address");
		lblNewLabel_1_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_1_1_1_2.setBounds(22, 422, 212, 54);
		panel.add(lblNewLabel_1_1_1_1_2);
		
		textAddress = new JTextField();
		textAddress.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textAddress.setColumns(10);
		textAddress.setBounds(220, 422, 298, 54);
		panel.add(textAddress);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name,id,mobile,password,address;
				name=textName.getText();
				id=textId.getText();
				mobile=textMobile.getText();
				password=textPassword.getText();
				address=textAddress.getText();
				
				if(name.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Employee Name");
				}
				else if(id.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Employee Id");
				}
				else if(mobile.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Mobile Number");
				}
				else if(password.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Password");
				}
				else if(address.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Address");
				}
				else {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeemanagementsystem","root","Sabiya@123");
						String query="insert into employeemanagementsystem.registration values(?,?,?,?,?,?,?)";
						PreparedStatement ps=con.prepareStatement(query);
						ps.setString(1, textName.getText());
						ps.setInt(2, Integer.parseInt(textId.getText()));
						ps.setString(3, textMobile.getText());
						ps.setString(4, textPassword.getText());
						if(rbMale.isSelected())
							ps.setString(5, rbMale.getText());
						else
							ps.setString(5, rbFemale.getText());
						if(rbYes.isSelected())
							ps.setString(6, rbYes.getText());
						else
							ps.setString(6, rbNo.getText());
						ps.setString(7, textAddress.getText());
						int i=ps.executeUpdate();
						JOptionPane.showMessageDialog(btnRegister,i+ "Registration Successful!");
						Login_Page Ip=new Login_Page();
						Ip.show();
						dispose();
						ps.close();
						con.close();
					    
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		});
		btnRegister.setBackground(new Color(138, 43, 226));
		btnRegister.setForeground(new Color(255, 255, 255));
		btnRegister.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnRegister.setBounds(42, 630, 138, 39);
		contentPane.add(btnRegister);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textName.setText("");
				textId.setText("");
				textMobile.setText("");
				textPassword.setText("");
				textAddress.setText("");
				buttonGroup.clearSelection();
				buttonGroup_1.clearSelection();
				
				}
		});
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnReset.setBackground(new Color(255, 165, 0));
		btnReset.setBounds(215, 630, 138, 39);
		contentPane.add(btnReset);
		
		JButton btnBackToLogin = new JButton("Back To Login");
		btnBackToLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_Page Ip=new Login_Page();
				Ip.show();
				dispose();
			}
		});
		btnBackToLogin.setForeground(new Color(255, 255, 255));
		btnBackToLogin.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnBackToLogin.setBackground(new Color(255, 0, 0));
		btnBackToLogin.setBounds(376, 630, 203, 39);
		contentPane.add(btnBackToLogin);
	}
}
