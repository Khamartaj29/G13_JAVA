package Employee_Management_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;

public class Employee_Details extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textId;
	private JTextField textDept;
	private JTextField textPosition;
	private JTextField textCar;
	private JTextField textMobile;
	private JTextField textArea;
	private JButton btnDone;
	private JTable JTable_1;
	private JTable JTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_Details frame = new Employee_Details();
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
	public Employee_Details() {
		setTitle("Employee Management System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Employee_Details.class.getResource("/Assets/Screenshot 2024-03-26 193041.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1443, 777);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "EMPLOYEE DETAILS", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(153, 50, 204)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Back To Home Page");
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home_Page hp=new Home_Page();
				hp.show();
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton.setBounds(418, 471, 248, 68);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1.setBounds(24, 49, 205, 54);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Department");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(24, 186, 205, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Position");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_1_1.setBounds(24, 235, 205, 46);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Car Number");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_1_1_1.setBounds(24, 291, 205, 31);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Mobile Number");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_1_1_1_1.setBounds(24, 345, 205, 31);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Area");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_1_1_1_1_1.setBounds(24, 400, 205, 31);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Employee Id");
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_1_2.setBounds(24, 113, 205, 50);
		contentPane.add(lblNewLabel_1_1_2);
		
		textName = new JTextField();
		textName.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textName.setBounds(249, 57, 284, 39);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textId = new JTextField();
		textId.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textId.setColumns(10);
		textId.setBounds(249, 119, 284, 39);
		contentPane.add(textId);
		
		textDept = new JTextField();
		textDept.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textDept.setColumns(10);
		textDept.setBounds(249, 173, 284, 39);
		contentPane.add(textDept);
		
		textPosition = new JTextField();
		textPosition.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textPosition.setColumns(10);
		textPosition.setBounds(249, 231, 284, 39);
		contentPane.add(textPosition);
		
		textCar = new JTextField();
		textCar.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textCar.setColumns(10);
		textCar.setBounds(249, 283, 284, 39);
		contentPane.add(textCar);
		
		textMobile = new JTextField();
		textMobile.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textMobile.setColumns(10);
		textMobile.setBounds(249, 337, 284, 39);
		contentPane.add(textMobile);
		
		textArea = new JTextField();
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textArea.setColumns(10);
		textArea.setBounds(249, 393, 284, 39);
		contentPane.add(textArea);
		
		btnDone = new JButton("Submit");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name,id,dept,position,car,mobile,area;
				name=textName.getText();
				id=textId.getText();
				dept=textDept.getText();
				position=textPosition.getText();
				car=textCar.getText();
				mobile=textMobile.getText();
				area=textArea.getText();
				
				if(name.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Employee Name");
				}
				else if(id.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Employee Id");
				}
				else if(dept.equals("")) {
					JOptionPane.showMessageDialog(null,  "Please Enter Your Department");
				}
				else if(position.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Your Position");
				}
				else if(car.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Your Car Number");
				}
				else if(mobile.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Mobile Number");
				}
				else if(area.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter area");
				}
				else {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeemanagementsystem","root","Sabiya@123");
						String query="insert into employeemanagementsystem.employee_details values(?,?,?,?,?,?,?)";
						PreparedStatement ps=con.prepareStatement(query);
						ps.setString(1, textName.getText());
						ps.setInt(2, Integer.parseInt(textId.getText()));
						ps.setString(3, textDept.getText());
						ps.setString(4, textPosition.getText());
						ps.setInt(5, Integer.parseInt(textCar.getText()));
						ps.setString(6, textMobile.getText());
						ps.setString(7, textArea.getText());
						int i=ps.executeUpdate();
						JOptionPane.showMessageDialog(btnDone,i+ "Employee Details Entered Successfully!");
						ps.close();
						con.close();
					    
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
			}});
		btnDone.setForeground(new Color(255, 255, 255));
		btnDone.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnDone.setBackground(new Color(1, 197, 138));
		btnDone.setBounds(35, 471, 205, 68);
		contentPane.add(btnDone);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 235, 215));
		panel.setBorder(new LineBorder(new Color(153, 50, 204), 3));
		panel.setForeground(new Color(255, 192, 203));
		panel.setBounds(706, 49, 702, 602);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrolpane = new JScrollPane();
		scrolpane.setBounds(10, 10, 682, 582);
		panel.add(scrolpane);
		
		JTable_1 = new JTable();
		JTable_1.setBackground(new Color(255, 255, 255));
		JTable_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		JTable_1.setBorder(null);
		JTable_1.setForeground(new Color(0, 0, 0));
		JTable_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Employee Name", "Employee Id", "Department", "Position", "Car Number", "Mobile Number", "Area"
			}
		));
		JTable_1.getColumnModel().getColumn(0).setPreferredWidth(111);
		JTable_1.getColumnModel().getColumn(1).setPreferredWidth(90);
		JTable_1.getColumnModel().getColumn(2).setPreferredWidth(109);
		JTable_1.getColumnModel().getColumn(3).setPreferredWidth(119);
		JTable_1.getColumnModel().getColumn(4).setPreferredWidth(96);
		JTable_1.getColumnModel().getColumn(5).setPreferredWidth(106);
		JTable_1.getColumnModel().getColumn(6).setPreferredWidth(145);
		scrolpane.setViewportView(JTable_1);
		
		JButton btnViewEmployeeDetails = new JButton("View Employee Details");
		btnViewEmployeeDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeemanagementsystem","root","Sabiya@123");
					Statement st=con.createStatement();
					String sql="select * from employee_details";
					PreparedStatement ps=con.prepareStatement(sql);
					ResultSet rs=ps.executeQuery();
					DefaultTableModel tm=(DefaultTableModel)JTable_1.getModel();
					tm.setRowCount(0);
					while(rs.next()) {
						Object o[]= {rs.getString("name"),rs.getString("id"),rs.getString("dept"),rs.getString("position"),rs.getString("carno"),rs.getString("mobile"),rs.getString("area")};
						tm.addRow(o);
					}
				    
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnViewEmployeeDetails.setForeground(new Color(255, 255, 255));
		btnViewEmployeeDetails.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnViewEmployeeDetails.setBackground(new Color(0, 0, 255));
		btnViewEmployeeDetails.setBounds(171, 586, 332, 68);
		contentPane.add(btnViewEmployeeDetails);
	}
}
