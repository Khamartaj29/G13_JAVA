package hospital;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(HomePage.class.getResource("/Assects/Suretrust.png")));
		setTitle("SURE Trust Hospital Managment System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1041, 657);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(153, 50, 204)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPrescription = new JButton("Patient Prescription");
		btnPrescription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientPrescription pp=new PatientPrescription();
				pp.show();
				dispose();
			}
		});
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About_ContactUs pp=new About_ContactUs();
				pp.show();
				dispose();
			}
			
		});
		btnNewButton.setIcon(new ImageIcon(HomePage.class.getResource("/Assects/icons8-about-us-32.png")));
		btnNewButton.setBounds(947, 10, 70, 38);
		contentPane.add(btnNewButton);
		btnPrescription.setIcon(new ImageIcon(HomePage.class.getResource("/Assects/Receptionist icon.png")));
		btnPrescription.setForeground(new Color(230, 230, 250));
		btnPrescription.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPrescription.setBackground(new Color(0, 128, 128));
		btnPrescription.setBounds(144, 394, 336, 49);
		contentPane.add(btnPrescription);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame FrmLoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(FrmLoginSystem, "Confirm if you want to exit", "Home Page",
				JOptionPane. YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
				System.exit(0);
				}
			}
		});
		btnExit.setBackground(new Color(220, 20, 60));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setForeground(new Color(230, 230, 250));
		btnExit.setBounds(218, 491, 140, 38);
		contentPane.add(btnExit);
		
		JButton btnPatient = new JButton(" Patients");
		btnPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientPage pp=new PatientPage();
				pp.show();
				dispose();
			}
		});
		btnPatient.setIcon(new ImageIcon(HomePage.class.getResource("/Assects/Patient icon.png")));
		btnPatient.setForeground(new Color(230, 230, 250));
		btnPatient.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnPatient.setBackground(new Color(0, 128, 128));
		btnPatient.setBounds(322, 200, 186, 49);
		contentPane.add(btnPatient);
		
		JButton btnReceptionist = new JButton("Book Appiontment");
		btnReceptionist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookAppointment lp=new BookAppointment();
				lp.show();
				dispose();
			}
		});
		btnReceptionist.setIcon(new ImageIcon(HomePage.class.getResource("/Assects/Receptionist icon.png")));
		btnReceptionist.setForeground(new Color(230, 230, 250));
		btnReceptionist.setBackground(new Color(0, 128, 128));
		btnReceptionist.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnReceptionist.setBounds(144, 301, 336, 49);
		contentPane.add(btnReceptionist);
		
		JButton btnDoctor = new JButton("Doctors");
		btnDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorPage obj =new DoctorPage();
		        obj.setVisible(true);
		        dispose();
			}
		});
		btnDoctor.setIcon(new ImageIcon(HomePage.class.getResource("/Assects/Doctor icon.png")));
		btnDoctor.setForeground(new Color(230, 230, 250));
		btnDoctor.setBackground(new Color(0, 128, 128));
		btnDoctor.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDoctor.setBounds(74, 197, 186, 49);
		contentPane.add(btnDoctor);
		
		JLabel lblNewLabel = new JLabel("~ Your Health, Our Mission");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(364, 100, 261, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblWelcome = new JLabel("Welcome to SURE Trust Health Portal !");
		lblWelcome.setIcon(new ImageIcon(HomePage.class.getResource("/Assects/Suretrust.png")));
		lblWelcome.setForeground(new Color(153, 50, 204));
		lblWelcome.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 34));
		lblWelcome.setBounds(25, 61, 634, 29);
		contentPane.add(lblWelcome);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 25));
		lblBackground.setIcon(new ImageIcon(HomePage.class.getResource("/Assects/Doctor.jpg")));
		lblBackground.setBounds(10, 10, 1011, 603);
		contentPane.add(lblBackground);
	}
}
