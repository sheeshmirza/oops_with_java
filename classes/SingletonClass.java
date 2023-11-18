package oops_with_java.classes;

/* a singleton class is a class that can have only one object (an instance of the class) at a time */
public class SingletonClass {

    private static SingletonClass instance;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Instance of a Singleton Class";
    }
}