<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import = "dto.Product" %>
<%@ page import ="dao.ProductRepository" %>
<%@ page errorPage = "exceptionNoProductId.jsp" %>
<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel = "stylesheet" href="./resources/css/bootsrtap.min.css"/>
<title>상품 상세 정보</title>
<script type="text/javascript">
	function addToCart() {
		if (confirm("상품을 장바구니에 추가하시겠습니까?")){
			document.addForm.submit();
		} else {
			document.addForm.reset();
		}
	}
</script>
</head>
<body>
	<jsp:include page = "menu.jsp" />
	<div class = "jumbotron">
		<div class = "container">
			<h1 class="display-3">상품 정보</h1>
		</div>
	</div>
	<%
		String id = request.getParameter("id");
		ProductRepository dao = ProductRepository.getInstance();
		Product product = dao.getProductById(id);
	%>
	<div class = "container">
		<div class = "row">
		<div class = "col-md-5">
			<img src="./resources/images/<%=product.getC_filename()%>"style = "width: 100%"/>
		</div>
			<div class = "col-md-6">
				<h3><%=product.getC_name() %></h3>
				<p><%=product.getC_description() %>
				<p> <b>상품코드 : </b><span class = "badge badge-danger">
					<%= product.getC_id() %></span>
				
				<p> <b>제조사</b> : <%=product.getC_manufacturer() %>
				<p> <b>분류</b> : <%=product.getC_category() %>
				<p> <b>재고 수사</b> : <%=product.getC_unitsinstock() %>
				<h4><%=product.getC_price()%>원</h4>
				<p> <form name = "addForm" action="./addCart.jsp?id=<%=product.getC_id()%>" method="post">
				<p><a href = "#" class = "btn btn-info" onclick="addToCart()">상품 주문 &raquo;</a>
				<a href = "./cart.jsp" class = "btn btn-warning">장바구니 &raquo;</a>
				<a href = "./products.jsp" class = "btn btn-secondary">상품 목록 &raquo;</a>
				</form>
			</div>
		</div>
	</div>
	<jsp:include page = "footer.jsp" />
</body>
</html>