package linkedlist.doubly;

import java.util.Objects;

public class DLLEmployee {

    private String firstName;
    private String lastName;
    private int employeeId;

    public DLLEmployee(String firstName, String lastName, int employeeId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DLLEmployee employee = (DLLEmployee) o;
        return employeeId == employee.employeeId &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, employeeId);
    }

    @Override
    public String toString() {
        return "DLLEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }
}
