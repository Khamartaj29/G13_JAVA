package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Methods extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Methods frame = new Methods();
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
	public Methods() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1108, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Types of cropping");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBackground(new Color(0, 255, 0));
		lblNewLabel.setForeground(new Color(204, 0, 255));
		lblNewLabel.setBounds(314, 10, 341, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Methods.class.getResource("/Assets/Screenshot 2024-03-15 104549.png")));
		lblNewLabel_1.setBounds(10, 86, 1074, 401);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Multicropping");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Multicropping rf=new Multicropping();
				rf.show();
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(138, 43, 226));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(43, 55, 157, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Mixedcropping");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mixedcropping rf=new Mixedcropping();
				rf.show();
				dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(0, 255, 255));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(408, 55, 172, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Combinationalcropping");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Combinationalcropping rf=new Combinationalcropping();
				rf.show();
				dispose();
			}
		});
		btnNewButton_2.setForeground(new Color(0, 255, 0));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_2.setBounds(830, 55, 201, 21);
		contentPane.add(btnNewButton_2);
	}
}
