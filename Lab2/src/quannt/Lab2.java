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
	public static void Bai2() {
		double a,b,c;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		a = scanner.nextDouble();
		System.out.print("Nhập hệ số b: ");
		b = scanner.nextDouble();
		System.out.print("Nhập hệ số c: ");
		c = scanner.nextDouble();
		if (a == 0) {
	            
	            if (b == 0) {
	                if (c == 0) {
	                    System.out.println("Phương trình có vô số nghiệm.");
	                } else {
	                    System.out.println("Phương trình vô nghiệm.");
	                }
	            } else {
	                double x = -c / b;
	                System.out.println("Phương trình có nghiệm duy nhất x = " + x);
	            }
		} else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
	}
}