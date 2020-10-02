package stack;


import java.util.LinkedList;

public class StackByLinkedList {
    private LinkedList<Integer> stack = new LinkedList<>();

    public int pop(){
        return  stack.pop();
    }

    public int peek(){
        return stack.peek();
    }

    public void push(int i){
         stack.push(i);
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public int getSize(){
        return stack.size();
    }
    public void printStack(){
        for (int i: stack) {
            System.out.println(i);
        }
    }
}
