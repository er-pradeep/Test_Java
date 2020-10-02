package queue;

import java.util.NoSuchElementException;

public class CircularQueue {
    private int [] circularArrayQueue;
    private int front;
    private int back;

    public CircularQueue(int capacity){
        circularArrayQueue = new int[capacity];
    }

    public void add(int data){
        if(size() == circularArrayQueue.length -1){
            int numItems = size();
            int [] newArray = new int[2*circularArrayQueue.length];
            System.arraycopy(circularArrayQueue,front,newArray,0,circularArrayQueue.length - front);
            System.arraycopy(circularArrayQueue,0,newArray,circularArrayQueue.length - front, back);

            circularArrayQueue = newArray;
            front = 0;
            back = numItems;
        }
        circularArrayQueue[back] = data;
        if(back < circularArrayQueue.length - 1){
            back++;
        }else{
            back = 0;
        }
    }

    public int remove(){
        if(size()==0){
            throw new NoSuchElementException();
        }
        int dataToRemove = circularArrayQueue[front];
        circularArrayQueue[front]=0;
        front++;
        if(size()==0){
            front=0;
            back=0;
        }else if (front == circularArrayQueue.length){
            front = 0;
        }
        return dataToRemove;
    }

    public void printQueue(){
        if(front<back){
            for(int i =front;i<back;i++){
                System.out.println(circularArrayQueue[i]);
            }
        }else{
            for(int i=front;i<circularArrayQueue.length;i++){
                System.out.println(circularArrayQueue[i]);
            }
            for(int i=0; i< back; i++){
                System.out.println(circularArrayQueue[i]);
            }
        }
    }

    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return circularArrayQueue[front];
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public int size(){
        if(back>=front) {
            return back - front;
        }else{
            return back - front + circularArrayQueue.length;
        }
    }
}