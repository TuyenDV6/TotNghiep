package unittest;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import dao.TKHopDongDAO;
import model.TKHopDong;

public class TestTKHopDongDAO {
	TKHopDongDAO tkhopdongdao = new TKHopDongDAO();
	
	@Test
	public void getHopdong_testchuan1() {
		//co list hop dong trong khoang thoi gian thoa man xem thong ke
		String ngaybatdau = "2019/01/01";
		String ngayketthuc = "2019/12/30";
		int id = 1;
		ArrayList<TKHopDong> list_hopdong = tkhopdongdao.getdshopdong(ngaybatdau, ngayketthuc, id);
		Assert.assertNotNull(list_hopdong);
	}
	
	@Test
	public void getHopDong_testchuan2() {
		//tên sinh viên thuê giường đúng với tên sinh viên trong khoảng thời gian xem thống kê
		String ngaybatdau = "2019/01/01";
		String ngayketthuc = "2019/12/30";
		int id = 1;
		String sinhvien = "tuyen";
		ArrayList<TKHopDong> list_hopdong = tkhopdongdao.getdshopdong(ngaybatdau, ngayketthuc, id);
		Assert.assertEquals(sinhvien, list_hopdong.get(0).getSv().getTen());
	}
	
	@Test
	public void getHopDong_testchuan3( ) {
		//tổng tiền thu được trong khoảng thời gian thống kê của sinh viên đó chính xác
		String ngaybatdau = "2019/01/01";
		String ngayketthuc = "2019/12/30";
		int id = 1;
		ArrayList<TKHopDong> list_hopdong = tkhopdongdao.getdshopdong(ngaybatdau, ngayketthuc, id);
		Assert.assertEquals(3200000, list_hopdong.get(0).getTongtien());
	}
	
	@Test
	public void getHopDong_testchuan4() {
		//id hợp đồng đúng với dánh sách hợp đồng tìm thấy được trong khoảng thời gian xem thống kê
		String ngaybatdau = "2019/01/01";
		String ngayketthuc = "2019/12/30";
		int id = 1;
		ArrayList<TKHopDong> list_hopdong = tkhopdongdao.getdshopdong(ngaybatdau, ngayketthuc, id);
		Assert.assertEquals(1, list_hopdong.get(0).getId());
	}

}
