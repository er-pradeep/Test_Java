package linkedlist;


public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        insert(list, 5);
        insert(list, 8);
        insert(list, 99);
        insert(list, 596);

        printList(list);
        deleteByKey(list, 99);
        deleteByKey(list, 88);
        deleteByKey(list, 5);

        System.out.println("At last");
        printList(list);
        deleteByPosition(list,0);
        printList(list);
    }

    public static LinkedList deleteByPosition(LinkedList list, int position) {
        Node currNode = list.head;
        if (position == 0 && currNode != null) {
            System.out.println("data delete at 0 position is" + currNode.data);
            list.head = currNode.next;
            return list;
        }

        int index = 0;
        Node prev = null;
        while (currNode != null) {
            if (position == index) {
                prev.next = currNode.next;
                System.out.println("Position element deleted " + position);
                break;
            } else {
                prev = currNode;
                currNode = currNode.next;
                index++;
            }
        }
        if (currNode == null) {
            System.out.println("Element not found at position " + position);
        }
        return list;
    }


    public static LinkedList deleteByKey(LinkedList list, int data) {
        Node currNode = list.head;
        if (currNode != null && currNode.data == data) {
            list.head = currNode.next;
            System.out.println("key head " + data + " found and deleted");
            return list;
        }
        Node prev = null;
        while (currNode != null && currNode.data != data) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println("key in between " + data + " found and deleted");
        }

        if (currNode == null) {
            System.out.println("key " + data + " not found ");
        }
        return list;
    }

    public static void printList(LinkedList list) {
        Node currNode = list.head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public static LinkedList insert(LinkedList list, int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }
}
