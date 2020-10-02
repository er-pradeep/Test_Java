package linkedlist;

public class TestInteger {
    public static void main(String[] args) {
        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;

        IntegerLinkedList list = new IntegerLinkedList();
        list.addInSortedOrder(three);
        list.addInSortedOrder(two);
        list.addInSortedOrder(one);
        list.addInSortedOrder(four);
        list.printList();
    }
}
