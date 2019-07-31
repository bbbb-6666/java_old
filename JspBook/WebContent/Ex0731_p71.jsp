<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%
		java.util.Date mydate = new java.util.Date();
    	String time = "Current Time : ";
    	
	%>
	<%
		out.print(time+mydate);
	%>
</body>
</html>