/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
/**
 * StudentDemo.java
 *
 * Lab Task 2 demo: proves encapsulation works two ways --
 * (1) accessing data through getters WORKS.
 * (2) accessing the private fields directly FAILS TO COMPILE.
 *
 * Run this class's main method for your "correct access" screenshot.
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student(101, "Ali Raza", 3.75);

        // CORRECT WAY: access through public getters
        System.out.println("Accessing data via getters:");
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("CGPA: " + s.getCgpa());
        System.out.println(s);

        // ------------------------------------------------------------------
        // PROOF OF ENCAPSULATION: uncomment the three lines below and try to
        // build the project. NetBeans/javac will refuse to compile, with an
        // error like:
        //
        //   error: id has private access in Student
        //
        // This is exactly what Lab Task 2 asks you to observe and screenshot.
        // ------------------------------------------------------------------

        // int directId = s.id;        // COMPILE ERROR: id has private access in Student
        // String directName = s.name; // COMPILE ERROR: name has private access in Student
        // double directCgpa = s.cgpa; // COMPILE ERROR: cgpa has private access in Student
    }
}
