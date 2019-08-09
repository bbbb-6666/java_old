<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		border-collapse : collapse;
	}
</style>
</head>
<body>

	<% int count = 0; %>
	<table border=1>
			<%
			for (int i=1; i<10; i++){
				out.print("<tr>");/*3행을 만들 준비가 된 것 */
				for (int j=1; j<10; j++){
					out.print("<td>");
					out.print(i+" X "+j+" = "+i*j);
					out.print("</td>");
				}
				out.print("</tr>");
			}
		%> 
	</table>
</body>
</html>