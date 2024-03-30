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

public class DeleteDoctor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable JTable1;
	private JTextField DId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteDoctor frame = new DeleteDoctor();
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
	public DeleteDoctor() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DeleteDoctor.class.getResource("/Assects/Suretrust.png")));
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
		panel.setBounds(49, 20, 743, 57);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DELETE DOCTOR DETAILS");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 35));
		lblNewLabel.setBounds(172, 10, 439, 37);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(153, 50, 204)));
		panel_1.setBounds(49, 128, 743, 384);
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
		btnNewButton_1.setBounds(174, 522, 160, 32);
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
		btnNewButton.setBounds(494, 522, 153, 32);
		contentPane.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(224, 255, 255), 2));
		panel_2.setBackground(new Color(70, 130, 180));
		panel_2.setBounds(49, 80, 743, 43);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Doctor ID           :");
		lblNewLabel_1.setForeground(new Color(230, 230, 250));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(29, 10, 172, 23);
		panel_2.add(lblNewLabel_1);
		
		DId = new JTextField();
		DId.setBackground(new Color(176, 224, 230));
		DId.setFont(new Font("Tahoma", Font.BOLD, 16));
		DId.setBounds(206, 10, 268, 23);
		panel_2.add(DId);
		DId.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fid=DId.getText();
                try{ Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/suretrust","root","root");
                Statement st= conn.createStatement();
               String sql="DELETE FROM `doctor_record` WHERE ID="+fid;
               PreparedStatement pstmt=conn.prepareStatement(sql);
               pstmt.executeUpdate();
               JOptionPane.showMessageDialog(null, "Doctor data deleted successfully");
               conn.close();
               DId.setText("");
               }catch(Exception e2){
               JOptionPane.showMessageDialog(null, e2);
               }
			}
		});
		btnNewButton_2.setForeground(new Color(230, 230, 250));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBackground(new Color(255, 0, 0));
		btnNewButton_2.setBounds(551, 10, 130, 23);
		panel_2.add(btnNewButton_2);
	}
}
