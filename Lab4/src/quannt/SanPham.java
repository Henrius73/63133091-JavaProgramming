package quannt;

import java.util.Scanner;

public class SanPham {
    //Bai1
    private String tenSp;
    private double donGia;
    private double giamGia;

    
    public SanPham() {}

    
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    //Bai3
    public SanPham(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }
    private double getThueNhapKhau() {
        return 0.1 * donGia;
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }

    
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = scanner.nextDouble();
    }
    //Bai4
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

    
    //Bai2
    public static void main(String[] args) {
        
        SanPham sp1 = new SanPham();
        System.out.println("Nhập thông tin sản phẩm 1:");
        sp1.nhap();

        
        SanPham sp2 = new SanPham();
        System.out.println("Nhập thông tin sản phẩm 2:");
        sp2.nhap();

        
        System.out.println("\nThông tin sản phẩm 1:");
        sp1.xuat();
        System.out.println("\nThông tin sản phẩm 2:");
        sp2.xuat();
    }
}
