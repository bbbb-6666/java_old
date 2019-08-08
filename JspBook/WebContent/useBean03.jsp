<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action Tag - UseBean</title>
</head>
<body>
<%--jsp파일과 자바파일이 따로있음. 자바로 동작하는애를 jsp로 처음 데리고 와서 작동시켜보는것 --%>
	<jsp:useBean id="person" class="dao.Person" scope="request"/> 
	<p> 아이디 : <%= person.getId() %> </p>
	<p> 이   름 : <%= person.getName() %> </p>
</body>
</html>