package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Multicropping extends JFrame {

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
					Multicropping frame = new Multicropping();
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
	public Multicropping() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1207, 639);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Multicropping = new JLabel("Multicropping");
		Multicropping.setForeground(new Color(255, 51, 153));
		Multicropping.setBackground(new Color(204, 51, 153));
		Multicropping.setFont(new Font("Times New Roman", Font.BOLD, 35));
		Multicropping.setBounds(310, 10, 395, 29);
		contentPane.add(Multicropping);
		
		JList list = new JList();
		list.setFont(new Font("Times New Roman", Font.BOLD, 25));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Multi cropping is practice of producing two or more crops", "on the same plot of land at a same time,rather than simply one ,", "throughout the same growing season"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(10, 54, 662, 101);
		contentPane.add(list);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Multicropping.class.getResource("/Assets/multiple1.jpeg")));
		lblNewLabel.setBounds(788, 54, 323, 166);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"S.no", "Crop Name1", "Crop Name2", "Crop Name3", "month"},
				{"1.", "Rice", "potato", "wheat", "Jan-march"},
				{"2", "cotton", "Ground nut","chick " ,"June -Nov"},
				{"3",  "sunflower", "cotton", "rice","jan-nov"},
				
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(46, 237, 1035, 192);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Select");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(255, 0, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				select rf=new select();
				rf.show();
				dispose();
				
			}
		});
		btnNewButton.setBounds(185, 466, 97, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quary");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quary rf=new Quary();
				rf.show();
				dispose();
			}
				
			
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setForeground(new Color(51, 204, 255));
		btnNewButton_1.setBounds(498, 466, 118, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Contract");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contract rf=new contract();
				rf.show();
				dispose();
			
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_2.setForeground(new Color(51, 51, 255));
		btnNewButton_2.setBounds(782, 466, 118, 21);
		contentPane.add(btnNewButton_2);
	}
}
