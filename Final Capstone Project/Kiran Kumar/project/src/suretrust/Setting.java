package suretrust;



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

public class Setting extends JFrame {

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
					Setting frame = new Setting();
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
	public Setting() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1206, 665);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.BOLD, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Registration_number","Room_number", "bentch", "invigilator_name"},
				{"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
	        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
	        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
	        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
	        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
	        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
	        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
	        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
	        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
	        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
	        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
	        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
	        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
	        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
	        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
	        {"kiran", "20F21A0470", new Integer(23), "1st row 3rd bentch","karthick"},
	        
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(20, 142, 1172, 319);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("close");
		btnNewButton.setBackground(new Color(0, 64, 128));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				home rf=new home();
				rf.show();
				dispose();
			}
		});
		btnNewButton.setBounds(799, 528, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("All the best your Examination");
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBounds(254, 42, 585, 57);
		contentPane.add(lblNewLabel);
		JButton btnNewButton_1 = new JButton("previous");
		btnNewButton_1.setBackground(new Color(0, 0, 160));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				home rf=new home();
				rf.show();
				dispose();
			}
		});
		btnNewButton_1.setBounds(296, 528, 116, 21);
		contentPane.add(btnNewButton_1);
	}
}