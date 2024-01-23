/**
 * 
 */
package quannt;

import java.util.Scanner;

public class Lab1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bai1();
		Bai2();
		Bai3();
		Bai4();
	}
	public static void Bai1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		String hoTen = scanner.nextLine();
		System.out.print("Điểm TB: ");
		double diemTB = scanner.nextDouble();
		System.out.printf("%s %.2f điểm\n", hoTen, diemTB);
	}
	public static void Bai2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài hình chữ nhật: ");
		double dai = scanner.nextDouble();
		System.out.print("Nhập chiều rộng hình chữ nhật: ");
		double rong = scanner.nextDouble();
		double chuvi = (dai+rong) * 2;
		double dientich = dai*rong;
		double canhnhonat = Math.min(dai,rong);
		System.out.printf("Chu vi: %.2f\n",chuvi);
		System.out.printf("Diện Tích: %.2f\n",dientich);
		System.out.printf("Cạnh nhỏ nhất: %.2f\n",canhnhonat);
	}
	public static void Bai3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh của khối lập phương: ");
		double canh = scanner.nextDouble();
		double thetich = Math.pow(canh,3);
		System.out.printf("Thể tích của khối lập phương: %.2f",thetich);
	}
	public static void Bai4() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nNhập a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhập c: ");
		double c = scanner.nextDouble();
		double Delta = Math.pow(b,2) - 4 * a * c;
		if(Delta >= 0) {
			double canDelta = Math.sqrt(Delta);
            System.out.printf("Căn delta: %.2f%n", canDelta);
		}
		else {
			System.out.printf("Delta âm, không thể tính căn delta.");
		}
	}
}
