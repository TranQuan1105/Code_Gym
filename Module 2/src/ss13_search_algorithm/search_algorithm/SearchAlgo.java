package ss13_search_algorithm.search_algorithm;

public class SearchAlgo {
    public static int linearSearch(int[] numbers, int num) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(linearSearch(numbers, 4));
    }
}

