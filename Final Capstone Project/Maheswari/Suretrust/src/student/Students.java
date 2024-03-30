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

public class Students extends JFrame {

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
					Students frame = new Students();
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
	public Students() {
		setTitle("Students");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,800);
		getContentPane().setLayout(null);
		setVisible(true);
		setBounds(100,100,992,634);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Students Information");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(321, 35, 261, 36);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 89, 875, 333);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 18));
		scrollPane.setViewportView(table);
		JTableHeader Theader = table.getTableHeader();
	     Theader.setFont (new Font("Tahome",Font.BOLD,20));
		table.setRowHeight(30);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"B.Maheswari", "20F21A0479", "B.Balaraju", "9391304215", "X"},
				{"A.P.Pradeep", "20F21A04A4","A.P.Prathap", "9391421653", "X"},
				{"A.B.Kumar", "21F21A04A1", "A.B.Raju", "9456878890", "IX"},
				{"A.Kiran", "21F21A04A2", "A.Raghuaram", "7832356789", "IX"},
				{"S.Afroz", "22F21A04B1", "s.Basha", "8982881288", "VIII"},
				{"E.Vasundhara", "22F21A04B2", "E.Sreenivasulu", "9834788712", "VIII"},
				{"S.Mansoor", "23F21A04C1", "S.Anvar", "9875678769", "VII"},
				{"D.Sabia Sulthana", "23F21A04C2", "D.Razak", "8956789834", "VII"},
				{"S.Khamar Taj","24F21A04D1", "s.Rahim", "7899837890", "VI"},
				{"P.Nagaraj", "24F21A04D2","P.Upendra","9786567845", "VI"},
			},
			new String[] {
				"Name", "Register no.", "Father Name", "phone No.", " Standard"
			}
		));
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage rf=new HomePage();
				rf.show();
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(81, 492, 85, 21);
		contentPane.add(btnNewButton);
	}
}
