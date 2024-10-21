package ss2_LoopAndArray.Bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        System.out.println("Enter first array's length: ");
        int arr1Length = sc.nextInt();
        for (int i = 0; i < arr1Length; i++) {
            System.out.println("Enter array1's element: ");
            arr1.add(sc.nextInt());
        }
        System.out.println(arr1.size());
    }
}
