/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 * StudentCollectionTest.java
 *
 * JUnit tests validating the StudentCollection ADT operations, exercised
 * through the StudentCollectionImpl concrete class.
 */
public class StudentCollectionTest {

    private StudentCollection collection;

    @BeforeEach
    public void setUp() {
        collection = new StudentCollectionImpl();
    }

    @Test
    public void testNewCollectionIsEmpty() {
        assertTrue(collection.isEmpty());
        assertEquals(0, collection.getSize());
    }

    @Test
    public void testAddStudentIncreasesSize() {
        collection.addStudent(new Student(1, "Ali Raza", 3.75));
        assertEquals(1, collection.getSize());
        assertFalse(collection.isEmpty());
    }

    @Test
    public void testFindStudentById() {
        collection.addStudent(new Student(1, "Ali Raza", 3.75));
        collection.addStudent(new Student(2, "Sara Khan", 3.90));

        Student found = collection.findStudent(2);
        assertNotNull(found);
        assertEquals("Sara Khan", found.getName());
    }

    @Test
    public void testFindNonExistentStudentReturnsNull() {
        collection.addStudent(new Student(1, "Ali Raza", 3.75));
        assertNull(collection.findStudent(999));
    }

    @Test
    public void testRemoveStudent() {
        collection.addStudent(new Student(1, "Ali Raza", 3.75));
        assertTrue(collection.removeStudent(1));
        assertNull(collection.findStudent(1));
        assertTrue(collection.isEmpty());
    }

    @Test
    public void testRemoveNonExistentStudentReturnsFalse() {
        collection.addStudent(new Student(1, "Ali Raza", 3.75));
        assertFalse(collection.removeStudent(999));
    }
}