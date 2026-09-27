/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
/**
 * Student.java
 *
 * Demonstrates DATA ENCAPSULATION: internal state (id, name, cgpa) is
 * hidden from the outside world by making the fields private. The only
 * way for other code to read this data is through the public getter
 * methods, which protects the class from accidental or unauthorized
 * direct modification.
 */
public class Student {

    // Private fields -- cannot be accessed directly from outside this class
    private int id;
    private String name;
    private double cgpa;

    /**
     * Constructor -- the only way to set a Student's data at creation time.
     */
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public getters -- controlled, read-only access to the private fields

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', cgpa=" + cgpa + "}";
    }
}