package watcha;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserID;
	private JTextField txtUserPWD;
	static LoginForm frame = new LoginForm();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end of void main

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToJavadb = new JLabel("Watcha");
		lblWelcomeToJavadb.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToJavadb.setFont(new Font("함초롬돋움", Font.BOLD, 18));
		lblWelcomeToJavadb.setBounds(174, 24, 145, 25);
		contentPane.add(lblWelcomeToJavadb);
		
		txtUserID = new JTextField();
		txtUserID.setFont(new Font("Jura SemiBold", Font.PLAIN, 12));
		txtUserID.setBounds(162, 76, 116, 21);
		contentPane.add(txtUserID);
		txtUserID.setColumns(10);
		
		txtUserPWD = new JTextField();
		txtUserPWD.setFont(new Font("Jura SemiBold", Font.PLAIN, 12));
		txtUserPWD.setBounds(162, 122, 116, 21);
		contentPane.add(txtUserPWD);
		txtUserPWD.setColumns(10);
		
		JLabel Uid = new JLabel("USER NAME");
		Uid.setFont(new Font("Jura Medium", Font.PLAIN, 13));
		Uid.setBounds(53, 79, 97, 15);
		contentPane.add(Uid);
		
		JButton joinbt = new JButton("JOIN");
		joinbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 dispose();
           		// 새로운 화면을 생성한 후
           Join join = new Join();
           		// 새로운 화면을 보이게 한다 setVisable(ture);
           join.setVisible(true);

			}
		});
		joinbt.setFont(new Font("Jura SemiBold", Font.PLAIN, 12));
		joinbt.setBounds(53, 172, 97, 23);
		contentPane.add(joinbt);
		

		
		
		JButton loginbt = new JButton("LOGIN");
		loginbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	            // DB Connection
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
	               
	               String uid = txtUserID.getText(); // 얘 없으면 똑같이 userForm 뜸
	               String upwd = txtUserPWD.getText(); //
	                  
	               sql = "SELECT * FROM memberlist WHERE userid=? AND userpwd = ?";
	               pstmt = conn.prepareStatement(sql);
	               pstmt.setString(1, txtUserID.getText());
	               pstmt.setString(2, txtUserPWD.getText());
	               
	               result = pstmt.executeQuery();
	               
	               if(result.next()) {
	                     dispose();
	                     if(uid.equals("admin")) {  //새로운 화면을 생성한 후
	                     Admin admin = new Admin();
	                     admin.setVisible(true);//새로운 화면을 보이게 한다.
	                     }
	                     else {
	                        MemberInfo memberinfo = new MemberInfo();
	                        memberinfo.setVisible(true);
	                     }
	                  }
	                  else {
	                     JOptionPane.showMessageDialog(null, "로그인 실패");
	                  }
	                  
	               
	               
	            } catch (ClassNotFoundException e1) {
	               // TODO Auto-generated catch block
	               e1.printStackTrace();
	            }  catch (SQLException e1) {
	               // TODO Auto-generated catch block
	               e1.printStackTrace();
	            }
				
			}
		});
		loginbt.setFont(new Font("Jura SemiBold", Font.PLAIN, 12));
		loginbt.setBounds(181, 172, 97, 23);
		contentPane.add(loginbt);
		
		JLabel Upw = new JLabel("PASSWORD");
		Upw.setFont(new Font("Jura Medium", Font.PLAIN, 13));
		Upw.setBounds(53, 125, 97, 15);
		contentPane.add(Upw);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(311, 48, 145, 158);
		contentPane.add(label);
		
		JButton btnGuest = new JButton("GUEST");
		btnGuest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 dispose();
	           		// 새로운 화면을 생성한 후
	           Guest guest = new Guest();
	           		// 새로운 화면을 보이게 한다 setVisable(ture);
	           guest.setVisible(true);
			}
		});
		
		
		btnGuest.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnGuest.setBounds(53, 210, 97, 23);
		contentPane.add(btnGuest);
	} // end of public login form
} // end of calss
