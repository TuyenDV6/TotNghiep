package dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;

import model.QuanLy;

public class QuanLyDAO extends DAO {

	public QuanLyDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean kiemTraDangNhap(QuanLy ql) {
		boolean kq=false;
		if(ql.getUsername().contains("true")||ql.getUsername().contains("=")||ql.getPassword().contains("true")||ql.getPassword().contains("=")){
			return false;
		}
		String sql="{call kiemtraDN(?,?)}";
		try {
			CallableStatement cs=con.prepareCall(sql);
			cs.setString(1, ql.getUsername());
			cs.setString(2, ql.getPassword());
			ResultSet rs=cs.executeQuery();
			if(rs.next()) {
				ql.setId(rs.getInt("idquanly"));
				ql.setTen(rs.getString("ten"));
				kq=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			kq=false;
		}
		
		return kq;
	}

}
