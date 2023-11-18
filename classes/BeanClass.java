package oops_with_java.classes;

import java.io.Serializable;

public class BeanClass implements Serializable {

    /*
     * JavaBeans are classes that encapsulate many objects into a single object (the bean)
     * JavaBean is a special type of POJO with a strict set of conventions
     */

    /*
     * It is a Java class that should follow the following conventions :-
     * 1. Must implement Serializable
     * 2. It should have a public no-arg constructor
     * 3. All properties in java bean must be private with public getters and setter methods
     */
}

/* Example */

// The Bean class should implement the Serializable interface
class Employee implements Serializable {

    // Fields can only have private access

    private int id;
    private String name;
    private String department;

    // It must have a no-arg constructor

    public Employee() {
    }

    // The Bean class can only be accessed by using the getters and setters
    // getters and setters follow the getX and setX convention
    // in the case of a boolean, isX can be used for a getter

    public void setId(int id) {
        this.id = id;
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