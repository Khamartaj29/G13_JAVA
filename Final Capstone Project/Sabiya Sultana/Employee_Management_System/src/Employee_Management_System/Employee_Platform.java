package Employee_Management_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Employee_Platform extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_Platform frame = new Employee_Platform();
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
	public Employee_Platform() {
		setTitle("Employee Platform");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Employee_Platform.class.getResource("/Assets/Screenshot 2024-03-16 225405.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(153, 50, 204), 6));
		contentPane.setBackground(new Color(152, 251, 152));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 255, 255)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setForeground(new Color(250, 240, 230));
		panel.setBounds(20, 20, 777, 69);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO EMPLOYEE MANAGEMENT SYSTEM");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\MY PC\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-03-26 193041.png"));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel.setBounds(0, 5, 777, 64);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration__Page Ip=new Registration__Page();
				Ip.show();
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 240, 245));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(148, 177, 202, 60);
		contentPane.add(btnNewButton);
		
		JButton btnLogIn = new JButton("LOG IN");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_Page Ip=new Login_Page();
				Ip.show();
				dispose();
			}
		});
		btnLogIn.setForeground(new Color(224, 19, 247));
		btnLogIn.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnLogIn.setBackground(new Color(255, 240, 245));
		btnLogIn.setBounds(148, 304, 202, 60);
		contentPane.add(btnLogIn);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Employee_Platform.class.getResource("/Assets/Screenshot 2024-03-26 122218.png")));
		lblNewLabel_1.setBounds(396, 151, 412, 259);
		contentPane.add(lblNewLabel_1);
	}
}
