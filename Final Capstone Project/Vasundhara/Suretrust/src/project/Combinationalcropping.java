package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Combinationalcropping extends JFrame {

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
					Combinationalcropping frame = new Combinationalcropping();
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
	public Combinationalcropping() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1505, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Combinational Cropping");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setBackground(new Color(255, 222, 173));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(473, 10, 390, 38);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnCombinationalCroppingIs = new JTextPane();
		txtpnCombinationalCroppingIs.setForeground(new Color(138, 43, 226));
		txtpnCombinationalCroppingIs.setText("Combinational cropping is defined as cultivating different crops in same field . the crop seasons of two crops should be different.It may help the farmers haversting  of two crops is very easy.. It will improves the fertility of the soil also.");
		txtpnCombinationalCroppingIs.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtpnCombinationalCroppingIs.setBounds(83, 76, 885, 96);
		contentPane.add(txtpnCombinationalCroppingIs);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Combinationalcropping.class.getResource("/Assets/Screenshot 2024-03-17 092218.png")));
		lblNewLabel_1.setBounds(1015, 10, 417, 182);
		contentPane.add(lblNewLabel_1);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.BOLD, 14));
		table.setForeground(new Color(255, 0, 255));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"S.no", "CropName" ,"Temparature(celsius)", "Rainfall(centimeters)", "Type of soil"},
				{"1.", "Lemon+Groundnut", " 20-25", "50-125","sandyloamy"},
				{"2", "Mango+chilly", "4-15", "80-100", "sandyloamy"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(58, 223, 1411, 166);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Select");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				select rf=new select();
				rf.show();
				dispose();
			}
			
		});
		btnNewButton.setForeground(new Color(199, 21, 133));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(223, 413, 113, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quary");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quary rf=new Quary();
				rf.show();
				dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(148, 0, 211));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_1.setBounds(621, 413, 124, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("contract");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contract rf=new contract();
				rf.show();
				dispose();
			}
		});
		btnNewButton_2.setForeground(new Color(255, 0, 255));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_2.setBounds(1010, 424, 124, 21);
		contentPane.add(btnNewButton_2);
	}
}
