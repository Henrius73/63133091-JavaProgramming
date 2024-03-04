package quannt;

import java.util.Scanner;

public class Lab3 {
	public static void main (String[] args) {
		Bai1();
		Bai2();
	}
	public static void Bai1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập một số nguyên: ");
		int n = scanner.nextInt();
		
		boolean soNT = true;
		if(n <= 1) {
			soNT = false;
		}else {
			for(int i = 2; i < n; i++) {
				if (n % i == 0) {
                    soNT = false;
                    break;
			}
		}
			if (soNT) {
	            System.out.println(n + " là số nguyên tố.");
	        } else {
	            System.out.println(n + " không phải là số nguyên tố.");
	        }
		}
	}
	public static void Bai2() {
		for(int i = 1;i <= 9;i++) {
			System.out.printf("Bang cuu chuong cua %d:\n", i);
		for(int j = 1;j <= 10; j++) 
			System.out.printf("%d x %d = %d%n", i, j, i * j);
		}
		 System.out.println();
	}
}

