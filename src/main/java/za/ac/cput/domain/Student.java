package za.ac.cput.domain;

public abstract class Student {
    protected String name;
    protected int id;
    protected String major;

    // Constructor (protected to allow subclass access)
    protected Student(String name, int id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayStudentDetails();
}
