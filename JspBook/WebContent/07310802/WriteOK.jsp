<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page import = "java.util.*" %> <%-- 어제 했던 것들을 사용하기 위함--%>
  <%@ page import = "java.sql.*" %> <%--jdbc를 사용하기 위함 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write_OK</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8"); //폼에서 넘어오는 데이터의 한글처리가 이상없이 이루어짐.
		String b_subject = request.getParameter("b_subject");
		String b_name = request.getParameter("b_name");
		String b_contents = request.getParameter("b_contents"); //이 세개는 표 연동.
		
		Connection conn= null; //데이터베이스 연결 객체 선언 (아직 메모리에 없음)
		Statement stmt = null; //sql 문장 처리용 객체 선언 (아직 메모리에 없음)
		ResultSet rs = null; // 조회된 테이블 결과 저장 객체(select 실행시 필요, 그외는 불필요)
		String sql = ""; // 쿼리작성용 문자열 
		
		Calendar cal = Calendar.getInstance(); //국가들 설정에 따라서 날짜와 시간을 얻어내겠다.
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH) + 1;
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		int hh = cal.get(Calendar.HOUR_OF_DAY); //24시간으로 표시됨
		int ms = cal.get(Calendar.MINUTE);
		int sc = cal.get(Calendar.SECOND);
		String b_date = String.format("%2d-%02d-%02d %02d:%02d:%02d", yy,mm,dd,hh,ms,sc); 

		try {
			Class.forName("org.sqlite.JDBC"); //forname은 정적변수. 그 안에 드라이버명칭을 써주면 됨. :: JDBC 드라이버 로드
			out.print("드라이버로드OK<br>");
			conn = DriverManager.getConnection("jdbc:sqlite:D:\\sqlite 3\\mydb.db") ;
			out.print("디비연결OK<br>");
			stmt = conn.createStatement(); //쿼리실행용 객체 생성
 			
			sql = "insert into board (b_subject, b_name, b_visit, b_date, b_contents) "; //b_num은 빼고함
			sql += "values ('" + b_subject + "','";
			sql += b_name + "',0,'";
			sql += b_date + "','";
			sql += b_contents + "')";
			
			stmt.executeUpdate(sql);
			response.sendRedirect("./List.jsp"); //디비에 쓰기 작업 후 리스트 페이지로 이동
			
			//"values ('테스트', '홍길동', 0, '"  + b_date +  "', '테스트입니다')";	//이걸 실행시키려면 stmt 객체가 필요함, b_date에 b_date라고 넣으면 안됨.
			//stmt.executeUpdate(sql);
			//out.print(sql+"<br>");
			//out.print("쿼리실행 OK<br>");
		} catch(Exception e) {
			out.print(e.toString() + "DB 에러");
		}

		try {
			stmt.close(); //객체닫기
			conn.close(); //객체닫기
		} catch(Exception e) {
			out.print(e.toString()+"DB닫기 에러");
		}
	%>
</body>
</html>