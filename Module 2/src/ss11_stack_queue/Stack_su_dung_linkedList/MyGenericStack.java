package ss11_stack_queue.Stack_su_dung_linkedList;

import java.util.LinkedList;

public class MyGenericStack <T>{
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList<>();
    }

    public void push(T element){
        stack.push(element);
    }

    public T pop(){
        return stack.pop();
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(T element){
        return stack.isEmpty();
    }


}
