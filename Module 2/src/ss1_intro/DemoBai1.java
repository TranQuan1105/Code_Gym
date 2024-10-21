package ss1_intro;

import java.util.Scanner;

public class DemoBai1 {
    //class body
    // phương thức main
    public static void main(String[] args) {    /*psvm + tab */
        // sout + tab = console.log();
        // Cú pháp cho phép người dùng nhập
        // let name = prompt("Nhập tên: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.printf(name);
    }
}
