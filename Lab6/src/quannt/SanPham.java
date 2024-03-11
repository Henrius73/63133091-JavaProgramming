package quannt;

import java.util.Scanner;

public class SanPham {
	 String tenSp;
	    double donGia;
	    String hang;

	  
	    public void xuat() {
	        System.out.println("Tên sản phẩm: " + tenSp);
	        System.out.println("Đơn giá: " + donGia);
	        System.out.println("Hãng: " + hang);
	    }

	    
	    public void nhap() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập tên sản phẩm: ");
	        tenSp = scanner.nextLine();
	        System.out.print("Nhập đơn giá: ");
	        donGia = scanner.nextDouble();
	        scanner.nextLine();
	        System.out.print("Nhập hãng: ");
	        hang = scanner.nextLine();
	    }
}

