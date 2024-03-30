package hospital;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;

public class PatientPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JPanel contentPane;
	private JTextField textPId;
	private JTextField textPName;
	private JTextField textGender;
	private JTextField textMobile;
	private JButton btnAdd;
	private JButton btnDelete;
	private JButton btnUpdate;
	private JButton btnClear;
	DefaultTableModel model;
	private JTable table;
	private JTable JTable;
	//private JTextArea textAddress;
	private JTextField textAddress;

	Connection con=null;
	PreparedStatement pst=null;
	public void patient() {
		//initComponents();
		show_table();
		
	}
	
	private void show_table() {
		int CC;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/surst","root","root");
			pst=con.prepareStatement("SELECT * FROM patient");
			ResultSet Rs=pst.executeQuery();
			ResultSetMetaData RSMD=Rs.getMetaData();
			CC=RSMD.getColumnCount();
			DefaultTableModel DFT=(DefaultTableModel)JTable.getModel();
			DFT.setRowCount(0);
			while(Rs.next()) {
				Vector v2=new Vector();
				for(int i=1;i<=CC;i++) {
					v2.add(Rs.getString("PId"));
					v2.add(Rs.getString("PName"));
					v2.add(Rs.getString("Gender"));
					v2.add(Rs.getString("Mobile"));
					v2.add(Rs.getString("Address"));
				}
				DFT.addRow(v2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientPage frame = new PatientPage();
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
	public PatientPage() {
		setTitle("SURE Trust Hospital Managment System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PatientPage.class.getResource("/Assects/Suretrust.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1028, 627);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(153, 50, 204)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(16, 140, 317, 427);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Fill Patient Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(220, 20, 60)));
		panel.setBackground(new Color(224, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		final JButton btnExit = new JButton("X");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage lp=new HomePage();
				lp.show();
				dispose();
			}
		});
		btnExit.setBounds(263, 25, 46, 21);
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(btnExit);
		
		JLabel lblNewLabel_1 = new JLabel("Patient I'd      :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(22, 75, 128, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Patient Name :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(22, 120, 128, 21);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender            :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(22, 174, 128, 13);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile No      :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(22, 222, 128, 13);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Address          :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(22, 267, 128, 13);
		panel.add(lblNewLabel_5);
		
		textPId = new JTextField();
		textPId.setBounds(150, 74, 153, 19);
		panel.add(textPId);
		textPId.setColumns(10);
		
		textPName = new JTextField();
		textPName.setBounds(150, 123, 153, 19);
		panel.add(textPName);
		textPName.setColumns(10);
		
		textGender = new JTextField();
		textGender.setBounds(150, 173, 153, 19);
		panel.add(textGender);
		textGender.setColumns(10);
		
		textMobile = new JTextField();
		textMobile.setBounds(150, 221, 153, 19);
		panel.add(textMobile);
		textMobile.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pid,pname,gender,mobile,address;
				pid=textPId.getText();
				pname=textPName.getText();
				gender=textGender.getText();
				mobile=textMobile.getText();
				address=textAddress.getText();
				
				if(pid.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Patient I'd");
				}
				else if(pname.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Patient Name");
				}
				else if(gender.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Gender");
				}
				else if(mobile.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Mobile Number");
				}
				else if(address.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter Address");
				}
				else {
					try {
						con=DriverManager.getConnection("jdbc:mysql://localhost/suretrust","root","root");
						pst=con.prepareStatement("insert into patient(PId,PName,Gender,Mobile,Address)values(?,?,?,?,?)");
						pst.setString(1, pid);
						pst.setString(2, pname);
						pst.setString(3, gender);
						pst.setString(4, mobile);
						pst.setString(5, address);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Data Added Successfullu!");
						textPId.setText("");
						textPName.setText("");
						textGender.setText("");
						textMobile.setText("");
						textAddress.setText("");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnAdd.setForeground(new Color(230, 230, 250));
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAdd.setBackground(new Color(60, 179, 113));
		btnAdd.setBounds(10, 337, 85, 21);
		panel.add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pid = textPId.getText();
		        String PName= textPName.getText();
		        String Gender= textGender.getText();
		        String Mobile= textMobile.getText();
		        String Address= textAddress.getText();
		         try{ Class.forName("com.mysql.jdbc.Driver");
		        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/suretrust","root","root");
		        
		        String sql = "update `Patient` SET `PName`='"+PName+"',`Gender`='"+Gender+"',`Mobile`='"+Mobile+"',`Address`='"+Address+"'WHERE PId='"+Pid+"'";
		        PreparedStatement ptstmt = conn.prepareStatement(sql);
		        ptstmt.execute();
		        
		             JOptionPane.showMessageDialog(null, "Patient updated successfully");
		        
		         }catch(Exception e1){
		             JOptionPane.showMessageDialog(null, e1);
		         }
			}
		});
		btnUpdate.setBackground(new Color(186, 85, 211));
		btnUpdate.setForeground(new Color(230, 230, 250));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUpdate.setBounds(112, 337, 96, 21);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnDelete.setBackground(new Color(178, 34, 34));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDelete.setForeground(new Color(230, 230, 250));
		btnDelete.setBounds(224, 337, 85, 21);
		panel.add(btnDelete);
		
		textAddress = new JTextField();
		textAddress.setBounds(150, 266, 153, 26);
		panel.add(textAddress);
		textAddress.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 325, 272, 2);
		panel.add(separator);
		
		JButton btnNewButton = new JButton("View Patients");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{ Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sureTrust","root","root");
                Statement st= conn.createStatement();
                String sql="select * from Patient";
               PreparedStatement pstmt=conn.prepareStatement(sql);
               ResultSet rs= pstmt.executeQuery();
               DefaultTableModel tm=(DefaultTableModel)JTable.getModel();
               tm.setRowCount(0);
               while(rs.next()){
               Object o[]={rs.getString("PID"),rs.getString("PName"),rs.getString("Gender"),rs.getString("Mobile"),rs.getString("Address")};
               tm.addRow(o);
               }
                }catch(Exception e1){
                    JOptionPane.showMessageDialog(null,e1);
                }
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setForeground(new Color(230, 230, 250));
		btnNewButton.setBounds(74, 384, 163, 21);
		panel.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model=(DefaultTableModel)JTable.getModel();
				int selectedIndex=JTable.getSelectedRow();
				//int id=Integer.parseInt(model.getValueAt(selectedIndex,0).toString());
				textPId.setText(model.getValueAt(selectedIndex,0).toString());
				textPName.setText(model.getValueAt(selectedIndex,1).toString());
				textGender.setText(model.getValueAt(selectedIndex,2).toString());
				textMobile.setText(model.getValueAt(selectedIndex,3).toString());
				textAddress.setText(model.getValueAt(selectedIndex,4).toString());
			}
		});
		scrollPane.setBounds(343, 140, 650, 419);
		contentPane.add(scrollPane);
		
		JTable = new JTable();
		JTable.setBackground(new Color(230, 230, 250));
		scrollPane.setViewportView(JTable);
		JTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Patient Id", "Patient Name", "Gender", "Mobile No", "Address"
			}
		));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(255, 215, 0)));
		panel_1.setBackground(new Color(153, 50, 204));
		panel_1.setBounds(16, 35, 976, 65);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("   Patient Registration");
		lblNewLabel.setBounds(274, 10, 421, 40);
		panel_1.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(PatientPage.class.getResource("/Assects/Patient icon.png")));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 38));
		JTable.getColumnModel().getColumn(0).setPreferredWidth(90);
		JTable.getColumnModel().getColumn(1).setPreferredWidth(100);
		JTable.getColumnModel().getColumn(1).setMinWidth(20);
		JTable.getColumnModel().getColumn(3).setPreferredWidth(80);
		JTable.getColumnModel().getColumn(4).setPreferredWidth(90);
		

	
	}
}
