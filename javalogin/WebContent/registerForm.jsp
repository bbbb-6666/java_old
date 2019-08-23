<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입정보</title>
</head>
<body>
   <% request.setCharacterEncoding("UTF-8");%>
   <h3> 가 입 정 보 </h3>
   
   <%
      String pid = request.getParameter("id");
      String pname = request.getParameter("name");   
      String ppwd = request.getParameter("pwd");
      String pphone = request.getParameter("phone");
      String pgender = request.getParameter("gender");
      String pdo = request.getParameter("do");
      String pcity = request.getParameter("city");
      String pdtaddr = request.getParameter("dtaddr");
      String prday = request.getParameter("registdate");
      String pemail = request.getParameter("email");
      String purl = request.getParameter("url");
      String pbirth = request.getParameter("birth");
      String pvday = request.getParameter("lastvdate");
   %>
   
   <p> 아이디 :  <%=pid %>
   <p> 이름 :  <%=pname %>
   <p> 비밀번호  : <%=ppwd %>
   <p> 전화번호 : <%=pphone %>
   <p> 성별 :  <%=pgender %>
   <p> 주소 :  <%=pdo %>도 <%=pcity %>시 <%=pdtaddr %>
   <p> 가입일 :  <%=prday %> 
   <p> 이메일 :  <%=pemail %> @ <%= purl %>
   <p> 생일 :  <%=pbirth %>
   <p> 방문일 :  <%=pvday %>

</body>
</html>