package quannt;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab6 {
	public static void main(String[] args) 
	{
		Bai1();
		Bai2();
		Bai3();
	}
	public static void Bai1() {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();

        
        String ho = hoTen.substring(0, hoTen.indexOf(' '));
        String tenDemVaTen = hoTen.substring(hoTen.indexOf(' ') + 1);

     
        String tenDem = tenDemVaTen.substring(0, tenDemVaTen.lastIndexOf(' '));
        String ten = tenDemVaTen.substring(tenDemVaTen.lastIndexOf(' ') + 1);

        
        System.out.println("Họ: " + ho.toUpperCase());
        System.out.println("Tên đệm: " + tenDem);
        System.out.println("Tên: " + ten.toUpperCase());
        
        scanner.close();
	}
	public static void Bai2() {
		 Scanner scanner = new Scanner(System.in);
	        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();

	        for (int i = 0; i < 5; i++) {
	            System.out.println("Nhập thông tin cho sản phẩm thứ " + (i + 1) + ":");
	            SanPham sanPham = new SanPham();
	            sanPham.nhap();
	            danhSachSanPham.add(sanPham);
	        }

	        
	        System.out.println("Các sản phẩm có hãng là Nokia:");
	        for (SanPham sp : danhSachSanPham) {
	            if (sp.hang.equalsIgnoreCase("Nokia")) {
	                sp.xuat();
	                System.out.println();
	            }
	        }

	        scanner.close();
	    }
	public static void Bai3() {
		Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
            SinhVien sinhVien = new SinhVien();
            sinhVien.nhap();
            danhSachSinhVien.add(sinhVien);
        }

        
        System.out.println("Thông tin các sinh viên:");
        for (SinhVien sv : danhSachSinhVien) {
            sv.xuat();
            System.out.println();
        }

        scanner.close();
	}
}

