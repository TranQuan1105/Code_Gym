package ss2_LoopAndArray.Bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class Gop_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        System.out.println("Enter first array's length: ");
        int arr1Length = sc.nextInt();
        for (int i = 0; i < arr1Length; i++) {
            System.out.println("Enter array1's element: ");
            arr1.add(sc.nextInt());
        }

        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.println("Enter second array's length: ");
        int arr2Length = sc.nextInt();
        for (int i = 0; i < arr2Length; i++) {
            System.out.println("Enter array2's element: ");
            arr2.add(sc.nextInt());
        }
        gopMang(arr1, arr2);
    }
    public static void gopMang(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        ArrayList<Integer> arr3 = new ArrayList<>();
        for (int i = 0; i < arr1.size(); i++) {
            arr3.add(arr1.get(i));
        }
        for (int i = 0; i < arr2.size(); i++) {
            arr3.add(arr2.get(i));
        }
        System.out.println(arr3);
    }
}
