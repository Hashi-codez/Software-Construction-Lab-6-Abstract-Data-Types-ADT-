import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * AbstractionDemoTest.java
 *
 * JUnit test for Lab Task 3: verifies that identical client code works
 * correctly regardless of which concrete List implementation is used --
 * proving the client depends only on the List abstraction.
 */
public class AbstractionDemoTest {

    @Test
    public void testArrayListBehavesAsListContract() {
        List<String> students = new ArrayList<>();
        students.add("Ali");

        assertEquals(1, students.size());
        assertEquals("Ali", students.get(0));
    }

    @Test
    public void testLinkedListBehavesAsListContract() {
        List<String> students = new LinkedList<>();
        students.add("Sara");

        assertEquals(1, students.size());
        assertEquals("Sara", students.get(0));
    }

    @Test
    public void testSameClientCodeWorksForBothImplementations() {
        // Same method, called with two different concrete List implementations
        assertTrue(addsSuccessfully(new ArrayList<>()));
        assertTrue(addsSuccessfully(new LinkedList<>()));
    }

    // This helper method only knows about List -- the abstraction --
    // and has no idea whether it receives an ArrayList or LinkedList.
    private boolean addsSuccessfully(List<String> list) {
        list.add("Test Student");
        return list.contains("Test Student");
    }
}