<%@ page contentType="text/html; charset=utf-8"%>
<%@ page errorPage="exceptionNoProductId.jsp"%>

<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<meta charset="utf-8">
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
	<!-- db 연결하기 -->
	<div class="container">
		<div class="row">
			<%@ include file="dbconn.jsp" %>
			
			<!-- db로부터 상품 목록(cosmetic)을 불러와 웹에 표시하기  -->
			<%-- <%
				String id = request.getParameter("c_id");
				ProductRepository dao = ProductRepository.getInstance();
				Product product = dao.getProductById(id);
			%> --%>
			<%
			String c_id = request.getParameter("c_id");
			
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				
				String sql = "select * from cosmetic where c_id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, c_id);
				rs = pstmt.executeQuery();
				if (rs.next()) {
			%>
	<!-- 테이블 변수를 이용하여 수정!!  -->
	
			<div class="col-md-5">
				<img src="./resources/img/<%=rs.getString("c_filename")%>" style="width: 100%" />
			</div>
			<div class="col-md-6">
				<h3><%=rs.getString("c_name")%></h3>
				<p><%=rs.getString("c_description")%>
				<p><b>상품 코드 : </b><span class="badge badge-danger"> <%=rs.getString("c_id")%></span>
				<p><b>제조사</b> : <%=rs.getString("c_manufacturer")%>
				<p><b>분류</b> : <%=rs.getString("c_category")%>
				<p><b>재고 수</b> : <%=rs.getString("c_unitsinstock")%>
				<h4><%=rs.getString("c_price")%>원</h4>
				<p><form name="addForm" action="./addCart.jsp?c_id=<%=rs.getString("c_id")%>" method="post">
					<a href="#" class="btn btn-info" onclick="addToCart()"> 상품 주문 &raquo;</a>
					<a href="./cart.jsp" class="btn btn-warning"> 장바구니 &raquo;</a> 
					<a href="./products.jsp" class="btn btn-secondary"> 상품 목록 &raquo;</a>
				</form>
				</div>
				
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
		<hr>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>
