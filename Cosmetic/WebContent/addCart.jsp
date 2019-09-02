<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<%
	String id = request.getParameter("c_id");
	if (id == null || id.trim().equals("")) {
		response.sendRedirect("products.jsp");
		return;
	}

	
	// id변수를 이용하여 db에서 해당 상품 정보가져오기
	ProductRepository dao = ProductRepository.getInstance();

	Product product = dao.getcosmeticById(id);
	if (product == null) {
		response.sendRedirect("exceptionNoProductId.jsp");
	}

	ArrayList<Product> goodsList = dao.getAllProducts();
	Product goods = new Product();
	for (int i = 0; i < goodsList.size(); i++) {
		goods = goodsList.get(i);
		if (goods.getC_id().equals(id)) { 			
			break;
		}
	}
	
	ArrayList<Product> list = (ArrayList<Product>) session.getAttribute("cartlist");
	if (list == null) { 
		list = new ArrayList<Product>();
		session.setAttribute("cartlist", list);
	}

	int cnt = 0;
	Product goodsQnt = new Product();
	for (int i = 0; i < list.size(); i++) {
		goodsQnt = list.get(i);
		if (goodsQnt.getC_id().equals(id)) {
			cnt++;
			int orderQuantity = goodsQnt.getC_quantity() + 1;
			goodsQnt.setC_quantity(orderQuantity);
		}
	}

	if (cnt == 0) { 
		goods.setC_quantity(1);
		list.add(goods);
	}

	response.sendRedirect("product.jsp?id=" + id);
%>