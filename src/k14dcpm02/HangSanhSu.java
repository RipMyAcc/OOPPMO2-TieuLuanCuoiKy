package k14dcpm02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangSanhSu extends HangHoa{
    private String nhaSanXuat;
    private Date ngayNhapKho;
////////////////////////////////////////////
    public HangSanhSu(){}
    public HangSanhSu(String tenHang, String loaiHang, String maHang, int soLuongTonKho, double donGia, String nhaSanXuat, Date ngayNhapKho) 
    {
        super(tenHang, loaiHang, maHang, soLuongTonKho, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }
//////////////////////////////////////////////////////////////////////////
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
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
        String str = simpleDateFormat.format(ngayNhapKho);
        return super.toString()+ " || Nhà sản xuất: " +nhaSanXuat+ " || Ngày nhập kho: " +str+ " || Thuế: " +getThue()+ " || Đánh giá hàng sành sứ: " +getDanhGia();
    }
}
