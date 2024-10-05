package ss13_search_algorithm.chuoi_tang_dan_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();
        for (int i = 0; i < string.length(); i++) {       // single loop
            if (list.size() == 0 || string.charAt(i) > list.getLast()) {
                list.add(string.charAt(i));
            } else {
                if (list.size() > max.size()) {
                    max.clear();
                    max.addAll(list);
                    i--;
                }
                list.clear();
            }
        }
        if (list.size() > max.size()) {
            max.clear();
            max.addAll(list);
        }

        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
