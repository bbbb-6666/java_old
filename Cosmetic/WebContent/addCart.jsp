<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<%@ page import="java.sql.*"%> 
<%@ page import="com.oreilly.servlet.*"%>
<%@ page import="com.oreilly.servlet.multipart.*"%>



<%
	String c_id = request.getParameter("c_id");
	if (c_id == null || c_id.trim().equals("")) {
		response.sendRedirect("products.jsp");
		return;
	}

	
	// id변수를 이용하여 db에서 해당 상품 정보가져오기
	
	Connection conn = null;	
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "madang";
	String password = "madang";
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	conn = DriverManager.getConnection(url, user, password);
	
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String sql = "select * from product where c_id = ?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, c_id);
	rs = pstmt.executeQuery();	
	
	
	
	Product cosmetic = new Product();

	while(rs.next()) {
		String c_name = rs.getString("c_name");
		int c_price = rs.getInt("c_price");
		String c_description = rs.getString("c_description");
		String c_category = rs.getString("c_category");
		String c_manufacturer = rs.getString("c_manufacturer");
		long c_unitsinstock = rs.getLong("c_unitsinstock");
		String c_filename = rs.getString("c_filename");
		int c_quantity = rs.getInt("quantity");
		
		cosmetic.setC_name(c_name);
		cosmetic.setC_price(c_price);
		cosmetic.setC_description(c_description);
		cosmetic.setC_category(c_category);
		cosmetic.setC_manufacturer(c_manufacturer);
		cosmetic.setC_unitsinstock(c_unitsinstock);
		cosmetic.setC_filename(c_filename);
		cosmetic.setQuantity(c_quantity);

	}// end of while
		
	ProductRepository dao = ProductRepository.getInstance();
	dao.addProduct(cosmetic);

	
%>