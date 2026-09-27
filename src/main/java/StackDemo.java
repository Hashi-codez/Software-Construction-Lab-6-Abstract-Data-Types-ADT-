/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
/**
 * StackDemo.java
 *
 * Simple console demo for Lab Task 1.
 * Run this class's main method and screenshot the console output
 * for the "Screenshots" section of your PDF report.
 */
public class StackDemo {
    public static void main(String[] args) {
        StackADT<Integer> stack = new ArrayStack<>();

        System.out.println("Pushing 10, 20, 30 onto the stack...");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Current size: " + stack.size());
        System.out.println("Popping top element: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());
    }
}