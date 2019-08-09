<%--교재 p.161 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex0801_04</title>
</head>
<body>
	<%
		//response.sendRedirect("./Ex0801_05.jsp");
	%>
	<script>
		alert("다른 페이지로 이동합니다."); //이렇게 하면 메시지상자가 뜸.
		location.href='./Ex0801_05.jsp'; // 메시지 상자가 뜨고 지정된 url로 이동
	</script>
</body>
</html>