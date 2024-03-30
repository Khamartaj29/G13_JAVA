package hospital;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;

public class ViewDoctorDetails extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable JTable1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewDoctorDetails frame = new ViewDoctorDetails();
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
	public ViewDoctorDetails() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ViewDoctorDetails.class.getResource("/Assects/Suretrust.png")));
		setTitle("SURE Trust Hospital Managment System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 867, 608);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(153, 50, 204)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 50, 204));
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(255, 215, 0)));
		panel.setBounds(49, 37, 743, 69);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VIEW DOCTOR DETAILS");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 35));
		lblNewLabel.setBounds(188, 10, 409, 49);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(153, 50, 204)));
		panel_1.setBounds(49, 125, 743, 384);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 723, 364);
		panel_1.add(scrollPane);
		
		JTable1 = new JTable();
		scrollPane.setViewportView(JTable1);
		JTable1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		JTable1.setFont(new Font("Tahoma", Font.BOLD, 12));
		JTable1.setBackground(new Color(230, 230, 250));
		JTable1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Doctor Id", "Doctor Name", "Specialization"
			}
		));
		JTable1.getColumnModel().getColumn(0).setPreferredWidth(70);
		JTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
		JTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(175, 519, 160, 32);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorPage obj =new DoctorPage();
		        obj.setVisible(true);
		        dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(230, 230, 250));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnNewButton = new JButton("View Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{ Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sureTrust","root","root");
                Statement st= conn.createStatement();
                String sql="select * from doctor_record";
               PreparedStatement pstmt=conn.prepareStatement(sql);
               ResultSet rs= pstmt.executeQuery();
               DefaultTableModel tm=(DefaultTableModel)JTable1.getModel();
               tm.setRowCount(0);
               while(rs.next()){
               Object o[]={rs.getString("ID"),rs.getString("DoctorName"),rs.getString("Specialization")};
               tm.addRow(o);
               }
                }catch(Exception e1){
                    JOptionPane.showMessageDialog(null,e1);
                }
			}
		});
		btnNewButton.setForeground(new Color(230, 230, 250));
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(495, 517, 153, 37);
		contentPane.add(btnNewButton);
	}
}
