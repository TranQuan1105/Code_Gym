package nhap;

import java.util.ArrayList;
import java.util.Scanner;

public class themPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                System.out.println(i);
            }
        }
    }
}
