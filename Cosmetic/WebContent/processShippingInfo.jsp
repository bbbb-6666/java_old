<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.net.URLEncoder"%>
<%
	request.setCharacterEncoding("UTF-8");

	Cookie c_cartId = new Cookie("Shipping_c_cartId", URLEncoder.encode(request.getParameter("c_cartId"), "utf-8"));
	Cookie c_name = new Cookie("Shipping_c_name", URLEncoder.encode(request.getParameter("c_name"), "utf-8"));
	Cookie c_shippingDate = new Cookie("Shipping_c_shippingDate", URLEncoder.encode(request.getParameter("c_shippingDate"), "utf-8"));
	Cookie c_country = new Cookie("Shipping_c_country",	URLEncoder.encode(request.getParameter("c_country"), "utf-8"));
	Cookie c_zipCode = new Cookie("Shipping_c_zipCode", URLEncoder.encode(request.getParameter("c_zipCode"), "utf-8"));
	Cookie c_addressName = new Cookie("Shipping_c_addressName", URLEncoder.encode(request.getParameter("c_addressName"), "utf-8"));

	c_cartId.setMaxAge(365 * 24 * 60 * 60);
	c_name.setMaxAge(365 * 24 * 60 * 60);
	c_zipCode.setMaxAge(365 * 24 * 60 * 60);
	c_country.setMaxAge(365 * 24 * 60 * 60);
	c_addressName.setMaxAge(365 * 24 * 60 * 60);

	response.addCookie(c_cartId);
	response.addCookie(c_name);
	response.addCookie(c_shippingDate);
	response.addCookie(c_country);
	response.addCookie(c_zipCode);
	response.addCookie(c_addressName);

	response.sendRedirect("orderConfirmation.jsp");
%>
