package model;



public class Phong {
	private int id;
	private String ten;
	private String hangphong;
	private String loaiphong;
	private Giuong giuong;
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
	public String getHangphong() {
		return hangphong;
	}
	public void setHangphong(String hangphong) {
		this.hangphong = hangphong;
	}
	public String getLoaiphong() {
		return loaiphong;
	}
	public void setLoaiphong(String loaiphong) {
		this.loaiphong = loaiphong;
	}
	public Giuong getGiuong() {
		return giuong;
	}
	public void setGiuong(Giuong giuong) {
		this.giuong = giuong;
	}
 
}