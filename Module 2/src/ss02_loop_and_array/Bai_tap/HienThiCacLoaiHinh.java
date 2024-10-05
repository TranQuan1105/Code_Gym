package ss02_loop_and_array.Bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn hình muốn in: ");
        System.out.println("1. Hình chữ nhật");
        System.out.println("2. Tam giác vuông có cạnh góc vuông ở bottom-left");
        System.out.println("3. Tam giác vuông có cạnh góc vuông ở top-left");
        System.out.println("4. Thoát");
        int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    hinhChuNhat();
                    break;
                case 2:
                    hinhTamGiacBottomLeft();
                    break;
                case 3:
                    hinhTamGiacTopLeft();
                    break;
                case 4:

                    break;
                default:
                    System.out.println("Phương án không hợp lệ! Vui lòng chọn lại.");
            }
    }

    public static void hinhChuNhat(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu doc: ");
        int row = sc.nextInt();
        System.out.println("Nhap chieu ngang: ");
        int column = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hinhTamGiacBottomLeft(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh goc vuong: ");
        int side = sc.nextInt();
        for (int i = 0; i <= side; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hinhTamGiacTopLeft(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh goc vuong: ");
        int side = sc.nextInt();
        for (int i = side; i >= 1 ; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
