package tutorial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.transform.Result;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class MemberInfo extends JFrame {
	
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
	 * Create the frame.
	 */
	public MemberInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMemberInformationForm = new JLabel("Member Information Form");
		lblMemberInformationForm.setFont(new Font("함초롬돋움", Font.BOLD, 16));
		lblMemberInformationForm.setBounds(177, 21, 207, 34);
		contentPane.add(lblMemberInformationForm);
		
		txtuserid = new JTextField();
		txtuserid.setBounds(129, 82, 116, 21);
		contentPane.add(txtuserid);
		txtuserid.setColumns(10);
		
		txtuserpwd = new JTextField();
		txtuserpwd.setBounds(129, 123, 116, 21);
		contentPane.add(txtuserpwd);
		txtuserpwd.setColumns(10);
		
		JLabel lblUserId = new JLabel("User ID");
		lblUserId.setBounds(43, 82, 57, 15);
		contentPane.add(lblUserId);
		
		JLabel lblUserPwd = new JLabel("User pwd");
		lblUserPwd.setBounds(43, 123, 57, 15);
		contentPane.add(lblUserPwd);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbconnect(); //메소드호출
				String uid = txtuserid.getText();
				sql =  "SELECT * from members WHERE userid = ?";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, uid);
					result = pstmt.executeQuery();
					
					while(result.next()) {
						String vuserid = result.getString("userid");
						String vuserpwd = result.getString("userpwd");
						String vuserphone = result.getString("userphone");
						String vuseradr = result.getString("useradr");
						txtuserid.setText(vuserid);
						txtuserpwd.setText(vuserpwd);
						txtuserphone.setText(vuserphone);
						txtuseradr.setText(vuseradr);
					}//end while
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSearch.setBounds(29, 296, 92, 23);
		contentPane.add(btnSearch);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbconnect(); //메소드호출
				String uid = txtuserid.getText();
				String upwd = txtuserpwd.getText();
				String uphone = txtuserphone.getText();
				String uadr = txtuseradr.getText();
				sql =  "insert into members values (?, ?, ?, ?)";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, uid);
					pstmt.setString(2, upwd);
					pstmt.setString(3, uphone);
					pstmt.setString(4, uadr);
					int rst = pstmt.executeUpdate();
					if(rst==1)JOptionPane.showMessageDialog(null, "1개의 레코드를 추가하였습니다.");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnAdd.setBounds(147, 296, 57, 23);
		contentPane.add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbconnect(); //메소드호출
				String uid = txtuserid.getText();
				String upwd = txtuserpwd.getText();
				String uphone = txtuserphone.getText();
				String uadr = txtuseradr.getText();
				sql = "UPDATE members SET userpwd=?, userphone=?, useradr=? WHERE userid=?";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, uid);
					pstmt.setString(2, upwd);
					pstmt.setString(3, uphone);
					pstmt.setString(4, uadr);
					int rst = pstmt.executeUpdate();
					if(rst==1)JOptionPane.showMessageDialog(null, "1개의 레코드를 수정하였습니다.");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnUpdate.setBounds(230, 296, 90, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("delete"); //서치가 된 다음에 델리트 누르면 삭제가 되는 것. 
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbconnect(); //메소드호출
				String uid = txtuserid.getText();
				String upwd = txtuserpwd.getText();
				String uphone = txtuserphone.getText();
				String uadr = txtuseradr.getText();
				sql = "delete from members where userid=? and userpwd=?";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, uid);
					pstmt.setString(2, upwd);
					pstmt.setString(3, uphone);
					pstmt.setString(4, uadr);
					int rst = pstmt.executeUpdate();
					if(rst==1)JOptionPane.showMessageDialog(null, "1개의 레코드를 삭제하였습니다.");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnDelete.setBounds(346, 296, 73, 23);
		contentPane.add(btnDelete);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(445, 296, 73, 23);
		contentPane.add(btnExit);
		
		JLabel lblUserPhone = new JLabel("User phone");
		lblUserPhone.setBounds(43, 165, 116, 15);
		contentPane.add(lblUserPhone);
		
		txtuserphone = new JTextField();
		txtuserphone.setColumns(10);
		txtuserphone.setBounds(129, 162, 255, 21);
		contentPane.add(txtuserphone);
		
		JLabel lblUserAddress = new JLabel("User address");
		lblUserAddress.setBounds(43, 191, 92, 45);
		contentPane.add(lblUserAddress);
		
		txtuseradr = new JTextField();
		txtuseradr.setColumns(10);
		txtuseradr.setBounds(129, 203, 255, 65);
		contentPane.add(txtuseradr);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbconnect(); //메소드호출
				String uid = txtuserid.getText();
				String upwd = txtuserpwd.getText();
				String uphone = txtuserphone.getText();
				String uadr = txtuseradr.getText();
				txtuserid.setText("");
				txtuserpwd.setText("");
				txtuserphone.setText("");
				txtuseradr.setText("");
			}
		});
		btnReset.setBounds(445, 245, 73, 23);
		contentPane.add(btnReset);
	}

	void dbconnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "madang", "madang");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버가 로드 되지 않았습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("데이터베이스 연결에 문제가 있습니다.");
			e.printStackTrace();
			
	}
	
}//end dbconnect() 
	
}
