package student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setTitle("HomePage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 756, 712);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SURE Trust");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\balar\\OneDrive\\Pictures\\trusticon.jpg"));
		lblNewLabel.setBounds(10, 10, 242, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\balar\\OneDrive\\Pictures\\school_8074788.png"));
		lblNewLabel_1.setBounds(291, 22, 113, 110);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SCHOOL MANAGEMENT SYSTEM");
		lblNewLabel_2.setForeground(new Color(128, 0, 64));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(145, 123, 390, 50);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("TEACHERS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Teachers rf=new Teachers();
				rf.show();
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(0, 64, 128));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\balar\\OneDrive\\Pictures\\presentation_609001.png"));
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(10, 197, 222, 76);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("STUDENTS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Students rf = new Students();
				rf.show();
				dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\balar\\OneDrive\\Pictures\\read_4696863.png"));
		btnNewButton_1.setForeground(new Color(0, 64, 128));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(10, 283, 222, 74);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MARKS");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentsMarks ref=new StudentsMarks();
				ref.show();
				dispose();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\balar\\OneDrive\\Pictures\\student-graduation-cap-diploma-scroll.jpg"));
		btnNewButton_2.setForeground(new Color(0, 64, 128));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(10, 367, 222, 74);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("EXTRA CURRICULAR ACTIVITIES");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExtracurricularActivities rf=new ExtracurricularActivities();
				rf.show();
				dispose();
				
			}
		});
		btnNewButton_3.setForeground(new Color(0, 64, 128));
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\balar\\OneDrive\\Pictures\\user-generated-content_4660903.png"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(10, 464, 445, 74);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("\"Today's children are tomorrow's citizens\"");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setBounds(311, 168, 329, 50);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_4 = new JButton("  COMPLAINT BOX ");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\balar\\OneDrive\\Pictures\\comp.png"));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Complaintbox rf=new Complaintbox();
				rf.show();
				dispose();
			}
		});
		btnNewButton_4.setForeground(new Color(0, 64, 128));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_4.setBounds(413, 558, 319, 84);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_4 = new JLabel("Here is your's complaint box");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_4.setBounds(85, 587, 319, 29);
		contentPane.add(lblNewLabel_4);
	}
}
