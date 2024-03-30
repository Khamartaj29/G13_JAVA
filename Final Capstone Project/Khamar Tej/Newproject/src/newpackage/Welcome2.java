package newpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Welcome2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome2 frame = new Welcome2();
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
	public Welcome2() {
		setTitle("Electricity Billing System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 789, 494);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(SystemColor.textHighlight);
		contentPane.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(128, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(53, 41, 666, 73);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Electricity Billing System");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(112, 10, 494, 53);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setBorder(new TitledBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(128, 0, 0)), "Login", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		panel_1.setBounds(53, 139, 666, 245);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Login Account as");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(65, 92, 271, 43);
		panel_1.add(lblNewLabel_1);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login2 rf=new Login2();
				rf.show();
				dispose();
			}
		});
		btnAdmin.setBackground(Color.PINK);
		btnAdmin.setForeground(new Color(230, 230, 250));
		btnAdmin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdmin.setBounds(341, 43, 178, 43);
		panel_1.add(btnAdmin);
		
		JButton btnCustomer = new JButton("Customer");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login wl=new Login();
				wl.show();
				dispose();
			}
		});
		btnCustomer.setForeground(new Color(230, 230, 250));
		btnCustomer.setBackground(Color.BLUE);
		btnCustomer.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCustomer.setBounds(341, 143, 178, 43);
		panel_1.add(btnCustomer);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Welcome wl=new Welcome();
				wl.show();
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setForeground(new Color(230, 230, 250));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(418, 400, 124, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Dont have Account");
		lblNewLabel_2.setForeground(new Color(128, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(199, 397, 242, 41);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame LoginPage = new JFrame("Exit");

				if (JOptionPane.showConfirmDialog(LoginPage, "Confirm if you want to exit", "Login Page",

				JOptionPane. YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {

				System.exit(0);
				}
			}
		});
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setForeground(new Color(230, 230, 250));
		btnNewButton_1.setBounds(696, 10, 69, 21);
		contentPane.add(btnNewButton_1);
	}
}
