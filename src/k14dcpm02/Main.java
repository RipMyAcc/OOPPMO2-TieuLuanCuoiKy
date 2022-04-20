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
        System.out.println("1.Thêm hàng hóa");
        System.out.println("2.Xuất hàng hóa");
        System.out.println("3.Tìm kiếm hàng hóa");
        System.out.println("4.Xóa hàng hóa theo mã");
        System.out.println("5.Sửa hàng hóa theo mã");
        System.out.println("6.Sắp xếp hàng hóa"); 
        System.out.println("7.Ghi dữ liệu");
        System.out.println("8.Thống kê");
        System.out.print("Nhập số: ");
        String n = QuanLyDanhSachHangHoa.chu.nextLine();
        switch(n)
        {
            case "1": themHang(); break;
            case "2": menuXuat(); break;
            case "3": menuTimHang(); break;
            case "4": xoaHang(); break;
            case "5": sua(); break;
            case "6": menuSapXep();break;
            case "7": ghiDuLieu(); break;
            case "8": thongKe(); break;
            default:
            {
                System.out.println("Dữ liệu không đúng");
                nhanEnterDeTiepTuc();
                menu();
                break;
            }
        }
    }
    static void menuXuat(){
        System.out.println("1.Xuất tất cả hàng hóa");
        System.out.println("2.Xuất hàng thực phẩm");
        System.out.println("3.Xuất hàng điện máy");
        System.out.println("4.Xuất hàng sành sứ");
        System.out.print("Nhập số: ");
        String n = QuanLyDanhSachHangHoa.chu.nextLine();
        switch(n)
        {
            case "1": xuatHangHoa(); break;
            case "2": xuatHangThucPham(); break;
            case "3": xuatHangDienMay(); break;
            case "4": xuatHangSanhSu(); break;
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
    static void xuatHangHoa()
    {
        quanLiDanhSachHangHoa.xuat();
        nhanEnterDeTiepTuc();
        menu();
    }
    static void xuatHangThucPham(){
        quanLiDanhSachHangHoa.xuatHangThucPham();
        nhanEnterDeTiepTuc();
        menu();
    }
    static void xuatHangDienMay(){
        quanLiDanhSachHangHoa.xuatHangDienMay();
        nhanEnterDeTiepTuc();
        menu();
    }
    static void xuatHangSanhSu(){
        quanLiDanhSachHangHoa.xuatHangSanhSu();
        nhanEnterDeTiepTuc();
        menu();
    }
    static void menuTimHang(){
        System.out.println("1.Tìm kiếm hàng hóa theo mã");
        System.out.println("2.Tìm kiếm hàng hóa theo tên");
        System.out.println("3.Tìm kiếm hàng hóa theo khoảng giá");
        System.out.print("Nhập số: ");
        String n = QuanLyDanhSachHangHoa.chu.nextLine();
        switch(n)
        {
            case "1": timHangTheoMa(); break;
            case "2": timHangTheoTen(); break;
            case "3": timHangTheoKhoangGia(); break;
            default:
            {
                System.out.println("Dữ liệu không đúng");
                nhanEnterDeTiepTuc();
                menu();
                break;
            }
        }
    }
    static void timHangTheoMa(){
        String maHang;
        System.out.print("Nhập mã hàng cần tìm: ");
        maHang = QuanLyDanhSachHangHoa.chu.nextLine();
        quanLiDanhSachHangHoa.traVeKetQua(quanLiDanhSachHangHoa.timHangTheoMa(maHang));
        nhanEnterDeTiepTuc();
        menu();
    }
    static void timHangTheoTen(){
        String tenHang;
        System.out.print("Nhập tên hàng cần tìm: ");
        tenHang = QuanLyDanhSachHangHoa.chu.nextLine();
        quanLiDanhSachHangHoa.xuatKetqua(quanLiDanhSachHangHoa.timHangHoaTheoTen(tenHang));
        nhanEnterDeTiepTuc();
        menu();
    }
    static void timHangTheoKhoangGia(){
        double donGia1=0;
        double donGia2=0;
        try {
            do{
                System.out.print("Nhập khoảng giá đầu: ");
                donGia1=QuanLyDanhSachHangHoa.so.nextDouble();
                if(donGia1<=0){
                    System.out.println("Khoảng giá đầu phải > 0");
                }
            }while(donGia1<=0);
            do{
                System.out.print("Nhập khoảng giá sau: ");
                donGia2=QuanLyDanhSachHangHoa.so.nextDouble();
                if(donGia1>=donGia2){
                    System.out.println("Đơn giá sau phải > đơn giá đầu");
                }
            }while(donGia1>=donGia2);
            quanLiDanhSachHangHoa.xuatKetqua(quanLiDanhSachHangHoa.timHangHoaTheoKhoangGia(donGia1, donGia2));
        } catch (Exception e) {
            QuanLyDanhSachHangHoa.resetSo();
            System.out.println("Chương trình bị lỗi do bạn nhập chữ vào chỗ cần nhập số, vui lòng thử lại");
            e.printStackTrace(); 
        }
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
    
    static void menuSapXep(){
        System.out.println("1.sắp xếp hóa tăng dần theo đơn giá");
        System.out.println("2.sắp xếp hóa giảm dần theo đơn giá");
        System.out.println("3.sắp xếp hóa tăng dần theo số lượng tồn");
        System.out.println("4.sắp xếp hóa giảm dần theo số lượng tồn");
        System.out.print("Nhập số: ");
        String n = QuanLyDanhSachHangHoa.chu.nextLine();
        switch(n)
        {
            case "1": sapXepTangDanTheoGia(); break;
            case "2": sapXepGiamDanTheoGia(); break;
            case "3": sapXepTangDanTheoSoLuongTon(); break;
            case "4": sapXepGiamDanTheoSoLuongTon(); break;
            default:
            {
                System.out.println("Dữ liệu không đúng");
                nhanEnterDeTiepTuc();
                menu();
                break;
            }
        }
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
    static void sapXepTangDanTheoSoLuongTon(){
        quanLiDanhSachHangHoa.sapXepTangDanTheoSoLuongTon();
        nhanEnterDeTiepTuc();
        menu();
    }
    static void sapXepGiamDanTheoSoLuongTon(){
        quanLiDanhSachHangHoa.sapXepGiamDanTheoSoLuongTon();
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