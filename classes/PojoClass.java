package oops_with_java.classes;

public class PojoClass {

    /* POJO stands for Plain Old Java Object */

    /* It is an ordinary object, which is not bound by any special restriction */
    /* A POJO class does not have any naming convention for properties and method */

    /* Generally, A POJO class contains variables and their Getters and Setters */

    /* POJO class is used to define the object entities */
}

/* Example */

class Employee {

    // Fields may have any of the access modifiers such as public, private, protected

    private int id;
    private String name;
    private String department;

    // In POJO, it is not necessary to have a no-arg constructor; it may or may not have it

    public Employee(int employeeId) {
        this.id = employeeId;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}