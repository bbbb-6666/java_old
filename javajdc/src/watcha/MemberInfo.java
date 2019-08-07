package watcha;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.SystemColor;

public class MemberInfo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberInfo frame = new MemberInfo();
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
	public MemberInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1033, 561);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWahtcha = new JLabel("WATCHA");
		lblWahtcha.setHorizontalAlignment(SwingConstants.CENTER);
		lblWahtcha.setFont(new Font("함초롬돋움", Font.BOLD, 25));
		lblWahtcha.setBounds(0, 10, 1017, 52);
		contentPane.add(lblWahtcha);
		
		JLabel lblFilm = new JLabel("FILM");
		lblFilm.setBounds(52, 92, 57, 15);
		contentPane.add(lblFilm);
		
		JLabel lblNewLabel = new JLabel("DATE");
		lblNewLabel.setBounds(52, 122, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("GENRE");
		lblNewLabel_1.setBounds(52, 154, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("AGE LIMIT");
		lblNewLabel_2.setBounds(52, 185, 67, 15);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(125, 89, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(125, 120, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(125, 151, 116, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(125, 182, 116, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblStars = new JLabel("STARS");
		lblStars.setBounds(52, 216, 57, 15);
		contentPane.add(lblStars);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(125, 213, 116, 21);
		contentPane.add(comboBox);
		
		JLabel lblReview = new JLabel("REVIEW");
		lblReview.setBounds(52, 255, 57, 15);
		contentPane.add(lblReview);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.activeCaption);
		textArea.setBounds(125, 255, 254, 185);
		contentPane.add(textArea);
		
		table = new JTable();
		table.setBackground(SystemColor.inactiveCaption);
		table.setBounds(445, 92, 540, 347);
		contentPane.add(table);
		
		JButton btnLoad = new JButton("LOAD");
		btnLoad.setBounds(899, 59, 86, 23);
		contentPane.add(btnLoad);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(293, 88, 86, 23);
		contentPane.add(btnAdd);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(293, 150, 86, 23);
		contentPane.add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(899, 449, 86, 23);
		contentPane.add(btnExit);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(293, 118, 86, 23);
		contentPane.add(btnUpdate);
	}
}
