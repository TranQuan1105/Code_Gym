package ss15_debug_exception.IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleException {
    public static boolean triangle(int a, int b, int c)throws Check{

        if (a < 0 || b < 0 || c < 0){
            throw new Check("So am");
        }else if (a + b < c || b +c < a || c + a < b){
            throw new Check("Tong 2 canh nho hon canh thu 3");
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh thu nhat : ");
        int a = scanner.nextInt();
        System.out.println("Nhap canh thu hai : ");
        int b = scanner.nextInt();
        System.out.println("Nhap canh thu ba : ");
        int c = scanner.nextInt();

        try {
            if (triangle( a, b, c)){
                System.out.println("OK");
            }
        } catch (Check check) {
            check.printStackTrace();
        }
    }
}
