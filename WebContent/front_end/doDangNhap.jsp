<%@page import="dao.QuanLyDAO"%>
<%@page import="model.QuanLy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    	String un = (String)request.getParameter("txtusername");
    	String pw = (String)request.getParameter("txtpassword");
    	
    	QuanLy ql=new QuanLy();
    	ql.setUsername(un);
    	ql.setPassword(pw);
    	QuanLyDAO dao=new QuanLyDAO();
    	boolean kq=dao.kiemTraDangNhap(ql);
    	
    	if(kq){
    		session.setAttribute("ql", ql);
    		response.sendRedirect("GDquanly.jsp");
    	}
    	else{
    		response.sendRedirect("GDdangnhap.jsp");
    	}
    %>
	