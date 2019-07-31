<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		border-collapse : collapse; <!--이거 없으면 선이 2줄로 나옴.-->
	}
</style>
</head>

<!-- for문을 이용한 표만들기 -->
<body>
	<% int count = 0; %>
	<table border=1>
		<%
			for (int i=0; i<3; i++){
				out.print("<tr>");/*3행을 만들 준비가 된 것 */
				for (int j=0; j<4; j++){
					out.print("<td>");
					out.print("테이블"+ ++count);
					out.print("</td>");
				}
				out.print("</tr>");
			}
		%> 
	</table>
	<br>
	<!--  /*<%
		//int count = 0;
	%>-->
	<% count = 0; %>
	<table border=1>
		<% 
			for (int i=0; i<3; i++) {%>
		<tr>
		<% for (int j=0; j<4; j++) {%>
		<td>테이블 <%=++count%></td>
		<% } %>
				</tr>
		<% } %> <!-- <%%>는 자바 언어고 </tr>는 html언어기 때문에 저렇게 적어줌. -->
			<!-- 
		<tr>
			<td>테이블</td>
			<td>테이블</td>
			<td>테이블</td>
		</tr>
		<tr>
			<td>테이블</td>
			<td>테이블</td>
			<td>테이블</td>
			<td>테이블</td>
		</tr>
		<tr>
			<td>테이블</td>
			<td>테이블</td>
			<td>테이블</td>
			<td>테이블</td> --> <!-- 위에 for문이 없으면 이렇게 만들어야함. -->
	</table>
</body>
</html>