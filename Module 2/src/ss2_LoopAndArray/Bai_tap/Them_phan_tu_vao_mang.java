package ss2_LoopAndArray.Bai_tap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Them_phan_tu_vao_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Array length: ");
        int length = sc.nextInt();
        for (int i = 0; i < length; i++) {
            System.out.println("Add to array");
            arr.add(sc.nextInt());
        }
        addArray(arr);
    }
    public static void addArray(ArrayList<Integer> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to array");
        int number = sc.nextInt();
        System.out.println("Index: ");
        int index = sc.nextInt();
        arr.add(index, number);
        System.out.println(arr);
    }
}