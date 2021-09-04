<%@page import="dao.TKGiuongDAO"%>
<%@page import="model.TKGiuong"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String std=(String)request.getParameter("ngaybatdau");
    String endd=(String)request.getParameter("ngayketthuc");
    ArrayList<TKGiuong> tk = (new TKGiuongDAO()).getdoanhthu(std, endd);
	int S = 0;
	for (int i = 0; i < tk.size(); i++){
		S += tk.get(i).getTongtien();
	}
    %>
<!DOCTYPE html>
<html>
<head>
<%@include file="header.jsp" %>
<meta charset="ISO-8859-1">
<title>GD danh sách giường</title>
<link rel="stylesheet" href="bootstrap/bootstrap.css">
</head>
<body>

<br>
<br>
<div class="container" align="center">
<h1>GD danh sách giường</h1>
<h4 style="margin-top: 50px;margin-bottom: 20px">Bảng thống kê các loại giường được thuê nhiều <br/> từ ngày: <%=std %> đến ngày: <%=endd %></h4>
	<%
		if(tk != null) {
	%>
<div class="container">
	<table class="table table-bordered">
		<tr style="text-align: center;font-weight: 600">
			<td>STT</td>
			<td>Hạng phòng</td>
			<td>Loại phòng</td>
			<td>Tầng giường</td>
			<td>Tổng số lượt thuê</td>
			<td>Tổng tiền thu được</td>
			<td>Chọn xem</td>
		</tr>
	
		<%
			for(int i = 0; i < tk.size(); i++) {%>
				
		<tr style="text-align: center;">
			<td><%=i+1%></td>
			<td><%=tk.get(i).getPhong().getHangphong() %></td>
			<td><%=tk.get(i).getPhong().getLoaiphong() %></td>
			<td><%=tk.get(i).getTanggiuong() %></td>
			<td><%=tk.get(i).getTongsoluong() %></td>
			<td style="text-align: right;"><%=tk.get(i).getTongtien() %></td>
			<td>
				<form action="GDdanhsachhopdong.jsp" method="get">
					<input type="hidden" name="id_giuong" value="<%=tk.get(i).getId()%>">
					<input type="hidden" name="tanggiuong" value="<%=tk.get(i).getTanggiuong()%>">
					<input type="hidden" name="ngaybatdau" value="<%=std%>">
					<input type="hidden" name="ngayketthuc" value="<%=endd%>">
					<input type="hidden" name="hangphong" value="<%=tk.get(i).getPhong().getHangphong()%>">
					<input type="hidden" name="loaiphong" value="<%=tk.get(i).getPhong().getLoaiphong()%>">
					<input class="btn btn-success" type="submit" value="Xem chi tiết">
				</form>
			</td>
		</tr>	
		<%} %>
	
</table>
<p style="font-size: 20px">Tổng doanh thu: <b><%= S %></b></p>
</div>
<%} %>
<button class="btn btn-danger" style="width: 300px" type="button" onclick="openPage('GDchonthoigian.jsp')" style="margin-top: 100px"> Quay lại </button>

</div>
<br>
<br>


</body>
</html>