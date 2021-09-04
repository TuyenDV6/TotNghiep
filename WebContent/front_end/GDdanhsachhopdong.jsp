<%@page import="dao.TKGiuongDAO"%>
<%@page import="model.TKHopDong"%>
<%@page import="model.HopDong"%>
<%@page import="dao.TKHopDongDAO"%>

<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String std=(String)request.getParameter("ngaybatdau");
    String endd=(String)request.getParameter("ngayketthuc");
    String hangphong=(String)request.getParameter("hangphong");
    String loaiphong=(String)request.getParameter("loaiphong");
    int tanggiuong = Integer.parseInt((String)request.getParameter("tanggiuong"));
    int id = Integer.parseInt((String)request.getParameter("id_giuong"));
    ArrayList<TKHopDong> tk = (new TKHopDongDAO()).getdshopdong(std, endd, id);
    
    %>
   
<!DOCTYPE html>
<html>
<head>
<%@include file="header.jsp" %>
<meta charset="ISO-8859-1">
<title>GD danh sách chi tiết một loại giường</title>
<link rel="stylesheet" href="bootstrap/bootstrap.css">
</head>
<body>
<div class="container" align="center">
	<h1 style="margin-top: 50px">GD danh sách chi tiết một loại giường</h1>
	<h4 style="margin-top: 100px">Kiểu phòng: <%=hangphong %>, <%=loaiphong %> <br/>Tầng giường: <%=tanggiuong %> <br/>Được thuê từ ngày: <%=std %> đến  ngày: <%=endd %></h4>
	
 	<%
 	if(tk != null) {
	%>
	
	<br>
	<br>
<table style="margin-top: 10px" class="table table-bordered">
	<tr style="text-align: center;">
	<td>ID hợp đồng</td>
	<td>Tên sinh viên</td>
	<td>Ngày lập hợp đồng</td>
	<td>Ngày kết thúc hợp đồng</td>
	<td>Tổng tiền</td>
	
	
	</tr>
	
	<%
		for(int i=0;i<tk.size();i++){
			if(tk.get(i).getId()==0) continue;
			else{
	%>
	<tr style="text-align: center;">
	<td><%=tk.get(i).getId() %></td>
	<td><%=tk.get(i).getSv().getTen()%></td>
	<td><%=tk.get(i).getNgaylap()%></td>
	<td><%=tk.get(i).getThoigianthue()%></td>
	<td style="text-align: right;"><%=tk.get(i).getTongtien()%>
	<%} %>
	<%} %>
	<%} %>
		
</table>
<br>
<br>
<br>
<button class="btn btn-success" style="width: 300px; margin: 10px" type="button" onclick="openPage('GDquanly.jsp')">Xác nhận</button>
<form action="GDdanhsachgiuong.jsp" method="post">
	<input type="hidden" name="ngaybatdau" value="<%=std%>">
	<input type="hidden" name="ngayketthuc" value="<%=endd%>">
	<input class="btn btn-danger" type="submit" value="Quay lại" style="width: 300px">
</form>
</div>
</body>
</html>