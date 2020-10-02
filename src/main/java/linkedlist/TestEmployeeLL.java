package linkedlist;

public class TestEmployeeLL {
    public static void main(String[] args) {
        Employee e1 = new Employee("Pradeep","Chandra",12);
        Employee e2 = new Employee("Mini","Chandra",123);
        Employee e3 = new Employee("Mikku","Chandra",124);
        Employee e4 = new Employee("Dolly","Chandra",125);
        Employee e5 = new Employee("Prakash","Chandra",126);
        System.out.println();
        EmployeeLinkedList ell = new EmployeeLinkedList();
        System.out.println(ell.isEmpty());
        ell.addToFront(e1);
        ell.addToFront(e2);
        ell.addToFront(e3);
        ell.addToFront(e4);
        ell.addToFront(e5);

        ell.printList();
        System.out.println(ell.getSize());

        System.out.println(ell.deleteFromFront());
        System.out.println("---------------");
        ell.printList();

        System.out.println(ell.deleteEmployeeById(1256));
        System.out.println("*************");
        ell.printList();
    }
}
