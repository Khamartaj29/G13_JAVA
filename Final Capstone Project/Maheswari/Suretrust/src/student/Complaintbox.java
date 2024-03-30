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
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Complaintbox extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textQue;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Complaintbox frame = new Complaintbox();
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
	public Complaintbox() {
		setTitle("complaintbox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 882, 459);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Students ,If you have any issues regarding school,Feel free to post here ");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(53, 51, 749, 40);
		contentPane.add(lblNewLabel);
		
		textQue = new JTextField();
		textQue.setBounds(68, 119, 709, 98);
		contentPane.add(textQue);
		textQue.setColumns(10);
		
		JButton btnNewButton = new JButton("SEND");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textQues;
				textQues=textQue.getText();
				if(textQues.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter issue");
				}
				else {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suretrust","root","tiger");
						String query="insert into problems values(?)";
						PreparedStatement ps= con.prepareStatement(query);
						ps.setString(1,textQue.getText());
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
				
		
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(595, 308, 127, 33);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage rf=new HomePage();
				rf.show();
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(87, 308, 105, 33);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("VIEW");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Problemview rf=new Problemview();
				rf.show();
				dispose();
			}
		});
		btnNewButton_2.setBackground(new Color(128, 255, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(307, 312, 117, 33);
		contentPane.add(btnNewButton_2);
	}
}
