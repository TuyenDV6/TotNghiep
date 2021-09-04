<%@page import="model.QuanLy"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<%@include file="header.jsp" %>
<meta charset="ISO-8859-1">
<title>GD chính quản lý</title>
<link rel="stylesheet" href="bootstrap/bootstrap.css">
<link rel="stylesheet" href="bootstrap/main.css">

</head>
<%
	QuanLy ql = (QuanLy)session.getAttribute("ql");
%>

<body>
<div class="container" align="center" style="margin-top:50px">
	<h1 class="text-success" style="margin-bottom: 50px">GD chính quản lý</h1>
	
			<h4 style="margin-bottom: 150px" >Xin chào: <%=ql.getTen() %></h4>
	
	<button type="button" class="btn btn-success" style="margin: 10px;margin-top: 10px; width: 300px">Làm hợp đồng</button>
	<br>
	<button type="button" class="btn btn-success" style="margin: 10px; width: 300px">Lên hóa đơn tháng</button>
	<br>
	<button type="button" class="btn btn-success" style="margin:10px; width: 300px">Thanh toán</button>
	<br>
	<button type="button" class="btn btn-success" style="margin:10px; width: 300px" onclick="openPage('GDchonloaithongke.jsp')"> Xem thống kê</button>
	<br>
	<button type="button" class="btn btn-danger" style="margin: 10px; width: 300px" onclick="openPage('GDdangnhap.jsp')">Đăng xuất</button>
</div>

</body>
</html>

