package student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentsMarks extends JFrame {

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
					StudentsMarks frame = new StudentsMarks();
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
	public StudentsMarks() {
		setTitle("StudentsMarks");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1208, 714);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Students Marks");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(408, 23, 199, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SA-1 Marks");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(435, 85, 148, 25);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 143, 1065, 295);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 18));
		scrollPane.setViewportView(table);
		JTableHeader Theader = table.getTableHeader();
	     Theader.setFont (new Font("Tahome",Font.BOLD,20));
		table.setRowHeight(30);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"B.Maheswari", "20F21A0479",90, 85, 92, 100, 90, 80, 85},
				{"A.P.pradeep", "20F21A04A4", 80, 90, 93, 91, 94, 70, 80},
				{"A.B.Kumar","21F21A04A1", 70, 95, 99, 80, 75, 90,90 },
				{"A.Kiran", "21F21A04A2", 94, 72, 80, 79, 90,75, 84},
				{"s.Afroz", "22F21A04B1", 89, 98, 96, 86, 98, 68, 90},
				{"E.Vasundhara", "22F21A04B2", 80,64, 97, 86, 97, 85, 90},
				{"S.Mansoor", "23F21A04C1", 98,89, 70, 98,69, 79, 83},
				{"D.Sabia Sulthana", "23F21A04C2", 89, 90, 96, 86, 76, 87, 85},
				{"S.Khamar Taj", "24F21A04D1", 72, 98, 89, 80, 90, 80, 75},
				{"P.Nagaraj","24F21A04D2", 95, 88, 90, 82, 80, 90, 74},
			},
			new String[] {
				"Name", "RegisterNo.", "Telugu", "Hindi", "English", "Mathematics", "Physics", "Biology", "Social"
			}
		));
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage ref=new HomePage();
				ref.show();
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(104, 528, 104, 33);
		contentPane.add(btnNewButton);
	}
}
