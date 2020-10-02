package queue;

public class QueueMain {
    public static void main(String[] args) {

        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;
        Integer five = 5;

        CircularQueue queue = new CircularQueue(5);

        queue.add(one);
        queue.add(two);
        queue.remove();
        queue.add(three);
        queue.remove();
        queue.add(four);
        queue.remove();
        queue.add(five);
        queue.remove();
        queue.add(one);

        queue.printQueue();
//        queue.add(janeJones);
//        queue.add(johnDoe);
//        queue.add(marySmith);
//        queue.add(mikeWilson);
//        queue.add(billEnd);
//        //queue.printQueue();
//
//        queue.remove();
//        queue.remove();
//        //queue.printQueue();
//
//        //System.out.println(queue.peek());
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        //queue.remove();
////
//        queue.add(mikeWilson);
////
////
//        queue.printQueue();
    }
}
