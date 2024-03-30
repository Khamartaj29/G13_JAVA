package student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class Viewdata extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Viewdata frame = new Viewdata();
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
	public Viewdata() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1154, 627);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnshow = new JButton("View Data");
		btnshow.setBackground(new Color(0, 255, 64));
		btnshow.setForeground(new Color(0, 0, 0));
		btnshow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suretrust","root","tiger");
					Statement st=con.createStatement();
					String query="select * from games";
					ResultSet rs=st.executeQuery(query);
					ResultSetMetaData rsmd=rs.getMetaData();
					DefaultTableModel model=(DefaultTableModel)table.getModel();
					int cols=rsmd.getColumnCount();
					String[] colName=new String[cols];
					for(int i=0;i<cols;i++)
						colName[i]=rsmd.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String name,register,activity,standard;
					while(rs.next()) {
						name=rs.getString(1);
						register=rs.getString(2);
						activity=rs.getString(3);
						standard=rs.getString(4);
						String[] row= {name,register,activity,standard};
						model.addRow(row);
						
					}
					st.close();
					con.close();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnshow.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnshow.setBounds(45, 213, 134, 42);
		contentPane.add(btnshow);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(243, 143, 832, 228);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("List Of Student's Interested Activities");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(317, 33, 425, 62);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage ref=new HomePage();
				ref.show();
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(128, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(45, 343, 134, 42);
		contentPane.add(btnNewButton);
	}
}
