package suretrust;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Homepage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage frame = new Homepage();
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
	public Homepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1059, 703);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\skiller\\project1\\photo.jpg"));
		lblNewLabel.setBounds(252, 133, 995, 533);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome Examination Sitting Arrangement");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 39));
		lblNewLabel_1.setBounds(323, 25, 749, 58);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(129, 57, 134));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login rf=new Login();
				rf.show();
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBounds(950, 93, 85, 21);
		contentPane.add(btnNewButton);
		
//		JButton btnNewButton_1 = new JButton("Registration");
//		btnNewButton_1.setBackground(new Color(129, 57, 134));
//		btnNewButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Registration rf= new Registration();
//				rf.show();
//				dispose();
//			}
//		});
//		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
//		btnNewButton_1.setBounds(903, 102, 156, 21);
//		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Home");
		btnNewButton_2.setBackground(new Color(129, 57, 134));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				home rf=new home();
				rf.show();
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_2.setBounds(323, 99, 85, 21);
		contentPane.add(btnNewButton_2);
	}
}
