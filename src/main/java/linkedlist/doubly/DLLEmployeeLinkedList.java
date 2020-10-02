package linkedlist.doubly;


public class DLLEmployeeLinkedList {
    private DLLEmployeeNode head;
    private DLLEmployeeNode tail;
    private int size;

    public void addToFront (DLLEmployee e){
        DLLEmployeeNode node = new DLLEmployeeNode(e);
        node.setNext(head);
        if(head == null){
            tail = node;
        }else{
            head.setPrev(node);
            //node.setNext();
        }
        head=node;
        size++;
    }

    public void addToTail(DLLEmployee e ){
        DLLEmployeeNode newTailNode = new DLLEmployeeNode(e);
        if(tail==null){
            head = newTailNode;
        }else{
            tail.setNext(newTailNode);
            newTailNode.setPrev(tail);
        }
        size++;
        tail = newTailNode;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void printList(){
        if(isEmpty())
            return;
        DLLEmployeeNode e = head;
        while(e!=null){
            System.out.println(e.getEmp());
            e = e.getNext();
        }
    }

    public DLLEmployee deleteFromFront(){
        if(isEmpty())
            return null;
        DLLEmployeeNode removingNode = head;
        if(head.getNext() == null){
            tail=null;
        }else{
            head.getNext().setPrev(null);
        }
        head = head.getNext();
        removingNode.setNext(null);
        size--;
        return removingNode.getEmp();
        }

    public DLLEmployee deleteFromEnd(){
        if(isEmpty())
            return null;
        DLLEmployeeNode removingNode = tail;
        if(tail.getPrev() == null){
            tail=null;
        }else{
            tail.getPrev().setNext(null);
        }
        tail = tail.getPrev();
        removingNode.setPrev(null);
        size--;
        return removingNode.getEmp();
    }
    /*

    public Employee deleteEmployeeById( int empId){
        if(isEmpty())
            return null;
        Employee removalEmp = null;
        EmployeeNode removalNode = head;
        EmployeeNode prevNode = null;
        if (removalNode != null && removalNode.getEmp().getEmployeeId() == empId) {
            head = removalNode.getEmployeeNode();
            System.out.println("key head " + empId + " found and deleted");;
            size--;
            return removalNode.getEmp();
        }
        EmployeeNode prev = null;
        while (removalNode != null && removalNode.getEmp().getEmployeeId() != empId) {
            prev = removalNode;
            removalNode = removalNode.getEmployeeNode();
        }
        if (removalNode != null) {
            prev.setEmployeeNode(removalNode.getEmployeeNode());
            removalEmp = removalNode.getEmp();
            size--;
            System.out.println("key in between " + empId + " found and deleted");
        }
        if (removalNode == null) {
            System.out.println("key " + empId + " not found ");
        }
        return  removalEmp;
    }*/
}