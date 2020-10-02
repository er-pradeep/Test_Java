package stack;

public class StackMain {
    public static void main(String[] args) {
        StackByLinkedList sba = new StackByLinkedList();
        sba.push(5);
        sba.push(4);
        sba.push(9);
        sba.push(10);
        sba.push(111);
        sba.push(938);

        sba.printStack();

        System.out.println("----------------");
        System.out.println("peek"+sba.peek());
        System.out.println("pop"+sba.pop());
        System.out.println("------------------");
        sba.printStack();
    }
}
