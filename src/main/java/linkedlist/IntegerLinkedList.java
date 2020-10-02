package linkedlist;

// implement sorted order integer linked list
public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(int i){
        IntegerNode frontNode = new IntegerNode(i);
        frontNode.setNext(head);
        head = frontNode;
        size++;
    }

    public void printList(){
        while(head!=null){
            System.out.print(head.getData()+",");
            head = head.getNext();
        }
    }

    public void addInSortedOrder(int i){
        IntegerNode node = new IntegerNode(i);
        IntegerNode prev=null;
        if(head == null || head.getData() >= i){
            addToFront(i);
            return;
        }
        IntegerNode current = head.getNext();
        IntegerNode previous  = head;
        while(current!=null && current.getData() < i){
            previous = current;
            current = current.getNext();
        }
        IntegerNode newNode = new IntegerNode(i);
        newNode.setNext(current);
        previous.setNext(newNode);
        size++;
    }

}
