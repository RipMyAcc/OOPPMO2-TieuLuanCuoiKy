package k14dcpm02;

public class HangDienMay extends HangHoa{
    private int tGBaoHanh;
    private double congSuatKW;
///////////////////////////////////////
    public HangDienMay(){}
    public HangDienMay(String tenHang, String loaiHang, String maHang, int soLuongTonKho, double donGia, int tGBaoHanh, double congSuatKW) {
        super(tenHang, loaiHang, maHang, soLuongTonKho, donGia);
        this.tGBaoHanh = tGBaoHanh;
        this.congSuatKW = congSuatKW;
    }
////////////////////////////////////////////
    @Override
    public double getThue() 
    {
        return getDonGia()*0.1;
    }
    @Override
    public String getDanhGia() {
        String d = "không có";
        if(getSoLuongTon() < 3)
        {
            d = "bán được";
        }
        return d;
    }
/////////////////////////////////////////
    @Override
    public String toString() {
        return super.toString()+ " || Thời gian bào hành (tháng): " +tGBaoHanh+ " || Công suất KW: " +congSuatKW+" || Thuế: "+getThue()+ " || Đánh giá hàng điện máy: " +getDanhGia();
    }
    
}
