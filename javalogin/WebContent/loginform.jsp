<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type = "text/javascript" src = "./resources/js/validation.js"></script>
<title>회원가입 창</title>
</head>
<body>
<form name=fom>
		<fieldset>
			<legend>회원가입</legend>
			<table>
				<tr>
					<td>아이디 * </td>
					<td><input type="text" id="id" name="id"></td>
				</tr>
				<tr>
					<td>이름 * </td>
					<td><input type="text" id="name" name="name"></td>
				</tr>
				<tr>
					<td>비밀번호 * </td>
					<td>
						<input type="password" id="pwd" name="pwd">
					</td>
				</tr>
				<tr>
					<td>핸드폰</td>
					<td>
						<input type="text" id="phone" name="phone">
					</td>
				</tr>
				<tr>
					<td>성별</td>
					<td><input type="radio" value="male" name="gender" class="gender">남 
						<input type="radio" value="female" name="gender" class="gender">여</td>
				</tr>
				<tr>
					<td>주소</td>
					<td> <input type=text name="do" id="do">도 
						 <input type="text" name="city" id="city">시  <br>
					상세주소 : <input type="text" name="detailaddr" id="detailaddr"></td>
				</tr>
				<tr>
					<td>회원가입일</td>
					<td>
						<input type="text" id="registdate" name="registdate">
					</td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="text" id="email" name="email"> @ 
						<select id="url">
							<option>naver.com</option>
							<option>daum.net</option>
							<option>nate.com</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>생일</td>
					<td><input type="date" id="birth" name="birth">
					</td>
				</tr>
				<tr>
					<td>최종방문일</td>
					<td><input type="text" id="lastvdate" name="lastvdate"></td>
				</tr>
				
				<tr>
					<td colspan="2"><input type="button" id="signup"
						value="Join us" onclick="CheckLogin()"> 
						<input type="reset" value="reset">
					</td>
				</tr>
				</table>
		</fieldset>
	</form>
</body>
</html>