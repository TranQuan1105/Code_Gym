package ss11_stack_queue.word_count;

import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void DemSoLanXuatHienCuaTu(){
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        TreeMap<String, Integer> wordMap = new TreeMap<>();
        System.out.println("Nhap chuoi: ");
        String inputString = sc.nextLine();
        String[] words = inputString.toUpperCase().split("\\d");
        System.out.println(words);
        for (String word: words) {
            temp++;
        }
        System.out.println("Chuoi " + inputString + " voi " + temp + " ki tu");
    }

    public static void main(String[] args) {
        DemSoLanXuatHienCuaTu();
    }
}