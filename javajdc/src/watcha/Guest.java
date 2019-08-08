package watcha;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class Guest extends JFrame {

	private JPanel contentPane;
	
	Connection conn;
	PreparedStatement pstmt;
	String sql;
	ResultSet result;
	private JTable tblguest;
	private JScrollPane scrollPane;
	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guest frame = new Guest();
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
	public Guest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGuset = new JLabel("GUEST");
		lblGuset.setFont(new Font("함초롬돋움", Font.BOLD, 16));
		lblGuset.setBounds(180, 20, 73, 22);
		contentPane.add(lblGuset);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 58, 352, 169);
		contentPane.add(scrollPane);
		
		tblguest = new JTable();
		scrollPane.setViewportView(tblguest);
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
			e.printStackTrace();}

		}
	
	void movieload() {
		// jtable에 테이블 데이터를 로드한다.
		dbconnect();
		int row = tblguest.getSelectedRow(); // 선택되어진 행을 가지고 오는 메소드
		String muserid = (tblguest.getModel().getValueAt(row, 0)).toString();
		sql = "select * from movie";
		try {
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeQuery();
			tblguest.setModel(DbUtils.resultSetToTableModel(result)); // 질의 결과를 테이블table에 넘겨준다.
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	} 
}
