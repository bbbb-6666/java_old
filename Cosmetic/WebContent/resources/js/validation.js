
function CheckAddProduct() {
	var c_id = document.getElementById("c_id");
	var c_name = document.getElementById("c_name");
	var c_unitPrice = document.getElementById("c_unitPrice");
	var c_unitsInStock = document.getElementById("c_unitsInStock");
	
	//상품 아이디 체크
	if (!check(/^P[0-9]{4,11}$/, c_id,
			"[상품코드]\nP와 숫자를 조합하여 5~12자까지 입력하세요 \n첫 글자는 반드시 대문자 P로 시작하세요"))
		return false;
	
	//상품명 체크
	if (c_name.value.length < 4 || c_name.value.length > 12) {
		alert("[상품명]\n최소 4자에서 최대 12자까지 입력하세요");
		c_name.select();
		c_name.focus();
		return false;
	}
	
	//상품 가격 체크 
	if (c_unitPrice.value.length == 0 || isNaN(c_unitPrice.value)) {
		alert("[가격]\n숫자만 입력하세요");
		c_unitPrice.select();
		c_unitPrice.focus();
		return false;
	}
	
	if (c_unitPrice.value < 0) {
		alert("[가격]\n음수를 입력할 수 없습니다");
		c_unitPrice.select();
		c_unitPrice.focus();
		return false;
	} else if (!check(/^\d+(?:[.]?[\d]?[\d])?$/, c_unitPrice,
			"[가격]\n소수점 둘째 자리까지만 입력하세요"))
		return false;
	
	//재고수 체크
	if (isNaN(c_unitsInStock.value)) {
		alert("[재고 수]\n숫자만 입력하세요");
		c_unitsInStock.select();
		c_unitsInStock.focus();
		return false;
	}
	
	function check(regExp, e, msg) {
		if (regExp.test(e.value)) {
			return true;
		}
		alert(msg);
		e.select();
		e.focus();
		return false;
	}
	
	document.newProduct.submit()
}