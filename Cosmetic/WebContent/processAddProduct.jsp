<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="com.oreilly.servlet.*"%>
<%@ page import="com.oreilly.servlet.multipart.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.sql.*"%>
<%@ include file="dbconn.jsp" %>
<%
	request.setCharacterEncoding("UTF-8");

	String filename = "";
	String realFolder = "D://GitHub//java//Cosmetic//WebContent//resources//img//"; //웹 애플리케이션상의 절대 경로
	int maxSize = 5 * 1024 * 1024; //최대 업로드될 파일의 크기 5MB
	String encType = "utf-8"; //인코딩 유형

	MultipartRequest multi = new MultipartRequest(request, realFolder, maxSize, encType,
			new DefaultFileRenamePolicy());

	String c_id = multi.getParameter("c_id");
	String c_name = multi.getParameter("c_name");
	Integer c_price = Integer.parseInt(multi.getParameter("c_price"));
	String c_description = multi.getParameter("c_description");
	String c_manufacturer = multi.getParameter("c_manufacturer");
	String c_category = multi.getParameter("c_category");
	Integer c_unitsinstock = Integer.parseInt(multi.getParameter("c_unitsinstock"));
	
	Integer price;

 	/*if (price.isEmpty())
		price = 0;
	else
		price = Integer.valueOf(unitPrice); */

 	long stock;

	/* if (c_unitsinstock.isEmpty())
		stock = 0;
	else
		stock = Long.valueOf(c_unitsinstock); */

	Enumeration files = multi.getFileNames();
	String fname = (String) files.nextElement();
	String c_filename = multi.getFilesystemName(fname);
	
	PreparedStatement pstmt = null;
	
	String sql = "insert into cosmetic values(?, ?, ?, ?, ?, ?, ?, ?)";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, c_id);
	pstmt.setString(2, c_name);
	pstmt.setInt(3, c_price);
	pstmt.setString(4, c_description);
	pstmt.setString(5, c_category);
	pstmt.setString(6, c_manufacturer);
	pstmt.setInt(7, c_unitsinstock);
	pstmt.setString(8, c_filename);
	pstmt.executeUpdate();
	
	if (pstmt != null)
		pstmt.close();
	if (conn != null)
		conn.close();

	response.sendRedirect("products.jsp");
%>