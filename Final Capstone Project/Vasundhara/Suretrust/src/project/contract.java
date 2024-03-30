package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class contract extends JFrame {

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
					contract frame = new contract();
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
	public contract() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 130, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contract");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(169, 10, 105, 13);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"S.no", "Name", "Mobile Number"},
				{"1", "Vasundhara", "9876543215"},
				{"2", "Jayasri", "8567625381"},
				{"3", "Pradeep", "1245678358"},
				{"4", "Kiran", "8243567545"},
				{"5", "Kumar", "6543782981"},
				{"6", "Sabiya", "9392435678"},
				{"7", "Maheswari", "9878238343"},
				{"8", "Sandhya", "9245678321"},
				{"9", "Rupa", "9565453525"},
				{"10", "Thirumal", "9845637245"},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.setBounds(10, 46, 416, 156);
		contentPane.add(table);
		
		JButton close = new JButton("close");
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Methods rf=new Methods();
				rf.show();
				dispose();
			}
		});
		close.setFont(new Font("Times New Roman", Font.BOLD, 14));
		close.setBounds(159, 220, 105, 21);
		contentPane.add(close);
	}
}
