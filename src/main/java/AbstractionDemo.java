/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * AbstractionDemo.java
 *
 * Lab Task 3: Programming to an Abstraction.
 *
 * The variable 'students' is declared using the INTERFACE type (List),
 * not a concrete class. This means the client code (this class) only
 * depends on what a List can do -- add(), get(), etc. -- and has no
 * knowledge of, or dependency on, which specific implementation is
 * providing that behavior underneath.
 *
 * We prove this by swapping the underlying implementation from an
 * ArrayList to a LinkedList at runtime, with ZERO changes needed to
 * the rest of the code that uses 'students'.
 */
public class AbstractionDemo {
    public static void main(String[] args) {

        // Step 1: declare the variable using the ABSTRACTION (interface)
        List<String> students;

        // Step 2: instantiate it as a concrete ArrayList implementation
        students = new ArrayList<>();
        students.add("Ali");
        System.out.println("Backed by ArrayList  -> " + students);
        System.out.println("Concrete class: " + students.getClass().getSimpleName());

        // Step 3: reassign the SAME variable to a completely different
        // concrete implementation -- a LinkedList
        students = new LinkedList<>();
        students.add("Sara");
        System.out.println("Backed by LinkedList -> " + students);
        System.out.println("Concrete class: " + students.getClass().getSimpleName());

        // Notice: the code that declares, adds to, and prints 'students'
        // never changed. Only the object assigned to it changed. This is
        // "programming to an interface, not an implementation."
    }
}