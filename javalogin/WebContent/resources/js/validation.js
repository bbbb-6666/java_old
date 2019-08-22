function CheckLogin() {
	var id = document.getElementById("id");
	var name = document.getElementById("name");
	var pwd = document.getElementById("pwd");
	var email = document.getElementById("email");
	
	
	/*id * 영숫자 8~12, 영문자시작
	name * 한영 20글자이하
	pwd * 영숫자특수문자 3가지가 다 들어가게 8~12*/
	
	//id * 영숫자 8~12, 영문자시작
	var regid = /^[a-z]([a-z|0-9]){7,11}$/;
	
	//name * 한영 20글자이하
	var redname = /^[a-z|A-Z|가-힣]{1,20}&/;
	
	//pwd * 영숫자특수문자 3가지가 다 들어가게 8~12
	var regpwd = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[$@$!%*#?&])[A-Za-z\d$@$!%*#?&]{7,11}$/;
	
	//email
	var regemail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
	
	/*var id = form.id.value;
	var name = form.name.value;
	var pwd = form.pwd.value;
	var email = form.email.value;*/
		
	if(!regid.test(id)) {
		alert("영문, 숫자로 이루어진 8~12글자 아이디를 작성하시오. \n(반드시 영어로 시작)")
		form.id.select();
		form.id.focus();
		return;
	}
	
	if(!regname.test(name)) {
		alert("한글, 영어가 포함된 20글자 이하의 이름을 작성하시오")
		form.name.select();
		form.name.focus();
		return;
	}
	
	if(!regpwd.test(pwd)) {
		alert("영문, 숫자, 특수문자가 포함된 비밀번호 8~12자리를 작성하시오.")
		form.pwd.select();
		form.pwd.focus();
		return;
	}
	
	if(!regemail.test(email)){
		alert("이메일을 확인하세요.");
		form.email.select();
		form.email.focus();
		return;
	}
	
	document.newMemberRegist.submit();
}

/*
if(!check(/^[a-zA-Z]([0-9]a-z[A-z]){7,11}$/, id, 
		"영문, 숫자로 이루어진 8~12글자 아이디를 작성하시오. \n(반드시 영어로 시작)")) {
    return false;
}

if(!check(/^[a-z|A-Z|가-힣]{1,20}&/, name, "한글, 영어가 포함된 20글자 이하의 이름을 작성하시오")) {
	return false;
}

if(!pwd.value.match(/^(?=.*[A-Za-z])(?=.*\d)(?=.*[$@$!%*#?&])[A-Za-z\d$@$!%*#?&]{7,11}$/, pwd,
		"영문, 숫자, 특수문자가 포함된 비밀번호 8~12자리를 작성하시오.")) {
	return false;
}*/
