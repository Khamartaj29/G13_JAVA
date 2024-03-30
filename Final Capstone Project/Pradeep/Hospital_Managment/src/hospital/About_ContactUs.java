package hospital;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;

public class About_ContactUs extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About_ContactUs frame = new About_ContactUs();
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
	public About_ContactUs() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(About_ContactUs.class.getResource("/Assects/Suretrust.png")));
		setTitle("SURE Trust Hospital Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1015, 576);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 50, 204)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2_3 = new JLabel("Problem-solving & enjoy leveraging my creativity to find innovative solutions.");
		lblNewLabel_2_3.setForeground(Color.BLUE);
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_3.setBackground(new Color(176, 224, 230));
		lblNewLabel_2_3.setBounds(10, 196, 624, 34);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Dept. of ECE. I am passionate and have developed a Hospital Management ");
		lblNewLabel_2_1.setForeground(Color.BLUE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1.setBackground(new Color(176, 224, 230));
		lblNewLabel_2_1.setBounds(10, 136, 668, 34);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("System of my knowledge in my field of study at SURE Trust and I excel at ");
		lblNewLabel_2_2.setForeground(Color.BLUE);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_2.setBackground(new Color(176, 224, 230));
		lblNewLabel_2_2.setBounds(10, 166, 624, 34);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2 = new JLabel("Hello! I'm Ashok Palimiri Pradeep, Currently Pursuing 4th B.Tech in");
		lblNewLabel_2.setBackground(new Color(176, 224, 230));
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(50, 107, 533, 34);
		contentPane.add(lblNewLabel_2);
		
		JButton btnExit = new JButton("X");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage lp=new HomePage();
				lp.show();
				dispose();
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExit.setBackground(Color.RED);
		btnExit.setBounds(896, 28, 46, 21);
		contentPane.add(btnExit);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(153, 50, 204));
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel.setBounds(21, 20, 543, 77);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("About Me and Contact Us");
		lblNewLabel_1.setForeground(new Color(153, 50, 204));
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(About_ContactUs.class.getResource("/Assects/icons8-about-us-32.png")));
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 35));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(About_ContactUs.class.getResource("/Assects/Pradeep.jpg")));
		lblNewLabel.setBounds(435, 10, 556, 516);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Follow");
		btnNewButton.setBackground(new Color(255, 105, 180));
		btnNewButton.setForeground(new Color(230, 230, 250));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://www.instagram.com/ap_the_mr.introvert?igsh=M3FuOGdjb3Zzamw5").toURI());
				}
				catch(Exception e1) {
					
				}
			}
		});
		btnNewButton.setBounds(78, 491, 85, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(About_ContactUs.class.getResource("/Assects/icons8-instagram-32.png")));
		lblNewLabel_3.setBounds(39, 476, 160, 50);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Follow");
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://www.instagram.com/ap_the_mr.introvert?igsh=M3FuOGdjb3Zzamw5").toURI());
				}
				catch(Exception e2) {
					
				}
			}
		});
		btnNewButton_1.setForeground(new Color(230, 230, 250));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBackground(new Color(65, 105, 225));
		btnNewButton_1.setBounds(287, 492, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(About_ContactUs.class.getResource("/Assects/icons8-linkedin-32.png")));
		lblNewLabel_4.setBounds(237, 476, 163, 50);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Follow me in Social Media");
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel_5.setForeground(new Color(165, 42, 42));
		lblNewLabel_5.setBounds(96, 434, 289, 34);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Feel Free to Contact Us");
		lblNewLabel_6.setForeground(new Color(0, 128, 0));
		lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		lblNewLabel_6.setBounds(78, 231, 263, 50);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(About_ContactUs.class.getResource("/Assects/icons8-email-32.png")));
		lblNewLabel_7.setBounds(60, 291, 40, 42);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("appradeep2001@gmail.com");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7_1.setBounds(110, 291, 249, 34);
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("");
		lblNewLabel_7_2.setIcon(new ImageIcon(About_ContactUs.class.getResource("/Assects/icons8-phone-32.png")));
		lblNewLabel_7_2.setBounds(60, 343, 40, 34);
		contentPane.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_3 = new JLabel("");
		lblNewLabel_7_3.setIcon(new ImageIcon(About_ContactUs.class.getResource("/Assects/icons8-whatsapp-32.png")));
		lblNewLabel_7_3.setBounds(62, 390, 62, 34);
		contentPane.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_7_4 = new JLabel("9392421653  /  9398157452");
		lblNewLabel_7_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7_4.setBounds(110, 343, 254, 34);
		contentPane.add(lblNewLabel_7_4);
		
		JLabel lblNewLabel_7_5 = new JLabel("9391421653");
		lblNewLabel_7_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7_5.setBounds(110, 390, 154, 34);
		contentPane.add(lblNewLabel_7_5);
	}
}
