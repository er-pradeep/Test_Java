package stack;

import java.util.EmptyStackException;

public class StackByArray {

    private int [] stack;
    private int top;

    public StackByArray(int capacity){
        stack = new int[capacity];
    }

    public void push (int i){
        if(top==stack.length){
            // resize array
            int [] newStack= new int[stack.length*2];
            System.arraycopy(stack,0,newStack,0,stack.length);
            stack = newStack;
        }
        stack[top++] = i;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int i= stack[--top];
        stack [top] = 0;
        return i;
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top==0;
    }

    public void printStack(){
        for(int i = top-1;i>=0;i--){
            System.out.print(stack[i]+",");
        }
    }
}
