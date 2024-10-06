package ss03_method;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập độ dài chiều thứ 1 trong mảng: ");
        int size1 = sc.nextInt();

        System.out.println("Nhập độ dài chiều thứ 2 trong mảng: ");
        int size2 = sc.nextInt();

        int[][] array = new int[size1][size2];

        System.out.println("Nhập phần tử ");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println(" ");
        }
        int max = array[0][0];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length;j++){
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }System.out.println("Số lớn nhất " + max);
    }
}
