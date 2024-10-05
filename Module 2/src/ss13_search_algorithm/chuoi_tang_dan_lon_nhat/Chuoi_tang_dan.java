package ss13_search_algorithm.chuoi_tang_dan_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Chuoi_tang_dan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String string = scanner.nextLine();

        LinkedList<Character> chuoiCanTim = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > chuoiCanTim.size()) {
                chuoiCanTim.clear();
                chuoiCanTim.addAll(list);
            }
            list.clear();
        }

        for (Character chuoi : chuoiCanTim) {
            System.out.print(chuoi);
        }
    }
}
