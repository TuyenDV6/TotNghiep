package unittest;

import dao.TKGiuongDAO;
import model.TKGiuong;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class TestTKGiuongDAO {
	TKGiuongDAO tkgiuongdao = new TKGiuongDAO();
	
	@Test
	public void getDSgiuong_testchuan1() {
		//test truong hop co list giuong trong khoang thoi gian xem thong ke
		String ngaybatdau = "2019/01/01";
		String ngayketthuc = "2019/12/30";
		
		ArrayList<TKGiuong> listgiuong = tkgiuongdao.getdoanhthu(ngaybatdau, ngayketthuc);
		Assert.assertNotNull(listgiuong);
	}
	
	@Test
	public void getDSgiuoong_testchuan2() {
		//test trường hợp tổng số lượt thuê của từng loại giường được sắp xếp theo chiều giảm dần
		String ngaybatdau = "2019/01/01";
		String ngayketthuc = "2019/12/30";
		
		ArrayList<TKGiuong> list_giuong = tkgiuongdao.getdoanhthu(ngaybatdau, ngayketthuc);
		
		
		boolean check = false;
		for(int i = 0; i < list_giuong.size()-1; i++) {
			if(list_giuong.get(i).getTongsoluong() >= list_giuong.get(i+1).getTongsoluong()) {
				check = true;
			}
		}
		Assert.assertEquals(true, check);
	}
	
	@Test
	public void getDSgiuong_testchuan3() {
		//test trường hợp tổng doanh thu bằng tổng tiền thu được của từng loại giường
		String ngaybatdau = "2019/01/01";
		String ngayketthuc = "2019/12/30";
		
		ArrayList<TKGiuong> list_giuong = tkgiuongdao.getdoanhthu(ngaybatdau, ngayketthuc);
		int tongdoanhthu = 0;
		for (int i = 0; i < list_giuong.size(); i++) {
			tongdoanhthu  += list_giuong.get(i).getTongtien();
		}
		Assert.assertEquals(30700000, tongdoanhthu);
	}
	
	@Test
	public void getDSgiuong_testchuan4() {
		//test trường hợp tổng số lượt thê bằng tổng lượt thuê của từng giường
		String ngaybatdau = "2019/01/01";
		String ngayketthuc = "2019/12/30";
		
		ArrayList<TKGiuong> list_giuong = tkgiuongdao.getdoanhthu(ngaybatdau, ngayketthuc);
		
		int s = 0;
		for (int i = 0; i < list_giuong.size(); i++) {
			s += list_giuong.get(i).getTongsoluong();
			
		}
		Assert.assertEquals(10, s);
	}
	
	@Test
	public void getDSgiuong_testchuan5() {
		//test trường hợp trong khoảng thời gian thống kê ra đúng tầng giường
		String ngaybatdau = "2019/01/01";
		String ngayketthuc = "2019/12/30";
		
		ArrayList<TKGiuong> list_giuong = tkgiuongdao.getdoanhthu(ngaybatdau, ngayketthuc);
		
		int tanggiuong = list_giuong.get(0).getTanggiuong();
		Assert.assertEquals(1, tanggiuong);
	}
	
	@Test
	public void getDSgiuong_testchuan6() {
		//test trường hợp trong khoảng thời gian thống kê ra đúng tổng tiền của 1 loại giường
		String ngaybatdau = "2019/01/01";
		String ngayketthuc = "2019/12/30";
		
		ArrayList<TKGiuong> list_giuong = tkgiuongdao.getdoanhthu(ngaybatdau, ngayketthuc);
		int tongtien = list_giuong.get(0).getTongtien();
		Assert.assertEquals(12000000, tongtien);
	}
	
	@Test
	public void getDSgiuong_testchuan7() {
		//test trường hợp trong khoảng thời gian xem thống kê ra đúng tổng số lượt thuê của từng loại giường
		String ngaybatdau = "2019/01/01";
		String ngayketthuc = "2019/12/30";
		
		ArrayList<TKGiuong> list_giuong = tkgiuongdao.getdoanhthu(ngaybatdau, ngayketthuc);
		
		int tongsoluotthue = list_giuong.get(0).getTongsoluong();
		Assert.assertEquals(4, tongsoluotthue);
	}
	
	@Test
	public void getDSgiuong_tesngoaile1() {
		//test trường hợp các loại giường đều không được thuê trong khoảng thời gian xem thống kê
		String ngaybatdau = "2010/01/01";
		String ngayketthuc = "2010/12/30";
		
		ArrayList<TKGiuong> list_giuong = tkgiuongdao.getdoanhthu(ngaybatdau, ngayketthuc);
		int s = 0;
		for (int i = 0; i < list_giuong.size(); i++) {
			s += list_giuong.get(i).getTongsoluong();
		}
		Assert.assertEquals(0, s);
		
	}
	
	@Test
	public void getDSgiuong_testngoaile2() {
		//test trường hợp không có doanh thu của tất cả loại giường trong khoảng thời gian xem thống kê
		String ngaybatdau = "2010/01/01";
		String ngayketthuc = "2010/12/30";
		ArrayList<TKGiuong> list_giuong = tkgiuongdao.getdoanhthu(ngaybatdau, ngayketthuc);
		int doanhthu = 0;
		for(int i = 0; i < list_giuong.size(); i++) {
			doanhthu += list_giuong.get(i).getTongtien();
		}
		
		Assert.assertEquals(0, doanhthu);
	}
	
	@Test
	public void getDSgiuong_testngoaile3() {
		//test trường hợp thời gian bắt đầu xem thống kê lớn hơn thời gian kết thúc xem thống kê
		String ngaybatdau = "2020/01/01";
		String ngayketthuc = "2019/01/01";
		ArrayList<TKGiuong> list_giuong = tkgiuongdao.getdoanhthu(ngaybatdau, ngayketthuc);
		
		int tongsoluong = 0;
		for(int i = 0; i < list_giuong.size(); i++) {
			tongsoluong += list_giuong.get(i).getTongsoluong();
		}
		
		Assert.assertEquals(0, tongsoluong);
	}
	
	@Test
	public void getDSgiuong_testngoaile4() {
		//test trường hợp k nhập thời gian bắt đầu và thời gian kết thúc
		String ngaybatdau = "";
		String ngayketthuc = "";
		ArrayList<TKGiuong> list_giuong = tkgiuongdao.getdoanhthu(ngaybatdau, ngayketthuc);
		
		int tongsoluong = 0;
		for(int i = 0; i < list_giuong.size(); i++) {
			tongsoluong += list_giuong.get(i).getTongsoluong();
		}
		
		Assert.assertEquals(0, tongsoluong);
	}

}
