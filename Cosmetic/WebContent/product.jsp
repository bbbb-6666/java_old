<%@ page contentType="text/html; charset=utf-8"%>
<%@ page errorPage="exceptionNoProductId.jsp"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<html>
<head>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<title>상품 상세 정보</title>
<script type="text/javascript">
	function addToCart() {
		if (confirm("상품을 장바구니에 추가하시겠습니까?")) {
			document.addForm.submit();
		} else {		
			document.addForm.reset();
		}
	}
</script>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 정보</h1>
		</div>
	</div>
		<%
		String c_id = request.getParameter("c_id");
		ProductRepository dao = ProductRepository.getInstance();
		Product product = dao.getcosmeticById("c_id");
		%>
	<!-- db 연결하기 -->
		<%@ include file="dbconn.jsp" %>
			
			<!-- db로부터 상품 목록(cosmetic)을 불러와 웹에 표시하기  -->
			<%
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				
				String sql = "select * from product";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
			%>
	<!-- 테이블 변수를 이용하여 수정!!  -->
	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<img src="D:/GitHub/java/Cosmetic/WebContent/resources/img/<%=product.getC_filename()%>" style="width: 100%" />
			</div>
			<div class="col-md-6">
				<h3><%=product.getC_name()%></h3>
				<p><%=product.getC_description()%>
				<p><b>상품 코드 : </b><span class="badge badge-danger"> <%=product.getC_id()%></span>
				<p><b>제조사</b> : <%=product.getC_manufacturer()%>
				<p><b>분류</b> : <%=product.getC_category()%>
				<p><b>재고 수</b> : <%=product.getC_unitsinstock()%>
				<h4><%=product.getC_price()%>원</h4>
				<p><form name="addForm" action="./addCart.jsp?id=<%=product.getC_id()%>" method="post">
					<a href="#" class="btn btn-info" onclick="addToCart()"> 상품 주문 &raquo;</a>
					<a href="./cart.jsp" class="btn btn-warning"> 장바구니 &raquo;</a> 
					<a href="./products.jsp" class="btn btn-secondary"> 상품 목록 &raquo;</a>
				</form>
				
				<!-- db관련객체 닫기  -->
			<%
				}
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			%>
			</div>
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>
