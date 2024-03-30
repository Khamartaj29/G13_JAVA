package hospital;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class DoctorPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorPage frame = new DoctorPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public DoctorPage() {
		setTitle("SURE Trust Hospital Managment System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DoctorPage.class.getResource("/Assects/Suretrust.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 641);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(153, 50, 204)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 50, 204)));
		panel_1.setBounds(83, 158, 415, 407);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Doctors");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddDoctors obj =new AddDoctors();
		        obj.setVisible(true);
		        dispose();
			}
		});
		btnNewButton.setForeground(new Color(230, 230, 250));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setBounds(111, 44, 216, 40);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Edit Doctors");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditDoctors obj =new EditDoctors();
		        obj.setVisible(true);
		        dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(128, 0, 128));
		btnNewButton_1.setForeground(new Color(230, 230, 250));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(111, 117, 216, 40);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delect Doctor");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteDoctor obj=new DeleteDoctor();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBackground(new Color(255, 0, 0));
		btnNewButton_2.setForeground(new Color(230, 230, 250));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(111, 190, 216, 40);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("View Doctors");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewDoctorDetails obj =new ViewDoctorDetails();
		        obj.setVisible(true);
		        dispose();
			}
		});
		btnNewButton_3.setBackground(new Color(0, 128, 0));
		btnNewButton_3.setForeground(new Color(230, 230, 250));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(111, 269, 216, 40);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Logout");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage obj =new LoginPage();
		        obj.setVisible(true);
		        dispose();
			}
		});
		btnNewButton_4.setBackground(new Color(128, 0, 0));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setForeground(new Color(230, 230, 250));
		btnNewButton_4.setBounds(300, 357, 92, 27);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Back");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage obj =new HomePage();
		        obj.setVisible(true);
		        dispose();
			}
		});
		btnNewButton_5.setBackground(new Color(0, 0, 0));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_5.setForeground(new Color(230, 230, 250));
		btnNewButton_5.setBounds(33, 357, 92, 27);
		panel_1.add(btnNewButton_5);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(255, 215, 0)));
		panel.setBackground(new Color(153, 50, 204));
		panel.setForeground(new Color(255, 215, 0));
		panel.setBounds(83, 51, 415, 74);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("  Doctor Records");
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(DoctorPage.class.getResource("/Assects/Doctor icon.png")));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 38));
		
		JLabel lblNewLabel = new JLabel((String) null);
		lblNewLabel.setIcon(new ImageIcon(DoctorPage.class.getResource("/Assects/Doctor.jpg")));
		lblNewLabel.setBounds(10, 10, 990, 584);
		contentPane.add(lblNewLabel);
	}
}
