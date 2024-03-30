package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mixedcropping extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mixedcropping frame = new Mixedcropping();
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
	public Mixedcropping() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1206, 665);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mixedcropping");
		lblNewLabel.setForeground(new Color(0, 191, 255));
		lblNewLabel.setBackground(new Color(238, 232, 170));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(329, 10, 399, 34);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnGrowingTwoOr = new JTextPane();
		txtpnGrowingTwoOr.setForeground(new Color(255, 0, 153));
		txtpnGrowingTwoOr.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtpnGrowingTwoOr.setText("Growing two or more crops simultaneously on the same piece of land is known as mixed cropping.This lowers the risk and provides some protection if one of the crops fails");
		txtpnGrowingTwoOr.setBounds(36, 62, 810, 84);
		contentPane.add(txtpnGrowingTwoOr);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Mixedcropping.class.getResource("/Assets/multiple3.jpeg")));
		lblNewLabel_1.setBounds(892, 38, 290, 136);
		contentPane.add(lblNewLabel_1);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.BOLD, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"S.No", "CropName", "Temparature(celsius)", "RainFall(centimeters)", "Type of soil"},
				{"1", "Wheat+Gram", "14-18", "50 -100", "clayey and loamy"},
				{"2", "Wheat+Mustard","10-25" ,"50-100" , "blackand red"},
				{"3", "Groundnut+Sunflower", "20-27", "50-125", "loam"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 208, 1172, 163);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Select");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				select rf=new select();
				rf.show();
				dispose();
				
			}
		});
		btnNewButton.setBounds(54, 483, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quary");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quary rf=new Quary();
				rf.show();
				dispose();
				
			}
			
		});
		btnNewButton_1.setBounds(447, 483, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Contract");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contract rf=new contract();
				rf.show();
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_2.setBounds(865, 483, 85, 21);
		contentPane.add(btnNewButton_2);
	}
}
