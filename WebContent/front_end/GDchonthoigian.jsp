<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="bootstrap/bootstrap.css">
<title>GD chọn thời gian xem thống kê</title>
</head>
<body >
<div class="container" align="center" style="margin-top:50px">
	<h1>GD chọn thời gian xem thống kê</h1>
	<form action="GDdanhsachgiuong.jsp">
	<table style="height:100px;margin-top: 150px; margin-bottom: 100px">
		<tr>
		<td style="font-weight: bold" >Ngày bắt đầu:</td>
		<td><input type="date" name="ngaybatdau" ></td>
		</tr>
		<tr>
		<td style="font-weight: bold">Ngày kết thúc:</td>
		<td><input type="date" name="ngayketthuc" ></td>
		</tr>
		
	</table>
	<button class="btn btn-success" type="submit" style="width: 300px; margin-bottom: 10px">Xem thống kê</button>
	</form>
	<button class="btn btn-danger" type="button" onclick="openPage('GDchonloaithongke.jsp')" style="width: 300px; margin-top: 10px">Quay lại</button>
</div>
</body>
</html>