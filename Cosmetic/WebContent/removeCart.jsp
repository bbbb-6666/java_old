<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<%
	String c_id = request.getParameter("c_id");
	if (c_id == null || c_id.trim().equals("")) {
		response.sendRedirect("products.jsp");
		return;
	}

	ProductRepository dao = ProductRepository.getInstance();	
	Product cosmetic = dao.getProductById(c_id);
	if (cosmetic == null) {
		response.sendRedirect("exceptionNoProductId.jsp");
	}

	ArrayList<Product> cartList = (ArrayList<Product>) session.getAttribute("cartlist");
	Product goodsQnt = new Product();
	for (int i = 0; i < cartList.size(); i++) { // 상품리스트 하나씩 출력하기
		goodsQnt = cartList.get(i);
		if (goodsQnt.getC_id().equals(c_id)) {
			cartList.remove(goodsQnt);
		}
	}

	response.sendRedirect("cart.jsp");
%>
