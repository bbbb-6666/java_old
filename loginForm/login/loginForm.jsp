<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type = "text/javascript" src = "./resources/js/validation.js"></script>
<title>회원가입</title>
</head>
<body>
<form name=fom>
		<fieldset>
			<legend>회원가입</legend>
			<table>
				<tr>
					<td>ID</td>
					<td><input type="text" id="id" name="id"></td>
				</tr>
				<tr>
					<td>PW<br>확인
					</td>
					<td><input type="password" id="pw1" name="pw1"><br>
						<input type="password" id="pw2" name="pw2"></td>
				</tr>
				<tr>
					<td>성별</td>
					<td><input type="radio" value="male" name="gender"
						class="gender">남 <input type="radio" value="female"
						name="gender" class="gender">여</td>
				</tr>
				<tr>
					<td>취미</td>
					<td><input type="checkbox" value="sport" name="hobby"
						class="hobby">운동 <input type="checkbox" value="trip"
						name="hobby" class="hobby">여행 <input type="checkbox"
						value="read" name="hobby" class="hobby">독서</td>
				</tr>
				<tr>
					<td>생일</td>
					<td><input type="date" id="birth" name="birth"></td>
				</tr>
				<tr>
					<td>나이</td>
					<td><input type="text" id="age" name="age"></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="text" id="email" name="email"> @ <select
						id="url">
							<option>naver.com</option>
							<option>daum.net</option>
							<option>nate.com</option>
					</select></td>
				</tr>
				<tr>
					<td>메모</td>
					<td><textarea id="memo" rows="3" cols="50"></textarea></td>
				</tr>
				<tr>
					<td colspan="2"><input type="button" id="signup"
						value="signup"> <input type="reset" value="reset">
					</td>
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>