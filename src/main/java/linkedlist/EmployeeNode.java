package linkedlist;

public class EmployeeNode {
    private Employee emp;
    private EmployeeNode employeeNode;

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public EmployeeNode getEmployeeNode() {
        return employeeNode;
    }

    public void setEmployeeNode(EmployeeNode employeeNode) {
        this.employeeNode = employeeNode;
    }

    public EmployeeNode(Employee emp) {
        this.emp = emp;
    }
}
