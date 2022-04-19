package k14dcpm02;

import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.util.Date;

public class HangThucPham extends HangHoa{
    private Date ngaySX;
    private Date ngayHetHan;
    private String nhaCungCap;
////////////////////////////////////////
    public HangThucPham(){}
    public HangThucPham(String tenHang, String loaiHang, String maHang, int soLuongTonKho, double donGia, Date ngaySX, Date ngayHetHan, String nhaCungCap) {
        super(tenHang, loaiHang, maHang, soLuongTonKho, donGia);
        this.ngaySX = ngaySX;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }
////////////////////////////////////////////////
    @Override
    public double getThue() 
    {
        return getDonGia() * 0.05;
    }
    @Override
    public String getDanhGia() {
        String d = "Không có";
        if(getSoLuongTon() != 0 && ngayHetHan.before(new Date()))
        {
            d = "khó bán";
        }
        return d;
    }
//////////////////////////////////////////////////////
    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
        String str1 = simpleDateFormat.format(ngaySX);
        String str2 = simpleDateFormat.format(ngayHetHan);   
        return super.toString()+ " || Ngày sản xuất: " +str1+ " || Ngày hết hạn: " +str2+ " || Nhà cung cấp: "+nhaCungCap+ " || Thuế: " +getThue()+ " || Đánh giá: " +getDanhGia();
    }

    /*
    public void setNSX(int year, int month, int day)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.ngaySX = calendar.getTime();
    }
    public void setHSD(int year, int month, int day)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.ngayHetHan = calendar.getTime();
    }
    */
    
}
