package hospital;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;

public class Registration_form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textName;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textUser;
	private JTextField textEmail;
	private JTextField textMobile;
	private JTextField textAge;
	private JPasswordField textPassword;
	private JTextField textDesignation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_form frame = new Registration_form();
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
	public Registration_form() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Registration_form.class.getResource("/Assects/Suretrust.png")));
		setTitle("SURE Trust Hospital Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 634);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(153, 50, 204)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Email I'd     :");
		lblNewLabel_1.setBounds(62, 200, 89, 17);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mobile No   :");
		lblNewLabel_2.setBounds(62, 256, 89, 17);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("User Name  :");
		lblNewLabel_3.setBounds(62, 150, 101, 17);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password   :");
		lblNewLabel_4.setBounds(62, 306, 89, 13);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender       :");
		lblNewLabel_5.setBounds(62, 344, 101, 25);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Age             :");
		lblNewLabel_6.setBounds(62, 393, 89, 17);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("Full Name    :");
		lblNewLabel.setBounds(62, 98, 101, 17);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		textName = new JTextField();
		textName.setBounds(168, 99, 230, 16);
		textName.setToolTipText("");
		textName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(textName);
		textName.setColumns(10);
		
		final JRadioButton rbMale = new JRadioButton("Male");
		rbMale.setBounds(161, 347, 59, 21);
		rbMale.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbMale.setBackground(new Color(240, 248, 255));
		buttonGroup.add(rbMale);
		contentPane.add(rbMale);
		
		final JRadioButton rbFemale = new JRadioButton("Female");
		rbFemale.setBounds(249, 347, 72, 21);
		rbFemale.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbFemale.setBackground(new Color(240, 248, 255));
		buttonGroup.add(rbFemale);
		contentPane.add(rbFemale);
		
		textUser = new JTextField();
		textUser.setBounds(168, 149, 176, 19);
		textUser.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(textUser);
		textUser.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(168, 199, 176, 19);
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textMobile = new JTextField();
		textMobile.setBounds(168, 255, 176, 19);
		textMobile.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(textMobile);
		textMobile.setColumns(10);
		
		textAge = new JTextField();
		textAge.setBounds(168, 392, 96, 19);
		textAge.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(textAge);
		textAge.setColumns(10);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(168, 305, 176, 19);
		contentPane.add(textPassword);
		
		final JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(191, 543, 101, 21);
		btnRegister.setForeground(new Color(255, 255, 255));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fname,uname,email,mobile,age,designation,password;
				fname=textName.getText();
				uname=textUser.getText();
				email=textEmail.getText();
				mobile=textMobile.getText();
				age=textAge.getText();
				designation=textDesignation.getText();
				password=textPassword.getText();
				
				if(fname.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Full Name");
				}
				else if(uname.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter User Name");
				}
				else if(email.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Email Address");
				}
				else if(mobile.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Mobile Number");
				}
				else if(age.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Age");
				}
				else if(designation.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Designation");
				}
				else if(password.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Password");
				}
				else {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suretrust","root","root");
					String query="insert into registration values(?,?,?,?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1, textName.getText());
					ps.setString(2, textUser.getText());
					ps.setString(3, textEmail.getText());
					ps.setString(4, textMobile.getText());
					//ps.setString(4, Integer.parseInt(textMobile.getText()));
					ps.setString(5, textPassword.getText());
					if(rbMale.isSelected())
						ps.setString(6, rbMale.getText());
					else
						ps.setString(6, rbFemale.getText());
					ps.setInt(7, Integer.parseInt(textAge.getText()));
					ps.setString(8, textDesignation.getText());
					int i=ps.executeUpdate();
					JOptionPane.showMessageDialog(btnRegister,i+" User Registerd successfully, Thanking You!");
					ps.close();
					con.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegister.setBackground(new Color(60, 179, 113));
		contentPane.add(btnRegister);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(319, 543, 100, 21);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText("");
				textUser.setText("");
				textEmail.setText("");
				textMobile.setText("");
				textPassword.setText("");
				textAge.setText("");
				textDesignation.setText("");
				buttonGroup.clearSelection();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBackground(new Color(244, 164, 96));
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("USER REGISTRATION");
		lblNewLabel_8.setBounds(104, 19, 301, 39);
		lblNewLabel_8.setIcon(new ImageIcon(Registration_form.class.getResource("/Assects/user-251.png")));
		lblNewLabel_8.setBackground(new Color(250, 128, 114));
		lblNewLabel_8.setFont(new Font("SimSun", Font.BOLD, 25));
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Designation :");
		lblNewLabel_9.setBounds(62, 437, 136, 25);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_9);
		
		textDesignation = new JTextField();
		textDesignation.setBounds(168, 442, 96, 19);
		contentPane.add(textDesignation);
		textDesignation.setColumns(10);
		
		JButton btnLogin = new JButton("Back to Login");
		btnLogin.setBounds(23, 543, 140, 21);
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage lp=new LoginPage();
				lp.show();
				dispose();
			}
		});
		btnLogin.setBackground(new Color(30, 144, 255));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnLogin);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Register Here", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 0)));
		panel.setBounds(13, 68, 406, 421);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(41, 510, 356, 13);
		contentPane.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(429, 10, 415, 577);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Registration_form.class.getResource("/Assects/Doctor - Copy.jpg")));
		lblNewLabel_7.setBounds(-10, 0, 425, 605);
		panel_1.add(lblNewLabel_7);
	}
}