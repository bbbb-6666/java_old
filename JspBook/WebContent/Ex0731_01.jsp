<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
   <%! //int count = 0;%>

<body>
   <%
     for(int i=0;/*어디까지 갈것인지 두번째에 조건식 써줌.*/i<5; ++i){
         out.print("<h1>JSP_TEST</h1>");
     }
   %>
   <%
	  //out.println(++//count);
   		out.print(myMethod(0)); /*print라고 해도 되고 println 이라고 해도됨 어차피 줄바꿈 안해도 되니까 print사용.*/
   		out.println("<h3>JSP</h3>");
   %>
   <%!
   		public int/*반환타입*/ myMethod/*정수형 명칭*/(int count) {
	   		return ++count; /*값을 증가시켜서 반환한다.*/
   }
   %>
</body>

</html>