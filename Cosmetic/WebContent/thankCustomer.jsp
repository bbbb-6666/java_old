<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.net.URLDecoder"%>
<html>
<head>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<title>주문 완료</title>
</head>
<body>
	<%
		String shipping_c_cartId = "";
		String shipping_c_name = "";
		String shipping_c_shippingDate = "";
		String shipping_c_country = "";
		String shipping_c_zipCode = "";
		String shipping_c_addressName = "";		

		Cookie[] cookies = request.getCookies();

		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				Cookie thisCookie = cookies[i];
				String n = thisCookie.getName();
				if (n.equals("Shipping_c_cartId"))
					shipping_c_cartId = URLDecoder.decode((thisCookie.getValue()), "utf-8");
				if (n.equals("Shipping_c_shippingDate"))
					shipping_c_shippingDate = URLDecoder.decode((thisCookie.getValue()), "utf-8");
			}
		}
	%>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">주문 완료</h1>
		</div>
	</div>
	<div class="container">
		<h2 class="alert alert-danger">주문해주셔서 감사합니다.</h2>
		<p>주문은	<%	out.println(shipping_c_shippingDate);	%>에 배송될 예정입니다! !	
		<p>주문번호 :	<%	out.println(shipping_c_cartId);	%>
	</div>
	<div class="container">
		<p><a href="./products.jsp" class="btn btn-secondary"> &laquo; 상품 목록</a>
	</div>
</body>
</html>
<%
	session.invalidate();

	for (int i = 0; i < cookies.length; i++) {
		Cookie thisCookie = cookies[i];
		String n = thisCookie.getName();
		if (n.equals("Customer_c_Id"))
			thisCookie.setMaxAge(0);
		if (n.equals("Customer_c_name"))
			thisCookie.setMaxAge(0);
		if (n.equals("Customer_c_phoneNumber"))
			thisCookie.setMaxAge(0);
		if (n.equals("Customer_c_country"))
			thisCookie.setMaxAge(0);
		if (n.equals("Customer_c_zipCode"))
			thisCookie.setMaxAge(0);
		if (n.equals("Customer_c_addressName"))
			thisCookie.setMaxAge(0);

		if (n.equals("Shipping_c_cartId"))
			thisCookie.setMaxAge(0);
		if (n.equals("Shipping_c_name"))
			thisCookie.setMaxAge(0);
		if (n.equals("Shipping_c_shippingDate"))
			thisCookie.setMaxAge(0);
		if (n.equals("Shipping_c_country"))
			thisCookie.setMaxAge(0);
		if (n.equals("Shipping_c_zipCode"))
			thisCookie.setMaxAge(0);
		if (n.equals("Shipping_c_addressName"))
			thisCookie.setMaxAge(0);
		
		response.addCookie(thisCookie);
	}
%>
