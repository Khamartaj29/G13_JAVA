package Employee_Management_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Car_Pool extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final Component FrmCarPool = null;
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textMobile;
	private JTextField textPosition;
	private JTextField textAddress;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Car_Pool frame = new Car_Pool();
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
	public Car_Pool() {
		setTitle("Car Pool");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Car_Pool.class.getResource("/Assets/Screenshot 2024-03-16 225405.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 682);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(322, 328, 489, 234);
		lblNewLabel.setBackground(new Color(250, 250, 210));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setIcon(new ImageIcon(Car_Pool.class.getResource("/Assets/Screenshot 2024-03-26 122138.png")));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ARE YOU READY FOR CAR POOL?");
		lblNewLabel_1.setBounds(165, 10, 501, 50);
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Employee Name");
		lblNewLabel_2.setBounds(29, 98, 165, 31);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Mobile Number");
		lblNewLabel_2_1.setBounds(29, 158, 165, 31);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Position");
		lblNewLabel_2_1_1.setBounds(29, 218, 165, 31);
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Ready For Car Pool?");
		lblNewLabel_2_1_1_1.setBounds(29, 423, 241, 31);
		lblNewLabel_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Gender:");
		lblNewLabel_2_1_1_1_1.setBounds(29, 329, 95, 31);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		JRadioButton ButtonMale = new JRadioButton("Male");
		ButtonMale.setBounds(29, 375, 103, 31);
		buttonGroup.add(ButtonMale);
		ButtonMale.setFont(new Font("Times New Roman", Font.BOLD, 22));
		contentPane.add(ButtonMale);
		
		JRadioButton ButtonFemale = new JRadioButton("Female");
		ButtonFemale.setBounds(154, 375, 103, 31);
		buttonGroup.add(ButtonFemale);
		ButtonFemale.setFont(new Font("Times New Roman", Font.BOLD, 22));
		contentPane.add(ButtonFemale);
		
		JCheckBox BoxYes = new JCheckBox("Yes");
		BoxYes.setBounds(29, 478, 128, 35);
		buttonGroup_1.add(BoxYes);
		BoxYes.setFont(new Font("Times New Roman", Font.BOLD, 22));
		contentPane.add(BoxYes);
		
		textName = new JTextField();
		textName.setBounds(228, 98, 300, 40);
		textName.setFont(new Font("Times New Roman", Font.BOLD, 22));
		contentPane.add(textName);
		textName.setColumns(10);
		
		textMobile = new JTextField();
		textMobile.setBounds(228, 149, 300, 40);
		textMobile.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textMobile.setColumns(10);
		contentPane.add(textMobile);
		
		textPosition = new JTextField();
		textPosition.setBounds(228, 209, 300, 40);
		textPosition.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textPosition.setColumns(10);
		contentPane.add(textPosition);
		
		textAddress = new JTextField();
		textAddress.setBounds(228, 267, 300, 50);
		textAddress.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textAddress.setColumns(10);
		contentPane.add(textAddress);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Address");
		lblNewLabel_2_1_1_2.setBounds(29, 269, 165, 50);
		lblNewLabel_2_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		contentPane.add(lblNewLabel_2_1_1_2);
		
		JCheckBox BoxNo = new JCheckBox("No");
		BoxNo.setBounds(188, 478, 128, 35);
		buttonGroup_1.add(BoxNo);
		BoxNo.setFont(new Font("Times New Roman", Font.BOLD, 22));
		contentPane.add(BoxNo);
		
		JButton btnNewButton = new JButton("Back To Home Page");
		btnNewButton.setBounds(322, 572, 255, 50);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Home_Page hp=new Home_Page();
				hp.show();
				dispose();
				}
		});
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setBackground(new Color(250, 250, 210));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		contentPane.add(btnNewButton);
		
		JButton btnCarPool = new JButton("Car Pool");
		btnCarPool.setBounds(22, 540, 269, 82);
		btnCarPool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name,mobile,position,area;
				name=textName.getText();
				mobile=textMobile.getText();
				position=textPosition.getText();
				area=textAddress.getText();
				
				if(name.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Employee Name");
				}
				else if(mobile.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Mobile Number");
				}
				else if(position.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Your Position");
				}
				else if(area.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter area");
				}
				else {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeemanagementsystem","root","Sabiya@123");
						String query="insert into employeemanagementsystem.car_pool values(?,?,?,?,?,?)";
						PreparedStatement ps=con.prepareStatement(query);
						ps.setString(1, textName.getText());
						ps.setString(2, textMobile.getText());
						ps.setString(3, textPosition.getText());
						ps.setString(4, textAddress.getText());
						if(ButtonMale.isSelected())
							ps.setString(5, ButtonMale.getText());
						else
							ps.setString(5, ButtonFemale.getText());
						if(BoxYes.isSelected())
							ps.setString(6, BoxYes.getText());
						else
							ps.setString(6, BoxNo.getText());
						int i=ps.executeUpdate();
						JOptionPane.showMessageDialog(btnCarPool,i + "Car Pool has done Successfully!");
						ps.close();
						con.close();
					    
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
			}});
		btnCarPool.setForeground(new Color(0, 0, 255));
		btnCarPool.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btnCarPool.setBackground(new Color(255, 250, 250));
		contentPane.add(btnCarPool);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(JOptionPane.showConfirmDialog(FrmCarPool, "Confirm if you want to exit", "Home Page",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(new Color(128, 0, 0));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnExit.setBackground(new Color(250, 240, 230));
		btnExit.setBounds(607, 572, 194, 50);
		contentPane.add(btnExit);
	}
}
