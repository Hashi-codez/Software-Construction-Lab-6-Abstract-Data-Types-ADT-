/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
/**
 * StudentCollection.java
 *
 * The ADT contract for a collection of Student objects. This interface
 * separates the SPECIFICATION (what operations are available) from the
 * IMPLEMENTATION (how students are stored internally).
 */
public interface StudentCollection {

    /**
     * Adds a student to the collection.
     * @param student the student to add
     */
    void addStudent(Student student);

    /**
     * Removes a student from the collection by ID.
     * @param id the ID of the student to remove
     * @return true if a student was removed, false if no such student existed
     */
    boolean removeStudent(int id);

    /**
     * Finds a student by ID.
     * @param id the ID to search for
     * @return the matching Student, or null if not found
     */
    Student findStudent(int id);

    /**
     * @return the number of students currently in the collection
     */
    int getSize();

    /**
     * @return true if the collection contains no students, false otherwise
     */
    boolean isEmpty();
}