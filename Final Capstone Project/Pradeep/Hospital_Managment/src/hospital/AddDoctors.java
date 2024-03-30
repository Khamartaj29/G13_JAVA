package hospital;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class AddDoctors extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField DId;
	private JTextField Dname;
	private JTextField DS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddDoctors frame = new AddDoctors();
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
	public AddDoctors() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddDoctors.class.getResource("/Assects/Suretrust.png")));
		setTitle("SURE Trust Hospital Managment System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 610);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(153, 50, 204)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 50, 204));
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(255, 215, 0)));
		panel.setBounds(49, 37, 743, 69);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD DOCTOR DETAILS");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 35));
		lblNewLabel.setBounds(198, 10, 409, 49);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(153, 50, 204)));
		panel_1.setBounds(49, 146, 743, 375);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Doctor ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(46, 54, 253, 38);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Doctor Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(46, 136, 253, 38);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Doctor Specilization ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(46, 211, 253, 38);
		panel_1.add(lblNewLabel_3);
		
		DId = new JTextField();
		DId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		DId.setBounds(309, 59, 367, 38);
		panel_1.add(DId);
		DId.setColumns(10);
		
		Dname = new JTextField();
		Dname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Dname.setColumns(10);
		Dname.setBounds(309, 136, 367, 38);
		panel_1.add(Dname);
		
		DS = new JTextField();
		DS.setFont(new Font("Tahoma", Font.PLAIN, 15));
		DS.setColumns(10);
		DS.setBounds(309, 211, 367, 38);
		panel_1.add(DS);
		
		JButton btnNewButton = new JButton("Add Doctor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String docid,docname,dosp;
				docid=DId.getText();
				docname=Dname.getText();
				dosp=DS.getText();
				
				if(docid.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Doctor ID");
				}
				else if(docname.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Docter Name");
				}
				else if(dosp.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Doctor Specilization");
				}
				else {
				try{ Class.forName("com.mysql.jdbc.Driver");
		        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/suretrust","root","root");
		        
		        String sql = "insert into doctor_record values (?,?,?)";
		        PreparedStatement ptstmt = conn.prepareStatement(sql);
		        ptstmt.setString(1, DId.getText());
		        ptstmt.setString(2, Dname.getText());
		        ptstmt.setString(3, DS.getText());
		        ptstmt.executeUpdate();
		        JOptionPane.showMessageDialog(null, "data inserted successfully");
		       conn.close();
		        }catch (Exception e1){
		            JOptionPane.showMessageDialog(null, e1);
		        } 
			}
			}		
		});
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setForeground(new Color(230, 230, 250));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(301, 297, 184, 38);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorPage obj =new DoctorPage();
		        obj.setVisible(true);
		        dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(230, 230, 250));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(75, 297, 158, 38);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DId.setText("");
				Dname.setText("");
				DS.setText("");
			}
		});
		btnNewButton_2.setBackground(new Color(178, 34, 34));
		btnNewButton_2.setForeground(new Color(230, 230, 250));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(545, 297, 143, 38);
		panel_1.add(btnNewButton_2);
	}
}
