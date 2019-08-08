package watcha;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.TextUI;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class MemberInfo extends JFrame {

	private JPanel contentPane;
	private JTextField txttitle;
	private JTextField txtruntime;
	private JTextField txtgenre;
	private JTextField txtage;
	private JTable memmvlist;
	
	Connection conn;
	PreparedStatement pstmt;
	String sql;
	ResultSet result;
	private JTextField txtuserid;

	/**
	 * Launch the application.
	 */
	/*
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
	}*/

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
		lblWahtcha.setBounds(0, -3, 1017, 52);
		contentPane.add(lblWahtcha);
		
		JLabel lbltitle = new JLabel("TITLE");
		lbltitle.setBounds(52, 136, 57, 15);
		contentPane.add(lbltitle);
		
		JLabel lblNewLabel = new JLabel("RUN TIME");
		lblNewLabel.setBounds(52, 196, 67, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("GENRE");
		lblNewLabel_1.setBounds(52, 164, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("AGE LIMIT");
		lblNewLabel_2.setBounds(52, 229, 67, 15);
		contentPane.add(lblNewLabel_2);
		
		txttitle = new JTextField();
		txttitle.setBounds(125, 133, 116, 21);
		contentPane.add(txttitle);
		txttitle.setColumns(10);
		
		txtruntime = new JTextField();
		txtruntime.setBounds(124, 194, 116, 21);
		contentPane.add(txtruntime);
		txtruntime.setColumns(10);
		
		txtgenre = new JTextField();
		txtgenre.setBounds(125, 161, 116, 21);
		contentPane.add(txtgenre);
		txtgenre.setColumns(10);
		
		txtage = new JTextField();
		txtage.setBounds(125, 226, 116, 21);
		contentPane.add(txtage);
		txtage.setColumns(10);
		
		JLabel lblStars = new JLabel("STARS");
		lblStars.setBounds(52, 260, 57, 15);
		contentPane.add(lblStars);
		
		JComboBox combostars = new JComboBox();
		combostars.setModel(new DefaultComboBoxModel(new String[]
				{"★★★★★", "★★★★", "★★★", "★★", "★"}));
		combostars.setBounds(125, 257, 116, 21);
		contentPane.add(combostars);
		
		JLabel lblReview = new JLabel("REVIEW");
		lblReview.setBounds(52, 291, 57, 15);
		contentPane.add(lblReview);
		
		JTextArea txtreview = new JTextArea();
		txtreview.setBackground(SystemColor.activeCaption);
		txtreview.setBounds(125, 288, 254, 152);
		contentPane.add(txtreview);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(445, 92, 540, 347);
		contentPane.add(scrollPane);
		
		memmvlist = new JTable();
		scrollPane.setViewportView(memmvlist);
		memmvlist.setBackground(SystemColor.inactiveCaption);
		
		JButton btnLoad = new JButton("LOAD");
		btnLoad.setBounds(899, 59, 86, 23);
		contentPane.add(btnLoad);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbconnect(); // 메소드호출
				String muserid = txtuserid.getText();
				String mtitle = txttitle.getText();
				String mgenre = txtgenre.getText();
				String mruntime = txtruntime.getText();
				String mage = txtage.getText();
				Object mstars = combostars.getSelectedItem();
				String mreview = txtreview.getText();
				
				sql = "insert into movie values (?, ?, ?, ?, ?, ?, ?)";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, muserid);
					pstmt.setString(2, mtitle);
					pstmt.setString(3, mgenre);
					pstmt.setString(4, mruntime);
					pstmt.setString(5, mage);
					pstmt.setNString(6, (String) mstars);
					pstmt.setString(7, mreview);
					
					int rst = pstmt.executeUpdate();
					if (rst == 1)
						JOptionPane.showMessageDialog(null, "영화 리뷰가 추가되었습니다.");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				memmvload(); // 이거 넣어놓으면 add 하면 자동으로 데이터로딩돼서 추가된게 보여짐
			}
			}
		);
		btnAdd.setBounds(293, 136, 86, 23);
		contentPane.add(btnAdd);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(293, 198, 86, 23);
		contentPane.add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(899, 449, 86, 23);
		contentPane.add(btnExit);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(293, 166, 86, 23);
		contentPane.add(btnUpdate);
		
		JLabel lblUserId = new JLabel("USER ID");
		lblUserId.setBounds(52, 107, 57, 15);
		contentPane.add(lblUserId);
		
		txtuserid = new JTextField();
		txtuserid.setColumns(10);
		txtuserid.setBounds(125, 104, 116, 21);
		contentPane.add(txtuserid);}
	
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
			
		void memmvload() {
			// jtable에 테이블 데이터를 로드한다.
			dbconnect();
			sql = "select * from movie";
			try {
				pstmt = conn.prepareStatement(sql);
				result = pstmt.executeQuery();
				memmvlist.setModel(DbUtils.resultSetToTableModel(result)); // 질의 결과를 테이블table에 넘겨준다.
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

		
		
	}
//end class memberinfo
