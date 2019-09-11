<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "model.UserDataBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RESULT</title>
</head>
<body>
	<h1>회원가입 결과 출력</h1>
		<% 
			//user로 받음
			//데이터형이 유저데이타빈이기 때문에 그걸로 변환해서 받을것임
			UserDataBean user2= (UserDataBean)request.getAttribute("user");
		%>
		
		First Name : <%= user2.getFirstname() %> <br>
		Last Name : <%= user2.getLastname() %> <br>
		Email : <%= user2.getEmail() %> <br>
</body>
</html>