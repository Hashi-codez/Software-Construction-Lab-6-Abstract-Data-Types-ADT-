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
 * LibrarySystemTest.java
 *
 * JUnit tests validating the LibrarySystem ADT operations, exercised
 * through the LibraryImplementation concrete class.
 */
public class LibrarySystemTest {

    private LibrarySystem library;

    @BeforeEach
    public void setUp() {
        library = new LibraryImplementation();
        library.addBook(new Book(1, "Clean Code", "Robert C. Martin"));
        library.addBook(new Book(2, "Effective Java", "Joshua Bloch"));
    }

    @Test
    public void testAddAndSearchBook() {
        Book found = library.searchBook(1);
        assertNotNull(found);
        assertEquals("Clean Code", found.getTitle());
    }

    @Test
    public void testSearchNonExistentBookReturnsNull() {
        assertNull(library.searchBook(999));
    }

    @Test
    public void testRemoveBook() {
        assertTrue(library.removeBook(1));
        assertNull(library.searchBook(1));
        assertFalse(library.removeBook(1)); // already removed
    }

    @Test
    public void testIssueBook() {
        assertTrue(library.issueBook(2));
        assertTrue(library.searchBook(2).isIssued());
    }

    @Test
    public void testCannotIssueAlreadyIssuedBook() {
        library.issueBook(2);
        assertFalse(library.issueBook(2)); // already issued
    }

    @Test
    public void testReturnBook() {
        library.issueBook(2);
        assertTrue(library.returnBook(2));
        assertFalse(library.searchBook(2).isIssued());
    }

    @Test
    public void testCannotReturnBookThatWasNeverIssued() {
        assertFalse(library.returnBook(1));
    }
}