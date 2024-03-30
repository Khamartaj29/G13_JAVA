package newpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;



import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Customerdetails extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JTable JTable;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customerdetails frame = new Customerdetails();
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
	public Customerdetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("View Customers");
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{ Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suretrust","root","root");
                //Statement st=con.createStatement();
                String sql="select * from Customerdetails";
               PreparedStatement pstmt=con.prepareStatement(sql);
               ResultSet rs= pstmt.executeQuery();
               DefaultTableModel tm=(DefaultTableModel)JTable.getModel();
               tm.setRowCount(0);
               while(rs.next()){
               Object o[]={rs.getString("customername"),rs.getString("meternumber"),rs.getString("Address"),rs.getString("Email"),rs.getString("phonenumber")};
               tm.addRow(o);
               }
                }catch(Exception e1){
                    JOptionPane.showMessageDialog(null,e1);
                }
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(10, 55, 186, 37);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 102, 810, 385);
		contentPane.add(scrollPane);
		
		JTable = new JTable();
		JTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Customer Name", "Meter Number", "Address", "Email", "Phone Number"
			}
		));
		JTable.getColumnModel().getColumn(0).setPreferredWidth(85);
		JTable.getColumnModel().getColumn(1).setPreferredWidth(81);
		JTable.getColumnModel().getColumn(4).setPreferredWidth(87);
		scrollPane.setViewportView(JTable);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setForeground(SystemColor.textHighlight);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage1 wl=new Homepage1();
				wl.show();
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(629, 55, 176, 37);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("ALL CUSTOMER DETAILS");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setBackground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(245, 10, 319, 35);
		contentPane.add(lblNewLabel);
	}
}
