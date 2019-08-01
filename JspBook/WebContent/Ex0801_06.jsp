<%-- p.165 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex0801_06</title>
</head>
<body>
	<%
		response.setIntHeader("Refresh", 5);
		Calendar cal = Calendar.getInstance(); //임포트문을 지정해줘야 사용할 수 있음.
		int hh = cal.get(Calendar.HOUR_OF_DAY);
		int ms = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);
		out.print(hh + " : " + ms + " : " + ss + "<br>");
	%>
</body>
</html>