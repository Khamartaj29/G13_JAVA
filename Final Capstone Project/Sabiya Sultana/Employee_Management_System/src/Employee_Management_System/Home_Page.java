package Employee_Management_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home_Page extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final Component FrmHomePage = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_Page frame = new Home_Page();
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
	public Home_Page() {
		setTitle("Employee Platform");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home_Page.class.getResource("/Assets/Screenshot 2024-03-16 225405.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO EMPLOYEE PLATFORM");
		lblNewLabel.setForeground(new Color(255, 99, 71));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel.setBounds(131, 23, 520, 64);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Employee Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee_Details Ip=new Employee_Details();
				Ip.show();
				dispose();
				
			}
		});
		btnNewButton.setBackground(new Color(250, 240, 230));
		btnNewButton.setForeground(new Color(186, 85, 211));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton.setBounds(88, 134, 238, 64);
		contentPane.add(btnNewButton);
		
		JButton btnReady = new JButton("Car Pool");
		btnReady.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Car_Pool Ip=new Car_Pool();
				Ip.show();
				dispose();
			}
		});
		btnReady.setBackground(new Color(250, 250, 210));
		btnReady.setForeground(new Color(0, 0, 255));
		btnReady.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btnReady.setBounds(408, 134, 238, 64);
		contentPane.add(btnReady);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(FrmHomePage, "Confirm if you want to exit", "Home Page",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(new Color(139, 69, 19));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnExit.setBackground(new Color(230, 230, 250));
		btnExit.setBounds(273, 224, 190, 64);
		contentPane.add(btnExit);
	}
}
