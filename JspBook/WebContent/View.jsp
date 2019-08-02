<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page import = "java.util.*" %>
  <%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View</title>
</head>
<body>
	<% String b_num = request.getParameter("b_num"); %> <%--밑에 b_num을 호출하기때문에 위에 써줘야함  --%>

	<%
		Connection conn= null; //데이터베이스 연결 객체 선언 (아직 메모리에 없음)
		Statement stmt = null; //sql 문장 처리용 객체 선언 (아직 메모리에 없음)
		ResultSet rs = null; // 조회된 테이블 결과 저장 객체(select 실행시 필요, 그외는 불필요)
		String sql = ""; // 쿼리작성용 문자열 
	%>
		
	<%	
		try {
			Class.forName("org.sqlite.JDBC"); //forname은 정적변수. 그 안에 드라이버명칭을 써주면 됨. :: JDBC 드라이버 로드
			out.print("드라이버로드OK<br>");
			conn = DriverManager.getConnection("jdbc:sqlite:D:\\sqlite 3\\mydb.db") ;
			out.print("디비연결OK<br>");
			stmt = conn.createStatement(); //쿼리실행용 객체 생성
			sql = "select * from board where b_num="+b_num; //b_num=?은 preparestatement구문을 써야함.
			rs = stmt.executeQuery(sql); // 쿼리 실행해서 결과를 rs 변수에 반환받음, rs는 거대한 변수.
		}  
			catch(Exception e) {
			out.print(e.toString() + "DB 에러");
		}	
	 %>
	 <%	
		
		String b_subject = rs.getString("b_subject");
		String b_name = rs.getString("b_name");
		int b_visit = rs.getInt("b_visit");
		String b_date = rs.getString("b_date");
		String b_contents = rs.getString("b_contents");
		b_contents = b_contents.replace("\n", "<br>");
	%>

<h2>글 보기</h2>
		<table border=1>
			<tr>
				<td width='100' align=center>번호</td>
				<td width='400'><%=b_num%></td>
			</tr>
			<tr>
				<td width='100' align=center>제목</td>
				<td width='400'><%=b_subject%></td>
			</tr>
			<tr>
				<td width='100' align=center>이름</td>
				<td width='400'><%=b_name %></td>
			</tr>
			<tr>
				<td width='100' align=center>내용</td>
				<td width='400'><%=b_contents %></td>
			</tr>
		</table>
	 <%
		try {
			rs.close(); //객체 닫긔
			stmt.close(); //객체닫기
			conn.close(); //객체닫기
		} catch(Exception e) {
			out.print(e.toString()+"DB닫기 에러");
		}
	 %>
</body>
</html>