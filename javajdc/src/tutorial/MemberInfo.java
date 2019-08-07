package tutorial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.transform.Result;

import net.proteanit.sql.DbUtils;

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
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	private JTable table;

	/**
	 * Create the frame.
	 */
	public MemberInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 756, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMemberInformationForm = new JLabel("Member Information Form");
		lblMemberInformationForm.setFont(new Font("함초롬돋움", Font.BOLD, 16));
		lblMemberInformationForm.setBounds(257, 21, 207, 34);
		contentPane.add(lblMemberInformationForm);

		txtuserid = new JTextField();
		txtuserid.setBounds(98, 82, 116, 21);
		contentPane.add(txtuserid);
		txtuserid.setColumns(10);

		txtuserpwd = new JTextField();
		txtuserpwd.setBounds(98, 123, 116, 21);
		contentPane.add(txtuserpwd);
		txtuserpwd.setColumns(10);

		JLabel lblUserId = new JLabel("User ID");
		lblUserId.setBounds(12, 82, 57, 15);
		contentPane.add(lblUserId);

		JLabel lblUserPwd = new JLabel("User pwd");
		lblUserPwd.setBounds(12, 123, 57, 15);
		contentPane.add(lblUserPwd);

		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbconnect(); // 메소드호출
				String uid = txtuserid.getText();
				sql = "SELECT * from members WHERE userid = ?";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, uid);
					result = pstmt.executeQuery();

					while (result.next()) {
						String vuserid = result.getString("userid");
						String vuserpwd = result.getString("userpwd");
						String vuserphone = result.getString("userphone");
						String vuseradr = result.getString("useradr");
						txtuserid.setText(vuserid);
						txtuserpwd.setText(vuserpwd);
						txtuserphone.setText(vuserphone);
						txtuseradr.setText(vuseradr);
					} // end while
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} // end actionperformed
			}
		});
		btnSearch.setBounds(24, 296, 78, 23);
		contentPane.add(btnSearch);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbconnect(); // 메소드호출
				String uid = txtuserid.getText();
				String upwd = txtuserpwd.getText();
				String uphone = txtuserphone.getText();
				String uadr = txtuseradr.getText();
				sql = "insert into members values (?, ?, ?, ?)";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, uid);
					pstmt.setString(2, upwd);
					pstmt.setString(3, uphone);
					pstmt.setString(4, uadr);
					int rst = pstmt.executeUpdate();
					if (rst == 1)
						JOptionPane.showMessageDialog(null, "1개의 레코드를 추가하였습니다.");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				dataload(); // 이거 넣어놓으면 add 하면 자동으로 데이터로딩돼서 추가된게 보여짐
			}
		});
		btnAdd.setBounds(126, 296, 57, 23);
		contentPane.add(btnAdd);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbconnect(); // 메소드호출
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
					if (rst == 1)
						JOptionPane.showMessageDialog(null, "1개의 레코드를 수정하였습니다.");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				dataload();
			}
		});
		btnUpdate.setBounds(207, 296, 90, 23);
		contentPane.add(btnUpdate);

		JButton btnDelete = new JButton("delete"); // 서치가 된 다음에 델리트 누르면 삭제가 되는 것.
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbconnect(); // 메소드호출
				String uid = txtuserid.getText();
				/*
				 * String upwd = txtuserpwd.getText(); String uphone = txtuserphone.getText();
				 * String uadr = txtuseradr.getText();
				 */
				sql = "delete from members where userid=?";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, uid);
//					pstmt.setString(2, upwd);
//					pstmt.setString(3, uphone);
//					pstmt.setString(4, uadr);
					int rst = pstmt.executeUpdate();
					if (rst == 1)
						JOptionPane.showMessageDialog(null, "1개의 레코드를 삭제하였습니다.");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				dataload();
			}
		});
		btnDelete.setBounds(321, 296, 73, 23);
		contentPane.add(btnDelete);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(418, 296, 73, 23);
		contentPane.add(btnExit);

		JLabel lblUserPhone = new JLabel("User phone");
		lblUserPhone.setBounds(12, 165, 116, 15);
		contentPane.add(lblUserPhone);

		txtuserphone = new JTextField();
		txtuserphone.setColumns(10);
		txtuserphone.setBounds(98, 162, 237, 21);
		contentPane.add(txtuserphone);

		JLabel lblUserAddress = new JLabel("User address");
		lblUserAddress.setBounds(12, 191, 92, 45);
		contentPane.add(lblUserAddress);

		txtuseradr = new JTextField();
		txtuseradr.setColumns(10);
		txtuseradr.setBounds(98, 203, 237, 65);
		contentPane.add(txtuseradr);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbconnect(); // 메소드호출
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
		btnReset.setBounds(515, 296, 73, 23);
		contentPane.add(btnReset);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(360, 65, 368, 204);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { // 클릭했을때 각 원하는 정보 열이 뜸
				// 테이블을 클릭했을 때, 행을 추출하고
				// 추출된 행의 각 컬럼을 왼쪽에 있는 각각의 텍스트 필드에 전달한다.
				dbconnect();
				int row = table.getSelectedRow(); // 선택되어진 행을 가지고 오는 메소드
				String uid = (table.getModel().getValueAt(row, 0)).toString();
				// 해당 uid를 이용하여 db를 검색하여 검색된 결과를 텍스트 필드에 전달
				sql = "SELECT * from members WHERE userid = ?";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, uid);
					result = pstmt.executeQuery();

					while (result.next()) {
						String vuserid = result.getString("userid");
						String vuserpwd = result.getString("userpwd");
						String vuserphone = result.getString("userphone");
						String vuseradr = result.getString("useradr");
						txtuserid.setText(vuserid);
						txtuserpwd.setText(vuserpwd);
						txtuserphone.setText(vuserphone);
						txtuseradr.setText(vuseradr);
					} // end while
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} // end catch
			}// end mouseclicked
		});
		scrollPane.setViewportView(table);

		JButton btnNewButton = new JButton("Data Load");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataload();
			}// end actionperformed

		}// end btnnewbutton
		);
		btnNewButton.setBounds(612, 296, 97, 23);
		contentPane.add(btnNewButton);

		dataload(); // 이거 넣어놔서 실행 할때 dataload 안 써놔도 테이블내역이 다 떠있음.

	} // end memberinfo

	// 연결설정
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

	}// end dbconnect()

	void dataload() {
		// jtable에 테이블 데이터를 로드한다.
		dbconnect();
		sql = "select userid, userphone, useradr from members";
		try {
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(result)); // 질의 결과를 테이블table에 넘겨준다.
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
