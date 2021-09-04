package model;

import java.util.Date;

public class HopDong {
	private int id;
	private String ten;
	private int tiencoc;
	private Date ngaylap;
	private Date thoigianthue;
	private HopDongDichVu hddv ;
	private SinhVien sv;
	private Giuong giuong;
	private QuanLy ql;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTiencoc() {
		return tiencoc;
	}
	public void setTiencoc(int tiencoc) {
		this.tiencoc = tiencoc;
	}
	public Date getNgaylap() {
		return ngaylap;
	}
	public void setNgaylap(Date ngaylap) {
		this.ngaylap = ngaylap;
	}
	public Date getThoigianthue() {
		return thoigianthue;
	}
	public void setThoigianthue(Date thoigianthue) {
		this.thoigianthue = thoigianthue;
	}
	public HopDongDichVu getHddv() {
		return hddv;
	}
	public void setHddv(HopDongDichVu hddv) {
		this.hddv = hddv;
	}
	public SinhVien getSv() {
		return sv;
	}
	public void setSv(SinhVien sv) {
		this.sv = sv;
	}
	public Giuong getGiuong() {
		return giuong;
	}
	public void setGiuong(Giuong giuong) {
		this.giuong = giuong;
	}
	public QuanLy getQl() {
		return ql;
	}
	public void setQl(QuanLy ql) {
		this.ql = ql;
	}

}
