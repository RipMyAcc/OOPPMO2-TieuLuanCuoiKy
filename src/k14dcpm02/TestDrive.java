package k14dcpm02;

public class TestDrive{
    private static Kho kho = new Kho();
    static 
    {
        try 
        {
            kho.duLieuCoSan();
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
        String n = Kho.chu.nextLine();
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
        Kho.chu.nextLine();
    }
    static void themHang()
    {
        String d=null;
        do{
            kho.them(kho.nhapHangHoaKhongCoMa(kho.nhapMaHangHoa()));
            System.out.print("Nhập tiếp (y/n): ");
            d=Kho.chu.nextLine();
        }while(d.equalsIgnoreCase("y"));
        nhanEnterDeTiepTuc();
        menu();
    }
    static void xuatHang()
    {
        kho.xuat();
        nhanEnterDeTiepTuc();
        menu();
    }
    static void timHang(){
        String maHang;
        System.out.print("Nhập mã hàng cần tìm: ");
        maHang = Kho.chu.nextLine();
        kho.traVeKetQua(kho.timHangTheoMa(maHang));
        nhanEnterDeTiepTuc();
        menu();
    }
    static void xoaHang()
    {
        System.out.print("Nhập mã hàng hóa cần xóa: ");
        String maHang = Kho.chu.nextLine();
        kho.xoa(kho.timHangTheoMa(maHang));
        nhanEnterDeTiepTuc();
        menu();
    }
    static void sua()
    {
        System.out.print("Nhập mã hàng hóa cần sửa: ");
        String maHang = Kho.chu.nextLine();
        kho.suaHangHoa(maHang);
        nhanEnterDeTiepTuc();
        menu();
    }
    static void sapXepTangDanTheoGia(){
        kho.sapXepTangDanTheoGia();
        nhanEnterDeTiepTuc();
        menu();
    }
    static void sapXepGiamDanTheoGia(){
        kho.sapXepGiamDanTheoGia();
        nhanEnterDeTiepTuc();
        menu();
    }
    static void ghiDuLieu(){
        System.out.print("Nhập tên file: ");
        String fileName=Kho.chu.nextLine();
        kho.writeFile(fileName);
        nhanEnterDeTiepTuc();
        menu();
    }
    static void thongKe(){
        kho.thongKe();
        nhanEnterDeTiepTuc();
        menu();
    }
}