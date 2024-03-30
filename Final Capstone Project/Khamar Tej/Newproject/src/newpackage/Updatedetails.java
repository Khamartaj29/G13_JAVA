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
import java.awt.Color;

public class Updatedetails extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textc;
	private JTextField texta;
	private JTextField texte;
	private JTextField textp;
	private JTextField textm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Updatedetails frame = new Updatedetails();
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
	public Updatedetails() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\91800\\Desktop\\icon.jpg"));
		setTitle("Electricity Billing System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1354, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBorder(new CompoundBorder());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(SystemColor.controlDkShadow);
		panel_2.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panel_2.setBackground(SystemColor.controlHighlight);
		panel_2.setBounds(496, 67, 797, 614);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Customer Name");
		lblNewLabel_2_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(21, 112, 138, 32);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Meter Number");
		lblNewLabel_2_1_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1_1.setBounds(21, 191, 138, 32);
		panel_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Address");
		lblNewLabel_2_1_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1_2.setBounds(21, 266, 138, 32);
		panel_2.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Email");
		lblNewLabel_2_1_3.setForeground(new Color(0, 0, 255));
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1_3.setBounds(32, 336, 138, 32);
		panel_2.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Phone Number");
		lblNewLabel_2_1_5.setForeground(new Color(0, 0, 255));
		lblNewLabel_2_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1_5.setBounds(21, 419, 138, 32);
		panel_2.add(lblNewLabel_2_1_5);
		
		JLabel lblNewLabel = new JLabel("Update Details");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBackground(new Color(230, 230, 250));
		lblNewLabel.setBounds(202, 10, 412, 51);
		panel_2.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 33));
		
		textc = new JTextField();
		textc.setBounds(292, 108, 244, 45);
		panel_2.add(textc);
		textc.setColumns(10);
		
		texta = new JTextField();
		texta.setBounds(292, 253, 244, 45);
		panel_2.add(texta);
		texta.setColumns(10);
		
		texte = new JTextField();
		texte.setColumns(10);
		texte.setBounds(292, 323, 244, 45);
		panel_2.add(texte);
		
		textp = new JTextField();
		textp.setColumns(10);
		textp.setBounds(292, 402, 244, 45);
		panel_2.add(textp);
		
		textm = new JTextField();
		textm.setColumns(10);
		textm.setBounds(292, 178, 244, 45);
		panel_2.add(textm);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setForeground(new Color(0, 0, 205));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String CustomerName = textc.getText();
		        String MeterNumber= textm.getText();
		        String Address= texta.getText();
		        String Email= texte.getText();
		        String PhoneNumber= textp.getText();
		         try{ Class.forName("com.mysql.jdbc.Driver");
		        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/suretrust","root","root");
		        
		        String sql = "update Customerdetails SET Email='"+texte+"',   PhoneNumber='"+textp+"', CustomerName='"+textc+"',Address='"+texta+"'WHERE MeterNumber='"+textm+"'";
		        //String sql = "update Customerdetails SET customername='"+textc+"',Address='"+texta+"',Email='"+texte+"',phonenumber='"+textp+"'WHERE meternumber='"+textm+"'";
		        PreparedStatement ptstmt = conn.prepareStatement(sql);
		        
		        ptstmt.execute();
		        
		             JOptionPane.showMessageDialog(null, "Record updated successfully");
		        
		         }catch(Exception e1){
		             JOptionPane.showMessageDialog(null, e1);
		         }
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(159, 503, 149, 37);
		panel_2.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage2 rf=new Homepage2();
				rf.show();
				dispose();
			}
		});
		btnCancel.setForeground(new Color(0, 0, 205));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCancel.setBounds(387, 503, 149, 37);
		panel_2.add(btnCancel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(255, 245, 238));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\91800\\Downloads\\hicon2.jpg"));
		lblNewLabel_1.setBounds(0, 55, 486, 626);
		contentPane.add(lblNewLabel_1);
	}
}
