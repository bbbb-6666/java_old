package tutorial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class LoginTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtuserid;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginTest frame = new LoginTest();
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
	public LoginTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserId = new JLabel("User ID ");
		lblUserId.setBounds(56, 76, 57, 15);
		contentPane.add(lblUserId);
		
		JLabel lblUserPwd = new JLabel("User PWD");
		lblUserPwd.setBounds(56, 118, 78, 15);
		contentPane.add(lblUserPwd);
		
		txtuserid = new JTextField();
		txtuserid.setBounds(159, 73, 116, 21);
		contentPane.add(txtuserid);
		txtuserid.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("null")
			public void actionPerformed(ActionEvent e) {
				
				//DB connection 
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet result = null;
				String sql = null;
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "madang";
				String pwd = "madang";
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url, user, pwd);
					sql = "SELECT * members WHERE userid = ? AND userpwd = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, txtuserid.getText());
					JLabel txtuserpwd = null;
					pstmt.setString(2, txtuserpwd.getText());
					
					result = pstmt.executeQuery();
					
					if(result.next()) {
						JOptionPane.showMessageDialog(null, "로그인이 성공하였습니다.");
					} else { 
						JOptionPane.showMessageDialog(null, "로그인이 실패하였습니다.");
					}
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//sql 구문 구성
				
				//Prepared Statement 구성 후 실행
				
				//질의 처리
				
				
			}
		});
		
		JTextField txtuserpwd = new JTextField();
		txtuserpwd.setColumns(10);
		txtuserpwd.setBounds(159, 115, 116, 21);
		contentPane.add(txtuserpwd);
		btnLogin.setBounds(56, 166, 97, 23);
		contentPane.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // 프로그램 종료 
			}
		});
		btnCancel.setBounds(178, 166, 97, 23);
		contentPane.add(btnCancel);
		
		JLabel lblLoginTest = new JLabel("Login Test");
		lblLoginTest.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginTest.setFont(new Font("함초롬돋움", Font.BOLD, 14));
		lblLoginTest.setBounds(87, 34, 151, 32);
		contentPane.add(lblLoginTest);
	}

}
