package newpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Billdetails extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textmeter;
	private JTextField textunits;
	private JTextField texttotal;
	private JTextField textmonth;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billdetails frame = new Billdetails();
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
	public Billdetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 446);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Bill Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(269, 22, 234, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Meter Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(74, 102, 136, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Month");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(74, 167, 136, 32);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Units Consumed");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(74, 222, 147, 32);
		contentPane.add(lblNewLabel_1_2);
		
		textmeter = new JTextField();
		textmeter.setBounds(329, 105, 214, 32);
		contentPane.add(textmeter);
		textmeter.setColumns(10);
		
		textunits = new JTextField();
		textunits.setColumns(10);
		textunits.setBounds(329, 222, 214, 32);
		contentPane.add(textunits);
		
		JLabel lblNewLabel_2 = new JLabel("Total Bill");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(80, 276, 154, 20);
		contentPane.add(lblNewLabel_2);
		
		JButton btnenter = new JButton("Enter");
		btnenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String meternumber,month,unitsconsumed,totalbill;
				meternumber=textmeter.getText();
				month=textmonth.getText();
				unitsconsumed=textunits.getText();
				totalbill=texttotal.getText();
				
				if(meternumber.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Meter Number");
				}
				if(month.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Full month");
				}
				else if(unitsconsumed.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter units consumed");
				}
				else if(totalbill.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter totalbill");
				}
				else {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suretrust","root","root");
					String query="insert into Billdetails values(?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1, textmeter.getText());
					ps.setString(2, textmonth.getText());
					ps.setString(3, textunits.getText());
					ps.setString(4, texttotal.getText());
					int i=ps.executeUpdate();
					JOptionPane.showMessageDialog(btnenter,i+" Details Entered successfully, Thank You!");
					ps.close();
					con.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			}
		});
		btnenter.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnenter.setBounds(161, 367, 110, 32);
		contentPane.add(btnenter);
		
		JButton btnCancel_1 = new JButton("Cancel");
		btnCancel_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage1 rf=new Homepage1();
				rf.show();
				dispose();
			}
		});
		btnCancel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancel_1.setBounds(348, 367, 110, 32);
		contentPane.add(btnCancel_1);
		
		texttotal = new JTextField();
		texttotal.setColumns(10);
		texttotal.setBounds(329, 279, 214, 32);
		contentPane.add(texttotal);
		
		textmonth = new JTextField();
		textmonth.setColumns(10);
		textmonth.setBounds(329, 167, 214, 32);
		contentPane.add(textmonth);
	}
}
