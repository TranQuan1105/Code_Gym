package ss11_stack_queue.Stack_su_dung_linkedList;

public class GenericStackClient {
    public static void main(String[] args) {
        stackOfStrings();
    }

    public static void stackOfStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        int n = stack.size();
        for (int i = 0; i < n; i++) {
            System.out.println(stack.pop());
        }

    }

    public void stackOfInteger(){

    }
}
