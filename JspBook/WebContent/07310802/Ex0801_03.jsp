<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex0801_03</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	<%
		String uname = request.getParameter("uname"); //getParameter라는 메소드를 통해 상대방이 전송한 내용을 받아낼 수 있음
		String subject = request.getParameter("subject");
		String contents = request.getParameter("contents");
		
		//넘어오는 문자중에 첫번째 항목 문자가 있으면 두번째항목 문자로 치환시키라는 것. 그래서 컨텐츠 덮어쓰기 하라는것.
		contents = contents.replace("'", "&nbsp;"); 
		contents = contents.replace("<", "&lt;");
		contents = contents.replace(">", "&gt;");
		contents = contents.replace("\n", "<br>");
		/*이렇게 치환을 해주지 않으면 명령기호를 넣었을 때 그것이 실행되어서 시스템에 변경 및 피해를 줄 수도 있다.
			보통 이 4개를 막으면 부작용을 막을 수 있음.*/
		
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");
		
		out.print("제목 : "+subject+"<br>");
		/*이렇게만 하면 넘어오긴 오는데 한글 처리가 안되어있어서 외계어로 됨. 
		    넘어오는 매개변수(패러미터)에 대해 처리를 해줘야함.
		    그래서 바디의 첫번째에다가 request.setCharacterEncoding("utf-8"); 이걸 써줌 */
		out.print("이름 : " + uname + "<br>");
		out.print("내용 : "+ contents + "<br>");
		out.print("통신사 : "+ phone + "<br>");
		out.print("지역 : "+ city + "<br>");
		out.print("접속아이피 : "+request.getRemoteAddr()); /*이건 자동으로 넘기는 거라 상대방이 넘기는ㄱ ㅔ없더라도 알아서 찍힘*/

	%>
</body>
</html>