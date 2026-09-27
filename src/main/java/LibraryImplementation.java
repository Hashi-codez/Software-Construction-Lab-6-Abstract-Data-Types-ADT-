/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
import java.util.HashMap;
import java.util.Map;

/**
 * LibraryImplementation.java
 *
 * A concrete implementation of the LibrarySystem ADT. Uses a HashMap,
 * keyed by bookId, as the underlying storage -- giving fast O(1) average
 * lookup, add, and remove by ID. This is the "HOW" behind the "WHAT"
 * declared in the LibrarySystem interface.
 */
public class LibraryImplementation implements LibrarySystem {

    private Map<Integer, Book> books;

    public LibraryImplementation() {
        books = new HashMap<>();
    }

    @Override
    public void addBook(Book book) {
        books.put(book.getBookId(), book);
    }

    @Override
    public boolean removeBook(int bookId) {
        return books.remove(bookId) != null;
    }

    @Override
    public Book searchBook(int bookId) {
        return books.get(bookId);
    }

    @Override
    public boolean issueBook(int bookId) {
        Book book = books.get(bookId);
        if (book == null || book.isIssued()) {
            return false;
        }
        book.setIssued(true);
        return true;
    }

    @Override
    public boolean returnBook(int bookId) {
        Book book = books.get(bookId);
        if (book == null || !book.isIssued()) {
            return false;
        }
        book.setIssued(false);
        return true;
    }
}