package dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Phong;
import model.TKGiuong;

public class TKGiuongDAO extends DAO{
	
	public TKGiuongDAO() {
		
	}
	
	public ArrayList<TKGiuong> getdoanhthu(String batdau, String ketthuc) {
		ArrayList<TKGiuong> kq = null;
		String sql = "{call getdoanhthu(?,?)}";
		
		try {
			 CallableStatement cs = con.prepareCall(sql);
			 cs.setString(1, batdau);
			 cs.setString(2, ketthuc);
			 ResultSet rs = cs.executeQuery();
			 
			 while(rs.next()) {
				 if( kq == null) {
					 kq = new ArrayList<TKGiuong>();
				 }
				 
				 Phong p = new Phong();
				 TKGiuong tk = new TKGiuong();
				 p.setHangphong(rs.getString("hangphong"));
				 p.setLoaiphong(rs.getString("loaiphong"));
				 tk.setTanggiuong(rs.getInt("tanggiuong"));
				 tk.setTongsoluong(rs.getInt("tongsoluot"));
				 tk.setTongtien(rs.getInt("doanhthu"));
				 tk.setId(rs.getInt("idgiuong"));
				 tk.setPhong(p);
				 kq.add(tk);
			 }
		 } catch (Exception e) {
			 e.printStackTrace();
			 return kq;
		 }
		return kq;
	}
	
}
