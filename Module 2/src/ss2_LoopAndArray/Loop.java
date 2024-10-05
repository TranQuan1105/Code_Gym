package ss2_LoopAndArray;

import java.util.Arrays;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int length = sc.nextInt();
        int[] number = new int[length];
        for (int i = 0; i < number.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng");
            number[i] = sc.nextInt();
        }
        System.out.println("Các phần tử trong mảng:");
        for (int i : number) {
            System.out.print(i + " ");
        }
        System.out.println(Arrays.toString(number));
        // deepToString: để truy cập mảng >= 2 chiều
    }
}