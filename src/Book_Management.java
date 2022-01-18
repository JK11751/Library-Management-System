import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Book_Management {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Book_Management window = new Book_Management();
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
	public Book_Management() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 948, 612);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 65, 359, 508);
		panel.setBackground(Color.CYAN);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Add New Book");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(10, 11, 291, 43);
		panel.add(btnNewButton);
		
		JButton btnDeleteBook = new JButton("Delete Book");
		btnDeleteBook.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDeleteBook.setBounds(10, 55, 291, 43);
		panel.add(btnDeleteBook);
		
		JButton btnSearchBook = new JButton("Search Book");
		btnSearchBook.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSearchBook.setBounds(10, 99, 291, 43);
		panel.add(btnSearchBook);
		
		JButton btnUpdateBook = new JButton("Update Book");
		btnUpdateBook.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpdateBook.setBounds(10, 143, 291, 43);
		panel.add(btnUpdateBook);
		
		JButton btnModifyRentCharges = new JButton("Update Rent Charges");
		btnModifyRentCharges.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnModifyRentCharges.setBounds(10, 187, 291, 43);
		panel.add(btnModifyRentCharges);
		
		JButton btnModifyOverdueCharges = new JButton("Update Overdue Charges");
		btnModifyOverdueCharges.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnModifyOverdueCharges.setBounds(10, 231, 291, 43);
		panel.add(btnModifyOverdueCharges);
		
		JButton btnUpadateBookQuantity = new JButton("Update Book Quantity");
		btnUpadateBookQuantity.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpadateBookQuantity.setBounds(10, 275, 291, 49);
		panel.add(btnUpadateBookQuantity);
		
		JButton btnUbook = new JButton("Update Book Price");
		btnUbook.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUbook.setBounds(10, 326, 291, 43);
		panel.add(btnUbook);
		
		JButton btnViewAllBooks = new JButton("View All Books In Library");
		btnViewAllBooks.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnViewAllBooks.setBounds(10, 370, 291, 39);
		panel.add(btnViewAllBooks);
		
		JButton btnViewAllIssued = new JButton("View All Issued Books");
		btnViewAllIssued.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnViewAllIssued.setBounds(10, 410, 291, 43);
		panel.add(btnViewAllIssued);
		
		JButton btnExportTo = new JButton("Export Issued Books  To Excel");
		btnExportTo.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExportTo.setBounds(10, 454, 339, 43);
		panel.add(btnExportTo);
		
		JButton btnExportAllBooks = new JButton("Export All Books To Excel");
		btnExportAllBooks.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExportAllBooks.setBounds(10, 497, 291, 43);
		panel.add(btnExportAllBooks);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(369, 65, 563, 497);
		panel_1.setBackground(Color.BLUE);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("BOOK TITLE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 11, 127, 28);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_2_1 = new JLabel("BOOK ID");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setBounds(10, 54, 127, 28);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("CATEGORY");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setBounds(10, 93, 100, 28);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("SHELF NO");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setBounds(10, 132, 110, 28);
		panel_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("ISBN NO");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setBounds(10, 171, 100, 28);
		panel_1.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("RENT CHARGES");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_5.setForeground(Color.WHITE);
		lblNewLabel_2_5.setBounds(10, 210, 157, 28);
		panel_1.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("OVERDUE CHARGES");
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_6.setForeground(Color.WHITE);
		lblNewLabel_2_6.setBounds(10, 249, 187, 28);
		panel_1.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("BOOK PRICE");
		lblNewLabel_2_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_7.setForeground(Color.WHITE);
		lblNewLabel_2_7.setBounds(10, 288, 157, 28);
		panel_1.add(lblNewLabel_2_7);
		
		textField = new JTextField();
		textField.setBounds(228, 11, 283, 32);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(228, 54, 283, 32);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(228, 93, 283, 30);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(228, 132, 283, 30);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(228, 171, 283, 28);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(228, 210, 283, 30);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(228, 249, 283, 32);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(228, 288, 283, 32);
		panel_1.add(textField_7);
		
		JLabel lblNewLabel_2_7_1 = new JLabel("BOOK QUANTITY");
		lblNewLabel_2_7_1.setForeground(Color.WHITE);
		lblNewLabel_2_7_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_7_1.setBounds(10, 327, 157, 28);
		panel_1.add(lblNewLabel_2_7_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(228, 327, 283, 32);
		panel_1.add(textField_8);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 255, 255));
		separator.setForeground(Color.GRAY);
		separator.setBounds(10, 414, 543, 2);
		panel_1.add(separator);
		
		JButton btnNewButton_1 = new JButton("SUBMIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to submit the changes!", "Confirm",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
				{
				System.exit(1);
			}}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(10, 437, 127, 32);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Add New Book");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.red);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(369, 11, 563, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Book Management");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 11, 359, 55);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
