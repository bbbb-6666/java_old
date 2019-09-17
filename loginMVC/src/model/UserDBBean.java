package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UserDBBean {
	
	//커넥션풀 접속 방법
    private Connection getConnection() throws Exception {

    	Context initCtx = new InitialContext();
        Context envCtx = (Context) initCtx.lookup("java:comp/env");
        DataSource ds = (DataSource)envCtx.lookup("jdbc/jsptest");
        return ds.getConnection();
        
    }
	
    //db 접속 종료하기
    private void closeDB() {
    	
    	Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
        	if (conn != null) pstmt.close();
        	if (pstmt != null) pstmt.close();
        	if (rs != null) pstmt.close();
        	System.out.println("DB 접속 해제");
        } catch (Exception e) {
			e.printStackTrace();
		}
		
	}
    
    //추가 방법
    public void insertUser() {
    	
    }
 
    
    //유저 정보 입력하기
    public void insertUser(String firstname,String lastname,String email) {
    	
    	Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = null;
        
        try {
        	 conn = getConnection();  //UserDBBean의 메소드 호출
        	 System.out.println("db접속");
        	 sql = "insert into user(firstname,lastname,email) values(?,?,?)";
        	 pstmt = conn.prepareStatement(sql);
        	 pstmt.setString(1, firstname);
        	 pstmt.setString(2, lastname);
        	 pstmt.setString(3, email);
        	 int num = pstmt.executeUpdate();
        	 
        } catch(Exception e){
        	e.printStackTrace();
        } finally {
        	closeDB();
		}
		
	}
    
    
    
    //DB 자료 list 출력
    public ArrayList<UserDataBean> list() {
		
    	String firstname="";
    	String lastname="";
    	String email="";
    	
    	Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<UserDataBean> list = new ArrayList<UserDataBean>();
        String sql = null;
    	
        try {
        	conn = getConnection();
        	System.out.println("db접속");
        	sql="select * from user";
        	pstmt= conn.prepareStatement(sql);
        	rs = pstmt.executeQuery();
        	
        	while(rs.next()) {
            	UserDataBean user = new UserDataBean(firstname,lastname,email);
        		
            	user.setFirstname(rs.getString("firstname"));
            	user.setLastname(rs.getString("lastname"));
            	user.setEmail(rs.getString("email"));

            	list.add(user);
        	}
       	
        } catch(Exception e) {
        	e.printStackTrace();
        } finally {
        	 closeDB();
		}
       
    	return list;
	}
   
}
