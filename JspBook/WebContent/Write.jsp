<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시판 글쓰기</h1>
	<form method='post' action='./WriteOK.jsp'> <%--메소드가 앞에 와도 되고 action이 앞에와도 됨 상관 ㄴㄴ--%>
		<table border=1>
			<tr>
				<td width='100' align=center>제목</td>
				<td width='400'><input type='text' name='b_subject' size = '40'><!-- 40문자 정도입력가능 --></td>
			</tr>
			<tr>
				<td width='100' align=center>이름</td>
				<td width='400'><input type='text' name='b_name' ></td>
			</tr>
			<tr>
				<td width='100' align=center>통신사</td>
				<td width='400'>
					<input type='radio' name='phone' value='SKT' checked> SKT &nbsp;
					<input type='radio' name='phone' value='KT'> KT &nbsp;
					<input type='radio' name='phone' value='LGT'> LGT <!-- 이름은 전부 동일하나, value만 바뀜. -->
				</td>
			</tr>
			<tr>
				<td width='100' align=center>지역</td>
				<td width='400'>
					<select name='city'>
    					<option value='ucity'selected>지역 선택</option>
    					<option value='chungbuk' >충북</option>
    					<option value='kyoungki'>경기</option>
    					<option value='seoul'>서울</option>
    				</select>
				</td>
			</tr>
			<tr>
				<td width='100' align=center>내용</td>
				<td width='400'><textarea rows ='15' cols='40' name='b_contents'></textarea></td>
			</tr>
			<tr>
				<td colspan = '2'><input type='submit'></td>
			</tr>
		</table>
		<!--  <input type='submit'> --><%--이름과 서밋버튼은 반드시 폼 안에 들어있어야함. --%>
	</form>
</body>
</html>