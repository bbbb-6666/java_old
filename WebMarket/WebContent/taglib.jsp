<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var = "k" begin="1" end="10" step="1"> <%-- :: 1부터 10까지 1씩 증가시켜가면서 안에 있는 내용을 반복하겠다. --%>
		<c:out value="${k}" />
	</c:forEach>
 </body>
</html>