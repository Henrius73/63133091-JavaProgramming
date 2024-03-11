package quannt;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Lab5 {

	public static void main(String[] args) {
		Bai1();
		Bai2();
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
	public static void Bai2() {
		Scanner scanner = new Scanner(System.in);
        ArrayList<String> danhSachHoTen = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên");
            System.out.println("6. Kết thúc");
            System.out.print("Chọn: ");
            int luaChon = scanner.nextInt();
            scanner.nextLine(); 
            switch (luaChon) {
                case 1:
                    nhapDanhSachHoTen(scanner, danhSachHoTen);
                    break;
                case 2:
                    xuatDanhSach(danhSachHoTen);
                    break;
                case 3:
                    xuatDanhSachNgauNhien(danhSachHoTen);
                    break;
                case 4:
                    sapXepVaXuatDanhSachGiamDan(danhSachHoTen);
                    break;
                case 5:
                    timVaXoaHoTen(scanner, danhSachHoTen);
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Sai lựa chọn. Vui lòng chọn lại.");
            }
        }
    }

    public static void nhapDanhSachHoTen(Scanner scanner, ArrayList<String> danhSach) {
        System.out.println("Nhập danh sách họ và tên (Nhập 'done' để kết thúc): ");
        while (true) {
            String hoTen = scanner.nextLine();
            if (hoTen.equalsIgnoreCase("done")) {
                break;
            }
            danhSach.add(hoTen);
        }
    }


    public static void xuatDanhSach(ArrayList<String> danhSach) {
        System.out.println("Danh sách họ và tên:");
        for (String hoTen : danhSach) {
            System.out.println(hoTen);
        }
    }

  
    public static void xuatDanhSachNgauNhien(ArrayList<String> danhSach) {
        Collections.shuffle(danhSach);
        System.out.println("Danh sách họ và tên ngẫu nhiên:");
        xuatDanhSach(danhSach);
    }

   
    public static void sapXepVaXuatDanhSachGiamDan(ArrayList<String> danhSach) {
        Collections.sort(danhSach, Collections.reverseOrder());
        System.out.println("Danh sách họ và tên sắp xếp giảm dần:");
        xuatDanhSach(danhSach);
    }

   
    public static void timVaXoaHoTen(Scanner scanner, ArrayList<String> danhSach) {
        System.out.print("Nhập họ tên cần xóa: ");
        String hoTenCanXoa = scanner.nextLine();
        boolean daXoa = false;
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).equalsIgnoreCase(hoTenCanXoa)) {
                danhSach.remove(i);
                daXoa = true;
                break; 
            }
        }
        if (daXoa) {
            System.out.println("Đã xóa thành công.");
        } else {
            System.out.println("Không tìm thấy họ tên cần xóa.");
        }
    }
    public static void Bai3() 
	{
		Scanner scanner = new Scanner(System.in);
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();

        int luaChon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
            System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
            System.out.println("3. Tìm và xóa sản phẩm theo tên");
            System.out.println("4. Xuất giá trung bình của các sản phẩm");
            System.out.println("5. Kết thúc");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    nhapDanhSachSanPham(scanner, danhSachSanPham);
                    break;
                case 2:
                    sapXepVaXuatSanPhamGiamDan(danhSachSanPham);
                    break;
                case 3:
                    timVaXoaSanPhamTheoTen(scanner, danhSachSanPham);
                    break;
                case 4:
                    xuatGiaTrungBinhCuaSanPham(danhSachSanPham);
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        } while (luaChon != 5);
	}
	
	private static void nhapDanhSachSanPham(Scanner scanner, ArrayList<SanPham> danhSachSanPham) {
        scanner.nextLine(); 
        System.out.println("Nhập danh sách sản phẩm (mỗi sản phẩm trên một dòng, nhập 'done' để kết thúc):");
        while (true) {
            System.out.print("Nhập tên sản phẩm: ");
            String tenSp = scanner.nextLine();
            if (tenSp.equalsIgnoreCase("done")) {
                break;
            }
            System.out.print("Nhập giá sản phẩm: ");
            double donGia = scanner.nextDouble();
            danhSachSanPham.add(new SanPham(tenSp, donGia));
            scanner.nextLine(); 
        }
    }
	private static void sapXepVaXuatSanPhamGiamDan(ArrayList<SanPham> danhSachSanPham) {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o2.getDonGia(), o1.getDonGia());
            }
        };
        Collections.sort(danhSachSanPham, comp);
        System.out.println("Danh sách sản phẩm sau khi sắp xếp giảm dần theo giá:");
        for (SanPham sp : danhSachSanPham) {
            System.out.println(sp);
        }
    }
	private static void timVaXoaSanPhamTheoTen(Scanner scanner, ArrayList<SanPham> danhSachSanPham) {
        scanner.nextLine(); 
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String tenSpCanXoa = scanner.nextLine();
        boolean found = false;
        for (SanPham sp : danhSachSanPham) {
            if (sp.getTenSp().equalsIgnoreCase(tenSpCanXoa)) {
                danhSachSanPham.remove(sp);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Đã xóa sản phẩm '" + tenSpCanXoa + "' khỏi danh sách.");
        } else {
            System.out.println("Không tìm thấy sản phẩm '" + tenSpCanXoa + "' trong danh sách.");
        }
    }
	private static void xuatGiaTrungBinhCuaSanPham(ArrayList<SanPham> danhSachSanPham) {
        double tongGia = 0;
        for (SanPham sp : danhSachSanPham) {
            tongGia += sp.getDonGia();
        }
        double giaTrungBinh = tongGia / danhSachSanPham.size();
        System.out.println("Giá trung bình của các sản phẩm: " + giaTrungBinh);
    }
}

