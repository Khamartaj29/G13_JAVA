package suretrust;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1109, 771);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(128, 255, 0));
		lblNewLabel.setIcon(new ImageIcon("D:\\skiller\\project1\\240_.jpg"));
		lblNewLabel.setBounds(58, 431, 1027, 240);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("All the best your Examination");
		lblNewLabel_1.setBackground(new Color(0, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 41));
		lblNewLabel_1.setBounds(351, 8, 550, 150);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Check your Seat");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update rf= new update();
				rf.show();
				dispose();
			
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBounds(885, 145, 200, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\skiller\\project1\\240_.jpg"));
		lblNewLabel_2.setBackground(new Color(128, 255, 0));
		lblNewLabel_2.setBounds(58, 168, 1027, 282);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("logout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage rf=new Homepage();
				rf.show();
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(127, 157, 85, 21);
		contentPane.add(btnNewButton_1);
		
		
		
		
	}
}