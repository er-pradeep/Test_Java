package linkedlist;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;
    public void addToFront (Employee e){
        EmployeeNode node = new EmployeeNode(e);
        node.setEmployeeNode(head);
        head=node;
        size++;
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
        EmployeeNode e = head;
        while(e!=null){
            System.out.println(e.getEmp());
            e = e.getEmployeeNode();
        }
    }

    public Employee deleteFromFront(){
        if(isEmpty())
            return null;

        EmployeeNode removalNode = head;
        head = head.getEmployeeNode();
        removalNode.setEmployeeNode(null);
        size--;
        return removalNode.getEmp();
    }

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
    }
}
