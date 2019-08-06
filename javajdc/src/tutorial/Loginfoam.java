package tutorial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Loginfoam extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginfoam frame = new Loginfoam();
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
	public Loginfoam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome to javadb class");
		lblWelcome.setFont(new Font("함초롬돋움", Font.BOLD, 17));
		lblWelcome.setBounds(110, 21, 225, 23);
		contentPane.add(lblWelcome);
		
		textField = new JTextField();
		textField.setBounds(283, 78, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(283, 131, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUserName = new JLabel("User name");
		lblUserName.setBounds(187, 81, 84, 15);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(187, 134, 84, 15);
		contentPane.add(lblPassword);
		
		JButton btnJoin = new JButton("Join");
		btnJoin.setBounds(184, 196, 97, 23);
		contentPane.add(btnJoin);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(302, 196, 97, 23);
		contentPane.add(btnLogin);
		
		JLabel label = new JLabel("");
		/*이미지 가져오기*/
		Image img = new ImageIcon(this.getClass().getResource("/login.png")).getImage(); /*빨간 줄 뜨면 임포트 시킬것.*/
		/*레이블에다가 이미지 추가*/ 
		label.setIcon(new ImageIcon(img));
		label.setBounds(25, 81, 129, 138);
		contentPane.add(label);
	}
}
