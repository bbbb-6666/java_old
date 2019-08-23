<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p> -------------기본 로케일 -------------
		<fmt:setLocale value = "ko" />
		<fmt:setBundle basename = "bundle.myBundle" var = "resourceBundle" /> 
						<!-- setBundle = 번들파일이 어디있는지 적는것.	
						var 웅앵 : 이름을 리소스번들이라고 부르겠다. 계속 번들위치를 적어주기 불편하니까 번들이름을 정해서 
						나중에 사용할때 좀 더 편하게 사용함. -->
	<p> 제목 : <fmt:message key = "title" bundle = "${resourceBundle}" />
	<p> <fmt:message key = "username" var = "userMsg" bundle = "${resourceBundle}" />
		이름 : ${userMsg}
	<p> -------------영문 로케일--------------
		<fmt:setLocale value = "en" />
		<fmt:setBundle basename = "bundle.myBundle" var = "resourceBundle" />
			<!-- 따로 셋로케일 값을 지정을 안 해주면 마이번들로 실행이 됨.-->
	<p> 제목 : <fmt:message key = "title" bundle = "${resourceBundle}" />
	<p> <fmt:message key = "username" var = "userMsg" bundle = "${resourceBundle}" />
		이름 : ${userMsg}	
</body>
</html>