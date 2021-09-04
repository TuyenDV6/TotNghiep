package dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.SinhVien;
import model.TKHopDong;

public class TKHopDongDAO extends DAO {
	public TKHopDongDAO() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<TKHopDong> getdshopdong(String batdau, String ketthuc, int id) {
		ArrayList<TKHopDong> kq = null;
		String sql = "{call gethopdong(?,?,?)}";

		try {
			CallableStatement cs = con.prepareCall(sql);
			cs.setString(1, batdau);
			cs.setString(2, ketthuc);
			cs.setInt(3, id);
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				if (kq == null) {
					kq = new ArrayList<TKHopDong>();
				}

				TKHopDong tkhd = new TKHopDong();
				SinhVien sv = new SinhVien();

				tkhd.setId(rs.getInt("idhopdong"));
				sv.setTen(rs.getString("tensinhvien"));
				tkhd.setNgaylap(rs.getDate("thoigianbatdau"));
				tkhd.setThoigianthue(rs.getDate("thoigianketthuc"));
				tkhd.setTongtien(rs.getInt("tongtienthudc"));
				tkhd.setSv(sv);
				kq.add(tkhd);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return kq;
		}
		return kq;
	}

}
