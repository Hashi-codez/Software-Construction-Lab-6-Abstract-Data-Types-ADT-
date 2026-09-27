/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
/**
 * StackADT.java
 *
 * Defines the contract for a Stack Abstract Data Type (ADT), based on the
 * LIFO (Last-In-First-Out) principle. This interface specifies WHAT
 * operations a stack supports, without dictating HOW they are implemented.
 * Any concrete class (array-based, linked-list-based, etc.) can implement
 * this interface as long as it honors the contract.
 *
 * @param <T> the type of elements held in this stack
 */
public interface StackADT<T> {

    /**
     * Pushes an item onto the top of the stack.
     * @param item the item to push
     */
    void push(T item);

    /**
     * Removes and returns the item at the top of the stack.
     * @return the item removed from the top of the stack
     * @throws java.util.EmptyStackException if the stack is empty
     */
    T pop();

    /**
     * Returns (without removing) the item at the top of the stack.
     * @return the item at the top of the stack
     * @throws java.util.EmptyStackException if the stack is empty
     */
    T peek();

    /**
     * @return true if the stack contains no elements, false otherwise
     */
    boolean isEmpty();

    /**
     * @return the number of elements currently in the stack
     */
    int size();
}