package k14dcpm02;

import java.util.Date;

public class HangSanhSu extends HangHoa{
    private String nhaSanXuat;
    private Date ngayNhapKho;
////////////////////////////////////////////
    public HangSanhSu(){}
    public HangSanhSu(String tenHang, String maHang, int soLuongTonKho, double donGia, String nhaSanXuat, Date ngayNhapKho) 
    {
        super(tenHang, maHang, soLuongTonKho, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }
//////////////////////////////////////////////////////////////////////////
    public String getNhaSanXuat() {
        return nhaSanXuat;
    }
    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }
    @Override
    public double getThue() 
    {
        return getDonGia() * 0.1;
    }
    @Override
    public String getDanhGia() {
        String d = "không có";
        if(getSoLuongTon() > 50 && ( new Date().getTime() - ngayNhapKho.getTime() )/100000000 >10)
        {
            d = "bán chậm";
        }
        return d;
    }
    @Override
    public String getLoaiHang() {
        return "Sành sứ";
    }
//////////////////////////////////////
    @Override
    public String toString() {
        String str = QuanLyDanhSachHangHoa.simpleDateFormat.format(getNgayNhapKho());
        return super.toString()+ " || Nhà sản xuất: " +getNhaSanXuat()+ " || Ngày nhập kho: " +str+ " || Thuế: " +getThue()+ " || Đánh giá hàng sành sứ: " +getDanhGia();
    }
}
