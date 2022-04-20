package k14dcpm02;

public abstract class HangHoa {
    private String tenHang;
    private String loaiHang;
    private String maHang;
    private int soLuongTon;
    private double donGia;
////////////////////////////////////////
    public HangHoa(){}
    public HangHoa(String tenHang, String loaiHang, String maHang, int soLuongTon, double donGia) 
    {
        this.tenHang = tenHang;
        this.loaiHang = loaiHang;
        this.maHang = maHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }
//////////////////////////////////////
    public String getTenHang() 
    {
        return tenHang;
    }
    public double getDonGia() 
    {
        return donGia;
    }
    public String getMaHang() {
        return maHang;
    }
    public String getLoaiHang() 
    {
        return loaiHang;
    }
    public int getSoLuongTon() 
    {
        return soLuongTon;
    }
    public abstract double getThue();
    public abstract String getDanhGia();
///////////////////////////////////////////
    @Override
    public String toString() {
        return "Tên hàng: " +getTenHang()+ " || Loại hàng: " +getLoaiHang()+ " || Mã hàng: " +getMaHang()+ " || Số lượng tồn: " +getSoLuongTon()+ " || Đơn giá: " +getDonGia();
    }

}




 
