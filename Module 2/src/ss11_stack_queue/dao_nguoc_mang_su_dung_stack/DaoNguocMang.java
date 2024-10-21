package ss11_stack_queue.dao_nguoc_mang_su_dung_stack;

import ss07_abstraction_tinh_truu_tuong.resizeable.Resizeable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocMang {
    public static void ReverseArr(){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int[] array = {1,2,3,4,5};
        System.out.println("Array: " + Arrays.toString(array));

        for (int number : array) {
            stack.push(number);
        }

        int n = stack.size();
        for (int i = 0; i < n; i++) {
            array[i] = stack.pop();
        }
        System.out.println("Reversed array: " + Arrays.toString(array));
    }
}
