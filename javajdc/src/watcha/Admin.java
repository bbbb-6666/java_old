package watcha;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.SystemColor;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Admin extends JFrame {
	
	Connection conn;
	PreparedStatement pstmt;
	String sql;
	ResultSet result;
	
	private JPanel contentPane;
	private JTable tblmovie;
	private JTable tblmem;
	private JTextField txtmovielist;
	private JTextField textmemlist;

	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdmin = new JLabel("ADMIN");
		lblAdmin.setFont(new Font("함초롬돋움", Font.BOLD, 18));
		lblAdmin.setBounds(328, 10, 80, 25);
		contentPane.add(lblAdmin);
		
		tblmovie = new JTable();
		tblmovie.setBackground(SystemColor.inactiveCaption);
		tblmovie.setBounds(12, 114, 340, 279);
		contentPane.add(tblmovie);
		
		JLabel lblMovieList = new JLabel("MOVIE LIST");
		lblMovieList.setBounds(12, 60, 88, 15);
		contentPane.add(lblMovieList);
		
		JLabel lblMemberList = new JLabel("MEMBER LIST");
		lblMemberList.setBounds(386, 60, 153, 15);
		contentPane.add(lblMemberList);
		
		tblmem = new JTable();
		tblmem.setBackground(SystemColor.inactiveCaption);
		tblmem.setBounds(386, 119, 333, 274);
		contentPane.add(tblmem);
		
		JButton btnmoviesearch = new JButton("Search\r\n");
		btnmoviesearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movieload();
				
			}
		});
		btnmoviesearch.setBounds(272, 81, 80, 23);
		contentPane.add(btnmoviesearch);
		
		txtmovielist = new JTextField();
		txtmovielist.setBounds(149, 83, 111, 21);
		contentPane.add(txtmovielist);
		txtmovielist.setColumns(10);
		
		textmemlist = new JTextField();
		textmemlist.setColumns(10);
		textmemlist.setBounds(386, 85, 111, 21);
		contentPane.add(textmemlist);
		
		JButton btnmemlist = new JButton("Search\r\n");
		btnmemlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memload();
			}
		});
		btnmemlist.setBounds(509, 85, 80, 23);
		contentPane.add(btnmemlist);
		
		JComboBox combomovie = new JComboBox();
		combomovie.setModel(new DefaultComboBoxModel(new String[]
				{"Make a selection", "Title", "Genre", "Age", "runtime"}));
		combomovie.setBounds(12, 83, 126, 21);
		contentPane.add(combomovie);
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

}
void movieload() {
	// jtable에 테이블 데이터를 로드한다.
	dbconnect();
	sql = "select * from movie "; //where like in = '%?%'
	try {
		pstmt = conn.prepareStatement(sql);
		result = pstmt.executeQuery();
		tblmovie.setModel(DbUtils.resultSetToTableModel(result)); // 질의 결과를 테이블table에 넘겨준다.
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

} 

void memload() {
	// jtable에 테이블 데이터를 로드한다.
	dbconnect();
	sql = "select * from memberlist where userid like in '%?%'"; // where like in = '%?%'
	try {
		pstmt = conn.prepareStatement(sql);
		result = pstmt.executeQuery();
		tblmem.setModel(DbUtils.resultSetToTableModel(result)); // 질의 결과를 테이블table에 넘겨준다.
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

}
}
