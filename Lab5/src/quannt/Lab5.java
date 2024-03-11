package quannt;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		Bai1();

	}
	public static void Bai1() {
		Scanner scanner = new Scanner(System.in);
        ArrayList<Double> danhSach = new ArrayList<>();

       
        System.out.println("Nhập danh sách số thực (Nhập 'N' để kết thúc): ");
        while (true) {
            double soThuc = scanner.nextDouble();
            danhSach.add(soThuc);
            System.out.print("Nhập thêm (Y/N)? ");
            scanner.nextLine(); 
            String luaChon = scanner.nextLine();
            if (luaChon.equalsIgnoreCase("N")) {
                break;
            }
        }

       
        System.out.println("Danh sách số thực vừa nhập:");
        for (double so : danhSach) {
            System.out.println(so);
        }

        double tong = 0;
        for (double so : danhSach) {
            tong += so;
        }
        System.out.println("Tổng của danh sách: " + tong);

        scanner.close();
    }

}
