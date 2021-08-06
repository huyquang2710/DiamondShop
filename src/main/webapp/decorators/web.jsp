<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Bootstrap styles -->
<link href="<c:url value="/template/web/assets/css/bootstrap.css" />"rel="stylesheet" />
<!-- Customize styles -->
<link href="<c:url value="/template/web/assets/style.css" />	"rel="stylesheet" />
<!-- font awesome styles -->
<link
	href="<c:url value="/template/web/assets/font-awesome/css/font-awesome.css" />"rel="stylesheet" />
<!-- Favicons -->
<link rel="shortcut icon"
	href="<c:url value="/template/web/assets/ico/favicon.ico " /> 	" />
</head>
<body>
	
	<div class="container">
		<div id="gototop"></div>
		<%@include file="/common/web/header.jsp" %>	
		
		<!-- Body  -->
		<dec:body />
		<!-- End Body -->
		<%@include file="/common/web/footer.jsp" %>

	</div>
	<!-- /container -->

	<!-- Placed at the end of the document so the pages load faster -->
	<script src="<c:url value="/template/web/assets/js/jquery.js "/>"></script>
	<script
		src="<c:url value="/template/web/assets/js/bootstrap.min.js "/>"></script>
	<script
		src="<c:url value="/template/web/assets/js/jquery.easing-1.3.min.js " /> "></script>
	<script
		src="<c:url value="/template/web/assets/js/jquery.scrollTo-1.4.3.1-min.js " /> "></script>
	<script src="<c:url value="/template/web/assets/js/shop.js " /> "></script>
</body>
</html>