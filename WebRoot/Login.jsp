<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'Login.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
</head>

<body>
	<form action="javascript:;" method="post">
		一级分类:<select name="seleOne" id="seleOne" onchange="change2();">
			<c:forEach items="${listOne}" var="listOne">
				<option value="${listOne.id}" selected="selected">${listOne.name}</option>
			</c:forEach>
			<option value="0" selected="selected">--请选择--</option>
		</select> 二级分类:<select name="seleTwo" id="seleTwo" onchange="change3();">
			<c:forEach items="${product1}" var="product1">
				<option value="${product1.id}" selected="selected">${product1.name}</option>
			</c:forEach>
			<option value="0" selected="selected">--请选择--</option>
		</select> 三级分类:<select name="seleThree" id="seleThree">
			<c:forEach items="${product1}" var="product1">
				<option value="${product1.id}" selected="selected">${product1.name}</option>
			</c:forEach>
			<option id="three" value="0" selected="selected">--请选择--</option>
		</select>
	</form>
	<a href="/EasyToBuyNets/ProductionServlet?action=ShowPages">商品管理</a>
	<script type="text/javascript">
	$(document).ready(function(){
		change1();
	 });
	</script>
	<script type="text/javascript" src="js/index.js"></script>
</body>

</html>
