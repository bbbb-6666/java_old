<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<script type="text/javascript" src="./resources/js/validation.js"></script>
<title>상품 등록</title>
</head>
<body>

	<!-- 다국어 설정 -->
	<fmt:setLocale value='<%= request.getParameter("language") %>'/>
	<fmt:bundle basename="bundle.message" >
	<jsp:include page="menu.jsp" />	
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3"><fmt:message key="title" /></h1>
		</div>
	</div>
	<div class="container">
		<div class="text-right"> 
			<a href="?language=ko" >Korean</a>|<a href="?language=en" >English</a>
			<a href="logout.jsp" class="btn btn-sm btn-success pull-right">logout</a>
		</div>	
		
		<!-- 상품 변수 내용 수정하기 -->
		<form name="newProduct" action="./processAddProduct.jsp" class="form-horizontal" method="post" enctype="multipart/form-data">
			<div class="form-group row">
				<label class="col-sm-2"><fmt:message key="c_id" /></label>
				<div class="col-sm-3">
					<input type="text" id="c_id"  name="c_id"  class="form-control" >
				</div>
			</div>
			
			
			<div class="form-group row">
				<label class="col-sm-2"><fmt:message key="c_name" /></label>
				<div class="col-sm-3">
					<input type="text" id="c_name"  name="c_name" class="form-control" >
				</div>
			</div>
			
			
			<div class="form-group row">
				<label class="col-sm-2"><fmt:message key="c_price"/></label>
				<div class="col-sm-3">
					<input type="text" id="c_price"  name="c_price" class="form-control" >
				</div>
			</div>
			
			
			<div class="form-group row">
				<label class="col-sm-2"><fmt:message key="c_description" /></label>
				<div class="col-sm-5">
					<textarea name="c_description" cols="50" rows="2" class="form-control"></textarea>
				</div>
			</div>
			
			
			<div class="form-group row">
				<label class="col-sm-2"><fmt:message key="c_manufacturer"/></label>
				<div class="col-sm-3">
					<input type="text" name="c_manufacturer" class="form-control">
				</div>
			</div>
			
			
			<div class="form-group row">
				<label class="col-sm-2"><fmt:message key="c_category" /></label>
				<div class="col-sm-3">
					<input type="text" name="c_category" class="form-control" >
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2"><fmt:message key="c_unitsinstock" /></label>
				<div class="col-sm-3">
					<input type="text" id="c_unitsinstock" name="c_unitsinstock" class="form-control" >
				</div>
			</div>
			
			<div class="form-group row">
				<label class="col-sm-2"><fmt:message key="productImage" /></label>
				<div class="col-sm-5">
					<input type="file" name="productImage" class="form-control">
				</div>
			</div>
			
			
			<div class="form-group row">
				<div class="col-sm-offset-2 col-sm-10 ">
					<input type="button" class="btn btn-primary" value="<fmt:message key="button" />" onclick="CheckAddProduct()">
				</div>
			</div>
		</form>
	</div>
	</fmt:bundle>
</body>
</html>
