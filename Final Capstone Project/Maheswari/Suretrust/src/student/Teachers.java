package student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teachers extends JFrame {

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
					Teachers frame = new Teachers();
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
	public Teachers() {
		setTitle("Teachers");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,800);
		getContentPane().setLayout(null);
		setVisible(true);
		setBounds(100, 100, 992, 634);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Teachers Information");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(290, 41, 242, 25);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 96, 926, 260);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 18));
		scrollPane.setViewportView(table);
		JTableHeader Theader = table.getTableHeader();
	     Theader.setFont (new Font("Tahome",Font.BOLD,20));
		table.setRowHeight(30);
		table.setModel(new DefaultTableModel(
				
			new Object[][] {
				{"1", "Miss.Jhansi","9397972970" , "Telugu", "VI - VIII"},
				{"2", "Mr.Rahuram", "9372527897","Telugu", "IX - X"},
				{"3", "Mrs.Swathi","9482395014" , "English", "VI - VIII"},
				{"4" , "Miss.Thanjeem","9492705434" , "English", "IX - X"},
				{"5", "Mr.Chandrasekhar", "9747653250","Mathematics", "VI - VIII"},
				{"6","Mr.Karthik", "9491304534", "Mathematics", "IX - X"},
				{"7", "Mrs.Jaheera","8317654997" , "Chemistry", "VI - VIII"},
				{"8", "Mr.Alim", "9701831679", "Physics", "VI - X"},
				{"9","Mrs.Rajeswari", "8767895467", "Biology", "VI - X"},
				{"10", "Mrs.Mamatha", "9742156496", "Social", "IX - X"},
			},
			new String[] {
				"S.NO.", "Name", "Phone Number", "Profession", "Standards to teach "
			}
		));
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage rf = new HomePage();
				rf.show();
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(103, 473, 85, 21);
		contentPane.add(btnNewButton);
	}
}
