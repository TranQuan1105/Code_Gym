package ss02_loop_and_array.Bai_tap;

import java.util.Scanner;

public class SoNguyenToNhoHon100 {
    static boolean isPrimeNumber(int number){
        int count = 0;
        for (int i = 1; i <= number; i++){
            if (number % i == 0 && number < 100){
                count++;
            }
        }
        if (count == 2){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số số nguyên tố cần in: ");
        int n = scanner.nextInt();
        int i = 1;
        int count = 0;
        while (true){
            if (isPrimeNumber(i)){
                System.out.println(i);
                count++;
            }
            if (count == n){
                break;
            }
            i++;
        }

    }
}
