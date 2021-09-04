<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GD đăng nhập</title>
<link rel="stylesheet" href="bootstrap/bootstrap.css">
<link rel="stylesheet" href="bootstrap/main.css">
</head>
<body >
<div class="container" align="center" style="margin-top: 120px">
	<h1 style="margin-bottom: 150px">GD đăng nhập</h1>
	<form action="doDangNhap.jsp" method="post">
	<table>
	<tr>
		<td style="font-weight: bold">Usename:</td>
		<td><input type="text" name="txtusername"></td>
	</tr>
	<tr>
		<td style="font-weight: bold">Password:</td>
		<td><input type="password" name="txtpassword"></td>
	</tr>
	</table>
	<br>
	<input style="margin-top: 100px" type="submit" value="Đăng Nhập" class="btn btn-warning">
	</form>
</div>
</body>
</html>