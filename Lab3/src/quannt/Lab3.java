package quannt;

import java.util.Scanner;
import java.util.Arrays;

public class Lab3 {
	public static void main (String[] args) {
		Bai1();
		Bai2();
		Bai3();
		Bai4();
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
	public static void Bai3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        
        int[] arr = new int[n];

        
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

       
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + min);

        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
                count++;
            }
        }
        double average = (double) sum / count;
        System.out.println("Trung bình cộng các phần tử chia hết cho 3 là: " + average);

        scanner.close();
	}
	public static void Bai4() {
		Scanner scanner = new Scanner(System.in);

       
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();

        
        String[] hoTen = new String[n];
        double[] diem = new double[n];
        String[] hocLuc = new String[n];

        
        for (int i = 0; i < n; i++) {
            scanner.nextLine(); 
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ và tên: ");
            hoTen[i] = scanner.nextLine();
            System.out.print("Điểm: ");
            diem[i] = scanner.nextDouble();

          
            if (diem[i] < 5) {
                hocLuc[i] = "Yếu";
            } else if (diem[i] < 6.5) {
                hocLuc[i] = "Trung bình";
            } else if (diem[i] < 7.5) {
                hocLuc[i] = "Khá";
            } else if (diem[i] < 9) {
                hocLuc[i] = "Giỏi";
            } else {
                hocLuc[i] = "Xuất sắc";
            }
        }

       
        System.out.println("\nThông tin của các sinh viên:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên " + (i + 1) + ":");
            System.out.println("Họ và tên: " + hoTen[i]);
            System.out.println("Điểm: " + diem[i]);
            System.out.println("Học lực: " + hocLuc[i]);
            System.out.println();
        }

        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                   
                    String tempHoTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tempHoTen;
                    
                    double tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;
                    
                    String tempHocLuc = hocLuc[i];
                    hocLuc[i] = hocLuc[j];
                    hocLuc[j] = tempHocLuc;
                }
            }
        }

        
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên " + (i + 1) + ":");
            System.out.println("Họ và tên: " + hoTen[i]);
            System.out.println("Điểm: " + diem[i]);
            System.out.println("Học lực: " + hocLuc[i]);
            System.out.println();
        }

        scanner.close();
	}
}

