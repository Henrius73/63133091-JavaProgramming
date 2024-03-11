package quannt;

import java.util.Scanner;

public class SanPham {
    
    private String tenSp;
    private double donGia;
    private double giamGia;

    
    public SanPham() {}

    
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    // Constructor chứa tên và giá (giảm giá mặc định là 0)
    public SanPham(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    // Getter và setter
    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    // Phương thức tính thuế nhập khẩu (10% giá sản phẩm)
    private double getThueNhapKhau() {
        return 0.1 * donGia;
    }

    // Phương thức xuất thông tin sản phẩm ra màn hình
    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }

    // Phương thức nhập thông tin sản phẩm từ bàn phím
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = scanner.nextDouble();
    }

    // Phương thức main để kiểm tra
    public static void main(String[] args) {
        // Tạo đối tượng sp1 và nhập thông tin từ bàn phím
        SanPham sp1 = new SanPham();
        System.out.println("Nhập thông tin sản phẩm 1:");
        sp1.nhap();

        // Tạo đối tượng sp2 và nhập thông tin từ bàn phím
        SanPham sp2 = new SanPham();
        System.out.println("Nhập thông tin sản phẩm 2:");
        sp2.nhap();

        // Xuất thông tin của sản phẩm 1 và sản phẩm 2 ra màn hình
        System.out.println("\nThông tin sản phẩm 1:");
        sp1.xuat();
        System.out.println("\nThông tin sản phẩm 2:");
        sp2.xuat();
    }
}
