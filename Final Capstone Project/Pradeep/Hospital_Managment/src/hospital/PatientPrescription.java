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
import javax.swing.border.TitledBorder;

public class PatientPrescription extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTable table;
	private JTextField textrefno;
	private JTextField textdose;
	private JTextField textnotab;
	private JTextField textuse;
	private JTextField textadvice;
	private JTextField textdailydose;
	private JTextField textsideeffects;
	private JTextField textinformation;
	private JTextField textissuedate;
	private JTextField textexpiredate;
	private JTextField textpid;
	private JTextField textpname;
	private JTextField textdob;
	private JTextField textaddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientPrescription frame = new PatientPrescription();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public PatientPrescription() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PatientPrescription.class.getResource("/Assects/Suretrust.png")));
		setTitle("SURE Trust Hospital Managment System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1310, 801);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 1276, 754);
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
		
		JLabel lblMembershipRegistrationSystem = new JLabel("   PATIENT  PRESCRIPTION");
		lblMembershipRegistrationSystem.setIcon(new ImageIcon(PatientPrescription.class.getResource("/Assects/Receptionist icon.png")));
		lblMembershipRegistrationSystem.setForeground(new Color(255, 255, 255));
		lblMembershipRegistrationSystem.setFont(new Font("Tempus Sans ITC", Font.BOLD, 40));
		lblMembershipRegistrationSystem.setBounds(266, 10, 656, 49);
		panel_1.add(lblMembershipRegistrationSystem);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(36, 102, 757, 352);
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 50, 204)));
		panel_2.setBackground(new Color(224, 255, 255));
		panel.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Name of Tablets");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(31, 197, 149, 25);
		panel_2.add(lblNewLabel);
		
		JLabel lblFirstname = new JLabel("Reference No");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFirstname.setBounds(31, 232, 149, 25);
		panel_2.add(lblFirstname);
		
		textrefno = new JTextField();
		textrefno.setFont(new Font("Dialog", Font.PLAIN, 15));
		textrefno.setColumns(10);
		textrefno.setBounds(177, 231, 175, 26);
		panel_2.add(textrefno);
		
		textdose = new JTextField();
		textdose.setFont(new Font("Dialog", Font.PLAIN, 15));
		textdose.setColumns(10);
		textdose.setBounds(560, 26, 175, 26);
		panel_2.add(textdose);
		
		textnotab = new JTextField();
		textnotab.setFont(new Font("Dialog", Font.PLAIN, 15));
		textnotab.setColumns(10);
		textnotab.setBounds(177, 267, 175, 26);
		panel_2.add(textnotab);
		
		textuse = new JTextField();
		textuse.setFont(new Font("Dialog", Font.PLAIN, 15));
		textuse.setColumns(10);
		textuse.setBounds(560, 231, 175, 26);
		panel_2.add(textuse);
		
		textadvice = new JTextField();
		textadvice.setFont(new Font("Dialog", Font.PLAIN, 15));
		textadvice.setColumns(10);
		textadvice.setBounds(560, 267, 175, 26);
		panel_2.add(textadvice);
		
		textdailydose = new JTextField();
		textdailydose.setFont(new Font("Dialog", Font.PLAIN, 15));
		textdailydose.setColumns(10);
		textdailydose.setBounds(177, 303, 175, 26);
		panel_2.add(textdailydose);
		
		JLabel lblLastName = new JLabel("Dose (mg)");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLastName.setBounds(412, 27, 152, 25);
		panel_2.add(lblLastName);
		
		JLabel lblAddress = new JLabel("No of Tablets");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAddress.setBounds(31, 267, 152, 25);
		panel_2.add(lblAddress);
		
		JLabel lblPincode = new JLabel("Issued Date");
		lblPincode.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPincode.setBounds(412, 138, 149, 25);
		panel_2.add(lblPincode);
		
		JLabel lblMobileNo = new JLabel("Expire Date");
		lblMobileNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMobileNo.setBounds(412, 185, 149, 25);
		panel_2.add(lblMobileNo);
		
		JLabel lblDate = new JLabel("Daily Dose");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDate.setBounds(31, 303, 149, 25);
		panel_2.add(lblDate);
		
		JLabel lblProveOfId = new JLabel("Other Information");
		lblProveOfId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProveOfId.setBounds(412, 99, 149, 25);
		panel_2.add(lblProveOfId);
		
		JLabel lblNewLabel_1 = new JLabel("Side Effects");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(412, 60, 149, 29);
		panel_2.add(lblNewLabel_1);
		
		textsideeffects = new JTextField();
		textsideeffects.setFont(new Font("Dialog", Font.PLAIN, 15));
		textsideeffects.setColumns(10);
		textsideeffects.setBounds(560, 61, 175, 26);
		panel_2.add(textsideeffects);
		
		final JComboBox cmbnametab = new JComboBox();
		cmbnametab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cmbnametab.getSelectedItem().equals("Crosin")) 
				{
					textrefno.setText("Cro@321");
					textdose.setText("2");
					textissuedate.setText("28/03/2024");
					textexpiredate.setText("20/05/2027");
					textdailydose.setText("4");
					textsideeffects.setText("Nausea,Sickness");
					textinformation.setText("Used for flu,pain,headache and fewer");
					textadvice.setText("Keep away from Sunlight");
					textuse.setText("Glass of Hot water and 1 tablet you have to take");
				}
				else if(cmbnametab.getSelectedItem().equals("Calpal")) 
				{
					textrefno.setText("Cal123pal");
					textdose.setText("0.5");
					textissuedate.setText("20/02/2023");
					textexpiredate.setText("10/03/2025");
					textdailydose.setText("3");
					textsideeffects.setText("Nausea,Sickness");
					textinformation.setText("Used for pain,headache and fewer");
					textuse.setText("Glass of Hot water and 1 tablet you have to take");
					textadvice.setText("Keep away from Sunlight");
				}
				else if(cmbnametab.getSelectedItem().equals("Dolo 650")) 
				{
					textrefno.setText("D650lo1234");
					textdose.setText("1.5");
					textissuedate.setText("01/09/2022");
					textexpiredate.setText("14/05/2026");
					textdailydose.setText("3");
					textsideeffects.setText("Nausea,Sleep,Sickness");
					textinformation.setText("Used for pain and fewer");
					textuse.setText("Glass of Hot water and 1 tablet you have to take");
					textadvice.setText("Keep away from Sunlight");
				}
				else if(cmbnametab.getSelectedItem().equals("Saridon")) 
				{
					textrefno.setText("S98765don");
					textdose.setText("1");
					textissuedate.setText("09/06/2023");
					textexpiredate.setText("12/06/2025");
					textdailydose.setText("3");
					textsideeffects.setText("Sleep,Sickness");
					textinformation.setText("Used for Headache");
					textuse.setText("Glass of Hot water and 1 tablet you have to take");
					textadvice.setText("Keep away from Sunlight");
				}
				else if(cmbnametab.getSelectedItem().equals("Vertirest")) 
				{
					textrefno.setText("V1234rest5432");
					textdose.setText("0.5");
					textissuedate.setText("05/01/2024");
					textexpiredate.setText("17/03/2025");
					textdailydose.setText("2");
					textsideeffects.setText("Swollen face,Sleep,Sickness");
					textinformation.setText("Used for nervous system");
					textuse.setText("Glass of Hot water and 1 tablet you have to take");
					textadvice.setText("Keep away from Sunlight");
				}
				else if(cmbnametab.getSelectedItem().equals("Seenarest")) 
				{
					textrefno.setText("S12309Re34");
					textdose.setText("1.5");
					textissuedate.setText("01/01/2024");
					textexpiredate.setText("13/10/2022");
					textdailydose.setText("3");
					textsideeffects.setText("Swollen face,Sickness");
					textinformation.setText("Used for heavy cold");
					textuse.setText("Glass of Hot water and 1 tablet you have to take");
					textadvice.setText("Keep away from Sunlight");
				}
				else if(cmbnametab.getSelectedItem().equals("Sumo")) 
				{
					textrefno.setText("S9391421MO");
					textdose.setText("1");
					textissuedate.setText("29/01/2024");
					textexpiredate.setText("16/05/2027");
					textdailydose.setText("3");
					textsideeffects.setText("Sleep and Sickness");
					textinformation.setText("Used for Heavy fewer");
					textuse.setText("Glass of Hot water and 1 tablet you have to take");
					textadvice.setText("Keep away from Sunlight");
				}
				else if(cmbnametab.getSelectedItem().equals("Sumo")) 
				{
					textrefno.setText("S9391421MO");
					textdose.setText("1");
					textissuedate.setText("29/01/2024");
					textexpiredate.setText("16/05/2027");
					textdailydose.setText("3");
					textsideeffects.setText("Sleep and Sickness");
					textinformation.setText("Used for Heavy fewer");
					textuse.setText("Glass of Hot water and 1 tablet you have to take");
					textadvice.setText("Keep away from Sunlight");
				}
				else if(cmbnametab.getSelectedItem().equals("Eldoper")) 
				{
					textrefno.setText("E92776464R");
					textdose.setText("0.5");
					textissuedate.setText("02/03/2022");
					textexpiredate.setText("16/05/2024");
					textdailydose.setText("3");
					textsideeffects.setText("Danmage Liver and Sickness");
					textinformation.setText("Used for Motions");
					textuse.setText("Glass of Hot water and 1 tablet you have to take");
					textadvice.setText("Keep away from Sunlight");
				}
			}
		});
		cmbnametab.setModel(new DefaultComboBoxModel(new String[] {"Choose the Tablets", "Crosin", "Calpal", "Dolo 650", "Saridon", "Vertirest", "Seenarest", "Sumo", "Eldoper"}));
		cmbnametab.setFont(new Font("Tahoma", Font.BOLD, 12));
		cmbnametab.setBackground(new Color(230, 230, 250));
		cmbnametab.setBounds(177, 196, 175, 29);
		panel_2.add(cmbnametab);
		
		textinformation = new JTextField();
		textinformation.setFont(new Font("Dialog", Font.PLAIN, 15));
		textinformation.setColumns(10);
		textinformation.setBounds(560, 98, 175, 26);
		panel_2.add(textinformation);
		
		textissuedate = new JTextField();
		textissuedate.setFont(new Font("Dialog", Font.PLAIN, 15));
		textissuedate.setColumns(10);
		textissuedate.setBounds(560, 137, 175, 26);
		panel_2.add(textissuedate);
		
		textexpiredate = new JTextField();
		textexpiredate.setFont(new Font("Dialog", Font.PLAIN, 15));
		textexpiredate.setColumns(10);
		textexpiredate.setBounds(560, 184, 175, 26);
		panel_2.add(textexpiredate);
		
		textpid = new JTextField();
		textpid.setFont(new Font("Dialog", Font.PLAIN, 15));
		textpid.setColumns(10);
		textpid.setBounds(177, 26, 175, 26);
		panel_2.add(textpid);
		
		JLabel lblStorageAdvice = new JLabel("Storage Advice");
		lblStorageAdvice.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStorageAdvice.setBounds(401, 268, 149, 25);
		panel_2.add(lblStorageAdvice);
		
		JLabel lblHowToUse = new JLabel("How to use Medication");
		lblHowToUse.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHowToUse.setBounds(377, 232, 184, 25);
		panel_2.add(lblHowToUse);
		
		JLabel lblPatientId = new JLabel("Patient ID");
		lblPatientId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPatientId.setBounds(31, 27, 149, 25);
		panel_2.add(lblPatientId);
		
		JLabel lblPatientName = new JLabel("Patient Name");
		lblPatientName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPatientName.setBounds(31, 62, 149, 25);
		panel_2.add(lblPatientName);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDateOfBirth.setBounds(31, 125, 149, 25);
		panel_2.add(lblDateOfBirth);
		
		JLabel lblPatientAddress = new JLabel("Patient Address");
		lblPatientAddress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPatientAddress.setBounds(31, 162, 149, 25);
		panel_2.add(lblPatientAddress);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGender.setBounds(31, 95, 149, 25);
		panel_2.add(lblGender);
		
		textpname = new JTextField();
		textpname.setFont(new Font("Dialog", Font.PLAIN, 15));
		textpname.setColumns(10);
		textpname.setBounds(177, 58, 175, 26);
		panel_2.add(textpname);
		
		textdob = new JTextField();
		textdob.setFont(new Font("Dialog", Font.PLAIN, 15));
		textdob.setColumns(10);
		textdob.setBounds(177, 124, 175, 26);
		panel_2.add(textdob);
		
		textaddress = new JTextField();
		textaddress.setFont(new Font("Dialog", Font.PLAIN, 15));
		textaddress.setColumns(10);
		textaddress.setBounds(177, 161, 175, 26);
		panel_2.add(textaddress);
		
		final JComboBox cmbgender = new JComboBox();
		cmbgender.setModel(new DefaultComboBoxModel(new String[] {"Select", "Male", "Female", "Other"}));
		cmbgender.setFont(new Font("Tahoma", Font.BOLD, 12));
		cmbgender.setBackground(new Color(230, 230, 250));
		cmbgender.setBounds(177, 90, 175, 25);
		panel_2.add(cmbgender);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(36, 529, 1210, 202);
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 50, 204)));
		panel_4.setBackground(new Color(224, 255, 255));
		panel.add(panel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 1190, 182);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setForeground(new Color(0, 0, 0));
		table.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Patient ID", "Patient Name", "Gender", "Date of Birth", "Address", "Name of Tablet", "Reference No", "No of Tablets", "Daily Dose", "Dose(mg)", "Side Effects", "Other Information", "Issued Date", "Expired Date", "How to use Medication", "Storage Advice"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(53);
		table.getColumnModel().getColumn(2).setPreferredWidth(44);
		table.getColumnModel().getColumn(3).setPreferredWidth(69);
		table.getColumnModel().getColumn(4).setPreferredWidth(50);
		table.getColumnModel().getColumn(5).setPreferredWidth(82);
		table.getColumnModel().getColumn(6).setPreferredWidth(74);
		table.getColumnModel().getColumn(7).setPreferredWidth(55);
		table.getColumnModel().getColumn(8).setPreferredWidth(53);
		table.getColumnModel().getColumn(9).setPreferredWidth(57);
		table.getColumnModel().getColumn(10).setPreferredWidth(68);
		scrollPane.setViewportView(table);
		
		JButton button = new JButton("Add Record");
		button.setBounds(73, 476, 141, 33);
		panel.add(button);
		button.setForeground(new Color(230, 230, 250));
		button.setBackground(new Color(106, 90, 205));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 DefaultTableModel model = (DefaultTableModel) table.getModel();
				 model.addRow(new Object[]{			            
						    textpid.getText(),
						    textpname.getText(),
						    cmbgender.getSelectedItem(),
						    textdob.getText(),
						    textaddress.getText(),
						    cmbnametab.getSelectedItem(),
							textrefno.getText(),
							textdose.getText(),
							textnotab.getText(),
							textuse.getText(),
							textadvice.getText(),
							textdailydose.getText(),
							textinformation.getText(),
							textissuedate.getText(),
							textexpiredate.getText(),
							textsideeffects.getText(),
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
		button_2.setBounds(282, 476, 133, 33);
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
		button_1.setBounds(473, 476, 121, 33);
		panel.add(button_1);
		button_1.setForeground(new Color(230, 230, 250));
		button_1.setBackground(new Color(139, 69, 19));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textpid.setText("");
				textrefno.setText("");
				textaddress.setText("");
				textpname.setText("");
				textdob.setText("");
				textdose.setText("");
				textnotab.setText("");
				textuse.setText("");
				textadvice.setText("");
				textdailydose.setText("");
				textsideeffects.setText("");
				//cmbgender.setSelectedItem("");
				textissuedate.setText("");
				textexpiredate.setText("");
				textinformation.setText("");
				
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnPrintPrescription = new JButton("Print Prescription");
		btnPrintPrescription.setBounds(696, 476, 255, 33);
		panel.add(btnPrintPrescription);
		btnPrintPrescription.setForeground(new Color(230, 230, 250));
		btnPrintPrescription.setBackground(new Color(199, 21, 133));
		btnPrintPrescription.addActionListener(new ActionListener() {
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
		btnPrintPrescription.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton button_3 = new JButton("Exit");
		button_3.setBounds(1057, 476, 121, 33);
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
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(153, 50, 204));
		separator.setForeground(new Color(153, 50, 204));
		separator.setBounds(36, 464, 1218, 2);
		panel.add(separator);
		
		JPanel Panel_3 = new JPanel();
		Panel_3.setBackground(new Color(230, 230, 250));
		Panel_3.setBounds(803, 102, 449, 345);
		panel.add(Panel_3);
		Panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(PatientPrescription.class.getResource("/Assects/Prescription.png")));
		lblNewLabel_2.setBounds(-74, 0, 523, 403);
		Panel_3.add(lblNewLabel_2);
	}
}
