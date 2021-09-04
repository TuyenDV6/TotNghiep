<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="header.jsp" %>
<meta charset="ISO-8859-1">
<title>GD chọn loại thống kê</title>
<link rel="stylesheet" href="bootstrap/bootstrap.css">
</head>
<body>
<div class="container" align="center" style="margin-top:50px">
	<h1 style="margin-top: 50px">GD chọn loại thống kê</h1>
	<button type="button" class="btn btn-success" style="margin: 200px 0 10px; width: 300px" onclick="openPage('GDchonthoigian.jsp')">TK loại giường theo lượt thuê</button>
	<br>
	<button type="button" class="btn btn-success" style="margin: 10px; width: 300px">TK sinh viên theo dư nợ</button>
	<br>
	<button type="button" class="btn btn-success" style="margin: 10px; width: 300px">TK doanh thu</button>
	<br>
	<button type="button" class="btn btn-danger" style="margin-top: 10px; width: 300px" onclick="openPage('GDquanly.jsp')">Quay lại</button>
	
</div>
</body>
</html>