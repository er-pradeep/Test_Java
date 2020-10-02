package linkedlist.doubly;

public class DLLEmployeeNode {
    private DLLEmployee emp;
    private DLLEmployeeNode next;
    private DLLEmployeeNode prev;

    public DLLEmployee getEmp() {
        return emp;
    }

    public void setEmp(DLLEmployee emp) {
        this.emp = emp;
    }

    public DLLEmployeeNode getNext() {
        return next;
    }

    public void setNext(DLLEmployeeNode next) {
        this.next = next;
    }

    public DLLEmployeeNode getPrev() {
        return prev;
    }

    public void setPrev(DLLEmployeeNode prev) {
        this.prev = prev;
    }

    public DLLEmployeeNode(DLLEmployee emp) {
        this.emp = emp;
    }
}
