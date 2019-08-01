<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex0801_02</title>
	<style>
		table {border-collapse : collapse}
	</style>
</head>
<body>
	<h1>민□lzI...☆</h1>
	<form method='post' action='./Ex0801_03.jsp'> <%--메소드가 앞에 와도 되고 action이 앞에와도 됨 상관 ㄴㄴ--%>
		<table border=1>
			<tr>
				<td width='100' align=center>제목</td>
				<td width='400'><input type='text' name='subject' size = '40'><!-- 40문자 정도입력가능 --></td>
			</tr>
			<tr>
				<td width='100' align=center>이름</td>
				<td width='400'><input type='text' name='uname' ></td>
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
				<td width='400'><textarea rows ='15' cols='40' name='contents'></textarea></td>
			</tr>
			<tr>
				<td colspan = '2'><input type='submit'></td>
			</tr>
		</table>
		<!--  <input type='submit'> --><%--이름과 서밋버튼은 반드시 폼 안에 들어있어야함. --%>
	</form>
	<%-- jsp에서 큰 따옴표는 권장하는 방법이 아님. 따옴표는 아예 안 쓰거나, 아니면 작은따옴표를 쓰거나.
	action='현재위치에서 전송시킬 자원의 위치'/// 이 과정 설명 : 양식 종이를 넘겨준다고 생각하면 됨. 
	 name='name' : 이렇게 쓰는 건 권장사항은 아님. 책에 이렇게 있어서 이렇게 하긴 함.
	 서밋 버튼을 누르면 ex0801_03.jsp에 전송이 되는 것.넘어가는 것.--%>
</body>
</html>