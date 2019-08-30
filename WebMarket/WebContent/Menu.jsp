<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav class = "navbar navbar-expand navbar-dark bg-dark">
		<div class = "container">
			<div class = "navbar-header">
				<a class="navbar-brand" href="./welcome.jsp">HOME</a>
				<%--<a class="navbar-brand" href="./products.jsp">LIST</a>
				<a class="navbar-brand" href="./addProduct.jsp">ADD PRODUCT</a>---%>
			</div>
			<div>
				<ul class = "navbar-nav mr-auto">
					<li class="nav-item"><a class = "nav-link" href="./products.jsp">상품 목록</a></li>
					<li class="nav-item"><a class = "nav-link" href="./addProduct.jsp">상품 등록</a></li>
					<li class="nav-item"><a class = "nav-link" href="./editProduct.jsp?edit=update">상품 수정</a></li>
					<li class="nav-item"><a class = "nav-link" href="./editProduct.jsp?edit=delete">상품 삭제</a></li>
				</ul>
			</div>
		</div>
	</nav>
</body>
</html>