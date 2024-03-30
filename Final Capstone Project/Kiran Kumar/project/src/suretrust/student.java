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

public class student extends JFrame {

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
					student frame = new student();
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
	public student() {
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
				{"V", "20F21A0470", new Integer(24), "1st row 3rd bentch","karthick"},
	        {"U", "20F21A0471", new Integer(24), "1st row 1rd bentch","karthick"},
	        {"T", "20F21A0472", new Integer(24), "1st row 2rd bentch","karthick"},
	        {"S", "20F21A0473", new Integer(24), "1st row 3rd bentch","karthick"},
	        {"R", "20F21A0474", new Integer(24), "1st row 4rd bentch","karthick"},
	        {"Q", "20F21A0475", new Integer(24), "1st row 1rd bentch","karthick"},
	        {"P", "20F21A0476", new Integer(24), "2st row 1rd bentch","karthick"},
	        {"O", "20F21A0477", new Integer(24), "2st row 2rd bentch","karthick"},
	        {"M", "20F21A0478", new Integer(24), "2st row 3rd bentch","karthick"},
	        {"L", "20F21A0479", new Integer(24), "2st row 4rd bentch","karthick"},
	        {"K", "20F21A0480", new Integer(24), "2st row 5rd bentch","karthick"},
	        {"J", "20F21A0482", new Integer(24), "3st row 1rd bentch","karthick"},
	        {"I", "20F21A0483", new Integer(24), "3st row 2rd bentch","karthick"},
	        {"H", "20F21A0470", new Integer(24), "3st row 3rd bentch","karthick"},
	        {"G", "20F21A0470", new Integer(24), "3st row 4rd bentch","karthick"},
	        {"F", "20F21A0470", new Integer(24), "3st row 5rd bentch","karthick"},
	        {"E", "20F21A0470", new Integer(24), "4st row 1rd bentch","karthick"},
	        {"D", "20F21A0470", new Integer(24), "4st row 2rd bentch","karthick"},
	        {"C", "20F21A0470", new Integer(24), "4st row 3rd bentch","karthick"},
	        {"B", "20F21A0470", new Integer(24), "4st row 4rd bentch","karthick"},
	        {"A", "20F21A0470", new Integer(24), "4st row 5rd bentch","karthick"},
	        
	        
	        
	       
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(20, 77, 1172, 368);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Previous");
		btnNewButton.setBackground(new Color(0, 64, 128));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update rf=new update();
				rf.show();
				dispose();
			}
		});
		btnNewButton.setBounds(278, 472, 100, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.setBackground(new Color(0, 0, 160));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Setting rf=new Setting ();
				rf.show();
				dispose();
			}
		});
		btnNewButton_1.setBounds(711, 472, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("All the best your Examination\"");
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBounds(254, 10, 585, 57);
		contentPane.add(lblNewLabel);
	}
}