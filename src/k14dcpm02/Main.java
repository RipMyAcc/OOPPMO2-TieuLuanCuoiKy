package k14dcpm02;

public class Main{
    static QuanLyDanhSachHangHoa quanLiDanhSachHangHoa = new QuanLyDanhSachHangHoa();
    static 
    {
        try 
        {
            quanLiDanhSachHangHoa.duLieuCoSan();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        menu();
    }
    static void menu()
    {
        System.out.println("-------------MENU-------------");
        System.out.println("1.Thêm hàng");
        System.out.println("2.Xuất hàng");
        System.out.println("3.Tìm kiếm hàng hóa theo mã");
        System.out.println("4.Xóa hàng hóa theo mã");
        System.out.println("5.Sửa hàng hóa theo mã");
        System.out.println("6.sắp xếp hóa tăng dần theo đơn giá");
        System.out.println("7.sắp xếp hóa giảm dần theo đơn giá");
        System.out.println("8.Ghi dữ liệu");
        System.out.println("9.Thống kê");
        System.out.print("Nhập số: ");
        String n = QuanLyDanhSachHangHoa.chu.nextLine();
        switch(n)
        {
            case "1": themHang(); break;
            case "2": xuatHang(); break;
            case "3": timHang(); break;
            case "4": xoaHang(); break;
            case "5": sua(); break;
            case "6": sapXepTangDanTheoGia(); break;
            case "7": sapXepGiamDanTheoGia(); break;
            case "8": ghiDuLieu(); break;
            case "9": thongKe(); break;
            default:
            {
                System.out.println("Dữ liệu không đúng");
                nhanEnterDeTiepTuc();
                menu();
                break;
            }
        }
    }
    static void nhanEnterDeTiepTuc()
    {
        System.out.println("Nhấn enter để tiếp tục");
        QuanLyDanhSachHangHoa.chu.nextLine();
    }
    static void themHang()
    {
        String d=null;
        do{
            quanLiDanhSachHangHoa.them(quanLiDanhSachHangHoa.nhapHangHoaKhongCoMa(quanLiDanhSachHangHoa.nhapMaHangHoa()));
            System.out.print("Nhập tiếp (y/n): ");
            d=QuanLyDanhSachHangHoa.chu.nextLine();
        }while(d.equalsIgnoreCase("y"));
        nhanEnterDeTiepTuc();
        menu();
    }
    static void xuatHang()
    {
        quanLiDanhSachHangHoa.xuat();
        nhanEnterDeTiepTuc();
        menu();
    }
    static void timHang(){
        String maHang;
        System.out.print("Nhập mã hàng cần tìm: ");
        maHang = QuanLyDanhSachHangHoa.chu.nextLine();
        quanLiDanhSachHangHoa.traVeKetQua(quanLiDanhSachHangHoa.timHangTheoMa(maHang));
        nhanEnterDeTiepTuc();
        menu();
    }
    static void xoaHang()
    {
        System.out.print("Nhập mã hàng hóa cần xóa: ");
        String maHang = QuanLyDanhSachHangHoa.chu.nextLine();
        quanLiDanhSachHangHoa.xoa(quanLiDanhSachHangHoa.timHangTheoMa(maHang));
        nhanEnterDeTiepTuc();
        menu();
    }
    static void sua()
    {
        System.out.print("Nhập mã hàng hóa cần sửa: ");
        String maHang = QuanLyDanhSachHangHoa.chu.nextLine();
        quanLiDanhSachHangHoa.suaHangHoa(maHang);
        nhanEnterDeTiepTuc();
        menu();
    }
    static void sapXepTangDanTheoGia(){
        quanLiDanhSachHangHoa.sapXepTangDanTheoGia();
        nhanEnterDeTiepTuc();
        menu();
    }
    static void sapXepGiamDanTheoGia(){
        quanLiDanhSachHangHoa.sapXepGiamDanTheoGia();
        nhanEnterDeTiepTuc();
        menu();
    }
    static void ghiDuLieu(){
        System.out.print("Nhập tên file: ");
        String fileName=QuanLyDanhSachHangHoa.chu.nextLine();
        quanLiDanhSachHangHoa.writeFile(fileName);
        nhanEnterDeTiepTuc();
        menu();
    }
    static void thongKe(){
        quanLiDanhSachHangHoa.thongKe();
        nhanEnterDeTiepTuc();
        menu();
    }
}