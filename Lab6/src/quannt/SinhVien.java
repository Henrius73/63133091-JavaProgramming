package quannt;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SinhVien {
	String hoTen;
    String email;
    String soDienThoai;
    String chungMinhNhanDan;

   
    public void xuat() {
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Email: " + email);
        System.out.println("Số điện thoại: " + soDienThoai);
        System.out.println("Chứng minh nhân dân: " + chungMinhNhanDan);
    }

    
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập email: ");
        while (true) {
            email = scanner.nextLine();
            if (kiemTraEmail(email)) {
                break;
            } else {
                System.out.println("Email không hợp lệ. Vui lòng nhập lại.");
            }
        }
        System.out.print("Nhập số điện thoại: ");
        while (true) {
            soDienThoai = scanner.nextLine();
            if (kiemTraSoDienThoai(soDienThoai)) {
                break;
            } else {
                System.out.println("Số điện thoại không hợp lệ. Vui lòng nhập lại.");
            }
        }
        System.out.print("Nhập chứng minh nhân dân: ");
        while (true) {
            chungMinhNhanDan = scanner.nextLine();
            if (kiemTraCMND(chungMinhNhanDan)) {
                break;
            } else {
                System.out.println("Chứng minh nhân dân không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }

    
    private boolean kiemTraEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    
    private boolean kiemTraSoDienThoai(String soDienThoai) {
        String regex = "^\\d{10,11}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(soDienThoai);
        return matcher.matches();
    }

    
    private boolean kiemTraCMND(String cmnd) {
        String regex = "^\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cmnd);
        return matcher.matches();
    }
}

