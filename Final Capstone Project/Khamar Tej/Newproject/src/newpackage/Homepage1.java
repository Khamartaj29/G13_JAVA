package newpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.Window.Type;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Homepage1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage1 frame = new Homepage1();
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
	public Homepage1() {
		setForeground(SystemColor.inactiveCaption);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\91800\\Downloads\\pop.png"));
		setTitle("Electricity Billing System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 943, 593);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\91800\\Downloads\\elect1.jpg"));
		lblNewLabel.setBounds(264, -93, 663, 649);
		contentPane.add(lblNewLabel);
		
		JButton btnEnterBillDetails = new JButton("Enter Bill Details");
		btnEnterBillDetails.setForeground(SystemColor.textHighlight);
		btnEnterBillDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Billdetails rf=new Billdetails();
				rf.show();
				dispose();
			}
		});
		btnEnterBillDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEnterBillDetails.setBounds(10, 244, 244, 46);
		contentPane.add(btnEnterBillDetails);
		
		JButton btnNewButton_1_1_3 = new JButton("Sign Out");
		btnNewButton_1_1_3.setForeground(SystemColor.textHighlight);
		btnNewButton_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Welcome2 rf=new Welcome2();
				rf.show();
				dispose();
			}
		});
		btnNewButton_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_1_3.setBounds(10, 340, 244, 46);
		contentPane.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1 = new JButton("Add New Customer");
		btnNewButton_1.setForeground(SystemColor.textHighlight);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Addnewcustomer rf=new Addnewcustomer();
				rf.show();
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(10, 73, 244, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("Customer Details");
		btnNewButton_1_2.setForeground(SystemColor.textHighlight);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customerdetails rf=new Customerdetails();
				rf.show();
				dispose();
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2.setBounds(10, 168, 244, 46);
		contentPane.add(btnNewButton_1_2);
	}
}
