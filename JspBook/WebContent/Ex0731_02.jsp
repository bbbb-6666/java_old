<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%! int data=50; %>
  <%
	out.println("data 변수의 값은 "+data+"입니다."+"<br>"); /*웹브라우저에는 print println의 차이가 없다.*/  
	//뛰어쓰기하고싶으면 br을 넣기. 윗줄이나 아랫줄 둘다 상관없음.
	out.println("data 변수의 값은 "+data+"입니다."); /*웹브라우저에는 print println의 차이가 없다.*/  
	
  %>
</body>
</html>