package watcha;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Join extends JFrame {
	Connection conn;
	PreparedStatement pstmt;
	String sql;
	ResultSet result;


	private JPanel contentPane;
	private JTextField txtuserid;
	private JTextField txtuserpwd;
	private JTextField txtuserid_1;
	private JTextField txtuserpwd_1;

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
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToWatcha = new JLabel("Welcome to Watcha");
		lblWelcomeToWatcha.setFont(new Font("함초롬돋움", Font.BOLD, 18));
		lblWelcomeToWatcha.setBounds(129, 20, 187, 30);
		contentPane.add(lblWelcomeToWatcha); 
	

	 JButton btnJoinUs = new JButton("Join!");
		btnJoinUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbconnect();
				String uid = txtuserid_1.getText();	// 해당 텍스트창에 적힌 글이 uid에 저장됨
	      		String upw = txtuserpwd_1.getText();
	      		
	      		if (chkDuplicate(uid)) {
	      			JOptionPane.showMessageDialog(null, "이미 존재하는 ID입니다.");
	      		}else {
		            sql = "INSERT INTO memberlist VALUES (?, ?)";
		            
		            try {
		            	pstmt = conn.prepareStatement(sql);
		            	pstmt.setString(1, uid);
						pstmt.setString(2, upw);
						
			            int rst = pstmt.executeUpdate();
			            if(rst==1)JOptionPane.showMessageDialog(null, "당신은,, 진정한 영화 매니아,,b");
			            
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
	      		}// end of if-else
			
			}

			private boolean chkDuplicate(String uid) {
				// TODO Auto-generated method stub
				dbconnect(); //메소드호출
				
				sql =  "SELECT * from memberlist WHERE userid = ?";
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
		btnJoinUs.setBounds(282, 190, 97, 23);
		contentPane.add(btnJoinUs);
		
		JLabel lblUserId = new JLabel("User ID");
		lblUserId.setBounds(99, 86, 57, 15);
		contentPane.add(lblUserId);
		
		txtuserid_1 = new JTextField();
		txtuserid_1.setBounds(205, 83, 116, 21);
		contentPane.add(txtuserid_1);
		txtuserid_1.setColumns(10);
		
		JLabel lblUserPwd = new JLabel("User PWD");
		lblUserPwd.setBounds(99, 121, 57, 15);
		contentPane.add(lblUserPwd);
		
		txtuserpwd_1 = new JTextField();
		txtuserpwd_1.setBounds(205, 118, 116, 21);
		contentPane.add(txtuserpwd_1);
		txtuserpwd_1.setColumns(10);
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

