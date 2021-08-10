<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href='<c:url value="/template/paging/style.css"/>'>
<title>Sản Phẩm</title>
</head>
<body>
	<div class="well well-small">
		<div class="row">
			<span style="margin-left: 25px;">Danh sách sản phẩm</span> <select
				class="pull-right">
				<option>A - Z</option>
				<option>Cao - Thấp</option>
			</select>
		</div>

		<c:if test="${ allProductsPaginate.size() > 0 }">
			<div class="row-fluid">
				<ul class="thumbnails">
					<c:forEach var="item" items="${ allProductsPaginate }"
						varStatus="loop">
						<li class="span4">
							<div class="thumbnail">
								<a href="product_details.html" class="overlay"></a> <a
									class="zoomTool" href="product_details.html"
									title="add to cart"><span class="icon-search"></span> QUICK
									VIEW</a> <a href="product_details.html"><img
									src="<c:url value="/template/web/assets/img/${ item.img }"/>"
									alt=""></a>
								<div class="caption cntr">
									<p>${ item.name }</p>
									<p>
										<strong><fmt:formatNumber type="number" groupingUsed="true" value="${ item.price }" />	</strong>
									</p>
									<h4>
										<a class="shopBtn" href="#" title="add to cart"> Add to
											cart </a>
									</h4>
									<div class="actionList">
										<a class="pull-left" href="#">Add to Wish List </a> <a
											class="pull-left" href="#"> Add to Compare </a>
									</div>
									<br class="clr">
								</div>
							</div>
						</li>
						<c:if
							test="${ (loop.index + 1) % 4 == 0 || (loop.index + 1)  == allProductsPaginate.size() }">
				</ul>
			</div>
			<c:if test="${ (loop.index + 1) < allProductsPaginate.size() }">
				<div class="row-fluid">
					<ul class="thumbnails">
			</c:if>
		</c:if>
		</c:forEach>
		</c:if>
	</div>
	<div class="pagination">
		<c:forEach var="item" begin="1" end="${ paginatesDTO.totalPage }" varStatus="loop">
			<c:if test="${ (loop.index) == paginatesDTO.currentPage }">
				<a href='<c:url value="/san-pham/${ idCategory }/${ loop.index }" />' class="active">${ loop.index }</a>
			</c:if>
			<c:if test="${ (loop.index) != paginatesDTO.currentPage }">
				<a href="<c:url value="/san-pham/${ idCategory }/${ loop.index }" />">${ loop.index }</a>
			</c:if>
		</c:forEach>
		
	</div>

</body>
</html>