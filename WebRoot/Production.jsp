<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'Production.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<style>
a {
	text-decoration: none;
}
/*---分页---*/
.pages {
	overflow: hidden;
	color: #888888;
	padding: 20px 10px;
	text-align: center;
	font-size: 16px;
	font-family: "宋体";
	margin-top: 20px;
}

.pages a {
	height: 36px;
	line-height: 36px;
	overflow: hidden;
	color: #666666;
	font-size: 16px;
	text-align: center;
	display: inline-block;
	padding: 0 15px;
	margin: 0 4px;
	border: 1px solid #cccccc;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border-radius: 2px;
	text-decoration: none;
}

.pages a:hover, .pages a.cur {
	color: #FFF;
	background-color: skyblue;
	border: 1px solid skyblue;
}

</style>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
</head>

<body>
	<div id="shang">
		<table border="1" id="tab"
			style="width:930px; text-align:center; margin-bottom:30px;"
			cellspacing="0" cellpadding="0">
			<tr id="trone">
				<th width="10%">商品名称</th>
				<th width="10%">商品图片</th>
				<th width="10%">库存</th>
				<th width="10%">价格</th>
				<th width="10%" colspan="2">操作</th>
			</tr>

			<c:forEach items="${ProductAll}" var="Product">
				<tr>
					<td>${Product.name}</td>
					<td><a href="#" target="_blank"> <img
							src="files/${Product.fileName}" width="50" height="50" />
					</a></td>
					<td>${Product.stock}</td>
					<td>${Product.price}</td>
					<td><a href="javascript:;"
						onclick="updateByProductId('${Product.id }','${pager.currentPage}')">修改</a></td>
					<td><a href="javascript:;" id="${Product.id}" class="delPro"
						onclick="_confirm2('${Product.id }')">下架</a></td>
				</tr>
			</c:forEach>
		</table>
		<%@ include file="pager.jsp"%>
	</div>
</body>
<script type="text/javascript" src="js/pager.js"></script>
<script type="text/javascript" src="js/Production.js"></script>
</html>
