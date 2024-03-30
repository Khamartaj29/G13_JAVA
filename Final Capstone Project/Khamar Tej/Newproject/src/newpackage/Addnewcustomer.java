package newpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.JScrollBar;
import java.awt.Panel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTree;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Addnewcustomer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cname;
	private JTextField address;
	private JTextField email;
	private JTextField phno;
	private JTextField mnum;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addnewcustomer frame = new Addnewcustomer();
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
	public Addnewcustomer() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\91800\\Desktop\\icon.jpg"));
		setTitle("Electricity Billing System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1354, 768);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.scrollbar);
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBorder(new CompoundBorder());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(SystemColor.controlDkShadow);
		panel_2.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panel_2.setBackground(SystemColor.activeCaption);
		panel_2.setBounds(479, 65, 679, 614);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Customer Name");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(21, 112, 138, 32);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Meter Number");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1_1.setBounds(21, 191, 138, 32);
		panel_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Address");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1_2.setBounds(21, 266, 138, 32);
		panel_2.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Email");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1_3.setBounds(32, 336, 138, 32);
		panel_2.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Phone Number");
		lblNewLabel_2_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1_5.setBounds(21, 419, 138, 32);
		panel_2.add(lblNewLabel_2_1_5);
		
		JLabel lblNewLabel = new JLabel("   New Customer Details");
		lblNewLabel.setBackground(SystemColor.textHighlight);
		lblNewLabel.setBounds(202, 10, 412, 51);
		panel_2.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 33));
		
		cname = new JTextField();
		cname.setBounds(292, 108, 244, 45);
		panel_2.add(cname);
		cname.setColumns(10);
		
		address = new JTextField();
		address.setBounds(292, 253, 244, 45);
		panel_2.add(address);
		address.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(292, 323, 244, 45);
		panel_2.add(email);
		
		phno = new JTextField();
		phno.setColumns(10);
		phno.setBounds(292, 402, 244, 45);
		panel_2.add(phno);
		
		mnum = new JTextField();
		mnum.setColumns(10);
		mnum.setBounds(292, 178, 244, 45);
		panel_2.add(mnum);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String customername,meternumber,Address,Email,phonenumber;
				customername=cname.getText();
				meternumber=mnum.getText();
				Address=address.getText();
				Email=email.getText();
				phonenumber=phno.getText();
				
				if(customername.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Customer Name");
				}
				else if(meternumber.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Meter Number");
				}
				else if(Address.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Address");
				}
				else if(Email.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Email");
				}
				else if(phonenumber.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Phone Number");
				}
				else {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suretrust","root","root");
						String query="insert into Customerdetails values(?,?,?,?,?)";
						PreparedStatement ps=con.prepareStatement(query);
						ps.setString(1, cname.getText());
						ps.setString(2, mnum.getText());
						ps.setString(3, address.getText());
						ps.setString(4, email.getText());
						ps.setString(5, phno.getText());
						int i=ps.executeUpdate();
						JOptionPane.showMessageDialog(btnNewButton,i+" User Registerd successfully, Thanking You!");
						ps.close();
						con.close();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}				}
			}
			
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(159, 503, 149, 37);
		panel_2.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage1 rf=new Homepage1();
				rf.show();
				dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCancel.setBounds(387, 503, 149, 37);
		panel_2.add(btnCancel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\91800\\Downloads\\signupImage.png"));
		lblNewLabel_1.setBounds(10, 169, 448, 466);
		contentPane.add(lblNewLabel_1);
	}
}
