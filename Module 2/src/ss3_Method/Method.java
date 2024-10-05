package ss3_Method;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        int n = array.length;
        int index_del = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number  = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (number == array[i]) {
                index_del = i;
            }
        }
        n--;
        for (int i = index_del; i < n; i++) {
            array[i] = array[i + 1];
        }
        System.out.println("mang sau khi xoa: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
