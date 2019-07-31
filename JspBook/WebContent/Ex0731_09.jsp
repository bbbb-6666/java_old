<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
	@import url('https://fonts.googleapis.com/css?family=Courgette|Lobster&display=swap');
	h1,h2 {font-family: 'Courgette', cursive;}
	</style>
</head>
<body>
	<%!
		String greeting = "hello, It's me.";
		String tagline = "welcome to my place";	
	%>
	<h1><%=greeting%></h1>
	<h2><%=tagline %></h2>
</body>
</html>