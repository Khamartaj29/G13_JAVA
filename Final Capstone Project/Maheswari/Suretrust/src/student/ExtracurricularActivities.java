package student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class ExtracurricularActivities extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExtracurricularActivities frame = new ExtracurricularActivities();
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
	public ExtracurricularActivities() {
		setTitle("ExtraActivities");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 504);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Extra Curricular Activities");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\balar\\OneDrive\\Pictures\\user-generated-content_4660903.png"));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(164, 10, 393, 63);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name ");
		lblNewLabel_1.setForeground(new Color(0, 128, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(83, 121, 141, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Register No.");
		lblNewLabel_2.setForeground(new Color(0, 128, 0));
		lblNewLabel_2.setBackground(new Color(0, 128, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(83, 195, 141, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Interested Activity");
		lblNewLabel_3.setForeground(new Color(0, 128, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(83, 255, 230, 46);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Standard");
		lblNewLabel_4.setForeground(new Color(0, 128, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(87, 331, 158, 25);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(342, 135, 230, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(342, 199, 230, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(344, 273, 228, 28);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(343, 338, 230, 25);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fname,regno,activity,standared;
				fname=textField.getText();
				regno=textField_1.getText();
				activity=textField_2.getText();
				standared=textField_3.getText();
				
				
				if(fname.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Full Name");
				}
				else if(regno.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Registerno.");
				}
				else if(activity.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Interested activity");
				}
				else if(standared.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter standared");
				}
				
				else {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suretrust","root","tiger");
					String query="insert into games  values(?,?,?,?)";
					PreparedStatement ps= con.prepareStatement(query);
					ps.setString(1, textField.getText());
					ps.setString(2, textField_1.getText());
					ps.setString(3, textField_2.getText());
					ps.setString(4, textField_3.getText());
					int i=ps.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton,i+"Record added successfully");
					ps.close();
					con.close();
				} catch (Exception e1) {
					
					
					
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}});
		btnNewButton.setBackground(new Color(128, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(309, 407, 134, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage rf=new HomePage();
				rf.show();
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(62, 409, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("View");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Viewdata rf=new Viewdata();
				rf.show();
				dispose();
			}
		});
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(536, 407, 113, 25);
		contentPane.add(btnNewButton_2);
	}
}
