/**
 * 
 */
package quannt;

import java.util.Scanner;

/**
 * 
 */
public class Lab2 {
	public static void main(String[] args) {
		Bai1();
		
	}
	public static void Bai1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập b: ");
		double b = scanner.nextDouble();
		giaiPhuongTrinhBacNhat(a, b);
    }
		public static void giaiPhuongTrinhBacNhat(double a, double b) {
	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình có vô số nghiệm.");
	            } else {
	                System.out.println("Phương trình vô nghiệm.");
	            }
	        } else {
	            double x = -b / a;
	            System.out.println("Nghiệm của phương trình là x = " + x);
	        }
	    }
}