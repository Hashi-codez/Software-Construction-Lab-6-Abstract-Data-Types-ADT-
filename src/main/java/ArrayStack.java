/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * ArrayStack.java
 *
 * A concrete, array-based implementation of the StackADT interface.
 * Demonstrates the LIFO principle using a resizable array as the
 * underlying data structure. This is the "HOW" behind the "WHAT"
 * declared in StackADT.
 *
 * @param <T> the type of elements held in this stack
 */
public class ArrayStack<T> implements StackADT<T> {

    private static final int DEFAULT_CAPACITY = 10;

    private T[] elements;
    private int top; // number of elements currently stored (also the next free index)

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
        top = 0;
    }

    @Override
    public void push(T item) {
        if (top == elements.length) {
            resize(elements.length * 2);
        }
        elements[top++] = item;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = elements[--top];
        elements[top] = null; // avoid holding a stale reference
        return item;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }

    private void resize(int newCapacity) {
        elements = Arrays.copyOf(elements, newCapacity);
    }
}
