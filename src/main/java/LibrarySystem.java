/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
/**
 * LibrarySystem.java
 *
 * The ADT contract for a Library System. This interface declares WHAT
 * operations the system supports, without saying anything about HOW
 * books are stored or searched internally. Any concrete class -- backed
 * by an ArrayList, a HashMap, a database, etc. -- can implement this
 * contract as long as it honors these method signatures.
 */
public interface LibrarySystem {

    /**
     * Adds a new book to the library.
     * @param book the book to add
     */
    void addBook(Book book);

    /**
     * Removes a book from the library by its ID.
     * @param bookId the ID of the book to remove
     * @return true if a book was removed, false if no such book existed
     */
    boolean removeBook(int bookId);

    /**
     * Searches for a book by its ID.
     * @param bookId the ID to search for
     * @return the matching Book, or null if not found
     */
    Book searchBook(int bookId);

    /**
     * Issues (checks out) a book to a borrower.
     * @param bookId the ID of the book to issue
     * @return true if the book was found and successfully issued,
     *         false if the book doesn't exist or is already issued
     */
    boolean issueBook(int bookId);

    /**
     * Returns a previously issued book back to the library.
     * @param bookId the ID of the book being returned
     * @return true if the book was found and successfully returned,
     *         false if the book doesn't exist or wasn't issued
     */
    boolean returnBook(int bookId);
}