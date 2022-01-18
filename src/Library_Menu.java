import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Library_Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Library_Menu window = new Library_Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Library_Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 751, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 53, 696, 382);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.CYAN);
		panel.setOpaque(true);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 303, 360);
		panel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setOpaque(true);
		
		JLabel lblNewLabel_1_4 = new JLabel("LIBRARY MENU");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_4.setBackground(Color.RED);
		lblNewLabel_1_4.setOpaque(true);
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setBounds(0, 0, 303, 33);
		panel_1.add(lblNewLabel_1_4);
		
		JButton btnNewButton = new JButton("Book Management");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 44, 253, 33);
		panel_1.add(btnNewButton);
		
		JButton btnBookTransaction = new JButton("Book Transaction");
		btnBookTransaction.setForeground(Color.BLUE);
		btnBookTransaction.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBookTransaction.setBounds(10, 110, 253, 33);
		btnBookTransaction.setFocusable(false);
		panel_1.add(btnBookTransaction);
		
		JButton btnStudentsManagement = new JButton("Students Management");
		btnStudentsManagement.setForeground(Color.BLUE);
		btnStudentsManagement.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnStudentsManagement.setBounds(10, 177, 253, 33);
		btnStudentsManagement.setFocusable(false);
		panel_1.add(btnStudentsManagement);
		
		JButton btnCategoriesManagement = new JButton("Categories Management");
		btnCategoriesManagement.setForeground(Color.BLUE);
		btnCategoriesManagement.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCategoriesManagement.setBounds(10, 243, 253, 33);
		btnCategoriesManagement.setFocusable(false);
		panel_1.add(btnCategoriesManagement);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setForeground(Color.BLUE);
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogout.setBounds(10, 302, 253, 33);
		btnLogout.setFocusable(false);
		panel_1.add(btnLogout);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(323, 11, 363, 360);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("NOTIFICATIONS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBackground(Color.RED);
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(0, 0, 363, 31);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Library Information");
		lblNewLabel_5.setBounds(10, 42, 182, 14);
		panel_2.add(lblNewLabel_5);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLUE);
		separator.setBounds(10, 67, 343, 2);
		panel_2.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Total books in the library [By Type]");
		lblNewLabel_1.setBounds(10, 91, 233, 25);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Total Students in the library System");
		lblNewLabel_1_1.setBounds(10, 147, 233, 25);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Total books issued");
		lblNewLabel_1_2.setBounds(10, 192, 233, 25);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Total number of book's category  in the library");
		lblNewLabel_1_3.setBounds(10, 234, 233, 25);
		panel_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_5 = new JLabel("Total Invoice");
		lblNewLabel_1_5.setBounds(10, 284, 233, 25);
		panel_2.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(268, 93, 85, 20);
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBorder(new LineBorder(Color.white,2));
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setBounds(268, 149, 85, 20);
		lblNewLabel_6_1.setBackground(Color.WHITE);
		lblNewLabel_6_1.setOpaque(true);
		lblNewLabel_6_1.setBorder(new LineBorder(Color.WHITE,2));
		panel_2.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("");
		lblNewLabel_6_2.setBounds(268, 197, 85, 20);
		lblNewLabel_6_2.setBackground(Color.WHITE);
		lblNewLabel_6_2.setOpaque(true);
		lblNewLabel_6_2.setBorder(new LineBorder(Color.WHITE,2));
		
		panel_2.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("");
		lblNewLabel_6_3.setBounds(268, 239, 85, 20);
		lblNewLabel_6_3.setBackground(Color.WHITE);
		lblNewLabel_6_3.setOpaque(true);
		lblNewLabel_6_3.setBorder(new LineBorder(Color.WHITE,2));
		panel_2.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_6_4 = new JLabel("");
		lblNewLabel_6_4.setBounds(268, 289, 85, 20);
		lblNewLabel_6_4.setBackground(Color.WHITE);
		lblNewLabel_6_4.setOpaque(true);
		lblNewLabel_6_4.setBorder(new LineBorder(Color.WHITE,2));
		panel_2.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel = new JLabel("KISMATT SCHOOL");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 716, 53);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN BY:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(20, 446, 64, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("TYPE:");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setBounds(228, 451, 38, 24);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("DATE:");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setBounds(396, 446, 37, 29);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("TIME:");
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setBounds(577, 451, 37, 24);
		frame.getContentPane().add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(94, 446, 124, 30);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setBounds(276, 446, 110, 30);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setBounds(445, 446, 110, 30);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("");
		lblNewLabel_3_1_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_2.setBounds(624, 446, 101, 24);
		frame.getContentPane().add(lblNewLabel_3_1_2);
	}
}
