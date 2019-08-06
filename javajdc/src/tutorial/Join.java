package tutorial;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Join extends JFrame {
	Connection conn;
	PreparedStatement pstmt;
	String sql;
	ResultSet result;


	private JPanel contentPane;
	private JTextField txtuserid;
	private JTextField txtuserpwd;
	private JTextField txtuserphone;
	private JTextField txtuseradr;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join frame = new Join();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Join() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserId = new JLabel("User ID");
		lblUserId.setBounds(32, 59, 57, 15);
		contentPane.add(lblUserId);
		
		txtuserid = new JTextField();
		txtuserid.setBounds(134, 56, 116, 21);
		contentPane.add(txtuserid);
		txtuserid.setColumns(10);
		
		JLabel lblSignUp = new JLabel("SIGN UP JAVADB CLASS");
		lblSignUp.setFont(new Font("함초롬돋움", Font.BOLD, 16));
		lblSignUp.setBounds(116, 10, 195, 23);
		contentPane.add(lblSignUp);
		
		JLabel lblUserPwd = new JLabel("User PWD");
		lblUserPwd.setBounds(32, 96, 90, 15);
		contentPane.add(lblUserPwd);
		
		txtuserpwd = new JTextField();
		txtuserpwd.setColumns(10);
		txtuserpwd.setBounds(134, 93, 116, 21);
		contentPane.add(txtuserpwd);
		
		JLabel lblUserPhone = new JLabel("User Phone");
		lblUserPhone.setBounds(32, 133, 90, 15);
		contentPane.add(lblUserPhone);
		
		JLabel lblUserAddress = new JLabel("User Address");
		lblUserAddress.setBounds(32, 171, 90, 15);
		contentPane.add(lblUserAddress);
		
		txtuserphone = new JTextField();
		txtuserphone.setColumns(10);
		txtuserphone.setBounds(134, 130, 116, 21);
		contentPane.add(txtuserphone);
		
		txtuseradr = new JTextField();
		txtuseradr.setColumns(10);
		txtuseradr.setBounds(134, 168, 236, 51);
		contentPane.add(txtuseradr);
		
		
		
		JButton btnJoinUs = new JButton("Join us!");
		btnJoinUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbconnect();
				String uid = txtuserid.getText();	// 해당 텍스트창에 적힌 글이 uid에 저장됨
	      		String upw = txtuserpwd.getText();
	      		String uphone = txtuserphone.getText();	
	      		String uadr = txtuseradr.getText();
	      		
	      		if (chkDuplicate(uid)) {
	      			JOptionPane.showMessageDialog(null, "이미 존재하는 ID입니다.");
	      		}else {
		            sql = "INSERT INTO members VALUES (?, ?, ?, ?)";
		            
		            try {
		            	pstmt = conn.prepareStatement(sql);
		            	pstmt.setString(1, uid);
						pstmt.setString(2, upw);
						pstmt.setString(3, uphone);
						pstmt.setString(4, uadr);
						
			            int rst = pstmt.executeUpdate();
			            if(rst==1)JOptionPane.showMessageDialog(null, "유저 " + uid + " 가 추가되었습니다.");
			            
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
	      		}// end of if-else
			
			}

			private boolean chkDuplicate(String uid) {
				// TODO Auto-generated method stub
				dbconnect(); //메소드호출
				
				sql =  "SELECT * from members WHERE userid = ?";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, uid);
					result = pstmt.executeQuery();
					
					if(result.next()) {
						return true;
					}//end while
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				return false;
			}
			});
		btnJoinUs.setBounds(273, 228, 97, 23);
		contentPane.add(btnJoinUs);
	}

	protected void dbconnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "madang", "madang");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
