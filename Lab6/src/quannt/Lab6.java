package quannt;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab6 {
	public static void main(String[] args) 
	{
		Bai1();
		
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
        System.out.println("Tên đệm: " + tenDem.toUpperCase());
        System.out.println("Tên: " + ten.toUpperCase());
        
        scanner.close();
	}
}
