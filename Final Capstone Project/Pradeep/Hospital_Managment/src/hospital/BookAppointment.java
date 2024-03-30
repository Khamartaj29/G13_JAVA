package hospital;

import java.awt.BorderLayout;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class BookAppointment extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTable table;
	private JTextField textTokenNo;
	private JTextField textFirstName;
	private JTextField textLastName;
	private JTextField textAddress;
	private JTextField textPincode;
	private JTextField textMobile;
	private JTextField textDateReg;
	private JTextField textRoom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookAppointment frame = new BookAppointment();
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
	public BookAppointment() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(BookAppointment.class.getResource("/Assects/Suretrust.png")));
		setTitle("SURE Trust Hospital Managment System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1313, 687);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 1284, 631);
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(153, 50, 204)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(36, 22, 1218, 70);
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 215, 0)));
		panel_1.setBackground(new Color(153, 50, 204));
		panel.add(panel_1);
		
		JLabel lblMembershipRegistrationSystem = new JLabel("   PATIENT  BOOK  APPIONTMENT");
		lblMembershipRegistrationSystem.setIcon(new ImageIcon(BookAppointment.class.getResource("/Assects/Receptionist icon.png")));
		lblMembershipRegistrationSystem.setForeground(new Color(255, 255, 255));
		lblMembershipRegistrationSystem.setFont(new Font("Tempus Sans ITC", Font.BOLD, 40));
		lblMembershipRegistrationSystem.setBounds(266, 10, 723, 49);
		panel_1.add(lblMembershipRegistrationSystem);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(36, 113, 424, 419);
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 50, 204)));
		panel_2.setBackground(new Color(224, 255, 255));
		panel.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Token No");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(31, 27, 149, 25);
		panel_2.add(lblNewLabel);
		
		JLabel lblFirstname = new JLabel("First Name");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFirstname.setBounds(31, 62, 149, 25);
		panel_2.add(lblFirstname);
		
		textTokenNo = new JTextField();
		textTokenNo.setFont(new Font("Dialog", Font.PLAIN, 15));
		textTokenNo.setColumns(10);
		textTokenNo.setBounds(177, 27, 218, 25);
		panel_2.add(textTokenNo);
		
		textFirstName = new JTextField();
		textFirstName.setFont(new Font("Dialog", Font.PLAIN, 15));
		textFirstName.setColumns(10);
		textFirstName.setBounds(177, 62, 218, 26);
		panel_2.add(textFirstName);
		
		textLastName = new JTextField();
		textLastName.setFont(new Font("Dialog", Font.PLAIN, 15));
		textLastName.setColumns(10);
		textLastName.setBounds(177, 94, 218, 26);
		panel_2.add(textLastName);
		
		textAddress = new JTextField();
		textAddress.setFont(new Font("Dialog", Font.PLAIN, 15));
		textAddress.setColumns(10);
		textAddress.setBounds(177, 124, 218, 26);
		panel_2.add(textAddress);
		
		textPincode = new JTextField();
		textPincode.setFont(new Font("Dialog", Font.PLAIN, 15));
		textPincode.setColumns(10);
		textPincode.setBounds(177, 161, 218, 26);
		panel_2.add(textPincode);
		
		textMobile = new JTextField();
		textMobile.setFont(new Font("Dialog", Font.PLAIN, 15));
		textMobile.setColumns(10);
		textMobile.setBounds(177, 197, 218, 26);
		panel_2.add(textMobile);
		
		textDateReg = new JTextField();
		textDateReg.setFont(new Font("Dialog", Font.PLAIN, 15));
		textDateReg.setColumns(10);
		textDateReg.setBounds(177, 233, 218, 26);
		panel_2.add(textDateReg);
		
		final JComboBox cmbGender = new JComboBox();
		cmbGender.setModel(new DefaultComboBoxModel(new String[] {"Select", "Male", "Female", "Others"}));
		cmbGender.setFont(new Font("Tahoma", Font.BOLD, 12));
		cmbGender.setBounds(177, 308, 218, 29);
		panel_2.add(cmbGender);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLastName.setBounds(28, 94, 152, 25);
		panel_2.add(lblLastName);
		
		JLabel lblAddress = new JLabel("Address ");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAddress.setBounds(28, 125, 152, 25);
		panel_2.add(lblAddress);
		
		JLabel lblPincode = new JLabel("Pincode\r\n");
		lblPincode.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPincode.setBounds(31, 160, 149, 25);
		panel_2.add(lblPincode);
		
		JLabel lblMobileNo = new JLabel("Mobile No");
		lblMobileNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMobileNo.setBounds(31, 197, 149, 25);
		panel_2.add(lblMobileNo);
		
		JLabel lblDate = new JLabel("Date to Register");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDate.setBounds(31, 233, 149, 25);
		panel_2.add(lblDate);
		
		JLabel lblProveOfId = new JLabel("Gender ");
		lblProveOfId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProveOfId.setBounds(31, 309, 149, 25);
		panel_2.add(lblProveOfId);
		
		JLabel lblDoctorType = new JLabel("Doctor Type");
		lblDoctorType.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDoctorType.setBounds(31, 344, 149, 25);
		panel_2.add(lblDoctorType);
		
		JLabel lblAmountPaid = new JLabel("Amount Paid");
		lblAmountPaid.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAmountPaid.setBounds(31, 384, 149, 25);
		panel_2.add(lblAmountPaid);
		
		final JComboBox cmbAmountPaid = new JComboBox();
		cmbAmountPaid.setModel(new DefaultComboBoxModel(new String[] {"Choose Option", "₹500", "₹1000", "₹2000", "₹2500"}));
		cmbAmountPaid.setFont(new Font("Tahoma", Font.BOLD, 12));
		cmbAmountPaid.setBounds(177, 380, 218, 29);
		panel_2.add(cmbAmountPaid);
		
		final JComboBox cmbDoctorType = new JComboBox();
		cmbDoctorType.setModel(new DefaultComboBoxModel(new String[] {"Choose Option", "General", "Cardiologist", "Dentist", "Neurologist", "Ophthalmologist", "Gynecologist", "Pulmonologist", "Cardiologist"}));
		cmbDoctorType.setFont(new Font("Tahoma", Font.BOLD, 12));
		cmbDoctorType.setBounds(177, 345, 218, 25);
		panel_2.add(cmbDoctorType);
		
		JLabel lblNewLabel_1 = new JLabel("Room No");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(31, 268, 149, 29);
		panel_2.add(lblNewLabel_1);
		
		textRoom = new JTextField();
		textRoom.setFont(new Font("Dialog", Font.PLAIN, 15));
		textRoom.setColumns(10);
		textRoom.setBounds(177, 269, 218, 26);
		panel_2.add(textRoom);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(470, 113, 784, 419);
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 50, 204)));
		panel_4.setBackground(new Color(224, 255, 255));
		panel.add(panel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 765, 399);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setForeground(new Color(0, 0, 0));
		table.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Token No", "First Name", "Last Name", "Address", "Pincode", "Mobile No", "Date to Register", "Room N0", "Gender", "Doctor Type", "Amount Paid"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(53);
		table.getColumnModel().getColumn(3).setPreferredWidth(77);
		table.getColumnModel().getColumn(4).setPreferredWidth(50);
		table.getColumnModel().getColumn(5).setPreferredWidth(87);
		table.getColumnModel().getColumn(6).setPreferredWidth(84);
		table.getColumnModel().getColumn(7).setPreferredWidth(55);
		table.getColumnModel().getColumn(8).setPreferredWidth(53);
		table.getColumnModel().getColumn(9).setPreferredWidth(88);
		table.getColumnModel().getColumn(10).setPreferredWidth(68);
		scrollPane.setViewportView(table);
		
		JButton button = new JButton("Add Record");
		button.setBounds(81, 572, 153, 33);
		panel.add(button);
		button.setForeground(new Color(230, 230, 250));
		button.setBackground(new Color(106, 90, 205));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 DefaultTableModel model = (DefaultTableModel) table.getModel();
				 model.addRow(new Object[]{			            
				            textTokenNo.getText(),
							textFirstName.getText(),
							textLastName.getText(),
							textAddress.getText(),
							textPincode.getText(),
							textMobile.getText(),
							textDateReg.getText(),
							textRoom.getText(),
							cmbGender.getSelectedItem(),
							cmbDoctorType.getSelectedItem(),
							cmbAmountPaid.getSelectedItem(),
		    	   });
			     
			        
			       if (table.getSelectedRow() == -1){
			           if (table.getRowCount() == 0){
			           JOptionPane.showMessageDialog(null, "Update confirmed","Hospital  Book Appointment",
			                   JOptionPane.OK_OPTION);
			           }
			       }   
			     
			        }
			        
			
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton button_2 = new JButton("Delete");
		button_2.setBounds(327, 572, 133, 33);
		panel.add(button_2);
		button_2.setForeground(new Color(230, 230, 250));
		button_2.setBackground(new Color(255, 0, 0));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
		        if(table.getSelectedRow()==-1){
		            if(table.getRowCount()==0){

		                JOptionPane.showMessageDialog(null, "No data to delete ", 
		                        "Patient Book Appointment",JOptionPane.OK_OPTION);
		            }else{

		                JOptionPane.showMessageDialog(null, "Select a row to delete ", 
		                        "Patient Book Appointment",JOptionPane.OK_OPTION);
		            }
		        }else{
		            model.removeRow(table.getSelectedRow());
		        }     
				
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton button_1 = new JButton("Reset");
		button_1.setBounds(569, 572, 133, 33);
		panel.add(button_1);
		button_1.setForeground(new Color(230, 230, 250));
		button_1.setBackground(new Color(128, 0, 0));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textTokenNo.setText("");
				textFirstName.setText("");
				textLastName.setText("");
				textAddress.setText("");
				textPincode.setText("");
				textMobile.setText("");
				textDateReg.setText("");
				textRoom.setText("");
				cmbGender.setSelectedItem("Make a Selection");
				cmbDoctorType.setSelectedItem("Make a Selection");
				cmbAmountPaid.setSelectedItem("Make a Selection");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton button_4 = new JButton("Print");
		button_4.setBounds(823, 572, 133, 33);
		panel.add(button_4);
		button_4.setForeground(new Color(230, 230, 250));
		button_4.setBackground(new Color(178, 34, 34));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					table.print();
				}
				catch(java.awt.print.PrinterException e){
					System.err.format("No Printer found", e.getMessage());
				}	
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton button_3 = new JButton("Exit");
		button_3.setBounds(1063, 570, 133, 33);
		panel.add(button_3);
		button_3.setForeground(new Color(230, 230, 250));
		button_3.setBackground(new Color(85, 107, 47));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage pp=new HomePage();
				pp.show();
				dispose();
				
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(153, 50, 204));
		separator.setForeground(new Color(153, 50, 204));
		separator.setBounds(36, 549, 1218, 2);
		panel.add(separator);
	}
}
