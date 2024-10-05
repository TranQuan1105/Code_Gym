package ss03_method;

import java.util.Scanner;

public class timPhanTuNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Độ dài mảng: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Nhập phần tử vào mảng: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i:arr) {
            System.out.print(" " + i);
        }
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
                index = i;
            }
        }
        System.out.println("\n" + "Giá trị nhỏ nhất là " + min + " tại vị trí : " +  index);
    }
}
