package model;



public class HopDongDichVu {
	private int id;
	private int soluongcungcap;
	private DichVu dichvu;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSoluongcungcap() {
		return soluongcungcap;
	}
	public void setSoluongcungcap(int soluongcungcap) {
		this.soluongcungcap = soluongcungcap;
	}
	public DichVu getDichvu() {
		return dichvu;
	}
	public void setDichvu(DichVu dichvu) {
		this.dichvu = dichvu;
	}
}
