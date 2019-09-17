package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDBBean {
	
	// 변수처럼 다른 값을 못들어가게 하려고 static final 선언. 상수화를 시키는 것.
	
	//jdbc 드라이버 주소 
	static final String driver = "com.mysql.cj.jdbc.Driver";
	
	//
	static final String url = "jdbc:mysql://localhost:3306/simplemvc?serverTimezone=UTC";
	
	//DB ID
	static final String userid = "root"; 
	
	//DB PASSWORD
	static final String userpw = "1234";
	
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void connectDB() {		
		//1. DB 접속
		System.out.println("DB 접속 : ");
		try {
			//드라이버 연결
			Class.forName(driver);
			
			//커넥션
			conn = DriverManager.getConnection(url, userid, userpw);
				//그래서 conn이 null값이면 실패한 것.
				if(conn != null) System.out.println("성공");
				else System.out.println("실패");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ClassNotFoundException");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("SQLException");
			e.printStackTrace();
		}
		
		//2. PreparedStatement문 준비 후 쿼리 전송
		String sql = "select * from member;";
		try {
			
			//3. ResultSet 받기
				//넘겨진 쿼리를 rs에다가 받음
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); //데이터의 모든 결과가 rs안에 들어옴.
			
			//4. Result 결과물 출력해보기 -> rs.getString()
			while(rs.next()) {
				//괄호안에 컬럼인덱스순서(숫자)나 컬럼명을 가져와도 됨 둘중 하나만.
				System.out.println("First Name : "+ rs.getString("firstname"));
				System.out.println("Last Name : "+ rs.getString("lastname"));
				System.out.println("Email : "+ rs.getString("email"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//5. PreparedStatement문, ResultSet, Conn 해제 후 Close()를 통해 닫아줌.
	public static void closeDB() {
		if (conn==null) {
			try {
				pstmt.close();
				rs.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void searchUser() {
		//2. PreparedStatement 문 준비 -> 쿼리전송
		String sql = "select * from member";      // 쿼리문 생성
		try {
			pstmt = conn.prepareStatement(sql);      // 쿼리문 실행
			//3. ResultSet 받기
			rs = pstmt.executeQuery();
			//4. ResultSet 결과물 출력 -> rs.getString()
			while(rs.next()) {
				System.out.println("First name : " + rs.getString("firstname"));
				System.out.println("Last name : " + rs.getString("lastname"));
				System.out.println("email : " + rs.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}      
	}
	
	public static void insertUser(String firstname, String lastname, String email) {
		try {
			String sql = "insert into member values (?, ?, ?);";
			
			//pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, firstname);
			pstmt.setString(2, lastname);
			pstmt.setString(3, email);

			//처리된 줄 수 받기 
			int num = pstmt.executeUpdate();
			if(num==0) System.out.println("실패");
			else System.out.println("성공");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		closeDB();
		
	}


	public static void main(String[] args) throws SQLException{
		connectDB();
		searchUser();
		closeDB();
		
		/*
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//1. DB 접속
		System.out.println("DB 접속 : ");
		try {
			//드라이버 연결
			Class.forName(driver);
			
			//커넥션
			conn = DriverManager.getConnection(url, userid, userpw);
				//그래서 conn이 null값이면 실패한 것.
				if(conn != null) System.out.println("성공");
				else System.out.println("실패");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ClassNotFoundException");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("SQLException");
			e.printStackTrace();
		}
		
		//2. PreparedStatement문 준비 후 쿼리 전송
		String sql = "select * from member;";
		pstmt = conn.prepareStatement(sql);
			
		//3. ResultSet 받기
			//넘겨진 쿼리를 rs에다가 받음
		rs = pstmt.executeQuery();
		
		//4. Result 결과물 출력해보기 -> rs.getString()
		while(rs.next()) {
			//괄호안에 컬럼인덱스순서(숫자)나 컬럼명을 가져와도 됨 둘중 하나만.
			System.out.println("First Name : "+ rs.getString("firstname"));
			System.out.println("Last Name : "+ rs.getString("lastname"));
			System.out.println("Email : "+ rs.getString("email"));
		}
		
		//5. PreparedStatement문, ResultSet, Conn 해제 후 Close()를 통해 닫아줌.
		pstmt.close();
		rs.close();
		conn.close();*/
	}
	
	
	//1. DBConnect, DBClose는 메소드로 분리.
	//2. DB접속해제 부분을 제외하고는 UserSearch 메소드로 분리
	//3. UserInsert 메소드를 추가
	//(index.jsp에서 받아와서 controller가 가지고 있는 회원정보를 
	// DB에 넘겨주는 부분으로 추가 :: insert into member(?,?,?) 
	//-> user.getfirstName(), user.getlastname(), user.getemail();
	//4. search한 결과를 result.jsp에 출력되도록 함.
	
	
	
}
