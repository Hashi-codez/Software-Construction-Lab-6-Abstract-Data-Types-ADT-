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

/**
 * StudentTest.java
 *
 * JUnit test for Lab Task 2: verifies that the public getters correctly
 * expose the private fields set through the constructor.
 */
public class StudentTest {

    @Test
    public void testGettersReturnConstructorValues() {
        Student s = new Student(101, "Ali Raza", 3.75);

        assertEquals(101, s.getId());
        assertEquals("Ali Raza", s.getName());
        assertEquals(3.75, s.getCgpa(), 0.0001);
    }
}