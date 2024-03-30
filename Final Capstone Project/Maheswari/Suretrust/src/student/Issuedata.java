package student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
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

public class Issuedata extends JFrame {

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
					Issuedata frame = new Issuedata();
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
	public Issuedata() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 965, 545);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("COMPLAINT BOX");
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(299, 39, 262, 56);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("OPEN");
		btnNewButton.setBackground(new Color(128, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suretrust","root","tiger");
					Statement st=con.createStatement();
					String query="select * from problems";
					ResultSet rs=st.executeQuery(query);
					ResultSetMetaData rsmd=rs.getMetaData();
					DefaultTableModel model=(DefaultTableModel)table.getModel();
					int cols=rsmd.getColumnCount();
					String[] colName=new String[cols];
					for(int i=0;i<cols;i++)
						colName[i]=rsmd.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String name;
					while(rs.next()) {
						name=rs.getString(1);
						String[] row= {name};
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
			
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(29, 212, 130, 47);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(297, 152, 382, 254);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage rf=new HomePage();
				rf.show();
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(128, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(29, 322, 122, 41);
		contentPane.add(btnNewButton_1);
	}
}
