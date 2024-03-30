package newpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Homepage2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage2 frame = new Homepage2();
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
	public Homepage2() {
		setTitle("Electricity Billing System");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\91800\\Downloads\\pop.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 480);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(19, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\91800\\Downloads\\elect2.jpg"));
		lblNewLabel.setBounds(5, 0, 667, 499);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Pay Bill");
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PayBill rf=new PayBill();
				rf.show();
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(109, 10, 156, 44);
		contentPane.add(btnNewButton);
		
		JButton btnUpdateDetails = new JButton("Update Details");
		btnUpdateDetails.setForeground(SystemColor.textHighlight);
		btnUpdateDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Updatedetails rf=new Updatedetails();
				rf.show();
				dispose();
			}
		});
		btnUpdateDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUpdateDetails.setBounds(295, 10, 182, 44);
		contentPane.add(btnUpdateDetails);
		
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.setForeground(SystemColor.textHighlight);
		btnSignOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Welcome2 rf=new Welcome2();
				rf.show();
				dispose();
			}
		});
		btnSignOut.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSignOut.setBounds(502, 10, 170, 44);
		contentPane.add(btnSignOut);
	}
}
