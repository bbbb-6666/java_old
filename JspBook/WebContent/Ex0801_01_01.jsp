<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@  page import ="java.util.*"%> 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex0801_01_01</title>
</head>
<body>
	<%--@ include file="./Ex0801_menu.jsp" --%>
	<jsp:include page="./Ex0801_footer.jsp" flush="false" />
	<%= new Date() %> <br>
	<%
		Date date = new Date(); 
		out.print(date+"<br>");
		out.print(date+"<br>");
		out.print(date+"<br>");
		int hour = date.getHours();
		out.print(hour+"<br>");
	%>
	<%
		Calendar cal = Calendar.getInstance(); //국가들 설정에 따라서 날짜와 시간을 얻어내겠다.
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH) + 1;
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		int hh = cal.get(Calendar.HOUR_OF_DAY); //24시간으로 표시됨
		int ms = cal.get(Calendar.MINUTE);
		int sc = cal.get(Calendar.SECOND);
		String date2 = yy + "-" + mm + "-" + dd + " " + hh + ":" + ms + ":" + sc;
		out.print(date2 + "<br>");
		String date3 = String.format("%2d-%02d-%02d %02d:%02d:%02d", yy,mm,dd,hh,ms,sc); 
		out.print(date3 + "<br>");
	%>
	<jsp:include page="./Ex0801_footer.jsp" flush="false" />
	<%--@ <%@ include file="./Ex0801_footer.jsp" %> --%>
</body>
</html>