<!--  chapter 03 의 내용 전부 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- contentType="text/html; charset=UTF-8 : 어떤 나라에서  하더라도 한국어로 출력되게 해달라.-->
    <%@  page import ="java.util.*"%> 
    		<!-- 선언적인 성격이 있기 때문에 어떤 코드보다도 가장 위쪽에 작성함. / * 별표의 뜻은 뭘쓸지 모르겠어서 왠만하면 다 갖다 쓰겠다는 뜻.-->
   <!-- <%@  page import ="java.sql.*"%> -->
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="./Ex0801_menu.jsp" %> <!-- 넣고 싶은 곳에 넣으면됨, 맨밑에 푸터도 마찬가지 -->
	<%= new Date() %> <br> <!-- 이렇게만 써줘도 됨. 왜냐면 앞에 import로 선언해줬기 때문에, 한번만 사용할거라면 이 방식-->
	<%
		Date date = new Date(); //여러 방식으로 쓸거라면 이 방식
		out.print(date+"<br>");
		out.print(date+"<br>");
		int hour = date.getHours();
		out.print(hour+"<br>");
	%>
	<%
		Calendar cal = Calendar.getInstance(); //국가들 설정에 따라서 날짜와 시간을 얻어내겠다.
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH);
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		int hh = cal.get(Calendar.HOUR_OF_DAY); //24시간으로 표시됨
		int ms = cal.get(Calendar.MINUTE);
		int sc = cal.get(Calendar.SECOND);
		String date2 = yy + "-" + mm + "-" + dd + " " + hh + ":" + ms + ":" + sc;
		out.print(date2 + "<br>");
		String date3 = String.format("%2d-%02d-%02d %02d:%02d:%02d", yy,mm,dd,hh,ms,sc);
		/*괄호 안에 (형식, 변수)을 쓰면됨. 형식은  퍼센트기호를 많이 사용함. 숫자는 d 숫자형식으로 나와달라고 형식지정자를 써주면 됨.
		%2d : 숫자 두자리로 해서 출력되게 해주세요///// 위에 문장은 정적변수(?) */
		out.print(date3 + "<br>");
		%>
	<%@ include file="./Ex0801_footer.jsp" %> 
</body>
</html>