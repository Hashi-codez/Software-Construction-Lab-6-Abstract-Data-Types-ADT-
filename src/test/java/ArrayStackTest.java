import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * ArrayStackTest.java
 *
 * JUnit test for Lab Task 1: verifies the LIFO behavior of ArrayStack.
 * push(10); push(20); push(30); pop() must return 30.
 */
public class ArrayStackTest {

    @Test
    public void testPushAndPopFollowsLIFOOrder() {
        StackADT<Integer> stack = new ArrayStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.pop(), "pop() should return the most recently pushed item (30)");
    }

    @Test
    public void testSizeAfterOperations() {
        StackADT<Integer> stack = new ArrayStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(3, stack.size());
        stack.pop();
        assertEquals(2, stack.size());
    }

    @Test
    public void testIsEmpty() {
        StackADT<Integer> stack = new ArrayStack<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }
}