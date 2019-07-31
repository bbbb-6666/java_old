<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		/*호출하지 않으면 작동하지 않는 메서드.*/
		public int sum(int a, int b) {
		return a+b;
	}
	%>
	<%
		out.print("두 수의 합은 "+sum(2,5)+"입니다.");	
	%>
</body>
</html>