package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class exam extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exam frame = new exam();
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
	public exam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1109, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\vasun\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-03-17 132714.png"));
		lblNewLabel.setBounds(10, 116, 1085, 353);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Examination Student Sitting Arrangement");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel_1.setBounds(104, 10, 809, 42);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setForeground(new Color(138, 43, 226));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(36, 71, 123, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setForeground(new Color(255, 0, 255));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_1.setBounds(454, 80, 158, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(818, 71, 201, 31);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Student View Details");
		btnNewButton_2.setForeground(new Color(0, 255, 255));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_2.setBounds(860, 80, 173, 21);
		contentPane.add(btnNewButton_2);
	}
}
