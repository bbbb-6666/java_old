<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet"
		  href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<style>
	@import url('https://fonts.googleapis.com/css?family=Lobster&display=swap');
	h1 {font-family: 'Lobster', cursive;}
	</style>
</head>
<body>
	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<div class = "container">
			<div class = "navbar-header">
				<a class = "navbar-brand" href="./welcome.jsp">Home</a>
			</div>
		</div>
	</nav>
	<%!
		String greeting = "hello, It's me.";
		String tagline = "welcome to my place";	
	%>
	<div class = "jumbotron">
		<div class = container>
			<h1 class = "display-3">
				<%= greeting %>
			</h1>
		</div>
	</div>
</body>
</html>