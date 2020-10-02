package queue;

import java.util.NoSuchElementException;

public class QueueByArray {
    private int [] queueArray;
    private int front;
    private int back;

    public QueueByArray(int capacity){
        queueArray = new int[capacity];
    }

    public void add(int data){
        if(back==queueArray.length){
            int [] newArray = new int[2*queueArray.length];
            System.arraycopy(queueArray,0,newArray,0,queueArray.length);
            queueArray = newArray;
        }
        queueArray[back] = data;
        back++;
    }

    public int remove(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int data = queueArray[front];
        front++;
        return data;
    }

    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return queueArray[front];
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public int size(){
        return back-front;
    }
}
