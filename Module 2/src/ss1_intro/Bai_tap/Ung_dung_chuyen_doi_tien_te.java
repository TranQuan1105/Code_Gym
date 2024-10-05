package ss1_intro.Bai_tap;

import java.util.Scanner;

public class Ung_dung_chuyen_doi_tien_te {
    public static void main(String[] args) {
        int rate = 23000;
        int USD;
        int VND;
        System.out.println("1. Chuyển đổi từ VND sang USD");
        System.out.println("2. Chuyển đổi từ USD sang VND");
        System.out.println("0. Thoát");
        Scanner sc = new Scanner(System.in);
        int chuyenDoi = sc.nextInt();
        switch (chuyenDoi){
            case 1:
                System.out.print("Nhập số tiền bạn đang có (đơn vị: VND): ");
                VND = sc.nextInt();
                USD = VND / rate;
                System.out.println("Đã chuyển đổi " + VND + " VND" + " thành " + USD + " USD");
                break;
            case 2:
                System.out.println("Nhập số tiền bạn đang có (đơn vị: USD): ");
                USD = sc.nextInt();
                VND = USD * rate;
                System.out.println("Đã chuyển đổi " + USD + " USD" + " thành " + VND + " VND");
                break;
            case 0:
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
        }
    }
}
